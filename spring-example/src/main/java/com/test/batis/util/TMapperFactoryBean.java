package com.test.batis.util;

import com.test.batis.dao.CMapper;
import com.test.batis.dao.TMapper;
import com.test.batis.mybatis.MySqlSession;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 1、MyFactoryBean自己必须生效 存在spring容器当中
 * 2、mapperInterface必须有值（合理）
 */
//@Component
public class TMapperFactoryBean implements FactoryBean {


	@Override
	public Object getObject() throws Exception {
		//单例池 存放 90%
		TMapper mapper = (TMapper) MySqlSession.getMapper(TMapper.class);
		return mapper;
	}

	@Override
	public Class<?> getObjectType() {
		return TMapper.class;
	}


}
