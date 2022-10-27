package com.bridgelabz;

public class FindMaximum {



    public static String FindMax(String[] array){

        String max = null ;
        int result = 0;
        for(Integer i = 0 ; i < array.length ; i++){
            for (Integer j = 0 ; j<array.length ; j++){
                if(array[i].compareTo(array[j]) > 0 && array[i].compareTo(array[j]) > result){
                    result = array[i].compareTo(array[j]);
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b" , "c"};
        System.out.println("Maximum Number is " + FindMax(strings));



    }

}
