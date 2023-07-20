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
public class Q5 {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        float marks;
        System.out.print("Enter marks = ");
        marks = scan.nextFloat();
        float m = marks;
        
        if(m<70)
            System.out.println("D");
        else if(m<=79)
            System.out.println("C");
        else if(m<=89)
            System.out.println("B");
        else if(m<=100)
            System.out.println("A");
        else{};
        
    }
}
