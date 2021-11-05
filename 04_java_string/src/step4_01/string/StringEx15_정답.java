package step4_01.string;
import java.util.Arrays;
//2021-11-04 5:29 ~ 5:
import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */


public class StringEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		int textLine = text.length(); //문자열 길이
		char[] temp = new char[textLine];
		char[] num = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<textLine; i++) {
			temp[i] = text.charAt(i); //한글자씩

		}
		
		System.out.println(Arrays.toString(temp));
		
		int cnt = 0;
		
//		for(int i=0; i<num.length; i++) {
//			for(int j=0; j<temp.length; j++) {
//				
//				if(num[i] == temp[j]) {
//					cnt++;
//				}else if(num[i] ==)
//				
//			}
//		}
		
		
		scan.close();
	}

}
