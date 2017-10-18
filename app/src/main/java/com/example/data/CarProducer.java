package com.example.data;

/**
 * Created by TWPRUANHONG on 2017/3/9.
 */

public class CarProducer {
    private String name;
    private int logoRes;

    public CarProducer(int logoRes,String name) {
        this.logoRes = logoRes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogoRes() {
        return logoRes;
    }

    public void setLogoRes(int logoRes) {
        this.logoRes = logoRes;
    }
}
