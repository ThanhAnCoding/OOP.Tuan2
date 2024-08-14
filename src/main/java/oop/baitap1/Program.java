/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Rectangle r1;
        Rectangle r2;
        
        r1 = new Rectangle();
        
        
        Scanner sc = new Scanner(System.in);
        Double length,width;
        System.out.print("Nhap Chieu Dai:");
        length = sc.nextDouble();
        System.out.print("Nhap Chieu Rong:");
        width = sc.nextDouble();
        
        r2 = new Rectangle(length,width);
        
        System.out.println("Thong Tin R1");
        System.out.println(r1.toString()+"Dien Tich"+ r1.findArea() + " - Chu Vi" + r1.findPerimeter());
        System.out.println("Thong Tin R2");
        System.out.println(r2.toString()+"Dien Tich"+ r2.findArea() + " - Chu Vi" + r2.findPerimeter());
    }
}
