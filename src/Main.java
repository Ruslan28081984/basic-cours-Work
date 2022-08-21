import java.util.Objects;
import java.util.Arrays;
import java.util.Random;


public class Main {

    static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        employees[0] = new Employee("Анна", 1, 20000.0);
        employees[1] = new Employee("Вера", 2, 21000.0);
        employees[2] = new Employee("Лера", 3, 22000.0);
        employees[3] = new Employee("Катя", 4, 23000.0);
        employees[4] = new Employee("Маша", 5, 24000.0);
        employees[5] = new Employee("Даша", 1, 25000.0);
        // employees[6] = new Employee("Анна",2, 26000.0);
        employees[7] = new Employee("Валя", 3, 27000.0);
        employees[8] = new Employee("Таня", 4, 28000.0);
        employees[9] = new Employee("Галя", 5, 29000.0);

//        printAllEmployees();
        getCalculaterEmloyeesSalarySum();
        System.out.println(getCalculaterEmloyeesSalarySum());
        getEmployeeMinSalary();
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAndCalculateAverageSalary());
        printFullNameAllEmployee();

    }

    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static double getCalculaterEmloyeesSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                 minSalary = employees[i].getSalary();
                 minSalaryEmpl = employees[i];
                 index = 1;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null){
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];
                }
            }
        }
        return minSalaryEmpl;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = 1;
                break;
            }
        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null){
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];
                }
            }
        }
        return maxSalaryEmpl;
    }

    public static double getAndCalculateAverageSalary() {
        double sumSalaryEml = getCalculaterEmloyeesSalarySum();
        if (sumSalaryEml != 0) {
            return sumSalaryEml / employees.length;
        } else {
            return  0;
        }
    }

    public static void printFullNameAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }

        }
    }
}