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
public class Bai1Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ Tên: ");
        String HoTen = scanner.nextLine();
        System.out.print("Diểm TB: ");
        double diemtb = scanner.nextDouble();
        
 
        System.out.printf("%s %.2f diem",HoTen,diemtb);
        
        
        
    }
    
}
