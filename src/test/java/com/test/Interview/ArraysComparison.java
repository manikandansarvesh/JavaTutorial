package com.test.Interview;

import java.util.Arrays;

public class ArraysComparison {
    public static void main(String[] args) {
        int[] firstArray = {23, 45, 67, 98};
        int[] secondArray = {23, 54, 67, 98};
        int[] result = compareTwoArray(firstArray, secondArray);
        System.out.println("Compared two Arrays and results are "+Arrays.toString(result));

    }

  static  int []compareTwoArray(int [] array1,int[] array2){
        int[] sortedArray1 = Arrays.copyOf(array1, array1.length);
        Arrays.sort(sortedArray1);
        int[] sortedArray2 = Arrays.copyOf(array2, array2.length);
        Arrays.sort(sortedArray2);

        int[] commonArray = new int[Math.max(sortedArray1.length, sortedArray2.length)];
        int commonElements = 0, firstIndex = 0, secondIndex = 0;
        while (firstIndex < sortedArray1.length && secondIndex < sortedArray2.length) {
            if (sortedArray1[firstIndex] < sortedArray2[secondIndex]) firstIndex++;
            else if (sortedArray1[firstIndex] == sortedArray2[secondIndex]) {
                commonArray[commonElements] = sortedArray1[firstIndex];
                commonElements++;
                firstIndex++;
                secondIndex++;
            }
            else secondIndex++;
        }
        return commonArray;
    }
}
