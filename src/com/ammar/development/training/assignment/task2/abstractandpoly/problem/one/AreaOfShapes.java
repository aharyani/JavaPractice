package com.ammar.development.training.assignment.task2.abstractandpoly.problem.one;

public class AreaOfShapes {

    public static void main(String[] args) {

        AreaOfShapes.calculateArea(1.1);
        AreaOfShapes.calculateArea(1,1);
        AreaOfShapes.calculateArea(9.0,10.0);
    }

    public static void calculateArea(double radius){
        double area = 3.14*(radius*radius);
        System.out.println("Area of Circle is : "+area);
    }
    public static void calculateArea(double breadth, double height){
        double area = (0.5)*(breadth*height);
        System.out.println("Area of Triangle is : "+area);
    }
    public static void calculateArea(int width,int length){
        double area = width*length;
        System.out.println("Area of Rectangle is : "+area);
    }
}
