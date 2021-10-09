package com.company;

public class Main {

    public static void main(String[] args) {

        Ball ball1 = new Ball(6, color.blue);
        Ball ball2 = new Ball(2, color.red);
        Ball ball3 = new Ball(4, color.blue);
        Ball ball4 = new Ball(2, color.green);
        Ball ball5 = new Ball(5, color.white);
        Ball ball6 = new Ball(7, color.red);
        Ball ball7 = new Ball(1, color.blue);

        Basket basket = new Basket();

        basket.AddBallInBasket(ball1);
        basket.AddBallInBasket(ball2);
        basket.AddBallInBasket(ball3);
        basket.AddBallInBasket(ball4);
        basket.AddBallInBasket(ball5);
        basket.AddBallInBasket(ball6);
        basket.AddBallInBasket(ball7);

        basket.findBlueBalls();

        float res = basket.FindBallsWeight();

        System.out.println("Basket balls weight:" + res);


    }

}


