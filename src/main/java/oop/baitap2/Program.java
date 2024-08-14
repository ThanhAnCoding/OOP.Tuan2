/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap2;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Account Acc1 = new Account("01","Thanh An",50);
        Account Acc2 = new Account("02","Kim Thoa",70);
        
        System.out.println("Thong Tin Ban Dau");
        System.out.println("Acc 1 :"+ Acc1.toString());
        System.out.println("Acc 2 :"+ Acc2.toString());
        
        Acc1.credit(30);
        Acc2.debit(15);
        
        System.out.println("Thong Tin Sau Khi Nap Rut");
        System.out.println("Acc 1 :"+ Acc1.toString());
        System.out.println("Acc 2 :"+ Acc2.toString());
        
        Acc1.transferTo(Acc2,20);
        Acc2.transferTo(Acc1,120);
        
         System.out.println("Thong Tin Sau Khi Chuyen Khoan");
        System.out.println("Acc 1 :"+ Acc1.toString());
        System.out.println("Acc 2 :"+ Acc2.toString());
    }
}
