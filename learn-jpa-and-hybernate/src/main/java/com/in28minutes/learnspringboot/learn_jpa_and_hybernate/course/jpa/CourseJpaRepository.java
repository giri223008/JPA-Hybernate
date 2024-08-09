package com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entityManger;

	public void insert(Course course) {
		entityManger.merge(course);
	}

	public Course findById(long id) {
		return entityManger.find(Course.class, id);
	}

	public void deleteById(long id) {
		Course course = entityManger.find(Course.class, id);
		System.out.println("giri" + course.getId());
		entityManger.remove(course);
	}

}
