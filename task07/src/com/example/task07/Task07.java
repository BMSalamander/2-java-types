package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо

        int lengthCamps = n / k; // сколько палаток можно разместить "в длину"
        int widthCamps = m / k; // сколько палаток - "в ширину" (одной линией)

        return lengthCamps * widthCamps; // проводим линий "в длину" в количестве линий "в ширину" (палатки целые)
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(10, 20, 5);
        System.out.println(result);
        */
    }

}
