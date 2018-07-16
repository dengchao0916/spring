package com.dengchao.factory;

import java.util.HashMap;
import java.util.Map;

import com.dengchao.bean.Car;

public class InstanceCarFactory {
    private Map<String, Car> cars = null;

    public InstanceCarFactory() {
        cars = new HashMap<String, Car>();
        cars.put("audi", new Car("audi", 50));
        cars.put("ford", new Car("ford", 60));
    }

    public Car getCar(String brand) {
        return cars.get(brand);
    }
}
