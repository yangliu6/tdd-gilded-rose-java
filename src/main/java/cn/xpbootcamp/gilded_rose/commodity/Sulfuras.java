package cn.xpbootcamp.gilded_rose.commodity;

public class Sulfuras extends Commodity {

    @Override
    public int calculateQuality(int day, int sellIn,int quality) {
        //无论天数怎么变，quality都不变
        this.setQuality(quality);
        return this.getQuality();
    }
}
