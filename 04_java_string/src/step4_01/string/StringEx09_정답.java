package step4_01.string;
//2021-10-05 3:19 ~ 4:00;
/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"}; //문제
		boolean[] isCheck = new boolean[4];
		String[] sav = new String[4];
		
		//셔플

		int i = 0;
		while(i<4) {

			int num = ran.nextInt(4);			
			if(!isCheck[num]) { //false통과
				isCheck[num] = true; // 랜덤Check = true로 변환
				sav[i++] = words[num]; // 랜덤문제 배열[0 1 2 3] = 기존 문제 배열[랜덤]
			}

		}
		//테스트 확인
		System.out.println(Arrays.toString(sav));	
		
		i = 0;
		int cnt = 0;
		
		while(i<4) { // 0 1 2 3
			
			System.out.println("문제: " + sav[i]); // 0 1 2 3
			System.out.print("답 입력: ");
			String txt = scan.next();
			
			
			if(sav[i].equals(txt)) { //정답일때,
				i++;
				System.out.println(i);
			}
			else { //오답일때,
				continue;
				
			}
			


		}
		
		
		
		
		scan.close();

	}

}
