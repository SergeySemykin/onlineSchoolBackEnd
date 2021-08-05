package edu.onlineSchool.eSchool.repo;

import edu.onlineSchool.eSchool.model.Pupils;
import edu.onlineSchool.eSchool.util.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PupilsMapper {
    public List<Pupils> getAll(){
        SqlSession sqlSession=mybatisUtil.getSqlSessionFactory().openSession();
        List<Pupils> pupilsList=sqlSession.selectList("getAll");
        sqlSession.commit();
        sqlSession.close();
        return pupilsList;
    }
    public void addPupil(Pupils pupils){
        SqlSession session= mybatisUtil.getSqlSessionFactory().openSession();
        session.insert("addPupil",pupils);
        session.commit();
        session.close();
    }
    public void deletePupil(int pupilId){
        SqlSession session= mybatisUtil.getSqlSessionFactory().openSession();
        session.delete("deletePupil",pupilId);
        session.commit();
        session.close();
    }
}
