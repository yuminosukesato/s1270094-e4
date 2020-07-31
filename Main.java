import java.util.Random;
public class Main{
     public static void main(String[] args){
        
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
