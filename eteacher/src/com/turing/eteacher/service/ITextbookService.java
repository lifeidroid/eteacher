package com.turing.eteacher.service;

import java.util.List;

import com.turing.eteacher.base.IService;
import com.turing.eteacher.model.Textbook;

public interface ITextbookService extends IService<Textbook> {

	/**
	 * 根据课程ID查询教材
	 * @param courseId
	 * @return
	 */
	public Textbook getMainTextbook(String courseId);
	
	/**
	 * 根据课程ID查询教辅
	 * @param courseId
	 * @return
	 */
	public List<Textbook> getTextbookList(String courseId);
}
