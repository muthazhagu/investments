package investments;

/**
 * Created by muthu on 12/26/16.
 */
class Account {
    private final String accountId;
    private final String institution;
    private final AccountType accountType;
    private final String accountHolderName;

    static class Builder{
        private final String accountId;
        private final String institution;
        private final AccountType accountType;

        private String accountHolderName;

        Builder(String accountId, String institution, AccountType accountType){
            this.accountId = accountId;
            this.institution = institution;
            this.accountType = accountType;
        }

        Builder accountHolderName(String accountHolderName){
            this.accountHolderName = accountHolderName;
            return this;
        }

        Account build(){
            return new Account(this);
        }
    }

    private Account(Builder b){
        accountId = b.accountId;
        institution = b.institution;
        accountType = b.accountType;
        accountHolderName = b.accountHolderName;
    }
}
