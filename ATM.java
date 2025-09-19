package com.ex;

import java.util.Scanner;

class Atm1{
	float Balance;
	int pin=1234;
	public void checkpin() {
		Scanner sc=new Scanner(System.in);
		int enterpin=sc.nextInt();
		if(enterpin==pin) {
			menu();
		}
		else {
			System.out.println("Enter valid Pin");
			
		}
	}
	public void menu() {
		System.out.println("Enter Your Choice ");
		System.out.println("1. Check Balance : ");
		System.out.println("2. Withdraw Money : ");
		System.out.println("3. Deposit Money : ");
		System.out.println("4. Exit ");
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositMoney();
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Please Enter Valid Choice");
		}
	}
	public void checkBalance() {
		System.out.println("Balance : "+Balance);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter the amount : ");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("Withdraw Successfully");
		}
		menu();
		
	}
	public void depositMoney() {
		System.out.println("Enter The amount : ");
		Scanner sc=new Scanner(System.in);
		float amount=sc.nextFloat();
		Balance=Balance+amount;
		System.out.println("Money deposit Successfully");
		menu();
	}
}

public class Demo{
		
	public static void main(String[] args) {
		Atm1 obj=new Atm1();
		obj.checkpin();
		 
		
	}

}
