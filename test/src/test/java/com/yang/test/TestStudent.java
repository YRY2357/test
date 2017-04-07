package com.yang.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.BeanStudent;
import com.test.service.IStudentService;


public class TestStudent {
	private ApplicationContext ac = null;
	private IStudentService iss;

	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		iss=(IStudentService) ac.getBean("studentServiceImpl");
	}
	@Test
	public void testStudent(){
		BeanStudent bs= new BeanStudent(1,"Ð¡Ã÷","ÄÐ",18,null);
		System.out.println(bs);
	}

}
