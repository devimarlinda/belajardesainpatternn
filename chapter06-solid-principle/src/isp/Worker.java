package isp;

class Employe {
    private int id;
    private String name;
    private double salary;
    public Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Mengatur gaji
    public void adjustSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }
    // Menangani laporan keuangan
    public void generatePaySlip() {
        System.out.println("Generating payslip for " + name);
        System.out.println("Salary: " + salary);
    }
    // Menampilkan informasi karyawan
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Kelas untuk menyimpan informasi dasar karyawan
class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
// Kelas untuk mengatur gaji karyawan
class SalaryManager {
    public void adjustSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
    }
}

// Kelas untuk menangani laporan keuangan
class PaySlipGenerator {
    public void generatePaySlip(Employee employee) {
        System.out.println("Generating payslip for " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", 5000.0);

        // Menggunakan SalaryManager untuk mengatur gaji
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.adjustSalary(employee, 10); // Naik gaji 10%

        // Menggunakan PaySlipGenerator untuk menghasilkan slip gaji
        PaySlipGenerator paySlipGenerator = new PaySlipGenerator();
        paySlipGenerator.generatePaySlip(employee);

        // Menampilkan informasi karyawan
        employee.displayEmployeeInfo();
    }
}

