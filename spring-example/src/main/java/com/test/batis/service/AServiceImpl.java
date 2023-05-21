package com.test.batis.service;

import com.test.batis.dao.AMapper;
import com.test.batis.dao.CMapper;
import com.test.batis.dao.TMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class AServiceImpl implements AService{
	//1、对象？
	//2、tMapper如何产生的？谁产生的
	@Autowired
	CMapper cMapper;

//	public void settMapper(TMapper tMapper) {
//		this.tMapper = tMapper;
//	}


	@Override
	public List<Map<String, Object>> queryFroList() {
		//aMapper.queryFroList();
		return cMapper.queryFroList();
	}


	@Override
	public Map<String, Object> queryFroMap(Integer id) {
		return cMapper.queryFroMap(id);
	}
}
