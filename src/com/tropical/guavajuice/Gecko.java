package com.tropical.guavajuice;
import java.util.HashMap;

import java.util.Arrays;
import java.util.Collections;

public class Gecko {
	public static void main(String[] args) {
	////////////////////////////////Switch////////////////////////////////	
//		int num = 25;
//		switch(num) {
//		case 10:
//			System.out.println("number 10");
//			break;
//		case 25:
//			System.out.println("number 25");
//			break;
//		}
		//////////////////Find Largest Number in an Array////////////////////////

		
//		int largest=0;
//		for(int numberLooping:nums) {
//			if (numberLooping>largest) {
//				largest=numberLooping;
//			}
//		}
//		System.out.println(largest);
		
		int[] nums = {3,6,1,4,4,8,9};
        int duplicateCount = countDuplicates(nums);
        System.out.println("Number of duplicate integers: " + duplicateCount);
        
       
	}
	public static int countDuplicates(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // Step 1: Populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); }
        System.out.println(frequencyMap);
        // Step 2: Count duplicates
        int duplicateCount = 0;
        for (int count : frequencyMap.values()) {
            if (count > 1) {
                duplicateCount++;  // Increment for each duplicate number
            }
        }
        return duplicateCount;
    }
}
