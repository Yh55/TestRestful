package com.cn.restful.impl;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.model.PersonModel;
import com.cn.restful.RestfulIService;


@Controller
public class RestfulServiceImpl  implements  RestfulIService{

	 /** 日志实例 */  
    private static final Logger logger = Logger.getLogger(RestfulServiceImpl.class);  
  
    public @ResponseBody  
    String hello() {  
        logger.info("hello........");  
        return "你好！hello";  
    }  
  
    public @ResponseBody  
    String say(@PathVariable(value = "msg") String msg) {  
        return "{\"msg\":\"you say:'" + msg + "'\"}";  
    }  
  
    public @ResponseBody  
    String getPerson(@PathVariable("id") String id) {  
        logger.info("获取人员信息id=" + id);  
        PersonModel person = new PersonModel();  
        person.setName("张三");  
        person.setSex("男");  
        person.setAge(30);  
        person.setId(id);  
          
        JSONObject jsonObject = JSONObject.fromObject(person);  
        logger.info(jsonObject);  
        logger.info(jsonObject.toString());  
        return jsonObject.toString();  
    }  
      
    public Object deletePerson(@PathVariable("age") int age) { 
        logger.info("删除人员信息id=" + age);  
        JSONObject jsonObject = new JSONObject();  
            jsonObject.put("msg", "删除人员信息成功");  
    return jsonObject;  
    }  
  
  
    public @ResponseBody String addPerson(@RequestBody PersonModel person) {  
        logger.info("注册人员信息成功id=" + person.getId());  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("msg", "注册人员信息成功");  
        return jsonObject.toString();  
    }  
      
    public @ResponseBody Object updatePerson(@RequestBody PersonModel person) {  
        logger.info("更新人员信息id=" + person.getId());  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("msg", "更新人员信息成功");  
        return jsonObject.toString();  
    }

}
