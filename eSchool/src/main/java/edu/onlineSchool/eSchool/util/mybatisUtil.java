package edu.onlineSchool.eSchool.util;

import org.apache.ibatis.session.*;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

public class mybatisUtil {
    private static SqlSessionFactory sessionFactory;
    static{
        Reader reader;
        try{
            reader=Resources.getResourceAsReader("mybatis-configuration.xml");
            sessionFactory=new SqlSessionFactoryBuilder().build(reader);


        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static  SqlSessionFactory getSqlSessionFactory(){
        return sessionFactory;
    }
}
