package Yussuf_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int newnum = 0;
		
		System.out.print("Please enter a four digit integer :");
		int num = scnr.nextInt();
		 while(num > 9999) {
		   System.out.print("Error, please enter a 'FOUR' digit integer :");
		   num = scnr.nextInt();
		   newnum = Encrypt(num);
		 }if(num < 9999)
		   newnum = Encrypt(num);	 
		 
		System.out.println("The encrypted integer is :" +newnum);
		 
		
	}
    public static int Encrypt(int dig) {

    	int a = dig / 1000;
    	int b = (dig % 1000) / 100;
    	int c = (dig % 100) / 10;
    	int d = dig % 10;
    	
        a = (a + 7) % 10;
    	b = (b + 7) % 10;
    	c = (c + 7) % 10;
    	d = (d + 7) % 10;
    	dig = c * 1000 + d * 100 + a * 10 + b;
    	
    	return(dig);

	}

}
