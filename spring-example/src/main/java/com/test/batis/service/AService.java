package com.test.batis.service;

import java.util.List;
import java.util.Map;

public interface AService {
	public List<Map<String,Object>> queryFroList();
	public Map<String,Object> queryFroMap(Integer id);
}
