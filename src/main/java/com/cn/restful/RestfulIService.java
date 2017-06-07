package com.cn.restful;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.model.PersonModel;


@Controller
@RequestMapping("/restful")
public interface RestfulIService {
	
	
	 @RequestMapping(value = "/hello", produces = "text/plain;charset=UTF-8")  
	    public @ResponseBody  
	    String hello();  
	  
	      
	    @RequestMapping(value = "/say/{msg}", produces = "application/json;charset=UTF-8")  
	    public @ResponseBody  
	    String say(@PathVariable(value = "msg") String msg);  
	  
	      
	    @RequestMapping(value = "/getPerson/{id:\\d+}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")  
	    public @ResponseBody  
	    String getPerson(@PathVariable("id") String id);  
	      
	      
	    @RequestMapping(value = "/deletePerson/{id:\\d+}", method = RequestMethod.DELETE)  
	    public @ResponseBody Object deletePerson(@PathVariable("age") int age) ;  
	      
	    /** 
	     * 推荐使用，这种可以解决绝大多数问题 
	     * @param person 
	     * @return 
	     */  
	    @RequestMapping(value = "/addPerson", method = RequestMethod.POST,   
	            produces = "application/json;charset=UTF-8",  
	            consumes = "application/json;charset=UTF-8" )  
	    public String addPerson(PersonModel person);  
	      
	      
	    @RequestMapping(value = "/updatePerson", method = RequestMethod.PUT)  
	    public @ResponseBody Object updatePerson(@RequestBody PersonModel person);  
	
}
