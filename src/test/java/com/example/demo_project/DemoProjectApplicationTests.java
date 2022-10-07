package com.example.demo_project;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;
import com.example.demo_project.service.impl.Birdflying;

@SpringBootTest
public class DemoProjectApplicationTests {
//	
//	@Autowired
//	private PersonService personSerivce;
//	
//	@Autowired
//	private PersonServiceImpl PersonServiceImpl;
//	
//	@Test
//	public void contextLoads() {
//		Person per = personSerivce.getPersonInfo("TTT");
//		PersonServiceImpl.printPersonAttributes(per);
//	}
	
	@Autowired
	private Active active;
	
	@Test
	public void contextLoads1() {
		Bird bird = active.getflyInfo("ttt", 5);
		active.printBirdAttributes(bird);
	}
	
	@Test
	public void activetest() {
		
	}

	public class Homework1006 {
		public void main(String[] args) {
			SpringApplication.run(Homework1006.class, args);
			Bird bird = new Bird();
			bird.getName();
			bird.getAge();
			
			Birdflying active = new Birdflying();
			Bird Bird = active.getflyInfo("ttt", 9);
			active.printBirdAttributes(Bird);
		}
	
	
//	public static void main(String[] args) {
//		SpringApplication.run(DemoProjectApplicationTests.class, args);
//		PersonServiceImpl personservice = new PersonServiceImpl();
//		Person per = personservice.getPersonInfo("YYY");
//		personservice.printPersonAttributes(per);
//	}
	}
}
