package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;
        for (int j = 0; j < arr.length; j++) {
            int minValue = Integer.MAX_VALUE;
            int index = 0;
            for (int i = j; i < arr.length; i++) {
                minValue = Math.min(minValue, arr[i]);
                if (minValue == arr[i]) index = i;
            }
            int temp;
            temp = arr[j];
            arr[j] = arr[index];
            arr[index] = temp;
        }
    }
}