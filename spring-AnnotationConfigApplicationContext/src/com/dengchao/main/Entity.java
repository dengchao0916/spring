package com.dengchao.main;

public class Entity {

    private String name;
    private int time;

    public Entity() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Entity [name=" + name + ", time=" + time + "]";
    }

}
