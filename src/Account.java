public class Account {
    private float balance;

    public void deposit(float amount ) {
        if ( amount > 0 ) {
            balance += amount;
        }
    }

    public void withdraw(float amount) {
        if (amount > 0 ) {
            balance -= amount;
        }
    }

    //getter - reading value from a field
    public float getBalance() {
        return balance;
    }

    //Encapsulation - Bundling the data and methods that operate on the data within one unit or class
    // and hiding the values or state of an object in the class


}
