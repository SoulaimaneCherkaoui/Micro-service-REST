package com.example.bank_account_service.service;
import com.example.bank_account_service.DTO.BankAccountRequestDTO;
import com.example.bank_account_service.DTO.BankAccountResponseDTO;
import com.example.bank_account_service.entities.BankAccount;

public interface AccountService {
public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
