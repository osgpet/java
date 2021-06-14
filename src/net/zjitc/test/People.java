package net.zjitc.test;

/**
 * @Author admin
 * @Date 2019/3/12 14:34
 */
public class People {
    /* 封装：属性设置私有的*/
   private int age;
    String name;
    /*为属性添加set和get方法，分别用来设置和获取属性值*/
    void setAge(int age){
        if(age<0){
            System.out.println("年龄不能为负数");
        }else{
            this.age=age;
        }
    }

   int getAge(){
        return age;
   }

    void speak(){
        System.out.println(name+"说话");
    }
}
