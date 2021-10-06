package step4_01.string;

//import java.util.Arrays;
import java.util.Scanner;
//2021-10-06 12:22 ~ 1:54
/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */


public class StringEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "aaa"}; // 0 1 2
		String[] pws = {"1111",     "2222", "123"}; 
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"}; // 0 1 2
		
		int identifier = -1; // 로그아웃 상태
		
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) { //로그인
				if(identifier > -1) { //로그인 상태면
					System.out.println("이미 로그인된 상태입니다.");
				}
				else if(identifier == -1) { //로그아웃 상태면,
					System.out.print("ID입력 : ");
					String idName = scan.next();
					System.out.print("패스워드 입력 : ");
					String pwNum = scan.next();
					identifier = 0;
					
					for(int i=0; i<ids.length; i++) {
						if(idName.equals(ids[i])) { //입력한 id와 같은 값이 있을때
							identifier=i; //입력한 아이디 배열 위치 저장
							if(pwNum.equals(pws[identifier])) { //입력한 비밀번호와 같은 값일때
								System.out.println(ids[identifier] + "님 로그인 상태입니다.");
								//로그인 상태로 바꿈
							}else {
								System.out.println("비밀번호를 다시 확인하세요.");
							}	
						}
					}
				}
				
			}
			else if (sel == 2) { //로그아웃
				if(identifier == -1) {
					System.out.println("이미 로그아웃 상태입니다.");
				}else if(identifier > -1) {
					System.out.println("로그아웃 되었습니다.");
					identifier = -1;
				}
			}
			else if (sel == 3) { //쇼핑메뉴
				if(identifier == -1) {
					System.out.println("로그인 해주세요.");
				}else if(identifier > -1) {
					for(int i=0; i<items.length; i++) {
						System.out.println((i+1) + ") " + items[i]);
					}
					System.out.print("메뉴선택: ");
					int menuNum = scan.nextInt();
					
					//장바구니에 담기 items[menuNum-1];
					
					jang[count][0] = identifier; // identifier에 id저장
					jang[count][1] = menuNum;	//선택한 메뉴
					
					count++; // 현재 줄 +1
				}
			}
			else if (sel == 4) { //장바구니
				int sel1 = 0;
				int sel2 = 0;
				int sel3 = 0;
				
				for(int i=0; i<count; i++) {
					if(jang[i][1] == 1) sel1++; // 개별 카운트
					else if(jang[i][1] == 2) sel2++;
					else if(jang[i][1] == 3) sel3++;
				}
				
				System.out.println(items[0] + " : " + sel1 +"개");
				System.out.println(items[1] + " : " + sel2 +"개");
				System.out.println(items[2] + " : " + sel3 +"개");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		scan.close();

	}

}
