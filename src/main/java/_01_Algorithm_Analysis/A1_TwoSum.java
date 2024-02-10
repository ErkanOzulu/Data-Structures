package _01_Algorithm_Analysis;

import java.util.Arrays;

public class A1_TwoSum {
    public static void main(String[] args) {

        int[] input=new int[]{4,7,2,11};
        System.out.println(Arrays.toString(twoSumSolution1(input, 9)));


    }
    // Bruteforce Solution of Two Sum problem.
    public static int[] twoSumSolution1(int[]input, int targetValue){

        for (int i = 0; i < input.length; i++) {

            for (int j = 1; j < input.length; j++) {

                if (i!=j){
                    if (input[i]+input[j]==targetValue)
                        return new int[]{i,j};
                }
            }
        }

       return new int[]{};
    }
}
/**
Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */