package Yussuf_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int newnum = 0;
		
		System.out.print("Please enter the encrypted four-digit integer :");
		int num = scnr.nextInt();
		 while(num > 9999) {
		   System.out.print("Error, please enter an encrypted 'FOUR' digit integer :");
		   num = scnr.nextInt();
		   newnum = Decrypt(num);
		 }if(num < 9999)
		   newnum = Decrypt(num);	 
		 
		System.out.println("The decrypted integer is :" +newnum);
		 
	}
	
	public static int Decrypt(int dig) {
		int a = dig / 1000;
    	int b = (dig % 1000) / 100;
    	int c = (dig % 100) / 10;
    	int d = dig % 10;
    	
        a = (a + 3) % 10;
    	b = (b + 3) % 10;
    	c = (c + 3) % 10;
    	d = (d + 3) % 10;
    	dig = c * 1000 + d * 100 + a * 10 + b;
    	
    	return (dig);
    	

	}

}
