package com.day16day17dsa;

import java.util.Scanner;

public class Insertion {

	static Scanner sc = new Scanner(System.in);
	
	public static void insertionSort(String [] array) {
		for(int i = 1; i < array.length; i++) {
			String key = array[i];
			int j =  i - 1;
			while(j >= 0 && (key.compareTo(array[j]) < 0)) {
				array [j + 1 ] = array[j];
				--j;
			}	
			array [j + 1] = key;
		}
	}
	
	public static void printString(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println("Strings at index " + i + " is " + strings[i]);
		}
	}
	
	public static void scanString(String[] strings) {
		for(int i = 0; i < strings.length; i++) {
			System.out.println(i);
			strings [i] = sc.next();	
		}
	}
	
	public static void main(String[] args) {
		String[] strings = new String[5];
		scanString(strings);
		
		printString(strings);
		insertionSort(strings);
		
		
	}
	
}
