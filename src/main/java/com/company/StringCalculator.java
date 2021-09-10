package com.company;

public class StringCalculator{
    public int add(String numbers){
        if(numbers.length() == 0){
            return 0;
        }else{
            String delimiter = ",|\n";
            if(numbers.matches("//(.*)\n(.*)")){
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
                System.out.println(delimiter);
            }
            String[] numList = numbers.split(delimiter);
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
