import java.util.Scanner;
public class NewClass{
public static void main(String[] args)
{System.out.println("Enter the name of a cricket player");
Cricket_Player cric=new Cricket_Player();
cric.play();
cric.cricket();
System.out.println("Enter the name of a football player");
Football_Player foot=new Football_Player();
foot.play();
foot.goals();
System.out.println("Enter the name of a hockey player");
Hockey_Player hock=new Hockey_Player();
hock.play();
hock.hockey();
}
}
class Player{
void play()
{
Scanner sc= new Scanner(System.in);
String str =sc.nextLine();
}
}
class Cricket_Player extends Player {
void cricket(){
System.out.println("He is the captain of the Indian cricket team");
}}
class Football_Player extends Player{
void goals()
{System.out.println("Goals scored by Robert Lewandowski in Champions league is 15");
}
}
class Hockey_Player extends Player
{ void hockey()
{System.out.println("Dhyanchand was a legendry player of hockey");
}
}