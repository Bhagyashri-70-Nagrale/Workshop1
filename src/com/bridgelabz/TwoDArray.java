package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		
		  System.out.println("Enter Matrix size (row/column):  ");
	        Scanner sc = new Scanner(System.in);
	        PrintWriter pw = new PrintWriter(System.out);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int[][] Matrix =new int[a][b];
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                Matrix[i][j] = sc.nextInt();
	            }
	        }
	        pw.println("The matrix you entered according to your input:");
	        for (int i = 0; i < a; i++) {
	            pw.print("[ ");
	            for (int j = 0; j < b; j++) {
	                pw.print(Matrix[i][j]+" ");
	            }
	            pw.println("]");
	            pw.flush();
	        }
	}
}
