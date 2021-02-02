import java.util.Scanner;
public class Organization {
public static void main(String[] args) {
// TODO Auto-generated method stub
Manager obj_1=new Manager("Saksham", 12345,100000);
obj_1.empdetails();
}
}
class Employee
{String name;
int empid;
float salary;
Employee()
{
}
Employee(String n, int emp, float sal)
{
this.name=n;
this.empid=emp;
this.salary=sal;
}
String name() {
return name;
}
float salary()
{
return salary;
}
float increaseSalary()
{
System.out.println("Enter the percentage by which you want to increase the salary");
Scanner sc=new Scanner(System.in);
int per=sc.nextInt();
float increase=(per*salary)/100;
float total=salary+increase;
return total;
}}
class Manager extends Employee
{
Manager(String name, int empid, float salary)
{
super(name,empid,salary);
}
void empdetails()
{
String department;
float increase=increaseSalary();
System.out.println("Enter the department of employee ");
Scanner sc=new Scanner(System.in);
department= sc.nextLine();
System.out.println("The name of Employee is: "+name);
System.out.println("The Employee ID of "+name+ " is: "+empid);
System.out.println("The salary of "+name+ " is: "+salary);
System.out.println("The salary of "+name+ " is increased to: "+increase);
System.out.println(name+" belong to the department: " +department);
}}