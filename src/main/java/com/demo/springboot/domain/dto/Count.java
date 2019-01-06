package com.demo.springboot.domain.dto;

public class Count {

    public static int countLength(String text, char character){
        int length=0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character || text.charAt(i) == Character.toUpperCase(character))
                length++;
        }

        return length;
    }
}
