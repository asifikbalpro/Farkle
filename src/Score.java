import java.util.Scanner;

public class Score {
    int[] main_score;
    int turn_score;
    int[] Dice_point;
    int[] newDice;
    Dice dice = new Dice(); // this line is not going to work.



    public int ask_point(){
        Scanner ask = new Scanner(System.in);
        int point = ask.nextInt();
//        return ask_point();
        turn_score = point;
        check();
        return turn_score;
    }

    public void check(){
        System.out.println("ask_point is: "+turn_score);
        for (int i = 0; i < Dice_point.length; i++){
            if (turn_score == Dice_point[i]){
                System.out.println(i +" " + "found");
                dice_value_chack(Dice_point.length);
            }else {
                System.out.println(i +" " + "not found");
            }
        }
        dice_value_chack(dice.Dice_value.length);
    }

    public int[] dice_value_chack(int n){

        newDice = new int[n];
        for (int i = 0; i < dice.Dice_value.length; i++){
            newDice[i] = dice.Dice_value[i];
            System.out.println(newDice[i]);
        }
        return newDice;
    }


    public int[] points(){


        return Dice_point;
    }




}
