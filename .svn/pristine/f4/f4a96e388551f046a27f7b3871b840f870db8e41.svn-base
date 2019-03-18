package com.service;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

import common.CommonUtil;

public class BaseService {

	private Logger log = null;
	public CommonUtil commonUtil = new CommonUtil();
    public SqlSessionTemplate sqlSessionTemplate = null;
	public Logger getLog(Class<?> classStr) {
		return Logger.getLogger(classStr);
	}
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

    
}
