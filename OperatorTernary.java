/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner latihan = new Scanner(System.in);
        System.out.println("masukkan nilai a");
        double a = latihan.nextDouble();
        System.out.println("masukkan nilai b");
        double b = latihan.nextDouble();
        String kondisi = a > b ? "Benar" : "Salah";
        System.out.println("Apakah a>b benar?" + kondisi);
    }
}
