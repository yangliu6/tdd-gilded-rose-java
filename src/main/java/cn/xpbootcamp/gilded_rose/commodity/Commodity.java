package cn.xpbootcamp.gilded_rose.commodity;

//定义商品类
public class Commodity {
    private int SellIn;//商品距离保质期的距离
    private int Quality;//商品价值

    public Commodity(){

    }

    public Commodity(int quality,int sellIn){
        this.SellIn = sellIn;
        this.Quality = quality;
    }

    public void setSellIn(int SellIn){
        this.SellIn = SellIn;
    }

    public int getSellIn(){
        return this.SellIn;
    }

    public void setQuality(int Quality){
        this.Quality = Quality;
    }

    public int getQuality(){
        return this.Quality;
    }

    //对于有保质期的商品计算quality值
    public int calculateQuality(int day,int sellIn,int quality) {
        return this.getQuality();
    }

    //对于无保质期的商品计算quality值
    public int calculateQuality(int day,int quality) {
        return this.getQuality();
    }
}
