package jkcodebase.BankApplication.service.impl;

import jkcodebase.BankApplication.dto.TransactionDto;
import jkcodebase.BankApplication.entity.Transaction;
import jkcodebase.BankApplication.repository.TransactionRepository;
import jkcodebase.BankApplication.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {

        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();

        transactionRepository.save(transaction);
        System.out.println("Transaction saved Successfully");


    }
}
