package com.bridgelabz;

public class FindMaximum {



    public static float FindMax(Float[] array){

        float max = 0.0F;
        for(Integer i = 0 ; i < array.length ; i++){
            for (Integer j = 0 ; j<array.length ; j++){
                if(array[i].compareTo(array[j]) == 1 && array[i]>max ){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Float[] floats = {21.5F , 11.5F , 31.5F};
        System.out.println("Maximum Number is " + FindMax(floats));



    }

}
