class Employee {
    public double calculateSalary() {
        return 90000;
    }
}

class Manager extends Employee {
    public double calculateSalary() {
        return 50000;
    }
}

class Worker extends Employee {
    public double calculateSalary() {
        return 25000;
    }
}
 class  EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Manager();
        Employee emp2 = new Worker();

        System.out.println("Manager Salary: " + emp1.calculateSalary());
        System.out.println("Worker Salary: " + emp2.calculateSalary());
    }
}
