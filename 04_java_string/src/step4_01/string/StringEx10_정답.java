package step4_01.string;

import java.util.Scanner;

//2021-10-05 4:01 ~ 4:12
/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		boolean isCheck = true;
		String start = "자전거";		
		while(isCheck) {
			

			System.out.println("제시어 : " + start);
			System.out.print("입력: ");
			String sav = scan.next();
			
			if(sav.equals("quit")) {
				isCheck = false;
				System.out.println("-종료-");
			}
			
			//test
					
			if(start.charAt(start.length()-1) == (sav.charAt(0))) {
				start = sav;
			}else {
				System.out.println("다시 입력");
			}
				
		}
		
		
		scan.close();
	}

}
