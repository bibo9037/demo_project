package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bird;
		//����		
public interface Active {
		// �^�ǫ��A	   ��k		 ���A
	public Bird getflyInfo(String name, int age);
	
	public void printBirdAttributes(Bird bird);
}
