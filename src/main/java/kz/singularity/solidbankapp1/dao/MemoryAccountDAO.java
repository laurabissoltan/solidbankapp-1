package kz.singularity.solidbankapp1.dao;

import kz.singularity.solidbankapp1.model.Account;
import kz.singularity.solidbankapp1.model.AccountType;
import kz.singularity.solidbankapp1.model.AccountWithdraw;
import kz.singularity.solidbankapp1.service.impl.AccountCreationServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO{

    List <Account> accountList = new ArrayList<>();



/*    public MemoryAccountDAO(List<Account> accountList) {
        this.accountList = accountList;
    }*/

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }
}
