package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long inputNumber = Long.parseLong(input);

        String resultType;

        if (inputNumber >= Byte.MIN_VALUE && inputNumber <= Byte.MAX_VALUE)
            resultType = "byte";
        else if (inputNumber >= Short.MIN_VALUE && inputNumber <= Short.MAX_VALUE)
            resultType = "short";
        else if (inputNumber >= Integer.MIN_VALUE && inputNumber <= Integer.MAX_VALUE)
            resultType = "int";
        else
            resultType = "long";

        return resultType;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
