package jkcodebase.BankApplication.repository;

import jkcodebase.BankApplication.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  TransactionRepository extends JpaRepository <Transaction,String> {
}
