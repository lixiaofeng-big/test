package com.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @program: mydemo-parent
 * @description:
 * @author: admin
 * @create: 2019-10-03 21:06
 **/
public class GetMapperFactory {
    public static <T> T getMapper(Class<T> clz){
        SqlSessionFactory factory = SqlSessionFactoryUtils.getFactory();
        SqlSession sqlSession = factory.openSession(true);
        T mapper = sqlSession.getMapper(clz);
        return mapper;
    }
}
