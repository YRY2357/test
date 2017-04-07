package com.test.service;

import java.util.List;

import com.test.bean.BeanStudent;

public interface IStudentService {
	public void saveStudent(BeanStudent stu) throws Exception;
	public void updateStudent(BeanStudent stu) throws Exception;
	public void deleteStudent(BeanStudent stu) throws Exception;
	public List<BeanStudent> findStudent(BeanStudent stu) throws Exception;

}
