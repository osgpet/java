package net.zjitc.shopping;

/**
 * @Author admin
 * @Date 2019/3/12 15:08
 * 超市类：
 *   属性：超市名称、商品数组
 *   方法：封装方法、卖货
 */
public class Market {
    private String mName;
    private Goods[] goodsArray;

    /**
     * 遍历商品数组，若数组中存在该商品，则返回该商品对象，
     * 若不存在，返回null,表示超市中没有该商品
     * @param gName
     * @return
     */
    Goods sell(String gName){
        for (int i = 0; i <goodsArray.length ; i++) {
//           比较传入的商品名称 与 超市中某商品名称是否一致
            if(goodsArray[i].getgName().equals(gName)){
                return goodsArray[i];
            }
        }
        return null;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setGoodsArray(Goods[] goodsArray) {
        this.goodsArray = goodsArray;
    }

    public Goods[] getGoodsArray() {
        return goodsArray;
    }
}
