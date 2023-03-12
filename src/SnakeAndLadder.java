
import java.util.Random;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int goal = 100;
        int dice_count=0;
        int playerPosition = 0;
        System.out.println("Player Position:" + playerPosition);
        System.out.println("Press S to start the Snake and Ladder Game:");
        char p = sc.next().charAt(0);
        switch (p) {
            case 's':
                while (playerPosition!=goal) {
                    int option = rand.nextInt(3) + 1;
                    int dice_roll = rand.nextInt(6) + 1;
                    System.out.println("Number on Dice:"+dice_roll);
                    dice_count++;
                    if(option==1){
                        playerPosition=playerPosition+0;
                        System.out.println("No Play");
                        System.out.println("Player Position:" + playerPosition);
                    }
                    else if(option==2){
                    playerPosition = playerPosition + dice_roll;
                    System.out.println("Congrats you found a Ladder");
                    System.out.println("Player Position:" + playerPosition);
                    }
                    else{
                        playerPosition = playerPosition - dice_roll;
                        if(playerPosition<1){
                            playerPosition=0;
                        }
                        System.out.println("sorry Snake bite");
                        System.out.println("Player Position:" + playerPosition);
                        }
                    if(playerPosition>=100){
                        playerPosition = playerPosition - dice_roll;
                        while (playerPosition!=100) {
                            int dice_roll1 = rand.nextInt(6) + 1;
                            playerPosition=playerPosition+dice_roll1;
                            if(playerPosition==100){
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
        System.out.println("Player completed the game");
        System.out.println("Number of times Dice rolled: "+dice_count);

        }
    }

