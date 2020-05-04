package cn.xpbootcamp.gilded_rose;


import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import cn.xpbootcamp.gilded_rose.commodity.CommonCommodity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonCommodityTest {

    @Test
    public void should_return_correct_vale_if_day_bigger_than_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality = commonCommodity.calculateQuality(6,5,30);
        Assertions.assertEquals(23,quality);
    }

    @Test
    public void should_return_correct_vale_if_day_smaller_than_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality = commonCommodity.calculateQuality(3,5,30);
        Assertions.assertEquals(27,quality);
    }

    @Test
    public void should_return_correct_vale_if_day_equal_quality(){
        Commodity commonCommodity = new CommonCommodity();
        int quality = commonCommodity.calculateQuality(5,5,30);
        Assertions.assertEquals(25,quality);
    }
}
