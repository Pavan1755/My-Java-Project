import java.util.Scanner;


class Guesser{
    int Guessernum;

    public int takeNumberGesser()
    {   System.out.println("GUESSER GUESS A NUMBER");
        Scanner Scan = new Scanner(System.in);
        Guessernum = Scan.nextInt();

        return Guessernum;
    }
}

class Player{
    int playernum;
    public int takeNumberPlayer()
    {
        System.out.println("Player guess Any Number");
        Scanner Scan = new Scanner(System.in);
        playernum = Scan.nextInt();

        return playernum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void CollectFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser=g.takeNumberGesser();
    }

    void CollectFromPlayer()
    {
        Player P1 = new Player();
        numFromPlayer1=P1.takeNumberPlayer();

        Player P2 = new Player();
        numFromPlayer2=P2.takeNumberPlayer();

        Player P3 = new Player();
        numFromPlayer3=P3.takeNumberPlayer();
    }

    void compare(){
        if(numFromPlayer1==numFromGuesser){
            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser)
            {
                System.out.println("ALL Plyers Won the Game");
            }
            else if(numFromPlayer2==numFromGuesser){
                System.out.println("Only Player1 and Player2 Won the Game");
            }
            else if(numFromPlayer3==numFromGuesser){
                System.out.println("Only Player1 and Player3 Won the Game");
            }
            else
            {
                System.out.println("Only Player1 Won The Game");
            }

        }
        else if(numFromPlayer2==numFromGuesser)
        {
            if(numFromPlayer3==numFromGuesser)
            {
                System.out.println("Only Player2 and player3 Won The Game");
            }
            else
            {
                System.out.println("Only Player2 Won The Game");
            }
        }
        else if(numFromPlayer3==numFromGuesser)
        {
            System.out.println("Only Player3 Won The Game");
        }
        else
        {
            System.out.println("No Player won The Game");
        }
    }
}

public class GuesserGame 
{
    public static void main(String[] args)
    {
        Umpire U = new Umpire();
        U.CollectFromGuesser();
        U.CollectFromPlayer();
        U.compare();

    }
    
}