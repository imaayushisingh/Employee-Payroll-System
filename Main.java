import java.util.ArrayList;

abstract class Employee { //abstraction
    private String name;
    private int id;
    public Employee(String name, int id){//constructor
        this.name = name;
        this.id = id;
    }
    public String getName(){//encapsulation
        return name;
    }
    public int getID(){
        return id;
    }
    public abstract double calculateSalary(); //abstract method

    @Override //polymorphism
    public String toString(){
        return "Employee[Name: "+name+" ,ID: "+id+" ,Salary: "+calculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{//inheritance
    private double monthlySalary;
    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }

}

class PayRollSystem{
    private ArrayList<Employee> employeeList;
    public PayRollSystem(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee: employeeList){
            if(employee.getID() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
public class Main{
    public static void main(String args[]){

        PayRollSystem payroll = new PayRollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Aayushi", 142, 700000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Aum", 143, 90, 850.0);
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        System.out.println("Initial Employees details: ");
        payroll.displayEmployee();
        System.out.println("Removing Employees: ");
        payroll.removeEmployee(142);
        System.out.println("Remaining Employee details");
        payroll.displayEmployee();



    }

}