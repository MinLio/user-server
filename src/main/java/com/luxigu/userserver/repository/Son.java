package com.luxigu.userserver.repository;

import com.luxigu.userserver.annotation.Inheritable;

public class Son extends Father {

	public Son() {
		System.out.println("Inheritable Son:" + Son.class.isAnnotationPresent(Inheritable.class));
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		
		System.out.println(s.toString());
	}
}
