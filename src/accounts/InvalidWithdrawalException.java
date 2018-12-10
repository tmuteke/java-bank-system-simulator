package accounts;

public class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(){}

    InvalidWithdrawalException(String message) {
        super(message);
    }
}
