package step4_01.string;

// 문자열 관련 데이터의 형변환

public class StringEx04 {

	public static void main(String[] args) {
		
		// 1) 문자열 ==> 숫자
		String sNum = "10";
		System.out.println(sNum + 1); // 101
		int nNum = Integer.parseInt(sNum); //Integer.parseInt("문자열") 메서드 사용
		System.out.println(nNum + 1); // 11

		System.out.println();
		
		// 2) 숫자 ==> 글자
		
		// 2-1) + "" 사용
		String str1 = nNum + ""; // "10"
		System.out.println(str1+1); //101
		
		// 2-2) Integer.toString(숫자) 메서드 사용
		String str2 = Integer.toString(nNum);
		System.out.println(str2+1);
		
		// 2-3) String.valueOf(숫자)메서드 사용
		String str3 = String.valueOf(nNum);
		System.out.println(str3+1);
		
		System.out.println();
		
		// 참고) 구글에서 ASCII코드표 검색 (65 : 'A' , 97: 'a' 상식으로 암기)
		char ch1 = 'a';
		int n1 = (int)ch1;
		System.out.println(ch1 + " / " + n1);
		System.out.println();
		
		
		
		
		
	}

}
