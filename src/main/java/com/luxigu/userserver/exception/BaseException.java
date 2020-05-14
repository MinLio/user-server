package com.luxigu.userserver.exception;

import lombok.Data;

/**
 * <title>基本异常类</title>
 * <p>用于定义统一异常类，用于处理某阶段已明确的异常，
 * 该异常类具有两个属性<code>code</code>异常码（异常唯一标记，表示异常类别）和<code>message</code>异常消息（描述异常原因，与异常码一一对应）</p>
 * 
 * @author liqf
 *
 */
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BaseException(IResponseEnum responseEnum, Object[] args, String message) {
		super(message);
	}
	
	public BaseException(IResponseEnum responseEnum, Object[] args, String message, Throwable t) {
		super(message, t);
	}
	
	public BaseException(Object obj) {
		super();
	}
	
	public BaseException(Object... args) {
		super();
	}
	
	private int code;
	private String message;
	private Object[] args;
	private ResponseEnum responseEnum;
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseEnum getResponseEnum() {
		return responseEnum;
	}

	public void setResponseEnum(ResponseEnum responseEnum) {
		this.responseEnum = responseEnum;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
	
}
