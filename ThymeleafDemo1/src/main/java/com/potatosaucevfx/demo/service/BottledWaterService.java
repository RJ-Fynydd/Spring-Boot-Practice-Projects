package com.potatosaucevfx.demo.service;

import com.potatosaucevfx.demo.model.BottledWater;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
@Service
public class BottledWaterService {

    public static List<BottledWater> getBottleOfWaterList() {
        Random rand = new Random();
        // DB stuff would go here.
        // But for testing heres this.
        List<BottledWater> bottleArray = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            String brand;
            switch (rand.nextInt(3)) {
                case 0:
                    brand = "Dasani";
                    break;
                case 1:
                    brand = "Aquafina";
                    break;
                case 2:
                    brand = "Off Brand";
                    break;
                default:
                    brand = "null";
                    break;
            }

            bottleArray.add(new BottledWater(brand, rand.nextDouble() * 30, rand.nextBoolean()));

        }
        return bottleArray;
    }

}
