package step4_01.string;
//2021-10-01 5:29 ~ 5:36
//# 문자열 1차원

public class StringEx06_정답 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		String[] num = str.split("/");
		
		int sav = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= Integer.parseInt(num[i]);
			sav +=arr[i];
		}
		System.out.println(sav);
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89}; // 0 1 2
		String text = "";
		
		for(int i=0; i<scores.length; i++) {
			text += scores[i] + "" + "/";
		}
		
		System.out.print(text.substring(0,9));
	}

}
