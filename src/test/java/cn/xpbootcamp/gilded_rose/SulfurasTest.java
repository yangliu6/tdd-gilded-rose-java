package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import cn.xpbootcamp.gilded_rose.commodity.Sulfuras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SulfurasTest {
    @Test
    public void should_return_same_quality(){
        Commodity sulfurasOne = new Sulfuras();
        Commodity sulfurasTwo = new Sulfuras();
        int qualityOne = sulfurasOne.calculateQuality(2,30,90);
        int qualityTwo = sulfurasTwo.calculateQuality(100,30,90);
        Assertions.assertEquals(90,qualityOne);
        Assertions.assertEquals(90,qualityTwo);
    }
}
