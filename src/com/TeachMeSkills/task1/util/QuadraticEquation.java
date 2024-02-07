package com.TeachMeSkills.task1.util;
/*
The method of this class solves the quadratic equation
 */
public class QuadraticEquation {

    public static double[] solve(int a, int b, int c)
    {
        //a*x*x + b*x + c = 0
        double D = b*b - 4*a*c;
        double[] solve = new double[2];
        solve[0] = (-b + Math.sqrt(D))/(2*a); // Этот корень нам нужен.
        solve[1] = (-b - Math.sqrt(D))/(2*a);
        return solve;
    }
}
