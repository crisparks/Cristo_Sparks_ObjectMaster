package src;



public class HumanTest extends Human
{
   public static void main (String[] args){
        Human human = new Human();
        Human human2 = new Human();
        human.attack(human2);
        human2.returnHealth();
    }
}
