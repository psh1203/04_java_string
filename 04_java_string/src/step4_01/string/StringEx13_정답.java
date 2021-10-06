package step4_01.string;

import java.util.Arrays;

//2021-10-06 2:52 ~ 
// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};

		int cnt = 0; //회전 횟수
		String[] newName = new String[5];
		
		String txt = "";
		int true1 = 0;
		int true2 = 5;
		
		while(true1 < 5) {	
			
			int sav = 0;//최대값 저장
			int j=0; //최대값 배열 위치
			
			for(int i=0; i<names.length; i++) {
				char ch1 = names[i].charAt(0);
				int n1 = (int)ch1;
				
				if(n1 > sav) { // 최대값
					sav = n1;
					j=i;
					cnt++;
				}
			}
			
			
			//사전 역순
			newName[true1++] = names[j];
			names[j] = " ";

			//사전 순
			
		}
		
		for(int i=4; i<newName.length; i--) {
			//newName[i] = names[j];
		}		
		System.out.println(Arrays.toString(newName));
		//System.out.println(txt);
		
	}

}
