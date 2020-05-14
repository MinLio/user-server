package com.luxigu.userserver.exception;

/**
 * 自定义断言类
 * @author liqf
 *
 */
public interface Assert {
	
	/**
	 * 创建异常
	 * @param obj
	 * @return
	 */
	BaseException baseException(Object... args);
	
	/**
	 * 创建异常
	 * @param obj
	 * @param orgs
	 * @return
	 */
	BaseException baseException(Throwable t, Object... args);
	
	/**
	 * <p>断言对象<code>obj</code>非空，如果<code>obj</code>为空，则抛出异常</p>
	 * @param obj 待判断对象
	 */
	default void assertNotNull(Object obj) {
		if (obj == null) {
			throw baseException(obj);
		}
	}
	
	/**
	 * <p>断言对象<code>obj</code>非空。如果<code>obj</code>为空，则抛出异常</p>
	 * <p>异常消息<code>message</code>支持参数传递方式，避免在判断之前进行字符串拼接</p>
	 * 
	 * @param obj 待判断对象
	 * @param args message占位符对应的参数列表
	 */
	default void assertNotNull(Object obj, Object... args) {
		if (obj == null) {
			throw baseException(args);
		}
	}
	
}
