package net.zjitc.shopping;

/**
 * @Author admin
 * @Date 2019/3/12 15:52
 * 顾客类：
 *   属性：顾客名称
 *   方法：封装方法、购物
 */
public class Custom {
    private String cName;

    /**
     * 表示顾客到某个超市去买某个商品，
     * 调用超市类的方法实现：
     *   若超市中存在该商品，则输出：顾客在超市买到了商品
     *   若不存在，则输出：顾客白跑了，在超市没有买到商品
     * @param market  超市对象
     * @param gName  商品名称
     */
    void shopping(Market market, String gName){
       Goods goods=market.sell(gName);
       if(goods==null){
           System.out.println(cName+"白跑了一趟，在"
                   +market.getmName()+"没有买到"+gName);
       }else{
           System.out.println(cName+"在"+market.getmName()
           +"买到了"+gName);
       }
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcName() {
        return cName;
    }
}
