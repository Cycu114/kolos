package com.demo.springboot.domain.dto;

import java.util.Arrays;

public class Sort {
    public static String sort(String numbers){
        String[] array;
        array = numbers.split(",");

        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(intArray);
        for (int i = 0; i < intArray.length; i++) {
            array[i] = String.valueOf(intArray[i]);
        }
        numbers = Arrays.toString(array);

        return numbers;
    }


}
