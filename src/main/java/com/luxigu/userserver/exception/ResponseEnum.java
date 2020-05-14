package com.luxigu.userserver.exception;

/**
 * <p>异常枚举类</p>
 * 
 * @author liqf
 *
 */
public enum ResponseEnum implements BusinessExceptionAssert {
	BAD_LICENCE_TYPE(7001, "Bad licence type."),
	
	LICENCE_NOT_FOUND(7002, "Licence not found.")
	;
	
	private int code;
	private String message;
	
	ResponseEnum(int _code, String _message) {}
	
	public int getCode() {
		return this.code;
	}
	
	public String getMessage() {
		return this.message;
	}
}
