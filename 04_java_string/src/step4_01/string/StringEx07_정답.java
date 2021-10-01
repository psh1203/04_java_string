package step4_01.string;

//2021-10-01 5:37 ~ 5:

public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
				
		String[] de = str.split("/");
		String[] xe = new String[3];
		
		for(int i=0; i<de.length; i++) {
			System.out.println(de[i]);
			de[i].split(",");
		}
		

	}

}
