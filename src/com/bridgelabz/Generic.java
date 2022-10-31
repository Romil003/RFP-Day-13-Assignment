package com.bridgelabz;

public class Generic<E extends Comparable<E>> {

    E var1 ;
    E var2 ;
    E var3 ;

    public Generic(E var1, E var2, E var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public static <E extends Comparable<E>> void max(E var1 , E var2 ,E var3){
        E max = var1;

        if(var2.compareTo(var1) > 0){
            max = var2;
        }
        if(var3.compareTo(var2) > 0){
            max = var3;
        }
        printMax(var1,var2,var3,max);
    }

    private static <E extends Comparable<E>> void printMax(E var1 , E var2 ,E var3, E max){
        System.out.println("Maximum element from " + var1 + ", " + var2 + " and " + var3 + " is " + max );
    }

    public static void main(String[] args) {
        Integer varA1 = 31;
        Integer varA2 = 3;
        Integer varA3 = 35;
        max(varA1,varA2,varA3);

        System.out.println();
        Float varB1 = 1.2F;
        Float varB2 = 2.3F ;
        Float varB3 = 21.5F;
        max(varB1,varB2,varB3);

        System.out.println();
        String a1 = "Vaibhav";
        String b1 = "Sarvesh";
        String c1 = "Rutik";
        max(a1,b1,c1);


    }
}
