import java.util.Objects;
import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
       // printArrayEmploess();
        maxSalary();
        minSalary();
    }
    public static void maxSalary(){
        int [] employeesSalary = {5,15,36,9,5};
        int maxSalary =  employeesSalary[0];
        for (int j: employeesSalary) {
            if (j > maxSalary){
                 maxSalary = j;
            }
        }
        System.out.println("максимальное значение "+ maxSalary);
    }
     public static void minSalary(){
        printArrayEmploess();
         int[] minSalary = {1, 4, -2, 3};
         int min = 0;
         for (int i : minSalary) {
             if (i < min) {
                 min = i;
             }
         }
         System.out.println(min);

     }
    public static void printArrayEmploess(){
        Employee [] employees = new Employee[10];
        employees[0] = new Employee("Анна",21000,1);
        employees[1] = new Employee("Владимир",22000,1);
        employees[2] = new Employee("Григорий",23000,2);
        employees[3] = new Employee("Ирина",24000,2);
        employees[4] = new Employee("Татьяна",25000,3);
        employees[5] = new Employee("Елена",25000,3);
        employees[6] = new Employee("Дмитрий",26000,4);
        employees[7] = new Employee("Павел",27000,4);
        employees[8] = new Employee("Андрей",28000,5);
        employees[9] = new Employee("Светлана",29000,5);

        int id = 0 ;
        for (int i = 0; i < employees.length; i++) {
            id ++;
            System.out.println(employees[i] +" id: "  + id);
        }

    }
    public static  getMaxSalaryes (arrEmloyees[]){


    }

}