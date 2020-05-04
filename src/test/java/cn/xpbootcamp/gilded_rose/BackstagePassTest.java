package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.commodity.BackstagePass;
import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackstagePassTest {

    //保质期大于等于10，质量每天加1且质量不会超过50
    @Test
    public void quality_should_add_one_if_sellIn_bigger_than_10(){
        Commodity backstagePass = new BackstagePass();
        //大于十天
        int quality1 = backstagePass.calculateQuality(10,30,20);
        Assertions.assertEquals(30,quality1);
        //等于十天
        int quality2 = backstagePass.calculateQuality(20,30,20);
        Assertions.assertEquals(40,quality2);
        //质量大于50
        int quality3 = backstagePass.calculateQuality(31,40,20);
        Assertions.assertEquals(50,quality3);
    }

    //保质期　[5,10)，质量每天加2且质量不会超过50
    @Test
    public void quality_should_add_two_if_sellIn_belong_5_to_10(){
        Commodity backstagePass = new BackstagePass();
        //5-10天以内
        int quality1 = backstagePass.calculateQuality(21,30,20);
        //质量超过50
        int quality2 = backstagePass.calculateQuality(31,40,20);
        //处于第五天时
        int quality3 = backstagePass.calculateQuality(15,20,20);
        Assertions.assertEquals(42,quality1);
        Assertions.assertEquals(50,quality2);
        Assertions.assertEquals(40,quality3);
    }

    //保质期　[0,5)，质量每天加3且质量不会超过50
    @Test
    public void quality_should_add_three_if_sellIn_belong_0_to_5(){
        Commodity backstagePass = new BackstagePass();
        //0到5天以内
        int quality1 = backstagePass.calculateQuality(26,30,10);
        //质量超过50
        int quality2 = backstagePass.calculateQuality(26,30,20);
        //处于第0天
        int quality3 = backstagePass.calculateQuality(20,20,10);
        Assertions.assertEquals(43,quality1);
        Assertions.assertEquals(50,quality2);
        Assertions.assertEquals(45,quality3);
    }

    //过了演唱会那天
    @Test
    public void quality_should_equal_0_if_sellIn_less_than_0(){
        Commodity backstagePass = new BackstagePass();
        int quality = backstagePass.calculateQuality(31,30,10);
        Assertions.assertEquals(0,quality);
    }
}
