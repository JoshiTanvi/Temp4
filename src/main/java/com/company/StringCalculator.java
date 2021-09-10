package com.company;

public class StringCalculator{
    public int add(String numbers){
        if(numbers.length() == 0){
            return 0;
        }else{
            String[] numList = numbers.split(",|\n");
            return sum(numList);
        }

    }

    private int sum(String[] numList) {
        int total = 0;
        for( String n: numList){
            total = total + Integer.parseInt(n);
        }
        return total;
    }
}
