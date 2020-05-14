package com.luxigu.userserver.exception;

import org.springframework.stereotype.Component;

@Component
public class UnifiedMessageSource {

	public String getMessage(String code, Object[] args) {
		return code + "：" + args;
	}
}
