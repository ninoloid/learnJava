package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();
        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

        String test = "test";
        test = "modified";
        System.out.println(test);

        char[] dicodingChar = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChar);
        System.out.println(dicodingChar);
        System.out.println(dicodingString);
        dicodingString = "modified";
        System.out.println(dicodingString);
    }
}