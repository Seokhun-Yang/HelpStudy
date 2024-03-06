package org.example;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Account> accountMap;

    public Bank() {
        accountMap = new HashMap<>();
    }

    public void createAccount(String name) {
        Account account = new Account(name);
        accountMap.put(account.getAccountNumber(), account);

        System.out.println("신규 계좌가 생성되었습니다.");
        System.out.println(name + " 고객님의 계좌번호는 " + account.getAccountNumber() + " 입니다.");
    }

    public void deleteAccount(String accountNumber) {
        accountMap.remove(accountNumber);

        System.out.println("계좌가 삭제되었습니다.");
    }

    public void checkBalance(String accountNumber) {
        Account account = accountMap.get(accountNumber);

        if (account == null) {
            System.out.println("해당 계좌번호를 가진 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.println("현재 잔액은 " + account.getCurrentMoney() + "원 입니다.");
    }

    public void deposit(String accountNumber, long money) {
        if (money <= 0) {
            System.out.println("입금액은 0원을 초과해야 합니다.");
            return;
        }

        Account account = accountMap.get(accountNumber);

        if (account == null) {
            System.out.println("해당 계좌번호를 가진 계좌가 존재하지 않습니다.");
            return;
        }

        long currentMoney = account.getCurrentMoney();

        currentMoney += money;
        account.setCurrentMoney(currentMoney);

        System.out.println("입금이 완료되었습니다. 현재 잔액은 " + currentMoney + "원 입니다.");
    }

    public void withdraw(String accountNumber, long money) {
        if (money <= 0) {
            System.out.println("출금액은 0원을 초과하여야 합니다.");
            return;
        }

        Account account = accountMap.get(accountNumber);

        if (account == null) {
            System.out.println("해당 계좌번호를 가진 계좌가 존재하지 않습니다!");
            return;
        }

        long currentMoney = account.getCurrentMoney();

        if (currentMoney - money < 0) {
            System.out.println("더 이상 출금하실 수 없습니다. 현재 잔액은 " + currentMoney + "원 입니다.");
            return;
        }

        currentMoney -= money;
        account.setCurrentMoney(currentMoney);

        System.out.println("출금이 완료되었습니다. 현재 잔액은 " + currentMoney + "원 입니다.");
    }
}
