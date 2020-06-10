package com.rhinh.aspectdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectDemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectJConfig.class);

		ctx.registerShutdownHook();
		Account acct = (Account) ctx.getBean(Account.class);
		acct.sayHello();
	}

}
