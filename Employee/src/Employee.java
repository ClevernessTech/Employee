//Gaddis Chapter 10 Programming Challenge 1

import java.util.Random;
public class Employee {
    String employeeName;
    int employeeNum;
    char employeeLetter;
    String employeeID;
    String hireDate;
    Random r = new Random();

    public Employee(){
        employeeName = "Company President";
        employeeNum = r.nextInt(1000);
        employeeLetter = (char)(r.nextInt(13) + 'a');
        hireDate = "10/03/2019";
        String str = String.format("%03d", employeeNum);
        employeeID = str + Character.toUpperCase(employeeLetter);
    }
    public Employee(String emplName, String hDate){
        employeeName = emplName;
        employeeNum = r.nextInt(1000);
        employeeLetter = (char)(r.nextInt(13) + 'a');
        hireDate = hDate;
        String str = String.format("%03d", employeeNum);
        employeeID = str + Character.toUpperCase(employeeLetter);
    }

    public void setEmployee(String e){
        this.employeeName = e;
    }
    public void setEmployeeNum(int eNum){
        this.employeeNum = eNum;
    }
    public void setHireDate(String hDate){
        this.hireDate = hDate;
    }

    public String getEmployeeID(){
        return this.employeeID;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    public String getEmployeeHireDate(){
        return this.hireDate;
    }

    public static void main(String args[]){
        Employee employee1 = new Employee();
        System.out.println(employee1.employeeID + "\t" + employee1.hireDate + "\t" + employee1.employeeName);
        Employee employee2 = new Employee("Jose Soto", "10/13/1986");
        System.out.println(employee2.employeeID + "\t" + employee2.hireDate + "\t"+ employee2.employeeName);
    }

}
