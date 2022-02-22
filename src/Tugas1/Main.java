package Tugas1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        double suhuawal;
        System.out.println("+=============================+");
        System.out.println("|  PROGRAM KONVERSI SUHU AIR  |");
        System.out.println("+=============================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhuawal = input.nextDouble();
        do{
            Konversi Celcius = new Konversi(suhuawal);
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            select=input.nextInt();
            if(select == 1){
                System.out.println("");
                System.out.println("Suhu dalam Celcius\t: " + suhuawal + "°C");
                System.out.println("Dalam Fahrenheit\t: " + Celcius.Fahrenheit() + "°F");
                System.out.println("Dalam Reamur\t\t: " + Celcius.Reamur() + "°R");
                System.out.println("Dalam Kelvin\t\t: " + Celcius.Kelvin() + "K");
                if(suhuawal <= 0){
                    System.out.println("Kondisi Air Beku.");
                }
                else if(suhuawal >= 100){
                    System.out.println("Kondisi Air Mendidih.");
                }
                else{
                    System.out.println("Kondisi Air Normal.");
                }
            }
            else if(select == 2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhuawal = input.nextDouble();
            }
            else if(select != 3){
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar");
            }
        }while(select!=3);
    }
    
}
