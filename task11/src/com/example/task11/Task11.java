package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки
        // Считаем проценты за год
        if (percent > 0.001) {
            for (int i = 0; i < 12; ++i) {
                sum += sum * percent;
            }
        }
        else {
            sum += sum * (percent * 12);
        }

        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
