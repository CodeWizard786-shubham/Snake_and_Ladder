
import java.util.Random;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int goal = 100;
        int dice_count=0;
        int playerPosition1=0;
        int playerPosition2=0;
        System.out.println("Player1 Position:" + playerPosition1);
        System.out.println("Player2 Position:" + playerPosition2);
        System.out.println("Press S to start the Snake and Ladder Game:");
        char p = sc.next().charAt(0);
        switch (p) {
            case 's':
                while (playerPosition1!=goal || playerPosition2!=goal) {
                    int option1 = rand.nextInt(3) + 1;
                    int option2 = rand.nextInt(3) + 1;
                    int dice_roll1 = rand.nextInt(6) + 1;
                    int dice_roll2 = rand.nextInt(6) + 1;
                    System.out.println("Number on Dice Player1:"+dice_roll1);
                    dice_count++;
                    if(option1==1 || option2==1){
                        playerPosition1=playerPosition1+0;
                        playerPosition2=playerPosition2+0;
                        System.out.println("No Play");
                        System.out.println("Player1 Position:" + playerPosition1);
                        System.out.println("Player2 Position:" + playerPosition2);
                    }
                    else if(option1==2 || option2==2){
                    playerPosition1 = playerPosition1 + dice_roll1;
                    playerPosition2 = playerPosition2 + dice_roll2;
                    System.out.println("Congrats you found a Ladder");
                    System.out.println("Player1 Position:" + playerPosition1);
                    System.out.println("Player2 Position2:" + playerPosition2);
                    }
                    else{
                        playerPosition1 = playerPosition1 - dice_roll1;
                        playerPosition2 = playerPosition2 - dice_roll2;
                        if(playerPosition1<1 || playerPosition2<1){
                            playerPosition1=0;
                            playerPosition2=0;
                        }
                        System.out.println("sorry Snake bite");
                        System.out.println("Player1 Position:" + playerPosition1);
                        System.out.println("Player2 Position:" + playerPosition2);
                        }
                    if(playerPosition1>=goal || playerPosition2>=goal){
                        playerPosition1 = playerPosition1 - dice_roll1;
                        playerPosition2 = playerPosition2 - dice_roll2;
                        while (playerPosition1!=100 || playerPosition2!=100) {
                            int dice_roll3 = rand.nextInt(6) + 1;
                            playerPosition1=playerPosition1+dice_roll3;
                            playerPosition2=playerPosition2+dice_roll3;
                            if(playerPosition1==goal || playerPosition2==goal){
                                break;
                            }
                        }
                        break;

                    }
                    }
                break;
            default:
                System.out.println("Entered Wrong character");
        }
        if(playerPosition1==100){
            System.out.println("Player 1 won the game");
        }
        else if(playerPosition2==100){
            System.out.println("Player 2 won");
        }
        System.out.println("Number of times Dice rolled: "+dice_count);

        }
    }

