/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tteoripbo.phonetrial;

/**
 *
 * @author Asus
 */
public class Samsung {
    private int volume;
private boolean isPowerOn;
public Samsung() {
// set volume awal
this.volume = 50;
}
public void powerOn() {
isPowerOn = true;
System.out.println("Handphone menyala...");
System.out.println("Selamat datang di SAMSUNG");
System.out.println("Android version 29");
}
public void powerOff() {
isPowerOn = false;
System.out.println("Handphone dimatikan");
}
public void volumeUp() {
if (isPowerOn) {
 int MAX_VOLUME = 0;
if (this.volume == MAX_VOLUME) {
System.out.println("Volume FULL!!");
System.out.println("sudah " + this.getVolume() + "%");
} else {
this.volume += 10;
System.out.println("Volume sekarang: " + this.getVolume());
}
} else {
System.out.println("Nyalakan dulu donk HP-nya!!");
}
}
public void volumeDown() {
if (isPowerOn) {
 int MIN_VOLUME = 0;
if (this.volume == MIN_VOLUME) {
System.out.println("Volume = 0%");
} else {
this.volume -= 10;
System.out.println("Volume sekarang: " + this.getVolume());
}
} else {
System.out.println("Nyalakan dulu donk HP-nya!!");
}
}
public int getVolume() {
return this.volume;
}
}
