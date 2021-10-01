package step4_01.string;

/*
 * 
 *  # 문자열 입력
 *  
 *  	next() : 공백을 기준으로 한 단어만 입력받는다.
 * 
 * */

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		//String name = scan.nextLine();//띄어쓰기 저장가능(클래스 안에 다른 자료형 포함시 오류..)
		String name = scan.next();//띄어쓰기를 제외한 문자열을 입력받는다.
		System.out.println("입력하신 이름은 " + name + "입니다.");
		
		scan.close();

	}

}
