package com.company;

enum color{
    blue,
    red,
    green,
    white,
    black,
    grey,
}

public class Ball {
    float weight = 0;
    color ballColor = color.red;

    public  Ball(float weightInit, color color){
        ballColor = color;
        weight = weightInit;
    }

}