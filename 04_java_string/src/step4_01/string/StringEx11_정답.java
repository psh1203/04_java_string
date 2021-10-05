package step4_01.string;

import java.util.Arrays;
//2021-10-05 4:12 ~ 4:
import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 	
 * } 
 */

//카테고리 a / 아이템 b + "/"
//{a, b}


public class StringEx11_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		int cnt = 0;
		
		String[] cate = new String[0];
		String[] itm = new String[0];
		String itmMenu = "";
		
		while(true) {
			
			System.out.println(Arrays.toString(cate));
			System.out.println(Arrays.toString(itm));
			System.out.println(Arrays.toString(items));
			System.out.println("================");
			
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if (sel == 1) { //카테고리 관리

				System.out.print("카테고리 추가: ");
				String name1 = scan.next();//입력받기
				
				if(cnt == 0) { // 처음
					cate = new String[1];
					cate[0] = name1; 
				}
				else if(cnt >= 1) { // 3
					
					String temp[] = cate; // 기존 cate 저장
					cate = new String[cnt+1]; // 1개 추가 3+1 = 0 1 2 3
					
					for(int i=0; i<cnt; i++) { // 3
						cate[i] = temp[i];
					}
					
					cate[cnt] = name1;
					temp = null;
				}
				cnt++;
			}
			else if (sel == 2) { //아이템 관리
				System.out.println("선택할 카테고리: ");
				String subName1 = scan.next();
				
				for(int i=0; i<cate.length; i++) {
					
					if(cate[i].equals(subName1)) { //일치하는 카테고리 있는 경우
					
						System.out.print("아이템 입력: ");
						String name2 = scan.next(); // 추가될 아이템명

						String temp[] = itm; // 기존 item
						itm = new String[itemCount+1]; //3+1 = 0 1 2 3
						
						for(int j=0; j<itemCount; j++) {
							itm[i] = temp[i];
						}
						
						itm[itemCount] = name2; // item 추가
						
						//카테고리랑 연결
//				 		{"과자", "홈런볼/쪼리퐁/"},
//						items = new String[100][2];
						for(int j=0; j<items.length; j++) {
							items[j][0] = cate[i]; //카테고리 cate[i]
							
							for(int k=0; k<itemCount; k++) {
								itmMenu += itm[k]+"/"; //아이템목록 문자열화
							}

							items[j][1] = itmMenu; 
							
							  
						}							
						
						temp = null;
						itemCount++;
					}
					
				}
				System.out.println();
			}
			else if (sel == 3) { //전체 상품 출력
				
		
				
			}
			
		}



	}

}
