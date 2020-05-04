package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.commodity.AgedBrie;
import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgedBrieTest {

    @Test
    public void should_return_50_if_quality_add_day_bigger_than_50(){
        Commodity agedBrie = new AgedBrie();
        int quality = agedBrie.calculateQuality(20,18,49);
        Assertions.assertEquals(50,quality);
    }

    @Test
    public void should_return_correct_vale_if_quality_add_day_smaller_than_50(){
        Commodity agedBrie = new AgedBrie();
        int quality = agedBrie.calculateQuality(2,18,18);
        Assertions.assertEquals(20,quality);
    }
}
