package com.dengchao.dao.impl;

import com.dengchao.dao.PersonDao;
import com.dengchao.entity.Person;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:12  2018/7/18 0018
 */

public class PersonDaoImpl implements PersonDao{

    private SqlSessionTemplate sqlSessionTemplate;

    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Person> selectAllPerson() {
        List<Person> list = sqlSessionTemplate.selectList("PersonMapper.selectAllPerson");
        return list;
    }

    @Override
    public int insertPerson(Person person) {
        int i = sqlSessionTemplate.insert("PersonMapper.insertPerson", person);
        return i;
    }
}
