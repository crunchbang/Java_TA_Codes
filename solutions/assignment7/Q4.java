
abstract class Account {
        protected float balance;

        public Account(float initial) {
                balance = initial;
        }

        public float getBalance() {
                return balance;
        }

        public abstract boolean withdraw(float amount); 

        public abstract boolean deposit(float amount); 
}

class SavingsAccount extends Account {

        private float interest;

        public SavingsAccount(float initial, float interest) {
                super(initial);
                this.interest = interest;
        }

        @Override
        public boolean withdraw(float amount) {
                boolean status;

                if (balance - amount < 0) {
                        status = false;
                } else {
                        balance -= amount;
                        status = true;
                }
                return status;
        }

        @Override
        public boolean deposit(float amount) {
                boolean status;

                if (amount < 0) {
                        status = false;
                } else {
                        balance += amount;
                        status = true;
                }
                return status;
        }

        public boolean addInterest() {
                float interestAmt = (balance * interest) / 100;
                boolean status = deposit(interestAmt);
                return status;
        }
}

class CurrentAccount extends Account {
        private final float overdraftLimit;

        public CurrentAccount(float initial, float limit) {
                super(initial);
                overdraftLimit = limit;
        }

        @Override
        public boolean deposit(float amount) {
                boolean status;

                if (amount < 0) {
                        status = false;
                } else {
                        balance += amount;
                        status = true;
                }
                return status;
        }

        /*
         * Check if the amount to be withdrawn is within 
         * the overdraft limit. If yes, allow; Deny otherwise.
         */
        @Override
        public boolean withdraw(float amount) {
                float excess = getBalance() - amount;
                boolean status;
                if (Math.abs(excess) < overdraftLimit) {
                        balance -= amount;
                        status = true;
                } else {
                        status = false;
                }
                return status;

        }

}

class Q4 {
        public static void main(String[] args) {
                SavingsAccount a2 = new SavingsAccount(100, 10);
                System.out.println("Savings account with balance 100 & interest 10% created");
                if (a2.addInterest()) {
                        System.out.println("Interest added.\nBalance: " + a2.getBalance());
                } else {
                        System.out.println("Error adding interest.");
                }

                System.out.println();
                CurrentAccount a3 = new CurrentAccount(100, 500);
                System.out.println("Current account with balance 100 & overdraft limit 500 created");
                if (a3.withdraw(400)) {
                        System.out.println("Rs.400 withdrawn.\nBalance: " + a3.getBalance());
                } else {
                        System.out.println("Withdraw failed. Exceeds overdraft limit.");
                }

                if (a3.withdraw(100)) {
                        System.out.println("Rs.100 withdrawn.\nBalance: " + a3.getBalance());
                } else {
                        System.out.println("Withdraw failed. Exceeds overdraft limit.");
                }

                if (a3.withdraw(200)) {
                        System.out.println("Rs.200 withdrawn.\nBalance: " + a3.getBalance());
                } else {
                        System.out.println("Withdraw failed. Exceeds overdraft limit.");
                }

                /*
                 * OUTPUT
                 *
                 * Savings account with balance 100 & interest 10% created
                 * Interest added.
                 * Balance: 110.0
                 *
                 * Current account with balance 100 & overdraft limit 500 created
                 * Rs.400 withdrawn.
                 * Balance: -300.0
                 * Rs.100 withdrawn.
                 * Balance: -400.0
                 * Withdraw failed. Exceeds overdraft limit.
                 */


        }
}
