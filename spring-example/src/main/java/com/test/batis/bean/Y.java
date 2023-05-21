package com.test.batis.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@Component
public class Y {

	public Y(){
		log.debug("y create");
	}
}
