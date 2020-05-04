package cn.xpbootcamp.gilded_rose.commodity;

public class BackstagePass extends Commodity{
    @Override
    public int calculateQuality(int day, int sellIn, int quality) {
        this.setSellIn(sellIn-day);//设置当前的保质期
        int currentSellIn = this.getSellIn();
        if(currentSellIn<0){
            return 0;
        }

        if(currentSellIn >= 10){
            this.setQuality(quality + day);
        }
        else if(currentSellIn >= 5 && currentSellIn<10){
            quality = quality + (10-currentSellIn)*2 + sellIn - 10 ;
            this.setQuality(quality);
        }
        else if(currentSellIn >= 0 && currentSellIn <5){
            quality = quality + sellIn + (5-currentSellIn)*3;
            this.setQuality(quality);
        }

        if(this.getQuality()>50)
        {
            return 50;
        }

        return this.getQuality();
    }
}
