package pe.edu.upc.streamfunctional.service;
import lombok.AllArgsConstructor;
import pe.edu.upc.streamfunctional.api.AccountApi;
import pe.edu.upc.streamfunctional.model.Account;
import pe.edu.upc.streamfunctional.repository.AccountRepository;
import java.util.List;
import java.util.stream.Collectors;
@AllArgsConstructor
public class AccountService {
    private final AccountApi accountApi;
    private final AccountRepository accountRepostory;

    public void listAccount() {
        List<Account> accounts = accountRepostory.getAccounts();
        for(int i=0; i < accounts.size();i++) {
            System.out.println(accounts.get(i));
        }
    }
    public void listAccountForeach() {
        List<Account> accounts = accountRepostory.getAccounts();
        for(Account account : accounts) {
            System.out.println(account);
        }
    }
    public void listAccountFunctional() {
        accountRepostory.getAccounts().
                forEach(account -> System.out.println(account));
    }
    public void listAccountMethodReference() {
        accountRepostory.getAccounts().
                forEach(System.out::println);
    }

    public void listStreamAccount() {
        accountApi.getAccounts().collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public void filterAccount(String customer) {
        accountApi.getAccounts()
                .filter(account -> account.getCustomer() == customer)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public void mapAccount(String customer) {
        accountApi.getAccounts()
                .filter(account -> account.getCustomer() == customer)
                .map(account -> account.getNumberAccount())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public void mapAccount300() {
        accountApi.getAccounts()
                .map(account -> {
                    if(account.getAmount() > 300) {
                        account.setAmount(account.getAmount() * 1.1F);
                    }
                    return account;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    public void mapAccountNew300() {
        accountApi.getAccounts()
                .map(this::incrementAmount)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
    private Account incrementAmount(Account account) {
        if(account.getAmount() > 300) {
            account.setAmount(account.getAmount() * 1.1F);
        }
        return account;
    }
}
