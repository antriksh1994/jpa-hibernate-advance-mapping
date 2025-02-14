package com.antriksh.crudedemo;

import com.antriksh.crudedemo.dao.AppDAO;
import com.antriksh.crudedemo.entity.Instructor;
import com.antriksh.crudedemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudedemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			createInstructor(appDAO);
//			findInstructor(appDAO);
//			deleteInstructor(appDAO);
		};

	}

	private void deleteInstructor(AppDAO appDao) {
		int theId = 3;
		appDao.deleteInstructorById(theId);
	}

	private void findInstructor(AppDAO appDAO) {
		int theId = 1;
		Instructor tempInstructor = appDAO.findInstructorById(theId);
		System.out.println("tempInstructor" + tempInstructor);
		System.out.println("Instructor details" + tempInstructor.getInstructorDetail());

	}

	private void createInstructor(AppDAO appDAO) {
		// create the instructor
//		Instructor tempInstructor =
//				new Instructor("Chad", "Darby", "darby@luv2code.com");
//
//		// create the instructor detail
//		InstructorDetail tempInstructorDetail =
//				new InstructorDetail(
//						"http://www.luv2code.com/youtube",
//						"Luv 2 code!!!");


		// create the instructor
		Instructor tempInstructor =
				new Instructor("Madhu", "Patel", "madhu@luv2code.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.luv2code.com/youtube",
						"Guitar");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		//
		// NOTE: this will ALSO save the details object
		// because of CascadeType.ALL
		//
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}

}








