package com.Basics1;

public class Bank {

	double rateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double rateOfInterest() {
        return 7.5;
    }
}

class AXIS extends Bank {
    @Override
    double rateOfInterest() {
        return 8.0;
    }
}

class HDFC extends Bank {
    @Override
    double rateOfInterest() {
        return 8.5;
    }
}

class KarnatakaBank extends Bank {
    @Override
    double rateOfInterest() {
        return 7.2;
    }
}

