class A{
private void fnctn() {
System.out.println("private");}
private int a;
}
class B extends A{
B()
{
System.out.println("Hello");
}
}
public class Access {
public static void main(String[] args)
{ B obj=new B();
obj.fnctn();
obj.a=10;
}
}