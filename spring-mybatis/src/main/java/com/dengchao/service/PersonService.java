package com.dengchao.service;

import com.dengchao.entity.Person;

import java.util.List;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:14  2018/7/18 0018
 */
public interface PersonService {
    public List<Person> selectAllPerson();
    public int insertPerson(Person person);
}
