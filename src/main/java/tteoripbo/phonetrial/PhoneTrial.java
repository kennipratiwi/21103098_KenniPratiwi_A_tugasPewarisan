/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tteoripbo.phonetrial;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PhoneTrial {

    public static void main(String[] args) {
 // membuat objek HP
 Phone redmiNote8 = (Phone) new Xiaomi();
 Phone IPhone9 = (Phone) new IPhone();
 Phone SamsungA13 = (Phone) new Samsung();
 Phone OPPOA57 = (Phone) new OPPO();
 // membuat objek user
 PhoneUser Kenni = new PhoneUser(redmiNote8);
 // kita coba nyalakan HP-nya
 Kenni.turnOnThePhone();
 // biar enak, kita buat dalam program
 Scanner input = new Scanner(System.in);
 String aksi;
 while (true) {
 System.out.println("=== APLIKASI INTERFACE ===");
 System.out.println("[1] Nyalakan HP");
 System.out.println("[2] Matikan HP");
 System.out.println("[3] Perbesar Volume");
 System.out.println("[4] Kecilkan Volume");
 System.out.println("[0] Keluar");
 System.out.println("--------------------------");
 System.out.print("Pilih aksi> ");
 aksi = input.nextLine();
 if (aksi.equalsIgnoreCase("1")) {
 Kenni.turnOnThePhone();
 } else if (aksi.equalsIgnoreCase("2")) {
 Kenni.turnOffThePhone();
 } else if (aksi.equalsIgnoreCase("3")) {
 Kenni.makePhoneLouder();
 } else if (aksi.equalsIgnoreCase("4")) {
 Kenni.makePhoneSilent();
 } else if (aksi.equalsIgnoreCase("0")) {
 System.exit(0);
 } else {
 System.out.println("Kamu memilih aksi yang salah!");
 }
 }
 }
}

