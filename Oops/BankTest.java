package com.Suraj.Oops;
//Ex of Method Overriding
class Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class SBI extends Bank {
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Interest Rate: " + b.getRateOfInterest() + "%");
    }
}
