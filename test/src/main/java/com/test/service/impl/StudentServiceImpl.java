package com.test.service.impl;

import java.util.List;

import com.test.bean.BeanStudent;
import com.test.dao.IStudentDao;
import com.test.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	
	public StudentServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentServiceImpl(IStudentDao dao) {
		super();
		this.dao = dao;
	}

	public void saveStudent(BeanStudent stu) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(4556489);
		dao.saveStudent(stu);
	}

	public void updateStudent(BeanStudent stu) throws Exception {
		// TODO Auto-generated method stub
		dao.updateStudent(stu);
	}

	public void deleteStudent(BeanStudent stu) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteStudent(stu);
	}

	public List<BeanStudent> findStudent(BeanStudent stu) throws Exception {
		// TODO Auto-generated method stub
		return dao.findStudent(stu);
	}

}
