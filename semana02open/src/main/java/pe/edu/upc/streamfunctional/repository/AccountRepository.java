package pe.edu.upc.streamfunctional.repository;
import pe.edu.upc.streamfunctional.model.Account;
import java.util.ArrayList;
import java.util.List;
public class AccountRepository {
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(1, "123-456-789", 123F, "1"));
        accounts.add(new Account(2, "123-456-788", 223F, "2"));
        accounts.add(new Account(3, "123-456-788", 323F, "2"));
        accounts.add(new Account(4, "123-456-787", 423F, "2"));
        accounts.add(new Account(5, "123-456-786", 23F, "3"));

        return accounts;
    }
}
