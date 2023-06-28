package main;

import java.util.Scanner;

import event.EventServiceImpl;
import member.MemberServiceImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MemberServiceImpl member = MemberServiceImpl.getInstance();
		EventServiceImpl event = EventServiceImpl.getInstance();
		boolean flag = true;

		while (flag) {
			System.out.println("===============================");
			System.out.print("1. 회원 관리\n2. 이벤트 관리\n3. 프로그램 종료\n>> ");
			switch (sc.nextInt()) {
			case 1 :
				System.out.print("\n회원 관리\n1. 회원 등록\n2. 회원 수 출력\n>> ");
				switch (sc.nextInt()) {
				case 1:
					member.membersave();
					break;
				case 2:
					member.membernum();
					break;
				}
				break;
			case 2 :
				System.out.print("\n이벤트 관리\n1. 이벤트 작성\n2. 이벤트 목록 출력\n>> ");
				switch (sc.nextInt()) {
				case 1:
					event.registerEvent();
					break;
				case 2:
					event.viewAllEvent();
					break;
				}
				break;
			case 3 :
				flag = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
