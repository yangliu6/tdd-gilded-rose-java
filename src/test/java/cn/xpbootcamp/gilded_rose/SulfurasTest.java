package cn.xpbootcamp.gilded_rose;

import cn.xpbootcamp.gilded_rose.commodity.Commodity;
import cn.xpbootcamp.gilded_rose.commodity.Sulfuras;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SulfurasTest {
    @Test
    public void should_return_same_quality(){
        Commodity sulfuras = new Sulfuras();
        int quality1 = sulfuras.calculateQuality(2,50,90);
        int quality2 = sulfuras.calculateQuality(100,50,90);
        Assertions.assertEquals(90,quality1);
        Assertions.assertEquals(90,quality2);
    }
}
