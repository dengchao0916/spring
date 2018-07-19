package com.dengchao.service.impl;

import com.dengchao.dao.PersonDao;
import com.dengchao.entity.Person;
import com.dengchao.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:15  2018/7/18 0018
 */

public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;
    @Override
    public List<Person> selectAllPerson() {
        List<Person> list = personDao.selectAllPerson();
        return list;
    }

    @Override
    public int insertPerson(Person person) {
        int i = personDao.insertPerson(person);
        return i;
    }
}
