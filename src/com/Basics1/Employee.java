package com.Basics1;

public class Employee {
    String ename;
    double salary;
    int eid;

    public Employee(String ename, double salary, int eid) {
        this.ename = ename;
        this.salary = salary;
        this.eid = eid;
    }
}

class Development extends Employee {
    public Development(String ename, double salary, int eid) {
        super(ename, salary, eid);
        this.ename=ename;
        this.salary=salary;
        this.eid=eid;
    }
    public void display() {
    	System.out.println("===========Development Employee==========");
        System.out.println("Employee Name: " + ename);
        calculateSalary();
        System.out.println("Employee Id: " + eid);
    }

    private void calculateSalary() {
        if (salary < 15000) {
            System.out.println("Employee Salary: " + (salary + salary * 0.05));
        } else {
            System.out.println("Employee Salary: " + (salary + salary * 0.08));
        }
    }
}

class Testing extends Employee {
    public Testing(String ename, double salary, int eid) {
        super(ename, salary, eid);
        this.ename=ename;
        this.salary=salary;
        this.eid=eid;
    }
    public void display() {
    	System.out.println("===========Testing Employee==========");
        System.out.println("Employee Name: " + ename);
        calculateSalary();
        System.out.println("Employee Id: " + eid);
        
    }

    private void calculateSalary() {
        if (salary < 10000) {
            System.out.println("Employee Salary: " + (salary + salary * 0.03));
        } else if (salary > 20000) {
            System.out.println("Employee Salary: " + (salary + salary * 0.1));
        } else {
            System.out.println("Invalid Details");
        }
    }
}

