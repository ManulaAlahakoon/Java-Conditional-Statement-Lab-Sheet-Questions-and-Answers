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
public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float wh,pay;
        System.out.print("Enter working hours = ");
        wh = scan.nextFloat();
        
        
        if(wh<=30){
            
            System.out.printf("Weekly wages = "+(wh*50));
            
        }else if(wh<=55){
            System.out.printf("Weekly wages = %.2f",((30*50)+((wh-30)*50*1.5)));
        }else{
            System.out.printf("Weekly wages = %.2f",((30*50)+(25*50*1.5)+((wh-55)*50*2)));
        }
        
    }
}
