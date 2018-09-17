package com.example.task11;

import java.lang.StrictMath.*;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки
        sum = (float)((double)sum * StrictMath.pow(1d + percent, 12d));

        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent); //563.46405f, 500.00006f

        System.out.println("Сумма на счете через год: " + sum);

    }

}
