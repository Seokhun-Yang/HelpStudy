package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n1.계좌 생성  2.입금  3.출금  4.잔액 조회  5.종료");
            System.out.println("무엇을 하시겠습니까?");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("계좌를 생성하겠습니다.");
                    System.out.println("고객님의 성함을 입력해주세요.");

                    String name = sc.next();
                    bank.createAccount(name);

                    break;
                case 2:
                    System.out.println("계좌번호를 입력해주세요.");

                    String accountNumber = sc.next();

                    System.out.println("입금하길 원하시는 금액을 입력해주세요.");

                    long depositMoney = sc.nextLong();
                    bank.deposit(accountNumber, depositMoney);

                    break;
                case 3:
                    System.out.println("계좌번호를 입력해주세요.");

                    accountNumber = sc.next();

                    System.out.println("출금하길 원하시는 금액을 입력해주세요.");

                    long withdrawMoney = sc.nextLong();
                    bank.withdraw(accountNumber, withdrawMoney);

                    break;
                case 4:
                    System.out.println("계좌번호를 입력해주세요.");

                    accountNumber = sc.next();
                    bank.checkBalance(accountNumber);

                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }

        }
    }
}