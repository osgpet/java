package net.zjitc.shopping;

import net.zjitc.shopping.Goods;
import net.zjitc.shopping.Market;

/**
 * @Author admin
 * @Date 2019/3/12 16:10
 * 测试类：
 *   main()方法：创建对象、调用方法
 */
public class ShoppingTest {
    public static void main(String[] args) {
       /* 1、创建若干个商品对象
       * 2、创建超市对象
       * 3、超市对象中添加一些商品
       * 4、创建顾客对象
       * 5、调用顾客对象的shopping方法*/
       Goods goods1=new Goods();
       goods1.setgName("茶叶蛋");
       Goods goods2=new Goods();
       goods2.setgName("酸奶");

       Market market=new Market();
       market.setmName("十足");
//      超市中添加商品
       Goods[] goods={goods1,goods2};
       market.setGoodsArray(goods);

       Custom custom=new Custom();
       custom.setcName("小王");
       custom.shopping(market,"茶叶蛋");
       custom.shopping(market,"作业");


    }
}
