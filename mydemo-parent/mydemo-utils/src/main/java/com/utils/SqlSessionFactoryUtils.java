package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: mydemo-parent
 * @description:
 * @author: admin
 * @create: 2019-10-03 16:38
 **/
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory factory;
    static {
        InputStream inputStream = null;
        try {
             inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException("读取配置文件失败",e);
        }
         factory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    public static SqlSessionFactory getFactory(){
        return  factory;
    }
}
