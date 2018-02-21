import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }
    /**
     *
     */
    private String accountName;
    /**
     *
     */
    private String accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;
    /**
     *
     * @param name dddd
     * @param accountCategory ddd
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        accountName = name;
        this.accountType = accountCategory;
    }
    /**
     *@param number sss.
     */
    public void setAccountNumber(final String number) {
        accountNumber = number;
    }
    /**
     *@return jjj
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     *@param name jjj
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }
    /**
     *
     * @return jjj
     */
    public String getOwnerName() {
        return ownerName;
    }
    /**
     *
     * @param money hhh
     */
    public void setAccountBalance(final double money) {
        accountBalance = money;
    }
    /**
     *
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }
    /**
     *
     */
    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
