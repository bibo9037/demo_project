package com.example.demo_project.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo_project.entity.Person;
import com.example.demo_project.service.ifs.PersonService;

	@Service								//��@����
public class PersonServiceImpl implements PersonService {

	@Override
	public Person getPersonInfo(String id) {
		Person person = new Person();
		person.setId(id);					//�n�PString��id�ۦP �ҥH()�����]�w�� = �I�s�|�H�]�w���ܡC �Y�����ȫh���|����
		person.setName("�p��");				//set��person���ƭ�
		person.setCity("�x�n��");				//set��person���ƭ�
		person.setAge(20);
		return person;						//return �^�ǭ�(person)�����A(Person)
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
