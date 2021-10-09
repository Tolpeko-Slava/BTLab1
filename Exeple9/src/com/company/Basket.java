package com.company;
import java.util.ArrayList;

public class Basket {
    static ArrayList<Ball> ballsBasket = new ArrayList<Ball>();

    public void AddBallInBasket(Ball ball) {
        ballsBasket.add(ball);
    }

    public void findBlueBalls()
    {
        boolean flag = true;

        for (int i = 0; i<ballsBasket.size(); i++)
        {
            Ball ballLook = ballsBasket.get(i);
            if(ballLook.ballColor==color.blue)
            {
                if (flag ){
                    System.out.println("Blue balls");
                    System.out.printf("%10s %10s\n","Ball Weigh","Ball Color" );
                    flag = false;
                }
                System.out.printf("%10f %10s \n", ballLook.weight,ballLook.ballColor.toString() );

            }
        }

        if(flag) {
            System.out.println("No blue balls found in basket");
        }

    }

    public float FindBallsWeight()
    {
        float resultWeight = 0;
        for (int i = 0; i<ballsBasket.size(); i++)
        {
            resultWeight +=  ballsBasket.get(i).weight;
        }
        return  resultWeight;

    }



}
