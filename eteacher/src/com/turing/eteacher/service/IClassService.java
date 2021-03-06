package com.turing.eteacher.service;

import java.util.List;
import java.util.Map;

import com.turing.eteacher.base.IService;
import com.turing.eteacher.model.Classes;

public interface IClassService extends IService<Classes> {

	//获取全部班
	public List<Map> getClassList();
	//根据课程Id查找班级Id
	public List<String> getClassIdsByCourseId(String courseId);
	
	// 获取用户当前学期所有课程对应的班级列表
	public List<Map> getClassListByUser(String userId,String tpId);
	//删除指定课程的班级
	public void deleteClassByCourseId(String courseId);
	//增加班级课程对应信息
	public void addCourseClasses(String courseId,String classId);
}
