package com.luxigu.userserver.exception;

import java.text.MessageFormat;

/**
 * 异常响应接口
 * @author liqf
 *
 */
public interface IResponseEnum {

	int getCode();
	String getMessage();
}

class BusinessException extends BaseException {

	private static final long serialVersionUID = 1L;

	public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
		super(responseEnum, args, message);
	}
	
	public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }
}

/**
 * <title>业务异常断言类</title>
 * 
 * @author liqf
 *
 */
interface BusinessExceptionAssert extends IResponseEnum, Assert {

	@Override
	default BaseException baseException(Object...args) {
		String msg = MessageFormat.format(this.getMessage(), args);
		return new BusinessException(this, args, msg);
	}
	
	@Override
	default BaseException baseException(Throwable t, Object... args) {
		String msg = MessageFormat.format(this.getMessage(), args);
		return new BusinessException(this, args, msg, t);
	}
}
