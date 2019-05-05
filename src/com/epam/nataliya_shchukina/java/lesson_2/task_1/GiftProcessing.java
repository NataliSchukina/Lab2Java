package com.epam.nataliya_shchukina.java.lesson_2.task_1;

import Seewts.Biscuits;
import Seewts.Candy;
import Seewts.Chocolate;
import Seewts.Sweet;

import java.util.Scanner;

public class GiftProcessing {
    /* обработка подарка */

    public static Sweet[] initGift() {    //инициализация массива
        return new Sweet[]{
                new Candy("Lastochka", 23.56f, 56.78f, "Vanila"),
                new Candy("Mask", 22.36f, 87.54f, "Seewts.Chocolate"),
                new Candy("Mars", 36.45f, 65.43f, "Nougat"),
                new Candy("Snickers", 40.56f, 56.87f, "Nuts"),
                new Chocolate("Alpen Gold", 56.90f, 123.76f, " darkChocolate"),
                new Chocolate("Milka", 86.20f, 143.76f, " milkChocolate"),
                new Biscuits("Oreo", 78.67f, 65.76f, 4),
                new Biscuits("Orion", 96.67f, 56.23f, 6)
        };
    }

    public void outputGift(Sweet[] giftArray) {       // вывод массива на печать
        for (int i = 0; i < giftArray.length; i++) {
            System.out.println("[" + (i + 1) + "] " + giftArray[i]);
        }
    }

    //com.epam.nataliya_shchukina.java.lesson_2.task_1.GiftProcessing newArray = new com.epam.nataliya_shchukina.java.lesson_2.task_1.GiftProcessing();
    public Sweet[] Add(Sweet[] sweetArray, int index) {      // добавляем сладость из набора подарка по номеру
        int newLength = sweetArray.length + 1;
        var newArray = new Sweet[newLength];
        var newSweet = sweetArray[index - 1];

        for (int i = 0; i < newLength; i++) {
            if (i != newLength - 1) {
                newArray[i] = sweetArray[i];
            } else {
                newArray[newLength - 1] = newSweet;
            }
        }
        return newArray;
    }

    public Sweet[] RemoveAt(Sweet[] sweetArray, int index) {     //удаление сладости из подарка по номеру
        var newLength = sweetArray.length - 1;
        var newArray = new Sweet[newLength];
        int offset = 0;

        for (int i = 0; i < newLength; i++) {
            if (i == (index - 1)) {
                offset = 1;
            }

            newArray[i] = sweetArray[i + offset];
        }

        return newArray;
    }

    public float getWeightGift(Sweet[] sweetArray) {        //получаем вес подарка
        float sumWeight = 0;
        for (int i = 1; i < sweetArray.length; i++) {
            sumWeight += sweetArray[i].getWeight();
        }
        return sumWeight;
    }

    public Sweet[] sortedGift(Sweet[] sweetArray) {            //сортировка подарка по весу
        boolean isSorted = false;
        Sweet buf = new Candy("o", 0, 0, "o");
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < sweetArray.length - 1; i++) {
                if (sweetArray[i].getWeight() > sweetArray[i + 1].getWeight()) {
                    isSorted = false;

                    buf = sweetArray[i];
                    sweetArray[i] = sweetArray[i + 1];
                    sweetArray[i + 1] = buf;
                }
            }
        }
        return sweetArray;
    }

    public Sweet[] changeGift(String input, Sweet[] sweetArray) {    // изменяем подарок удаляя или добавляя элемент
        Scanner scan = new Scanner(System.in);
        Sweet[] newgift = new Sweet[0];
        GiftProcessing giftnew = new GiftProcessing();
        while (input.equals("y")) {

            System.out.println("Хотите добавть или удалить сладость?  add/del");
            String inputChange = scan.next();
            switch (inputChange) {
                case "add": {
                    System.out.println("Введите номер добавляемой сладости");
                    int numberAdd = scan.nextInt();
                    newgift = giftnew.Add(sweetArray, numberAdd);
                    giftnew.outputGift(newgift);
                    sweetArray = newgift;
                }
                break;
                case "del": {
                    System.out.println("Введите номер удаляемой сладости");
                    int numberAdd = scan.nextInt();
                    newgift = giftnew.RemoveAt(sweetArray, numberAdd);
                    giftnew.outputGift(newgift);
                    sweetArray = newgift;
                }
                break;
            }
            System.out.println("Хотите изменить подарок?  y/n");
            // Scanner scan1 = new Scanner (System.in);
            String input1 = scan.next();
            input = input1;
        }
        return sweetArray;
    }

    public void getSweetByPrice(Sweet[] sweetArray) {          //выборка сладости в пределах задаваемой цены
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите границы значений для поиска");
        try{
            System.out.println("Введите нижнюю границу: " );
            float leftBounder = Float.parseFloat(scan.next());
            System.out.println("Введите верхнюю границу: " );
            float rightBounder = Float.parseFloat(scan.next());

             for (int i = 0; i < sweetArray.length; i++) {
                if ((sweetArray[i].getPrice() >= leftBounder) && (sweetArray[i].getPrice() <= rightBounder)) {
                    System.out.println(sweetArray[i].toString());

                }
             }
        }catch (Exception e ){
            System.out.println(" Ошибка введенного значения!");}

    }

}