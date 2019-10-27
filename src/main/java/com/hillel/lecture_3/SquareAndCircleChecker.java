package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {


    public String checkCircleInSquare(double circleArea, double squareArea) {

        String result = "";
        double lengthSideSquare=Math.sqrt(squareArea);
        double lengthDiagonal=Math.sqrt(2*lengthSideSquare*lengthSideSquare);
        double radiusCircle=Math.sqrt(circleArea/Math.PI);
        if (lengthDiagonal<=radiusCircle){
            result="The circle is in the square";
        }
        else {  result="The circle is not in the square";

        }

        return result;
    }

    public String checkSquareInCircle(double circleArea, double squareArea) {

        String result = "";
        double lengthSideSquare=Math.sqrt(squareArea);
        double lengthDiagonal=Math.sqrt(2*lengthSideSquare*lengthSideSquare);
        double radiusCircle=Math.sqrt(circleArea/Math.PI);
        if (lengthDiagonal<=radiusCircle){
            result="The square is in the circle";
        }
        else {  result="The square is not in the circle";

        }

        return result;
    }

}
