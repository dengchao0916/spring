package com.dengchao.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
    //后面的 “+” 号，表示只要是Person及其子类都可以添加新的方法
    @DeclareParents(value = "com.dengchao.main.Person+", defaultImpl = FemaleAnimal.class)
    public Animal animal;

}
