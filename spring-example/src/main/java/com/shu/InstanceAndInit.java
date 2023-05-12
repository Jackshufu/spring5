package com.shu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstanceAndInit {
	public static void main(String[] args) {
		// 代码级别理解spring容器就是这个对象
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();// spring容器的实例化
		// 确认是否能进行完整的spring开发。我们看能不能注册bean,扫描bean,通过getBean把bean拿出来？
		// 该方法等价于spring的扫描,扫描到spring的容器当中
		context.register(MyBean.class);
		// 对容器做初始化
		context.refresh();// spring容器的初始化
		// 完成实例化和初始化后，这个bean就在我们的单例池当中
		System.out.println(context.getBean(MyBean.class));
		// 运行该类报错，解决办法：https://blog.csdn.net/qq_25825005/article/details/122518377
	}
}
