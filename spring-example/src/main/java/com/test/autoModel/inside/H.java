package com.test.autoModel.inside;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 内部类的实例化现象
 * bean ---一定是一个java对象
 * 1、java常识
 * 2、spring
 */
public class H {

	class J{
		public J(H h){

		}
	}
	public static void main(String[] args) {
		// spring bean 的生命周期有一个非常重要的步骤 是 推断构造方法
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(H.class);
		context.register(J.class);
		context.refresh();

		context.getBean(J.class);
		/**
		 * 运行代码的时候报错
		 * java: 找不到符号
		 *   符号:   变量 log
		 *   位置: 类 com.test.autoModel.order.E
		 *
		 *   解决方式，将lombok版本升级，重启idea
		 * */
	}
}
