package com.bridgelabz;

public class FindMaximum {



    public static int FindMax(Integer[] array){

        int max = 0;
        for(Integer i = 0 ; i < array.length ; i++){
            for (Integer j = i+1 ; j< array.length ; j++){
                if(array[i].compareTo(array[j]) == 1 && array[i]>max ){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {12,25,2};
        System.out.println("Maximum Number is " + FindMax(integers));



    }

}
