package com.company;

import java.util.Scanner;

public class Copy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int park = 20;
        System.out.println("Parovkada 20 ta joy bor");
        int command = 1;
        int pul=0;
        int coud=0;

        while (command !=0){
            System.out.println("1-Moshina qo'shish");
            System.out.println("2-Moshina chiqib ketish");
            System.out.println("3-Jami mablag'i");
            System.out.println("4-Nechta mowina borligi");
            System.out.println("0-kun yakunlash");
            command=scanner.nextInt();
            switch (command){
                case 1:
                    System.out.println("Moshina qo'shing");
                    int coundplaes=scanner.nextInt();
                    if(park-coundplaes<0){
                        System.out.println("buncha joy yo'q");
                    }
                    if (park-coundplaes>=0){
                        park-=coundplaes;
                        coud+=coundplaes;
                        System.out.println("Moshina qo'shildi");
                    }
                    break;
                case 2:
                    System.out.println("Moshina chiqib ketish");
                    int countminus = scanner.nextInt();
                    if (countminus>20-park){
                        System.out.println("Buncha moshina yo'q");
                        System.out.println(20-park+"ta moshina bor");

                    }
                    if (countminus<=20-park){
                        park+=countminus;
                        System.out.println("moshina chiqib ketti");
                        pul += 5000*countminus;
                    }
                    break;
                case 3:
                    System.out.println("Jami mablag'i "+ pul);
                    break;
                case 4:
                    System.out.println(20-park+"ta moshina bor");
                    break;
                case 0:
                    if(20-park==0){
                        System.out.println("bugun "+coud+"ta moshina kirdi");
                        System.out.println("Jami mablag'i "+ pul);

                    }
                    if (20-park>0) {
                        System.out.println(20 - park + "ta moshina Parkovkada qogan");
                        System.out.println("Oldin moshinani chiqazvoring");
                    }
                    break;

            }
        }

    }
}