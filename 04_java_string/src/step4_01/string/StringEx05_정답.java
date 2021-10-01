package step4_01.string;

//2021-10-01 5:04 ~ 5:25
public class StringEx05_정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 33세
		String num = jumin.substring(0,2);
		int dateY = Integer.parseInt(num);
		System.out.println(2021-(1900+dateY-1));
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		String[] xx = jumin.split("-");
		//System.out.println(xx[1]);
		char xy= (xx[1]).charAt(0);

				
		if(xy == '1') {
			System.out.println("남성");
		}else if(xy == '2') {
			System.out.println("여성");
		}

	}

}
