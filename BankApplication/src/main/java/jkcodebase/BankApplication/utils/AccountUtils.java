package jkcodebase.BankApplication.utils;

import java.util.Random;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE="409";
    public static final String ACCOUNT_EXISTS_MESSAGE="The account is already registered with this email.";
    public static final String ACCOUNT_CREATION_SUCCESS="001";
    public static final String ACCOUNT_CREATION_MESSAGE="Account has been created successfully.";

    public static final String ACCOUNT_CREDITED_SUCCESS="005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE="Account has been credited";

    public static final String ACCOUNT_DEBIT_SUCCESS="007";
    public static final String ACCOUNT_DEBIT_SUCCESS_MESSAGE="Account has been debited";

    public static final String TRANSFER_SUCCESS_CODE="008";
    public static final String TRANSFER_SUCCESS_MESSAGE="Transfer successful";

    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficient balance!";

    public static final String ACCOUNT_FOUND_CODE="004";
    public static final String ACCOUNT_FOUND_MESSAGE="User Account Found";
    public static final String ACCOUNT_NOT_EXISTS_CODE="003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE="User with the provided Account Number does not exist";

    private static final Random random = new Random();
    public static String generateAccountNumber() {
        return "0137" + String.format("%010d", random.nextLong(1000000000L));
    }


}
