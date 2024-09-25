package com.example.bank_account_service.service;

import com.example.bank_account_service.DTO.BankAccountRequestDTO;
import com.example.bank_account_service.DTO.BankAccountResponseDTO;
import com.example.bank_account_service.entities.BankAccount;
import com.example.bank_account_service.enums.AccountType;
import com.example.bank_account_service.mappers.AccountMapper;
import com.example.bank_account_service.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    BankAccountRepository accountRepository;
    private AccountMapper accountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = accountMapper.toBankAccount(bankAccountDTO);
        BankAccount savedBankAccount = accountRepository.save(bankAccount);
     BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(savedBankAccount);
        return bankAccountResponseDTO;
    }
}
