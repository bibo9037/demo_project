package com.example.demo_project.service.ifs;

import com.example.demo_project.entity.Bird;
		//介面		
public interface Active {
		// 回傳型態	   方法		 型態
	public Bird getflyInfo(String name, int age);
	
	public void printBirdAttributes(Bird bird);
}
