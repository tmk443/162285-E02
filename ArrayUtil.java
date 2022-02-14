package com.company;
import java.time.LocalTime;


public class ArrayUtil {

    public static <T extends Comparable<T>> boolean jestPalindromem(T[] tab) {
        int i = 0;
        int j = tab.length -1;
        while(i <=j){
            if(tab[i].compareTo(tab[j]) !=0) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main (String[] args){
    Integer[] sortedInts = {1,2,3,4,5,6,7};
    Integer[] palindromInts = {1,2,3,3,2,1};
    LocalTime[] sortedTimes = {LocalTime.MIDNIGHT, LocalTime.NOON, LocalTime.MAX };
    LocalTime[] palindromTimes = {LocalTime.MIDNIGHT, LocalTime.NOON, LocalTime.MIDNIGHT };

        System.out.println("sa palindromem: ");
        System.out.println("posortowane inty" + jestPalindromem(sortedInts));
        System.out.println("nieposortowane inty" + jestPalindromem(palindromInts));
        System.out.println("posortowane czasy: "+jestPalindromem(sortedTimes));
        System.out.println("posortowane czasy: "+jestPalindromem(palindromTimes));
    }

}