//package com.ccq.utils;
//
//import com.ccq.mapper.UserMapper;
//import com.ccq.pojo.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created by hongjian.chen on 2018/8/1.
// */
//public class MyBatisUtil {
//    private static ApplicationContext ctx;
//
//    private static SqlSession sqlSession = null;
//
//    static {
//        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//    }
//
//    public static SqlSession getSqlSession() {
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ctx.getBean("sqlSessionFactory");
//        sqlSession = sqlSessionFactory.openSession();
//        return sqlSession;
//    }
//
//    public static void main(String[] args) {
//        User user = getSqlSession().getMapper(UserMapper.class).getUserByUserId("admin");
//        System.out.println(user.getNickname() + ";" + user.getPassword());
//
//    }
//}
