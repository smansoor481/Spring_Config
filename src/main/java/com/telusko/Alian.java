package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alian {
	private int age;
	@Autowired
	@Qualifier("laptop")
	private Computer com;
	
	

	public Alian()
	{
		System.out.println("Object is created..!!");
	}
	 
//	@ConstructorProperties({"age","lap"})
//	public Alian(int age, Computer lap) {
//		super();
//		this.age = age;
//		this.lap = lap;
//	}


	public int getAge() {
		return age;
	}
	
	public Computer getLap() {
		return com;
	}

	public void setLap(Computer lap) {
		this.com = lap;
	}
	

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public void setAge(int age) {
//		System.out.println("setter called`");
		this.age = age;
	}

	 

	public void code()
	{
		System.out.println("Coding");
		com.compile();
	}
	
	
	
	 
	
	
	

}
