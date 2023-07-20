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
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2;
        char operator;
        System.out.print("Enter first number = ");
        n1 = input.nextInt();
        
        System.out.print("Enter second number = ");
        n2 = input.nextInt();
        
        System.out.print("Enter Operator  (‘+’ ‘-’ ‘*’ ‘/’) = ");
        operator = input.next().charAt(0);
        
        switch(operator){
        
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println((float)n1/n2);
                break;
            
                
        
        
        }
        
    }
}
