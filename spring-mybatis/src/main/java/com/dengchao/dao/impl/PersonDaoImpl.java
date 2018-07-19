package com.dengchao.dao.impl;

import com.dengchao.dao.PersonDao;
import com.dengchao.entity.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:12  2018/7/18 0018
 */

public class PersonDaoImpl extends SqlSessionDaoSupport implements PersonDao{

    private SqlSession sqlSession;

    //主要是继承SqlSessionDaoSupport类的方式来获取SqlSession
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Person> selectAllPerson() {
        sqlSession = getSqlSession();
        List<Person> list = sqlSession.selectList("PersonMapper.selectAllPerson");
        return list;
    }

    @Override
    public int insertPerson(Person person) {
        sqlSession = getSqlSession();
        int i = sqlSession.insert("PersonMapper.insertPerson", person);
        return i;
    }
}
