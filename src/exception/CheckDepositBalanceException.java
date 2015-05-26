package exception;

/**
 * @author Maral Khojasteh
 */
public class CheckDepositBalanceException extends Exception {
    public CheckDepositBalanceException(String myMessage){
        super(myMessage);
    }
}
