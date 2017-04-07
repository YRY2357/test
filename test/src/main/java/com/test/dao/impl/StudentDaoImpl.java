package com.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.test.bean.BeanStudent;
import com.test.dao.IStudentDao;
import com.test.util.DBUtil;

public class StudentDaoImpl extends DBUtil implements IStudentDao {

	public void saveStudent(BeanStudent stu) {
		// TODO Auto-generated method stub
		Connection con=getConnection();
		String sql="INSERT INTO student VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1, stu.getId());
			pre.setString(2, stu.getName());
			pre.setString(3, stu.getGender());
			pre.setInt(4, stu.getAge());
			pre.setString(5, stu.getPhone());
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cloneConection(con);
		}
		
	}

	public void updateStudent(BeanStudent stu) {
		// TODO Auto-generated method stub
		Connection con=getConnection();
		String sql="UPDATE student SET st_gender=? WHERE st_id=?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setString(1, stu.getGender());
			pre.setInt(2, stu.getId());
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cloneConection(con);
		}
	}

	public void deleteStudent(BeanStudent stu) {
		// TODO Auto-generated method stub
		Connection con=getConnection();
		String sql="DELETE FROM t_student WHERE st_id=?";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			pre.setInt(1, stu.getId());
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cloneConection(con);
		}
	}

	public List<BeanStudent> findStudent(BeanStudent stu) {
		// TODO Auto-generated method stub
		List<BeanStudent>list=new ArrayList<BeanStudent>();
		Connection con=getConnection();
		String sql="SELECT *FROM t_student";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet res=pre.executeQuery();
			while(res.next()){
				stu=new BeanStudent();
				stu.setId(res.getInt(1));
				stu.setName(res.getString(2));
				stu.setGender(res.getString(3));
				stu.setAge(res.getInt(4));
				stu.setPhone(res.getString(5));
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			cloneConection(con);
		}
		return list;
	}

}
