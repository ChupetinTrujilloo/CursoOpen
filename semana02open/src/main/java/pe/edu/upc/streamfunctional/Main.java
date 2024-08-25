package pe.edu.upc.streamfunctional;
import pe.edu.upc.streamfunctional.api.AccountApi;
import pe.edu.upc.streamfunctional.repository.AccountRepository;
import pe.edu.upc.streamfunctional.service.AccountService;
public class Main {
    public static void main(String[] args) {
        AccountApi accountApi = new AccountApi();
        AccountRepository accountRepostory = new AccountRepository();
        AccountService accountService = new AccountService(accountApi, accountRepostory);

        //accountService.listAccount();
        //accountService.listAccountForeach();
        //accountService.listAccountFunctional();
        //accountService.listAccountMethodReference();
        //accountService.listStreamAccount();
        //accountService.filterAccount("2");
        //accountService.mapAccount("2");
        //accountService.mapAccount300();
        accountService.mapAccountNew300();
    }
}
