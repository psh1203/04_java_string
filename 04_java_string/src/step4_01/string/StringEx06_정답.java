package step4_01.string;

//2021-10-04 8:26 ~ 8:39
//# 문자열 1차원

public class StringEx06_정답 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		String[] asd = str.split("/");	

		//System.out.println(Arrays.toString(asd));
		
		int sav = 0;
		for(int i=0; i<arr.length; i++) {
			int num = Integer.parseInt(asd[i]);
			arr[i] += num;
			sav += arr[i];
		}
		System.out.println(sav);

		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		String[] txt = new String[3];		
		
		for(int i=0; i<scores.length; i++) {
			
			if(i == 2) {
				txt[i] = scores[i] + "";
			}else {
				txt[i] = scores[i] + "/";
			}
			System.out.print(txt[i] + "");
		}

	}

}
