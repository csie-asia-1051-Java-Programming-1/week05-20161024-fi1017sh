package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021009 陳俞儒
 */

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scn = new Scanner(System.in);
				int i,j;
				int size=scn.nextInt();
				for(i=1;i<=size;i++){
					for(j=1;j<=size;j++){
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
