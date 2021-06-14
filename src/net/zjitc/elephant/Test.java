package net.zjitc.elephant;

import net.zjitc.elephant.Elephant;
import net.zjitc.elephant.Fridge;

/**
 * @Author admin
 * @Date 2019/3/12 13:50
 */
public class Test {
    public static void main(String[] args) {
        Elephant elephant=new Elephant();
        Fridge fridge=new Fridge();

        fridge.open();
        elephant.in();
        fridge.close();
    }
}
