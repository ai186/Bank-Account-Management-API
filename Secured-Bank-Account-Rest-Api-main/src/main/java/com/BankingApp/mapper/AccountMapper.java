package com.BankingApp.mapper;

import com.BankingApp.dto.AccountDto;
import com.BankingApp.entity.Account;

public class AccountMapper {

    //accountDto -> account
    public static Account mapToAccount(AccountDto dto) {
        return new Account(dto.getId(), dto.getAccountHolderName(), dto.getBalance());
    }

    //account -> accountDto
    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());
    }
}
