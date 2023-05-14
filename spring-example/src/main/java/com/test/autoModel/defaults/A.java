package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Component
@Slf4j(topic = "e")
public class A implements ExampleAware {

	//  A,B,C三个类根据 com/test/autoModel/config/ModelConfig.java:6扫描到spring容器当中
	ExampleBean exampleBean;

	public A(){
		log.debug("default Constructor");

	}







//





//	public A(C c,B b,ExampleBean exampleBean){
//		log.debug("Constructor from c b,exampleBean");
//		this.exampleBean =exampleBean;
//	}

	@Override
	public void setExampleBean(ExampleBean exampleBean) {
		//this.exampleBean=exampleBean;
	}

	public ExampleBean getExampleBean() {
		return exampleBean;
	}
}
