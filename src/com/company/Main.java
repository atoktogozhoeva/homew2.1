package com.company;

public class Main {

    public static void main(String[] args) {
        homeW();
    }

    private static void homeW() {
        System.out.println(homeW(20,30));
        System.out.println(homeW(40,30));
        System.out.println(homeW(8,15));
        System.out.println(homeW(50,25));
        System.out.println(homeW(18,40));

    }

    public static String homeW(int age, int temperature) {
        if (age <= 20 && age >= 40 && temperature <= 20 && temperature >= 30) {
            return ("Можно идти гулять");
        }
        if (age > 20 || temperature <= 0 && temperature >= 28) {
            return ("Можно идти гулять");
        }
        if (age < 45 && temperature <= (-10) && temperature >= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }

}
