package cn.xpbootcamp.gilded_rose.commodity;

public class AgedBrie extends Commodity{

    @Override
    public int calculateQuality(int day, int sellIn,int quality) {
        //确保商品价格上限不超过50
        if(quality + day >= 50){
            this.setQuality(50);
        }
        //不超过50，质量每天加1
        else{
            this.setQuality(quality + day);
        }
        return this.getQuality();
    }
}
