package com.luxigu.userserver.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>统一异常处理类</p>
 * 
 * @author liqf
 *
 */
@Slf4j
@Component
@ControllerAdvice
@ConditionalOnWebApplication
@ConditionalOnMissingBean(UnifiedExceptionHandler.class)
public class UnifiedExceptionHandler {
	
	/**
	 * <p>运行环境：开发环境</p>
	 */
	private final static String ENV_DEV = "dev";
	
	/**
	 * <p>统一消息资源</p>
	 */
	@Autowired
	UnifiedMessageSource unifiedMessageSource;
	
	/**
	 * <p>当前环境</p>
	 */
	@Value(value = "${spring.profiles.active}")
	private String profile;
	
	public String getMessage(BaseException e) {
		String code = "response." + e.getResponseEnum().toString();
		String message = unifiedMessageSource.getMessage(code, e.getArgs());
		if (message == null || message.isEmpty()) {
			return e.getMessage();
		}
		
		return message;
	}
	
}
