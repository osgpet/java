package net.zjitc.test;

import net.zjitc.test.People;

/**
 * @Author admin
 * @Date 2019/3/12 14:35
 */
public class PeopleTest {
    public static void main(String[] args) {
        People people=new People();
        people.name="张三";
        /* 私有属性不能直接访问*/
//        people.age=-10;
        /* 通过get和set去获取和设置属性值*/
        people.setAge(-10);
        people.speak();
        System.out.println("年龄是："+people.getAge());

    }
}
