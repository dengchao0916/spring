package com.dengchao.service.impl;

import com.dengchao.entity.Person;
import com.dengchao.mapper.PersonMapper;
import com.dengchao.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:15  2018/7/18 0018
 */

@Service
public class PersonServiceImpl implements PersonService {

    private PersonMapper personMapper;

    @Resource
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> selectAllPerson() {
        List<Person> list = personMapper.selectAllPerson();
        return list;
    }

    @Override
    public int insertPerson(Person person) {
        int i = personMapper.insertPerson(person);
        return i;
    }
}
