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
public class Bai2Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chieu dai: ");
        double ChieuDai = scanner.nextDouble();
        System.out.print("Chieu rong: ");
        double ChieuRong = scanner.nextDouble();
        
        double ChuVi = (ChieuDai + ChieuRong) * 2;
        double DienTich = ChieuDai * ChieuRong;
        double CanhNhoNhat = Math.min(ChieuDai,ChieuRong);
 
        System.out.println("Chu vi: "+ChuVi);
        System.out.println("Dien tich: "+DienTich);
        System.out.println("Canh nho nhat: "+CanhNhoNhat);
        
        
        
    }
    
}
