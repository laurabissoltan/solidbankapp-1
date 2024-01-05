package kz.singularity.solidbankapp1.service;

import kz.singularity.solidbankapp1.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, String accountID);
}
