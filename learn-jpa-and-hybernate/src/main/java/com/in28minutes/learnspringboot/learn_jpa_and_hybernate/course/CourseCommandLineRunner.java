package com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.jpa.CourseJpaRepository;
import com.in28minutes.learnspringboot.learn_jpa_and_hybernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	//@Autowired
	//private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS JPA!", "in28minutes"));
		repository.save(new Course(2, "Learn devops JPA!", "in28minutes"));
		repository.save(new Course(3, "Learn Spring JPA!", "in28minutes"));
		
		/*repository.deleteById(1l);
		
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByName("Learn Spring JPA!"));*/
	}
}