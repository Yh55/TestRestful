package com.cn.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.Service.impl.TestServiceImpl;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestServiceImpl testService; 
	
	/*@RequestMapping(value="/listInfo")
	public @ResponseBody Map listInfo(@PathVariable(value="jsonInfo") String jsonInfo){
		String info = testService.testInfo(jsonInfo);
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		mapInfo.put("info", info);
		return mapInfo;
	}*/
	
	
	@RequestMapping("pagInfo")
	public String list(HttpServletRequest request){
		return "index";
	}
}
