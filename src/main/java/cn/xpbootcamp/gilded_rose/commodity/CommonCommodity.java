package cn.xpbootcamp.gilded_rose.commodity;

import com.sun.javafx.css.CalculatedValue;

public class CommonCommodity extends Commodity{

    @Override
    public int calculateQuality(int day,int sellIn,int quality){
        //没过保质期，质量每天减少1
       if(day <= sellIn){
           this.setQuality(quality-day);
       }
       //过了保质期，质量呈双倍减少
        else{
            int difference = day - sellIn;
            this.setQuality(quality-sellIn-2*difference);
        }
        //quality减到0将不再减少
        if(this.getQuality() <= 0)
        {
            return 0;
        }
        return this.getQuality();
    }
}
