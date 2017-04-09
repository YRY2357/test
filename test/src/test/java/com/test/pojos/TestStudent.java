package com.test.pojos;

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
		System.out.println(12344);
		ac = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		iss=(IStudentService) ac.getBean("studentServiceImpl");
		
	}
	@Test
	public void testStudent(){
		BeanStudent bs= new BeanStudent(1,"小明","男",18,null);
		System.out.println(bs.getName());
	}

}
