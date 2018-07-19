package com.dengchao.main;

import com.dengchao.entity.Person;
import com.dengchao.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author : Administrator
 * @Description :
 * @date : 下午 7:29  2018/7/18 0018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class PersonTest {

    @Autowired
    private PersonService personService;

    @Test
    public void demo() {


        Person person = new Person();
        person.setName("python");
        person.setAddress("中国台湾");
        person.setCoId(3);
        person.setIdCard("123123123123");
        person.setPhone("13733333337");

        int i = personService.insertPerson(person);
        System.out.println(i);


        /*List<Person> list = personService.selectAllPerson();
        System.out.println(list.size());
        for (Person temp : list) {
            System.out.println(temp.toString());
        }*/
    }
}
