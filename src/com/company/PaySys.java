package com.company;

import java.util.Scanner;

public class PaySys {
    public static void main(String[] args) {
        double balance = 10000;
        int password = 5555;
        Scanner scanner = new Scanner(System.in);
        int command;
        while (true) {
            System.out.println(" 1=> Hisobni tekshirish \n 2=> Pul olish \n 3=> Pul berish \n 4=> Parol almashtirish \n 5=> Mobil to'lov qilish");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Insert password");
                    int code = scanner.nextInt();
                    if (password == code) {
                        System.out.println("Balance: " + balance);
                    } else {
                        System.err.println("password incorrect");
                    }
                    break;

                case 2:
                    System.out.println("Insert password");
                    code = scanner.nextInt();
                    if (password == code) {
                        System.out.println("Summani kiriting");
                        double sum = scanner.nextDouble();
                        if (balance >= sum) {
                            balance -= sum;
                            System.out.println("Success");
                        } else {
                            System.out.println("Balanceda buncha pul yo'q");
                        }
                    } else {
                        System.err.println("password incorrect");
                    }
                    break;

                case 3:
                    System.out.println("Insert password");
                    code = scanner.nextInt();
                    if (password == code) {
                        System.out.println("Summani kiriting");
                        double sum = scanner.nextDouble();
                        balance += sum;
                        System.out.println("Success");
                    } else {
                        System.err.println("password incorrect");
                    }
                    break;

                case 4:
                    System.out.println("Eski parol kiriting");
                    code = scanner.nextInt();
                    if (password == code) {
                        System.out.println("Yangi parol kiriting");
                        int newPassword = scanner.nextInt();
                        System.out.println("Parolni qayta kiriting");
                        int second = scanner.nextInt();
                        if (newPassword == second) {
                            password = newPassword;
                            System.out.println("Successfull changed");
                        } else {
                            System.out.println("Parol mos emas");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Tel raqamingizni kiriting");
                    String phone = scanner.next();
                    if (phone.length() == 13) {
                        System.out.println("summani kiriting");
                        double sum = scanner.nextDouble();
                        if (balance >= sum && sum >= 1000) {
                            balance -= sum;
                            System.out.println("success");
                        } else {
                            System.err.println("pul yetarli emas");
                        }
                    }


            }
        }
    }
}
