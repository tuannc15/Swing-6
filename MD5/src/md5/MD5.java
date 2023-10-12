/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package md5;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author nctuan
 */
public class MD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MaHoaMD5 maHoaMD5 = new MaHoaMD5();
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần mã hóa: ");
        input = sc.nextLine();
        System.out.printf("Chuỗi mã hóa MD5: %s\n", maHoaMD5.converHashToString(input));
    }

}
