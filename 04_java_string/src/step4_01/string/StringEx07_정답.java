package step4_01.string;


//2021-10-04 8:49 ~ 9:23
public class StringEx07_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];

		String[] part1 = str.split(","); // 김철수/87  이만수/42  이영희/95
		String[] part2 = new String[6];
		
		for(int i=0; i<3; i++) {
										// 0	1		2	3		4	5
			part2 = part1[i].split("/");//김철수  87  이만수  42  이영희  95
			name[i] = part2[0]; //name[ 0 1 2 ] =
			score[i] = Integer.parseInt(part2[1]);

		}
	
		for(int i=0; i<3; i++) {
			System.out.print(name[i] + " ");
		}
		for(int i=0; i<3; i++) {
			System.out.print(score[i]+ " ");
		}

	}

}
