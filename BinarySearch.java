package com.day16day17dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public int binarySearch(String[] wordList, String searchWord) {
		int start = 0; 
		int length = wordList.length -1;
		while(start <= length) {
			int middle = start + (length - start) /2;
			int result = searchWord.compareTo(wordList[middle]);
			if(result == 0) 
				return middle;
			if(result > 0 ) 
				start = middle + 1;
			else 
				length = middle - 1;
			}
			return -1;
		}
	
	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		String [] wordList = {"Hello" , "this", "is", "a", "Binary", "search", "Program"};		
		Arrays.sort(wordList);
		System.out.println("List of word : ");
		System.out.println(Arrays.toString(wordList));
		System.out.println("Enter the Searching word : ");
		String searchWord = sc.next();
		int result = obj.binarySearch(wordList, searchWord);
		
		if(result == -1) {
			System.out.println("Word is not present in the list");
		}else {
			System.out.println("Word is present " + "index" + result);
		}
		
	}
}
