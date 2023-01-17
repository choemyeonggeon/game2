package game.yongmin.want.java.study;

import java.util.Scanner;

public class Yongmin extends DTO {
	public Yongmin() {
		setName("김용민");
		setExp(0);
		setAge(24);
	}
	public void checkyoungmin() {



		System.out.println("내이름은"+ getName());
		System.out.println("내 경험치는!  "+ getExp() +"  야!");
		System.out.println("내나이는 파릇파릇한 " + getAge() + "살!");

	}

	public void studyyongmin() {
		System.out.println("오늘의 공부 방식은??");
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("용민이가 공부를 시작한다!");
			System.out.println("1. 용민이가 코딩자습하기");
			System.out.println("2. 용민이가 인터넷강의를 본다!");
			System.out.println("3. 용민이가 선생님의 줌영상을 다시본다!");
			System.out.println("4. 메뉴로 돌아가기");


			int no = sc.nextInt();

			switch(no) {
			case 1:
				setExp(getExp()+100); 
				System.out.println("100점이 증가했습니다");
				break;
			case 2:
				setExp(getExp()+150);
				System.out.println("150점이 증가했습니다");
				break;
			case 3:
				setExp(getExp()+300);
				System.out.println("300점이 증가했습니다");
				break;	
			case 4:
				return;
			default :
				System.out.println("다른 번호를 다시 입력해 주세요");
			}
		}
	}	
	public void playyongmin() {

		System.out.println("오늘의 공부 방식은??");
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("용민이가 놀기 시작한다!");
			System.out.println("1. 용민이가 게임을 시작한다...");
			System.out.println("2. 용민이가 잠을 잔다...");
			System.out.println("3. 용민이가 여자친구를 만나러 간다...");
			System.out.println("4. 메뉴로 돌아가기");

			int oo = sc.nextInt();

			switch(oo) {
			case 1:
				setExp(getExp()-100); 
				System.out.println("100점이 떨어졌습니다");
				break;
			case 2:
				setExp(getExp()-150);
				System.out.println("150점이 떨어졌습니다");
				break;
			case 3:
				setExp(getExp()-300);
				System.out.println("300점이 떨어졌습니다");
				break;	
			case 4:
				return;
			default :
				System.out.println("다른 번호를 다시 입력해 주세요");
			}


		}
	
		}
	
	public void Interview() {
		Scanner sc = new Scanner(System.in);
		
		int rd = sc.nextInt();
		if(getExp()<1500) {
			System.out.println("면접에 신청 할 수 없습니다.");
		}else{
		System.out.println("면접에 신청 할 수 있습니다.");
		switch(rd) {
		case 1:
		System.out.println("면접에 도전한다!");
		break;
		case 2:
		System.out.println("면접은 다음 기회에!");
		break;
		case 3:
			System.out.println("메뉴로 돌아가기");
			return;
		}
	
		}
	}	
		
}
	