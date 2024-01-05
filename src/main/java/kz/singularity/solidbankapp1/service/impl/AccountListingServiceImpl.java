package kz.singularity.solidbankapp1.service.impl;

import kz.singularity.solidbankapp1.dao.AccountDAO;
import kz.singularity.solidbankapp1.model.Account;
import kz.singularity.solidbankapp1.model.AccountType;
import kz.singularity.solidbankapp1.model.AccountWithdraw;
import kz.singularity.solidbankapp1.service.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {
    AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountByType(String clientID, AccountType accountType) {
        return null;
    }
}
