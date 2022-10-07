package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

	@Service								//實作介面
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		person.setId(id);					//要與String的id相同 所以()內不設定值 = 呼叫會隨設定改變。 若有給值則不會改變
		person.setName("小白");				//set此person的數值
		person.setCity("台南市");				//set此person的數值
		person.setAge(20);
		return person;						//return 回傳值(person)的型態(Person)
	}
	public String getPersonId(Person person) {
		return person.getId();
	}
	public void printPersonAttributes(Person person) {
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getCity());
		System.out.println(person.getAge());
	}
}
