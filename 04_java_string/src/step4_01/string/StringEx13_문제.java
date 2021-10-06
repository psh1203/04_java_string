package step4_01.string;
//2021-10-06 1:54 ~ 2:
// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_문제 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		int sav = 0;	
		int cnt = 0;
		
		for(int i=0; i<names.length; i++) {
			char ch1 = names[i].charAt(0);
			int n1 = (int)ch1;
			
			if(n1 > sav) { // 최대값
				sav = n1;
				cnt++;
			}
		}
		
		
		
	}

}
