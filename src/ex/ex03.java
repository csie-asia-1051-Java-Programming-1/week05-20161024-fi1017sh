package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021009 陳俞儒
 */

public class ex03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long n=scn.nextLong();
		long i=(long) (Math.pow(2, n)-1);
		System.out.println(2*i);
	}

}
