package pe.edu.upc.streamfunctional.api;

import pe.edu.upc.streamfunctional.model.Account;
import pe.edu.upc.streamfunctional.repository.AccountRepository;

import java.util.stream.Stream;

public class AccountApi {
    public Stream<Account> getAccounts() {
        AccountRepository accountRepostory = new AccountRepository();
        return accountRepostory.getAccounts().stream();
    }
}
