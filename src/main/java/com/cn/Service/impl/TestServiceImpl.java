package com.cn.Service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cn.Service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	Logger logger = Logger.getLogger(TestServiceImpl.class);  

	
	public String testInfo(String jsonInfo) {
		logger.info("serviceImpl:"+jsonInfo);
		return jsonInfo;
	}

}
