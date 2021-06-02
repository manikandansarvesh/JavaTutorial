package com.test.Interview;

import java.util.Arrays;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int[] values = {45, 67,98, 24};
        int[] integers = new int[6];
        integers[4] = 54;
        integers[5] = 89;
        System.arraycopy(values, 0, integers, 0, values.length);
        int tmp;
        for(int i=0;i<integers.length;i++){
            for(int j=i+1;j<integers.length;i++){
                if(integers[i]>integers[j]){

                    tmp=integers[i];
                    integers[i]=integers[j];
                    integers[j]=tmp;
                }
            }
            System.out.println(integers[i]);
        }
        int largestNumberResult = Arrays.stream(integers).max().getAsInt();
        System.out.println("The largest number in array is " + largestNumberResult);
    }
}

