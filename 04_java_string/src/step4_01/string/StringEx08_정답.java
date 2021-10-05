package step4_01.string;

//2021-10-05 3:12 ~ 3:19
public class StringEx08_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		String[] num = new String[3];
		
		String str = "";
				
		for(int i=0; i<3; i++) {
			num[i] = score[i]+"";
			
			if(i == 2) {
				name[i] += "/" + num[i];
			}else {
				name[i] += "/" + num[i] + ",";
			}
			
			str += name[i];
		}
		
		System.out.println(str);

	}

}
