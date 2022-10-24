import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rockPaperScissors{
    public static void main(String[] args) throws InterruptedException {
        //AI Set Random Number
        int AI1 = (int) (Math.random() * 3);
        //
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Select: [1] Rock / [2] Paper / [3] Scissors");
        int selection = sc1.nextInt();

        switch (selection) {
            case 1:
                System.out.println("You've selected Rock: ");
                break;
            case 2:
                System.out.println("You've selected Paper: ");
                break;
            case 3:
                System.out.println("You've selected Scissors: ");
                break;
            default:
                System.out.println("Please Select again, [1] Rock / [2] Paper / [3] Scissors:");
                //למצוא דרך לקרוא לאותו הפקודה שוב בלופ
        }
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        switch (AI1) {
            case 0:
                System.out.println("Computer Selected Rock!");
                System.out.println();
                if (selection == 1){
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("We chose the same one! lets play again:");
                } else {
                    if (selection == 2){
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("YOU WIN!");
                    } else {
                        if (selection == 3){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("YOU LOST, COMPUTER WON!");
                        }
                    }
                }
                break;
            case 1:
                System.out.println("Computer selected paper!");
                System.out.println();
                if (selection == 1){
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("YOU LOST, COMPUTER WON!");
                } else {
                    if (selection == 2){
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("We chose the same one! lets play again:");
                    } else {
                        if (selection == 3){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("YOU WIN!");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Computer selected Scissors!");
                System.out.println();
                if (selection == 1){
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("YOU WIN!");
                } else {
                    if (selection == 2){
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("YOU LOST, COMPUTER WON!");
                    } else {
                        if (selection == 3){
                            TimeUnit.SECONDS.sleep(1);
                            System.out.println("We chose the same one! lets play again:");
                        }
                    }
                }
                break;
        }
        //System.out.println("Play again?: [Y] Yes / [N] NO");
        //String action = sc1.next();
        //if (action == "y"){
        //    System.out.println("Lets go!");
       // } else {
        //    System.out.println("Thanks for playing!");
       // }
    }
}