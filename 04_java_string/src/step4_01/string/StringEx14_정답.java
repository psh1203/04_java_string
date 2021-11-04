package step4_01.string;
//2021-11-04 5:19 ~ 5:25
import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 * equals X
 * 문자 길이로 비교.
 * 
 * 예)
 * 코끼리
 * 입력 = 티라노사우루스
 * 출력 = false
 */

public class StringEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");			// ex) 티라노사우루스
		String myName = scan.next();
		
		
		//compareTo 로 비교
//		if(name.compareTo(myName) == 0) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		int str1 = name.length();
		int str2 = myName.length();
		
		//문자 길이 비교..
		if(str1 == str2) {
			
			int cnt = 0; //true카운트
			
			for(int i=0; i<str1; i++) {
				if(name.charAt(i) == myName.charAt(i)) {
					cnt++;
				}else {
					//System.out.println("false");
				}
			}
			
			if(cnt == str1) {
				System.out.println("true!!");
			}else {
				System.out.println("false");
			}
		}
		else {
			System.out.println("false");
		}
		
	}

}
