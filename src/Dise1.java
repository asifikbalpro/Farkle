import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dise1 {
    int[] Dice_value = new int[6];
    int[] Dice_point = new int[14];
    int[] Dice_Score = new int[1];
    int[] Turn_score = new int[1];
    int[] new_Dice;
    Random random = new Random();


    Scanner ask = new Scanner(System.in);

    public void Dice_Value(){

        Dice_value[0] = random.nextInt(6)+1;
        Dice_value[1] = random.nextInt(6)+1;
        Dice_value[2] = random.nextInt(6)+1;
        Dice_value[3] = random.nextInt(6)+1;
        Dice_value[4] = random.nextInt(6)+1;
        Dice_value[5] = random.nextInt(6)+1;
    }
    public void Dise_Point(){



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


        ask.nextInt();

    }


}
