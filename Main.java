import java.util.Random;
import java.util.Scanner;
public class Main{
     public static void main(String[] args){
        System.out.println("Who are you?");
        Scanner sc1 = new Scanner(System.in);
        String line1 = sc1.nextLine();
        System.out.println("Hello,"+line1+"!");
        
        Random random = new Random();
        int ran = random.nextInt(2);
        int heads=0,tail=0;
        System.out.println("Tossing a coin...");
        for(int i=1;i<=3;i++)
        {
            if(ran==0){
                System.out.println("Round "+i+": Heads");
                heads++;
            }
            else {
                System.out.println("Round "+i+": tail");
                tail++;
            }
            ran = random.nextInt(2);
        }
        System.out.println("Heads:"+heads+"Tails"+tail); 
        if(heads>tail){
            System.out.println("You won");
        }
        else {
            System.out.println("You lose");
        }
        }
    }
