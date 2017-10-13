package lesson5;

import javax.security.auth.login.AccountException;

public interface DepositRequest extends Request {

    Account getDepositAccount();
}
