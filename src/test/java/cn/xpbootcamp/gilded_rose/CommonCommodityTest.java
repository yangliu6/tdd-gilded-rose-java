package cn.xpbootcamp.gilded_rose;


import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import cn.xpbootcamp.gilded_rose.commodity.CommonCommodity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonCommodityTest {

    @Test
    //普通商品过期后质量双倍减少，且不能低于0
    public void should_return_correct_vale_if_day_bigger_than_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality1 = commonCommodity.calculateQuality(6,5,30);
        int quality2 = commonCommodity.calculateQuality(6,5,5);
        Assertions.assertEquals(23,quality1);
        Assertions.assertEquals(0,quality2);
    }

    @Test
    //普通商品没过期质量每天减1，且不能低于0
    public void should_return_correct_vale_if_day_smaller_than_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality1 = commonCommodity.calculateQuality(3,5,30);
        int quality2 = commonCommodity.calculateQuality(6,10,5);
        Assertions.assertEquals(27,quality1);
        Assertions.assertEquals(0,quality2);
    }

    @Test
    //刚好到保值期那天，质量减1，且不能低于0
    public void should_return_correct_vale_if_day_equal_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality1 = commonCommodity.calculateQuality(5,5,30);
        int quality2 = commonCommodity.calculateQuality(10,10,9);
        Assertions.assertEquals(25,quality1);
        Assertions.assertEquals(0,quality2);
    }
}
