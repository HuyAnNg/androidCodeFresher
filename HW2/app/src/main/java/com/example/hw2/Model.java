package com.example.hw2;

public class Model {
    private String day;
    private String quality;
    private String temp1;
    private String temp2;
    private int pic;

    public Model(String day, String quality, String temp1, String temp2, int pic) {
        this.day = day;
        this.quality = quality;
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.pic = pic;
    }


    public String getDay() {
        return day;
    }

    public String getQuality() {
        return quality;
    }

    public String getTemp1() {
        return temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public int getPic() { return pic; }
}
