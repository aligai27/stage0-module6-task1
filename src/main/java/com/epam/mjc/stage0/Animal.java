package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public  Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal () {

    }

    public String getDescription() {
        String pawS = numberOfPaws > 1? "s":"";
        String fur = hasFur?"a":"no";
        return String.format("This animal is mostly %s. It has %d paw%s and %s fur.", color, numberOfPaws, pawS, fur);

    }


}
