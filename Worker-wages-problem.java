import java.util.Scanner;
public class Salary {
public static void main(String[] args)
{
System.out.println("Enter 1 for Daily worker \nEnter 2 for Salaried worker");
Scanner sc3=new Scanner(System.in);
int val=sc3.nextInt();
switch(val)
{
case 1:Scanner sc=new Scanner(System.in);
DailyWorker obj= new DailyWorker();
System.out.println("Enter the name of the daily worker");
obj.enter();
System.out.println("Enter the hours he works in a week");
int hrs=sc.nextInt();
obj.com_pay(hrs);
break;
case 2:Scanner sc4=new Scanner(System.in);
SalariedWorker object=new SalariedWorker();
System.out.println("\nEnter the name of the salaried worker");
object.enter();
System.out.println("Enter the hours he works in a week ");
int workinghours=sc4.nextInt();
object.com_pay(workinghours);
break;
}}}
class Worker
{
void enter() {
Scanner sc=new Scanner(System.in);
String str= sc.nextLine();
}}
class DailyWorker extends Worker
{
void com_pay(int hours)
{float hrs,days;
hrs=hours;
days=hrs/24;
System.out.println("Enter the rate/day of the daily worker ");
Scanner sc1=new Scanner(System.in);
int rate= sc1.nextInt();
float sal=days*rate;
System.out.println("The number of days in "+hrs+" hours is " +days);
System.out.println("Amount is paid for a day is "+rate);
System.out.println("Amount paid is " +sal);
}}
class SalariedWorker extends Worker
{void com_pay(int hours)
{float hrs,days,days_1,sal;
hrs=hours;
days=hrs/24;
days_1=40/24;
System.out.println("Enter the rate/day of the salaried worker ");
Scanner sc2=new Scanner(System.in);
int r= sc2.nextInt();
sal=days_1*r;
System.out.println("The number of days in "+hrs+ " hours is " +days);
System.out.println("Amount paid to salaried worker for 40 hrs or "+days_1+" days is " +sal);
}}