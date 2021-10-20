package step4_01.string;

//	문자열 관련 메서드(기능)

public class StringEx03 {

	public static void main(String[] args) {

		String str = "megait";
		System.out.println(str);
		System.out.println();
		
		//비교
//		int[] a = new int[3];
//		System.out.println(a.length);
		
		// 1) 문자열의 길이 : length()
		System.out.println(str.length());
		int size = str.length();
		System.out.println(size);
		System.out.println();
		
		// 2) 문자 한개 추출 (인덱싱) : charAt(index)
		System.out.println(str.charAt(0)); // 0 1 2...
		System.out.println(str.charAt(1));
		
		char ch = str.charAt(2); //(중요) charAt 메서드의 결과는 char자료형이다
		System.out.println(ch);
		System.out.println(str.charAt(str.length()-1)); // 마지막 글자 가져옴..
		
		System.out.println();
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		// 3) 문자 여러개 추출 (슬라이싱) : substring()
		// 3-1) substring(index1이상, index2미만)
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4,6));
		String subStr = str.substring(2,4);
		System.out.println(subStr);
		
		//3-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		System.out.println();
		
		// 4) 구분자로 잘라내기 : split(구분자)
		String str1 = "hello,java";
		String str2 = "hello java programming";
		String str3 = "hello@java@programming@megait";
		
		//
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		//
		temp = str2.split(" ");
		System.out.println(temp.length);
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();			
		
		//
		temp = str3.split("@");
		System.out.println(temp.length);
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();			
		
		System.out.println();
		
		// 5) 문자열 비교 : compareTo()
		str1 = "ac"; //0 1 2 3 4
		str2 = "ec"; //a b c d e....
		str3 = "ac";
		
		// 왼쪽값(기준값)이 작을 경우 음수
		System.out.println(str1.compareTo(str2));  //02 . 42
		
		// 왼쪽값(기준값)이 클 경우 양수
		System.out.println(str2.compareTo(str1)); //42 . 02
		
		// 양쪽값이 같은 경우 0
		System.out.println(str1.compareTo(str3));	//02 . 02
		
		
	}

}

