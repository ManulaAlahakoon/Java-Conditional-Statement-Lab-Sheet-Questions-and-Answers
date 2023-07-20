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
public class Q1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter first number = ");
        n1 = input.nextInt();
        
        System.out.print("Enter second number = ");
        n2 = input.nextInt();
        
        if(n1%n2 == 0){
        
            System.out.printf("The %d is divisable by %d",n1,n2);
            
        }else{
            System.out.printf("The %d is NOT divisable by %d",n1,n2);
        }
    }
}
