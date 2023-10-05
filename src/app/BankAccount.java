package app;

public class BankAccount {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";


    private String password;
    private double balans;

    public BankAccount(String password) {
        this.password = password;
        this.balans = 0.0;
    }

    public boolean autoEnter(String enteredPassword) {
        return enteredPassword.equals(password);
    }

    public void Medaxil(double miqdar) {
        balans += miqdar;
    }

    public void PulCek(double miqdar) {
        if (miqdar <= balans) {
            balans -= miqdar;
        } else {
            System.out.println(RED + "Balansinizda kifayet qeder vesait yoxdur. " + RESET);
        }
    }

    public double getBalans() {
        return balans;
    }


}