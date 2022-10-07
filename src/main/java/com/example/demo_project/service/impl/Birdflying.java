package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;
@Service
public class Birdflying implements Active {
	@Override
	public Bird getflyInfo(String name, int age) {
		Bird bird = new Bird();
		bird.setName(name);
		bird.setAge(age);
		return bird;
	}
	
	@Override
	public void printBirdAttributes(Bird bird) {
		System.out.println(bird.getName());
		System.out.println(bird.getAge());
	}	
}
