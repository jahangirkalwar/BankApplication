package jkcodebase.BankApplication.service;

import jkcodebase.BankApplication.dto.TransactionDto;
import jkcodebase.BankApplication.entity.Transaction;

public interface TransactionService {

    void saveTransaction (TransactionDto transactionDto);
}
