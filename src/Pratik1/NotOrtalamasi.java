package Pratik1;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {


    int mat,fizik,kimya,turkce,tarih,muzik;
    Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();

        double toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc=toplam/6;

        System.out.println("Ortalamanız:"+sonuc);

        boolean kosul1 = sonuc>=60;
        System.out.println("Durum="+(kosul1 ? "GEÇTİ" : "KALDI"));













    }


}
