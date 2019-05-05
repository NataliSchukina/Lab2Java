package com.epam.nataliya_shchukina.java.lesson_2.task_1;

import com.epam.nataliya_shchukina.java.lesson_2.task_1.Seewts.Sweet;

import java.util.Scanner;

public class Gift {
    /* подарок */

    public void Run() {
        GiftProcessing gift = new GiftProcessing();
        Sweet[] gift1  = gift.initGift();
        gift.outputGift(gift1);
        System.out.println("Хотите изменить подарок?  y/n");
        Scanner scan = new Scanner (System.in);
        String input = scan.next();
        gift1 = gift.changeGift(input, gift1);
        String allWeight  = Float.toString(gift.getWeightGift(gift1));
        System.out.println("Вес подарка: " + allWeight);
        System.out.println("Сортировка подарка по весу:");
        gift.outputGift(gift.sortedGift(gift1));
        System.out.println("Поиск сладости по цене");
        gift.getSweetByPrice(gift1);

        }



    }
