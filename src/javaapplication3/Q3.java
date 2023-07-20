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
public class Q3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter first number = ");
        n1 = input.nextInt();
        
        System.out.print("Enter second number = ");
        n2 = input.nextInt();
        
        System.out.print("Enter second number = ");
        n3 = input.nextInt();
        
        if(n1>=n2 && n1>=n3)
            System.out.println("Greatest number is " + n1);
        else if(n2>=n1 && n2>=n3)
            System.out.println("Greatest number is " + n2);
        else if(n3>=n1 && n3>=n2)
            System.out.println("Greatest number is " + n3);
      
       
        
    }
    
}
