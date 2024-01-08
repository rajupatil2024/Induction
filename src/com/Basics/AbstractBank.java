package com.Basics;

abstract class AbstractBank {

	abstract void rateOfInterest(); 
	void print() {
		System.out.println("Concrete Method");
	}
}

class SBI extends AbstractBank{
	@Override
	void rateOfInterest() {
		System.out.println("Rate of interest is 12%");
	}
}

class AXIS extends AbstractBank{
	@Override
	void rateOfInterest() {
		System.out.println("Rate of interest is 15%");
	}
}

