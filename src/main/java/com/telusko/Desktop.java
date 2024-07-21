package com.telusko;

import org.springframework.stereotype.Component;

@Component

/*
 * component is a automatically created the objects 
 */
public class Desktop implements Computer{
	public Desktop()
	{
		System.out.println("Desktop object is created..!!");
	}
	@Override
	public void compile()
	{
		System.out.println("Compiling using Desktop");
	}

}
