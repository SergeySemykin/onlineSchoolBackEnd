package edu.onlineSchool.eSchool.repo;

import edu.onlineSchool.eSchool.model.AppUser;
import edu.onlineSchool.eSchool.model.Pupils;
import edu.onlineSchool.eSchool.util.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppUserMapper {
    public AppUser getCurrentUser(String login,String password){
        SqlSession sqlSession= mybatisUtil.getSqlSessionFactory().openSession();
        AppUser currentUser=sqlSession.selectOne("getUser");
        sqlSession.commit();
        sqlSession.close();
        return currentUser;
    }
}
