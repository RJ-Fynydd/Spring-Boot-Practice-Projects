package com.potatosaucevfx.demo.model;

import java.text.DecimalFormat;

/**
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
public class BottledWater {

    private String brand;
    private double waterVolume;
    private boolean purified;

    public BottledWater(String brand, double waterVolume, boolean purified) {
        this.brand = brand;
        this.waterVolume = waterVolume;
        this.purified = purified;
    }

    public String isPurified() {
        if (purified) {
            return "Purified";
        } else {
            return "Spring";
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWaterVolume() {
        DecimalFormat format = new DecimalFormat("##.##");
        return format.format(waterVolume);
    }

    public void setWaterVolume(double waterVolume) {
        this.waterVolume = waterVolume;
    }

    public void setPurified(boolean purified) {
        this.purified = purified;
    }

    @Override
    public String toString() {
        return "BottledWater{" + "brand=" + brand + ", waterVolume=" + waterVolume + ", type=" + isPurified() + '}';
    }

}
