package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
		System.out.println("Hello added in feature branch! " + name);
		System.out.println("New println in development");
		System.out.println("Removed error");
		System.out.println("Trying to install");
	}
}
