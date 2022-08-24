package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(number(43, 41));
        System.out.println(number(20, 35));
        System.out.println(number(50, 38));
        System.out.println(number(45, 27));
        System.out.println(number(19, 24));
    }

    public static String number(int ageOfThePerson, int temperature) {
        if (ageOfThePerson >= 20 && ageOfThePerson <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (ageOfThePerson < 20 && temperature <= 28) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
