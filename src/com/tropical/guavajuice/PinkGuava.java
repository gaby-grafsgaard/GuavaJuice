package com.tropical.guavajuice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class PinkGuava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Fresh guava juice");
System.out.println("Have a cup");
//Change variable value without creating a new variable
int a=5;
int b=3;
a=a+b;//8
b=a-b;//5
a=a-b;//3
//find the biggest number in an array
int [] nums= {4,5,87,1,10};
int theBiggest = 0;
for(int i =0; i<nums.length;i++) {
	if(nums[i]>theBiggest) {
		 theBiggest =nums[i];
	}
	}
//System.out.println(theBiggest);

//how to find duplicate numbers in one Array
ArrayList<Integer> list1 =new ArrayList<Integer>(List.of(1,5,6,9,7,58,4,4));
list1.add(258);
ArrayList<Integer> list2 =new ArrayList<Integer>(List.of(1,66,6,97,89,58,4,4));
ArrayList<Integer> listNo =inBothOpt1(list1,list2);
System.out.println(listNo);


	}
	public static ArrayList<Integer> inBothOpt1(Collection<Integer> ints1, Collection<Integer> ints2) {
		TreeSet <Integer> set1 = new TreeSet<>(ints1);
		TreeSet <Integer> set2 = new TreeSet<>(ints2);
		System.out.println(set1);
		System.out.println(set2);

		set1.retainAll(set2);
	    return new ArrayList<Integer>(set1);}
}

