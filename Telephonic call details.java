import java.util.Scanner;
public class Telephone {
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Select the type of call:");
System.out.println("O for Ordinary");
System.out.println("U for Urgent");
System.out.println("L for Lightning");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
switch(ch)
{
case 'O':Ordinary obj=new Ordinary();
obj.ordinary();
break;
case 'U':Urgent obj_1=new Urgent();
obj_1.urgent();
break;
case 'L':Lightning obj_2=new Lightning();
obj_2.lightning();
break;
}
}
}
class Duration
{int input(){
System.out.println("Enter the duration of the call (in minutes) ");
Scanner sc= new Scanner(System.in);
int duration;
duration=sc.nextInt();
return duration;
}
}
class Ordinary extends Duration{
void ordinary() {
System.out.println("Enter the rate (per minute) of the ordianry call is (in rupees):");
Scanner sc= new Scanner(System.in);
float rate=sc.nextFloat();
int duration=input();
float result;
result=rate*duration;
System.out.println("The total cost of the ordinary call for "+duration+ " minutes is "+ result);
}
}
class Urgent extends Duration{
void urgent() {
System.out.println("Enter the rate (per minute) of the urgent call is (in rupees):");
Scanner sc= new Scanner(System.in);
float rate=sc.nextFloat();
int duration=input();
float result;
result=rate*duration;
System.out.println("The total cost of the urgent call for "+duration+ " minutes is "+ result);
}}
class Lightning extends Duration{
void lightning() {
System.out.println("Enter the rate (per minute) of the lightning call is (in rupees):");
Scanner sc= new Scanner(System.in);
float rate=sc.nextFloat();
int duration=input();
float result;
result=rate*duration;
System.out.println("The total cost of the lightning call for "+duration+ " minutes is "+ result);
}
}