package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr==null || arr.length==0) return;
        int minValue = Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
            if (minValue == arr[i]) index = i;
        }
        int temp;
        temp=arr[0];
        arr[0]=arr[index];
        arr[index]=temp;
    }
}