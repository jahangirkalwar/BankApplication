package jkcodebase.BankApplication.service;

import jkcodebase.BankApplication.dto.EmailDetails;

public interface EmailService {
    void sendEmail(EmailDetails emailDetails);
}
