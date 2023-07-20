/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Q9 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char g;
        System.out.print("Enter grade = ");
        g = scan.next().toUpperCase().charAt(0);
        
        switch(g){
            case 'A':{
                System.out.println("Excellent");
                break;}
            case 'B':{
                System.out.println("Well Done");
                break;}
            case 'C':{
                System.out.println("Good");
                break;}
            case 'D':{
                System.out.println("You pass");
                break;}
            case 'F':{
                System.out.println("Better Try Again");
                break;}
            default:{
                System.out.println("Invalid Grade");
                break;}
    }
        
    }
    
}
