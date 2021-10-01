package step4_01.string;

import java.util.Scanner;

/*
 * 
 *  # 문자열 비교 메서드
 *  
 * 		 equals() : 문자열은 == 연산자로 비교하지 않고 equals 메서드로 비교한다. 
 * 
 * 
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String productCd = "0x1234";
		System.out.print("# 상품코드 : ");
		String getProductCd = scan.next();
		
		//비교불가
//		if(productCd == getProductCd) System.out.println("== 연산자 : 일치");
//		else						  System.out.println("== 연산자 : 불일치");
		
		//비교가능
		if(productCd.equals(getProductCd)) System.out.println("== 연산자 : 일치");
		else							   System.out.println("== 연산자 : 불일치");

		scan.close();
	}

}
