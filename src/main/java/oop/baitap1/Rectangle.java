/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap1;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length=5;
        this.width=3;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double findArea(){
        double area = length*width;
        return area;
    }
    public double findPerimeter(){
        double Perimeter = (length+width)*2;
        return Perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
}
