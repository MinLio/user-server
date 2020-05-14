package com.luxigu.userserver.repository;

import com.luxigu.userserver.annotation.Inheritable;

@Inheritable
public class Father {

	public Father() {
		System.out.println("Inheritable Father:" + Father.class.isAnnotationPresent(Inheritable.class));
	}
}
