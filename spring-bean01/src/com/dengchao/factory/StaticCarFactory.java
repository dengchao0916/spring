package com.dengchao.factory;

import java.util.HashMap;
import java.util.Map;

import com.dengchao.bean.Car;

/**
 * 静态工厂方法：直接调用某一个类的静态方法，就可以返回bean的实例
 * 
 * @author Administrator
 * 
 */

public class StaticCarFactory {

    private static Map<String, Car> cars = new HashMap<String, Car>();

    static {
        cars.put("audi", new Car("audi", 30));
        cars.put("ford", new Car("ford", 20));
    }

    // 静态工厂方法
    public static Car getCar(String name) {
        return cars.get(name);
    }

}
