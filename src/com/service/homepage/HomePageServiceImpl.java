package com.service.homepage;

import org.apache.log4j.Logger;

import com.service.BaseService;


public class HomePageServiceImpl extends BaseService{

	Logger log = this.getLog(this.getClass());//加载log方法

	public String Test(){
		
//		UserinfoExample userExmp = new UserinfoExample();
//		userExmp.or().andNameIsNotNull();
//		SqlSession sqlSession = this.getSqlSessionTemplate().getSqlSessionFactory().openSession();
//		UserinfoMapper userinfoMapper = sqlSession.getMapper(UserinfoMapper.class);
//		List<Userinfo> list = userinfoMapper.selectByExample(userExmp);
//		for (Userinfo s : list)
//			log.info(s.getName()+"   "+s.getPwd());
		return "";
		
	}
}
