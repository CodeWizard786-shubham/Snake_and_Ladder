
import java.util.Random;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int goal = 100;
        int playerPosition = 0;
        System.out.println("Player Position:" + playerPosition);
        System.out.println("Press S to start the Snake and Ladder Game:");
        char p = sc.next().charAt(0);
        switch (p) {
            case 's':
                while (playerPosition!=goal) {
                    int option = rand.nextInt(3) + 1;
                    int dice_roll = rand.nextInt(6) + 1;
                    if(option==1){
                        playerPosition=playerPosition+0;
                        System.out.println("Player Position:" + playerPosition);
                    }
                    else if(option==2){
                    playerPosition = playerPosition + dice_roll;
                    System.out.println("Player Position:" + playerPosition);
                }
                    else{
                        playerPosition = playerPosition - dice_roll;
                        if(playerPosition<1){
                            playerPosition=1;
                        }
                        System.out.println("Player Position:" + playerPosition);
                        }
                    if(playerPosition==100){
                        break;

                    }
                    }
                break;
            default:
                System.out.println("Entered Wrong character");
        }
        System.out.println("Player completed the game");

        }
    }

