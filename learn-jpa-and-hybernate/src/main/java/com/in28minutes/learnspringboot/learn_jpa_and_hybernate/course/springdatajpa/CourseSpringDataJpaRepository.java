package com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

	List<Course> findByName(String courseName);
}
