package com.day16day17dsa;

import java.util.Scanner;

public class BankCounter {
	int Amount = 0;
	int head = -1;
	int tail = -1;
	String queue [];

	
	public BankCounter(int size) {
		queue = new String[size];
		
	}
	
	public void enqueue(int amount, String name) {
		if(tail < queue.length -1) {
			queue[++tail] = name;
			Amount = Amount + amount;
			if(head == -1)
				head++;
				return;
			
			
		}System.out.println("Full");
	
	}
	public void dequeue() {
		if(head < queue.length && head < tail) {
			head++;
			
		}
	}
	public void display() {
		if(head > tail || head == -1) {
			System.out.println("Empty");
			return;
		}
		for (int i = head; i <= tail; i++) {
			System.out.print(queue[i]);
		}
		System.out.println();
	}
	static BankCounter obj = new BankCounter(5);

	public static void main(String[] args) {
		
		int ch;

	
	Scanner sc = new Scanner(System.in);
	
	
	while (true) {
		System.out.println("Please enter the number : ");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter the customer name : ");
			String name = sc.next();
			System.out.println("Plese the amount :");
			int amount = sc.nextInt();
			obj.enqueue(amount, name);
			break;
		case 2:
			obj.dequeue();
			break;
		case 3:
			obj.display();
			break;
		case 4:
			sc.close();
			return;
		default:
		System.out.println("Error... Please Enter the vaild choice :  ");
		}
	}
}
}

