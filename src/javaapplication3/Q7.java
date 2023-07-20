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
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float speed;
        System.out.print("Enter speed = ");
        speed = scan.nextFloat();
        
        if(speed>100)
            System.out.println("Fine is rs 1000");
        else if(speed>=91)
            System.out.println("Fine is rs 750");
        else if(speed>=81)
            System.out.println("Fine is rs 500");
        else{}
    }
    
}
