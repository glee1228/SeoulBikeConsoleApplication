package bikeseoul.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuView {

	public static int menu() {

        int selection = 0;
        Scanner input = new Scanner(System.in);
        try {

        /***************************************************/
        System.out.println();
        System.out.println();
        System.out.println("메뉴");
        System.out.println("-------------------------\n");
        System.out.println("1 - 정류소 정보 전체 검색");
        System.out.println("2 - 정류소 정보 이름으로 검색");
        System.out.println("3 - 정류소 정보 번호로 검색");
        System.out.println("4 - 정류소 정보 거치대수로 검색");
        System.out.println("5 - 정류소 번호로 정류소 좌표 검색");
        System.out.println("6 - 정류소 번호로 대여횟수와 반납횟수 검색");
        System.out.println("7 - 정류소 번호로 해당 정류소 정보 삭제");
        System.out.println("8 - 정류소 이름으로 해당 정류소 정보 삭제");
        System.out.println("9 - 정류소 번호로 해당 정류소 정보 수정");
        System.out.println("10 - 정류소 정보 추가 생성");
        System.out.println("11 - 대여횟수와 반납횟수가 많은 순으로 정류소 정보 검색");
        System.out.println("12 - 나가기");
        
        selection = input.nextInt();
        }catch(InputMismatchException e) {
        	System.out.println(e+"의 오류입니다.");
        }finally {
        return selection;    
        }
    }
}
