/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap2;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void credit(int amount){
        this.balance = this.balance+amount;
        
    }
    public void debit(int amount){
        if(this.balance>amount){
            this.balance=this.balance-amount;
        }else{
            System.out.print("So Tien Trong Vi Khong Du De Thanh Toan");          
        }
    }
    public void transferTo(Account acc,int amount){
        if(this.balance>amount){
        acc.balance = acc.balance + amount;
        this.balance = this.balance -amount;
        }else{
            System.out.println("Giao Dich Khong Thuc Hien , So Du Khong Du");
        }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
