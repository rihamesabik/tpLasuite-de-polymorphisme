package src;

import java.util.Scanner;

public class td {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=1;
        for(int i=1;i<=15;i++) {
        	if (i%2==0) {
        		p=p*i;
        	}
        }
        System.out.println("les produits"+p);
	}
}
