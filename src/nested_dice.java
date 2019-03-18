import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nested_dice {
    public void Dise(){
        int[] Dice_Score = new int[1];
        int[] Turn_score = new int[1];
        int[] new_Dice;
        Random random = new Random();

        int[] Dice_point = new int[14];
        Dice_point[0] = 50; //five
        Dice_point[1] = 100;    //one
        Dice_point[2] = 300;    //one_one_one
        Dice_point[3] = 200;    //two_two_two
        Dice_point[4] = 300;    //three_three_three
        Dice_point[5] = 400;    ///four_four_four
        Dice_point[6] = 500;    //five_five_five
        Dice_point[7] = 600;    //six_six_six
        Dice_point[8] = 1000;   //four_of_kind
        Dice_point[9] = 2000;   //five_of_kind
        Dice_point[10] = 3000;  //six_of_kind
        Dice_point[11] = 1500;  //one_two_three_four_five_six
        Dice_point[12] = 1500;  //three_pairs
        Dice_point[13] = 2500;  //two_tripelets


        int[] Dice_value = new int[6];
        Dice_value[0] = random.nextInt(6)+1;
        Dice_value[1] = random.nextInt(6)+1;
        Dice_value[2] = random.nextInt(6)+1;
        Dice_value[3] = random.nextInt(6)+1;
        Dice_value[4] = random.nextInt(6)+1;
        Dice_value[5] = random.nextInt(6)+1;


        System.out.println("Rolling Dice");
        for (int i = 0; i < Dice_value.length; i++){
            System.out.println(Dice_value[i]);
        }

        System.out.println("Sorting Dise");
        Arrays.sort(Dice_value);
        for (int i = 0; i < Dice_value.length; i++){
            System.out.println(Dice_value[i]);
        }

        //this is the condition.started form here.
        //this will ask for the score.
        Scanner ask = new Scanner(System.in);
        int ask_point = ask.nextInt();
//        System.out.println(ask_point);


        for (int j = 0; j < Dice_point.length; j++) {
            if (ask_point == Dice_point[j]) {
                System.out.println("found it.");
                Dice_point[0] = ask_point;
            } else if(ask_point == 0){
                System.out.println("Farkle !!!");
                break;
            } else {
                break;
            }

            Dice_Score[0] = ask_point;
            System.out.println("Your turn score is: "+ ask_point);


            System.out.println("Enter the number of dice to set aside:");
            int number_of_dise = ask.nextInt();
            for (int k = 0; k < Dice_value.length; k++){
                if (number_of_dise > Dice_value.length){
                    System.out.println("You don't have that many dise");
                } else if(number_of_dise < Dice_value.length){
                    new_Dice = new int[Dice_value.length - number_of_dise];
                    System.out.println("you have :"+ new_Dice.length +" Dise.");
                    break;
                } else if (number_of_dise == Dice_value.length){
                    System.out.println("your have 0 Dise");
                } else {
                    System.out.println("Something wrong..");
                }
            }

        }
    }
}
