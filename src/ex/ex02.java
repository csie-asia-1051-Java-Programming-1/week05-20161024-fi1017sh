package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021009 陳俞儒
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n;
		System.out.println("請輸入n值:");
		n = scn.nextInt();
		int i=n--;
		int sum = 1;
		while(i>0){//條件
			sum =sum*i;//運算主體
			i--;//增減量
		}
		System.out.println("答案:"+sum);
	}

}
