package com.company;

public class Calculator {
    private double width;
    private double height;

    public double getHeight() {
        return height;

    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double newHeight) {
      height = newHeight;
    }

    public void setWidth(double newWidth)  {
        width = newWidth;
    }

    public double caculateArea() {
        return width * height;




    }
}

