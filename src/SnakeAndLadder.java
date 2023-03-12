
import java.util.Random;
import java.util.Scanner;
public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int goal = 100;
        int playerPosition = 0;
        int[] board = new int[101];
        int[] snakes = {17, 54, 62, 64, 87, 93, 95, 98};
        int[] ladders = {4, 9, 20, 28, 40, 51, 63, 71};
        System.out.println("Player Position:" + playerPosition);
        System.out.println("Press S to Roll the dice:");
        char p = sc.next().charAt(0);
        switch (p) {
            case 's':
                while (playerPosition!=goal) {
                    int dice_roll = rand.nextInt(6) + 1;
                    playerPosition = playerPosition + dice_roll;
                    System.out.println("Player Position:" + playerPosition);
                }
                break;
            default:
                System.out.println("Entered Wrong character");
        }
        if(playerPosition==100){
            System.out.println("Player won");

        }
        }
    }

