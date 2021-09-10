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
        String negatives = "";
        for( String n: numList){
            if(Integer.parseInt(n) < 0){
                if(negatives.equals("")){
                    negatives += n;
                }else{
                    negatives += ","+n;
                }

            }else {
                if(Integer.parseInt(n) <= 1000){
                    total = total + Integer.parseInt(n);
                }
            }
        }
        if(!negatives.equals("")){
            throw new IllegalArgumentException("Negatives are not allowed: "+negatives);
        }
        return total;
    }
}
