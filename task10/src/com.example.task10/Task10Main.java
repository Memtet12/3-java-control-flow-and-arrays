package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int index = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minValue =Math.min(minValue,arr[i]);
            if (arr[i] == minValue) index = i;
        }

        return index;
    }

}