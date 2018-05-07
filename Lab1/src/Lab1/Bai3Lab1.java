/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;
/**
 *
 * @author theunforgiven
 */
public class Bai3Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Canh: ");
        double Canh = scanner.nextDouble();
        
        double TheTichLP = Math.pow(Canh,3);
        
        System.out.println("The tich lap phuong: "+TheTichLP);
    }
    
}
