package kz.singularity.solidbankapp1.service.impl;

import kz.singularity.solidbankapp1.dao.AccountDAO;
import kz.singularity.solidbankapp1.model.AccountType;
import kz.singularity.solidbankapp1.model.CheckingAccount;
import kz.singularity.solidbankapp1.model.FixedAccount;
import kz.singularity.solidbankapp1.model.SavingAccount;
import kz.singularity.solidbankapp1.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {

    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, String accountID) {
        switch(accountType) {
            case CHECKING -> {accountDAO.createNewAccount(new CheckingAccount(accountType, accountID, clientID, 0.0, true ));
            }
            case FIXED -> {accountDAO.createNewAccount(new FixedAccount(accountType, accountID, clientID, 0.0, false ));
            }
            case SAVING -> {accountDAO.createNewAccount(new SavingAccount(accountType, accountID, clientID, 0.0, true ));
            }
            default -> throw new IllegalStateException("Unexpected value: " + accountType);
        }
    }
}
