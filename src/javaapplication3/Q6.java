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
public class Q6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float cp,sp;
        
        System.out.print("Enter cost price = ");
        cp = input.nextFloat();
        
        System.out.print("Enter selling price = ");
        sp = input.nextFloat();
        
        if(sp>cp){
            System.out.println("Profit");
        }else if(sp<cp){
            System.out.println("Loss");   
        }else{
            System.out.println("No Loss, No Profit");
        }
        
    }

}
                

