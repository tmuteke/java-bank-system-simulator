package accounts;

public class InvalidWithdrawalException extends Exception {
    public InvalidWithdrawalException(){}

    public InvalidWithdrawalException(String message) {
        super(message);
    }
}
