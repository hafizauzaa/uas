/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAPP;

/**
 *
 * @author User
 */
public class StackApp {
    public static void main(String[] args){
        Stack tumpukan=new Stack(10);
        tumpukan.push(0);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai2=tumpukan.pop();
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai2);
        System.out.println("Hafiz auza 20090060");
        
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
    }  
      
    }
