package com.swaraj;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 5;
        //System.out.println(Arrays.toString(numbers));

        int[] nums = {5,7,3,4,9};
        System.out.println(nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        /* ********************************************************************** */

        int[][] numbers2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));

    }
}
