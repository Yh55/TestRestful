package com.cn.test;

import org.apache.log4j.Logger;
import org.junit.Test;

import junit.framework.TestCase;

public class RestfulTest extends TestCase {
	private static Logger LOG = Logger.getLogger(RestfulTest.class);   
	
	
	
    
	   /* private static RestTemplate template = null;  
	      
	    @BeforeClass  
	    public static void beforeClass(){  
	        template = new RestTemplate();   
	          
	    }  */
	      
	      
	    public void testHello(){  
	        LOG.info("进入hello Method start..."); 
	        String url = CommUrl.HELLO;  
	        /** 
	         * 第一个参数是restful接口请求路径 
	         * 第二个参数是响应的类型 String.class 
	         */  
	        /*String result = template.getForObject(url, String.class);  
	        LOG.info("输出结果："+result);  */
	        LOG.info("进入hello Method end...");  
	    }  
	      
	    @Test  
	    public void testSay(){  
	        LOG.info("进入say Method start...");  
	        String url = CommUrl.SAY;
	        url=url+"gaoweigang";
	        /*String url = "http://localhost:8080/springMVCRestful/test/say/gaoweigang";*/  
	        /*String result = template.getForObject(url, String.class);  
	        LOG.info("输出结果："+result);  */
	        LOG.info("进入say Method end...");  
	          
	    }  
	      
	    @Test  
	    public void testGetPerson(){  
	        LOG.info("进入getPerson Method start...");  
	        /** 
	         * restful参数类型是int，不能传String类型的参数，否则调用不到接口 
	         */  
	        String url = CommUrl.GETPERSON;
	        url=url+"101";
	        /*String url = "http://localhost:8080/springMVCRestful/test/person/101";*/  
	        /*String result = template.getForObject(url, String.class);  
	        LOG.info("输出结果："+result);  */
	        LOG.info("进入getPerson Method end...");  
	          
	    }  
	      
	      
	    @Test  
	    public void testDeletePerson(){  
	        LOG.info("进入deletePerson Method start...");  
	        /** 
	         * restful参数类型是int，不能传String类型的参数，否则调用不到接口 
	         */  
	        String url = CommUrl.DELETEPERSON;
	        url=url+"1234";
	        /*String url = "http://localhost:8080/springMVCRestful/test/person/1234";*/  
	          
	       /* try {  
	            template.delete(url);  
	        } catch (RestClientException e) {  
	            e.printStackTrace();  
	        }   */
	        LOG.info("进入deletePerson Method end...");  
	          
	    }  
	      
	      
	    @Test  
	    public void testUpdatePerson(){  
	        LOG.info("进入UpdatePerson Method start...");  
	        /** 
	         * restful参数类型是int，不能传String类型的参数，否则调用不到接口 
	         */  
	        
	        String url=CommUrl.UPDATEPERSON;
	        /*String url = "http://localhost:8080/springMVCRestful/test/person";*/  
	          
	        /*try {  
	            Person person =new Person();  
	            person.setId(1234);  
	            person.setName("gaoweigang");  
	            person.setAge(22);  
	            person.setSex("男");  
	              
	            template.put(url, person);  
	        } catch (RestClientException e) {  
	            e.printStackTrace();  
	        }   */
	        LOG.info("进入UpdatePerson Method end...");  
	          
	    }  
	      
	    @Test  
	    public void testAddPerson(){  
	        LOG.info("进入addPerson Method start...");  
	        /** 
	         * restful参数类型是int，不能传String类型的参数，否则调用不到接口 
	         */  
	        //post
	        String url = CommUrl.ADDPERSON; 
	        /*String url = "http://localhost:8080/springMVCRestful/test/person";*/  
	       /* Person person =new Person();  
	        person.setId(1234);  
	        person.setName("gaoweigang");  
	        person.setAge(22);  
	        person.setSex("男");  
	          
	        String result = template.postForObject(url, person, String.class);  
	        LOG.info("输出结果为："+result);*/
	        LOG.info("进入addPerson Method end...");  
	          
	    }  
}
