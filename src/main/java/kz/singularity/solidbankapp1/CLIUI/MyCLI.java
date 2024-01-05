package kz.singularity.solidbankapp1.CLIUI;

import kz.singularity.solidbankapp1.model.AccountType;

import java.util.Scanner;

public class MyCLI implements CreateAccountOperationUI {
    Scanner scanner;

    MyCLI() {
        this.scanner = new Scanner(System.in);
    }
    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public double requestClientAmount() {
        return 0;
    }

    public String requestClientAccountNumber() {
        return null;
    }

    public Scanner getScanner() {
        return scanner;
    }

    @Override
    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }
}
