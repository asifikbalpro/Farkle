import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Dice {
    // the private element's.
//    int[] Dice_value = new int[6];

    int[] Dice_value;
    int[] Dice_point = new int[14];
    int[] Main_dice;
    int Main_score_1;
    int Turn_score;
    int[] newDice_point;
    int[] newDice_value;
//    int[][][] Dice_3;
    int[] alike;
    int[] alike_score;
    int alike_value;
    int[] three_of_kind;
    int[] four_of_kind;
    int true_element;
    int[] num;


    Random random = new Random();
    Scanner ask = new Scanner(System.in);
    int ask_points;
//    Score score = new Score();

//    public int[] Dice_Rolling() {
////
////
////        Dice_value[0] = random.nextInt(6) + 1;
////        Dice_value[1] = random.nextInt(6) + 1;
////        Dice_value[2] = random.nextInt(6) + 1;
////        Dice_value[3] = random.nextInt(6) + 1;
////        Dice_value[4] = random.nextInt(6) + 1;
////        Dice_value[5] = random.nextInt(6) + 1;
////
////        System.out.println("Dice Rolling");
////        for (int i = 0; i < Dice_value.length; i++) {
////            System.out.println(Dice_value[i]);
////        }
////        return Dice_value;
////    }

    public int[] Dice_Rolling_v1(int n) {
        System.out.println("Entering Dice Rolling function");
        Dice_value = new int[n];
        for (int i = 0; i < n; i++){
            Dice_value[i] = random.nextInt(6) + 1;
        }
        System.out.println("Dice Rolling");
        for (int i = 0; i < Dice_value.length; i++) {
            System.out.println(Dice_value[i]);
        }
        Dice_sorting();
        return Dice_value;

    }

    public int[] Dice_sorting() {

        System.out.println("Entering Dice Sorting function");
        System.out.println("Dice Sorting");
        Arrays.sort(Dice_value);
        for (int i = 0; i < Dice_value.length; i++) {
            System.out.println(Dice_value[i]);
        }
        //        Score();
//        score.ask_point();
        score_point_value();
        return Dice_value;
    }
//    public int[] Score(){
//        int ask_value = ask.nextInt();
//        Dice_Score = new int[1];
//        Turn_score = new int[1];
//
//        System.out.println("Entering Score function");
//        Dice_point[0] = 50; //five
//        Dice_point[1] = 100;    //one
//        Dice_point[2] = 300;    //one_one_one
//        Dice_point[3] = 200;    //two_two_two
//        Dice_point[4] = 300;    //three_three_three
//        Dice_point[5] = 400;    ///four_four_four
//        Dice_point[6] = 500;    //five_five_five
//        Dice_point[7] = 600;    //six_six_six
//        Dice_point[8] = 1000;   //four_of_kind
//        Dice_point[9] = 2000;   //five_of_kind
//        Dice_point[10] = 3000;  //six_of_kind
//        Dice_point[11] = 1500;  //one_two_three_four_five_six
//        Dice_point[12] = 1500;  //three_pairs
//        Dice_point[13] = 2500;  //two_tripelets
//
//
//        if (Dice_point[0] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[1] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[2] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[3] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[4] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[5] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[6] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[7] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[8] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[9] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[10] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[11] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[12] == ask_value){
//            Turn_score[0] += ask_value;
//        }else if (Dice_point[13] == ask_value){
//            Turn_score[0] += ask_value;
//        } else{
//            System.out.println("Wrong Number");
//            System.out.println("Try Aging");
//            Score();
//        }
//
//        return Turn_score;
//    }pu
//    public void detected(){
//        System.out.println("Entering detected function");
//
//
//    }

//    public int Score_v1(){
//        int ask_value = ask.nextInt();
//
//        System.out.println("Entering Score function");
//        Dice_point[0] = 50; //five
//        Dice_point[1] = 100;    //one
//        Dice_point[2] = 300;    //one_one_one
//        Dice_point[3] = 200;    //two_two_two
//        Dice_point[4] = 300;    //three_three_three
//        Dice_point[5] = 400;    ///four_four_four
//        Dice_point[6] = 500;    //five_five_five
//        Dice_point[7] = 600;    //six_six_six
//        Dice_point[8] = 1000;   //four_of_kind
//        Dice_point[9] = 2000;   //five_of_kind
//        Dice_point[10] = 3000;  //six_of_kind
//        Dice_point[11] = 1500;  //one_two_three_four_five_six
//        Dice_point[12] = 1500;  //three_pairs
//        Dice_point[13] = 2500;  //two_tripelets
//
//
//
//
//
//
//        for (int i = 0; i < Dice_point.length; i++){
//            if (ask_value == Dice_point[i]){
//                Turn_score += ask_value;
////                detected();
//
//            }
//        }
//
//
//
//        return Turn_score;
//    }


//    public int[] Remove_dice(){
//        System.out.println("Entering Remove Dice function");
//        System.out.println("Your turn score is: "+ Dice_Score[0]);
//
//        System.out.println("Enter the number of dice to set aside:");
//        int Number_of_dice_to_remove = ask.nextInt();
//        for (int i = 0; i < Dice_value.length; i++){
//            if (Number_of_dice_to_remove > Dice_value.length){
//                System.out.println("You don't have that many dise");
//            } else if(Number_of_dice_to_remove < Dice_value.length){
//                new_Dice = new int[Dice_value.length - Number_of_dice_to_remove];
//                System.out.println("you have :"+ new_Dice.length +" Dise.");
//
//            } else if (Number_of_dice_to_remove == Dice_value.length){
//                System.out.println("your have 0 Dise");
//                break;
//            } else {
//                System.out.println("Something wrong..");
//                break;
//            }
//
//
//        }
//        return Dice_value;
//    }

//    public int[] Remove_dice_v1(){
//        System.out.println("Entering Removeing Dice function");
//        System.out.println("You had "+Dice_value.length + "Dice");
//        System.out.println("Your turn score is: "+ Dice_Score[0]);
//        Dice calling_aging = new Dice();
//        System.out.println("Enter the number of dice to set aside:");
//        int Number_of_dice_to_remove = ask.nextInt();
//
//        if (Number_of_dice_to_remove >= Dice_value.length){
//            System.out.println("You don't have that many dise");
//            exit();
//        } else if(Number_of_dice_to_remove < Dice_value.length){
//            Dice_value = new int[Dice_value.length - Number_of_dice_to_remove];
//            System.out.println("you have :"+ Dice_value.length +" Dise.");
//            if (Dice_value.length != 0){
//                Dice_Rolling_v1(Dice_value.length);
//                Dice_sorting();
//                Score();
//                Remove_dice_v1();
//            }
//
//
//        } else if (Number_of_dice_to_remove == Dice_value.length){
//            System.out.println("your have 0 Dise");
//
//        } else {
//            System.out.println("Something wrong..");
//
//        }
//        return Dice_value;
//    }


//    public int[][][] score(){
//        System.out.println("entering score function");
//        Dice_3 = new int[7][7][7];
//
//
//        Dice_3[1][1][1] = 300;
//        Dice_3[2][2][2] = 200;
//        Dice_3[3][3][3] = 300;
//        Dice_3[4][4][4] = 400;
//        Dice_3[5][5][5] = 500;
//        Dice_3[6][6][6] = 600;
//
//
//
//        int ask_me = ask.nextInt();
//        for (int i = 0; i < Dice_value.length; i++){
//            for (int j = 0; j < Dice_value.length;j++){
//                for (int k = 0; k < Dice_value.length;k++){
//                    // check if ask value exist on dice_3
//                    if (Dice_3[i][j][k] == ask_me){
//                        System.out.println("found it");
//                        //check if Rolling dice exist on dice_3
//                        if (Dice_3[i][j][k] == Dice_value[i]){
//                            System.out.println("found it");
//                        }
//                    }
//                }
//            }
//        }
//
//
//
//
//        Dice_point = new int[14];
//
//        Dice_point[0] = 50; //five
//        Dice_point[1] = 100;    //one
//        Dice_point[2] = 300;    //one_one_one
//        Dice_point[3] = 200;    //two_two_two
//        Dice_point[4] = 300;    //three_three_three
//        Dice_point[5] = 400;    ///four_four_four
//        Dice_point[6] = 500;    //five_five_five
//        Dice_point[7] = 600;    //six_six_six
//        Dice_point[8] = 1000;   //four_of_kind
//        Dice_point[9] = 2000;   //five_of_kind
//        Dice_point[10] = 3000;  //six_of_kind
//        Dice_point[11] = 1500;  //one_two_three_four_five_six
//        Dice_point[12] = 1500;  //three_pairs
//        Dice_point[13] = 2500;  //two_tripelets
//        return Dice_3;
//
//    }

//    public int[] score(){
//        int ask_for_value = ask.nextInt();
//        Dice_point = new int[14];
//
//        Dice_point[0] = 50; //five
//        Dice_point[1] = 100;    //one
//        Dice_point[2] = 300;    //one_one_one
//        Dice_point[3] = 200;    //two_two_two
//        Dice_point[4] = 300;    //three_three_three
//        Dice_point[5] = 400;    ///four_four_four
//        Dice_point[6] = 500;    //five_five_five
//        Dice_point[7] = 600;    //six_six_six
//        Dice_point[8] = 1000;   //four_of_kind
//        Dice_point[9] = 2000;   //five_of_kind
//        Dice_point[10] = 3000;  //six_of_kind
//        Dice_point[11] = 1500;  //one_two_three_four_five_six
//        Dice_point[12] = 1500;  //three_pairs
//        Dice_point[13] = 2500;  //two_tripelets
//
//        for (int i = 0; i < Dice_point.length; i++){
//            if (Dice_point[i] == ask_for_value){
//                System.out.println(i+"found it"+Dice_point[i]);
//
//                for (int j = 0; j < Dice_point.length;j++){
////                    System.out.println(Dice_point[i]);
//                    System.out.println(newDice_point[0]);
////                    if (Dice_point)
//                }
//            }
//        }
//
//        return Main_score_1;
//    }

    public int score_point_value(){
        ask_points = ask.nextInt();

        three_of_kind = new int[6];
        three_of_kind[0] = 300;
        three_of_kind[1] = 200;
        three_of_kind[2] = 350;
        three_of_kind[3] = 400;
        three_of_kind[4] = 500;
        three_of_kind[5] = 600;

        for (int i = 0; i < three_of_kind.length; i++){
            if (ask_points == three_of_kind[i]){
                System.out.println("found on "+" "+ask_points+" "+three_of_kind[i]);
                alike_value(i+1);
                break;
            }
        }

        four_of_kind = new int[4];
        four_of_kind[1] = 1000;   //four_of_kind
        four_of_kind[2] = 2000;   //five_of_kind
        four_of_kind[3] = 3000;  //six_of_kind

        for (int i = 0; i < four_of_kind.length; i++){
            if (ask_points == four_of_kind[i]){
                System.out.println("found on "+" "+ask_points+" "+four_of_kind[i]);
                alike_value(i+1);
                break;
            }
        }

        Dice_point = new int[4];
        Dice_point[1] = 50; //five
        Dice_point[2] = 100;    //one
        Dice_point[3] = 1500;  //one_two_three_four_five_six
//        Dice_point[3] = 1500;  //three_pairs
//        Dice_point[4] = 2500;  //two_tripelets
        if (ask_points == Dice_point[0]){
            System.out.println("found on "+" "+ask_points+" "+Dice_point[0]);
            check_score();
        } else if (ask_points == Dice_point[1]){
            System.out.println("found on "+" "+ask_points+" "+Dice_point[1]);
            check_score();
        }

//        newDice_point[0] = ask_points;

        return alike_value;
    }

//    public int[] alike_value(){
//        newDice_value = new int[1];
//        alike = new int[6];
//        alike_score = new int[14];
//
//
//        for (int i = 0;i < Dice_value.length;i++){
//            if (Dice_value[i] == Dice_value[0]){
//                if (Dice_value[i] == Dice_value[1]){
//                    if (Dice_value[i] == Dice_value[2]){
////                        System.out.println(Dice_value[0]+" "+Dice_value[1]+" "+Dice_value[2]);
//                        System.out.println("found 3 of kind");
//                        alike[0] = 3;
//                        if (Dice_value[i] == Dice_value[3]){
//                            System.out.println("Found 4 of kind");
//                            alike[1] = 4;
//                            if (Dice_value[i] == Dice_value[4]){
//                                System.out.println("Found 5 of kind");
//                                alike[2] = 5;
//                                if (Dice_value[i] == Dice_value[5]){
//                                    System.out.println("Found 6 of kind");
//                                    alike[3] = 6;
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                }
//            }else if (Dice_value[i] == Dice_value[1]){
//                if (Dice_value[i] == Dice_value[2]){
//                    if (Dice_value[i] == Dice_value[3]){
//                        System.out.println(Dice_value[1]+" "+Dice_value[2]+" "+Dice_value[3]);
//                        alike[0] = 3;
//                        if (Dice_value[i] == Dice_value[4]){
//                            System.out.println("Found 4 of kind");
//                            alike[1] = 4;
//                            if (Dice_value[i] == Dice_value[5]){
//                                System.out.println("Found 5 of kind");
//                                alike[2] = 5;
//                                break;
//                            }
//                        }
//                    }
//                }
//            }else if (Dice_value[i] == Dice_value[2]){
//                if (Dice_value[i] == Dice_value[3]){
//                    if (Dice_value[i] == Dice_value[4]) {
//                        System.out.println(Dice_value[2] + " " + Dice_value[3] + " " + Dice_value[4]);
//                        alike[0] = 3;
//                        if (Dice_value[i] == Dice_value[5]){
//                            System.out.println("Found 4 of kind");
//                            alike[1] = 4;
//                            break;
//                        }
//                    }
//                }
//            }else if (Dice_value[i] == Dice_value[3]){
//                if (Dice_value[i] == Dice_value[4]){
//                    if (Dice_value[i] == Dice_value[5]){
//                        System.out.println(Dice_value[3]+" "+Dice_value[4]+" "+Dice_value[5]);
//                        alike[0] = 3;
//                        break;
//                    }
//                }
//            }
//        }
////        System.out.println("found it");
//        print();
//        score_point_value();
//        return alike;
//    }

    public int[] alike_value(int n){
        newDice_value = new int[1];
        alike = new int[6];
        alike_score = new int[14];


        for (int i = 0;i < Dice_value.length;i++){
            if (Dice_value[n] < Dice_value[1] && Dice_value[1] < Dice_value[2] && Dice_value[2] < Dice_value[3]
            && Dice_value[3] < Dice_value[4] && Dice_value[4] < Dice_value[5]){
                System.out.println("found serial");
            } else if (Dice_value[n] == Dice_value[0]){
                if (Dice_value[n] == Dice_value[1]){
                    if (Dice_value[n] == Dice_value[2]){
//                        System.out.println(Dice_value[0]+" "+Dice_value[1]+" "+Dice_value[2]);
                        System.out.println("found 3 of kind");
                        alike[0] = 3;
                        alike_value = Dice_value[n];
                        print();
                        System.out.println(alike_value);
                        if (Dice_value[n] == Dice_value[3]){
//                            System.out.println("Found 4 of kind");
                            alike[1] = 4;
                            if (Dice_value[n] == Dice_value[4]){
//                                System.out.println("Found 5 of kind");
                                alike[2] = 5;
                                if (Dice_value[n] == Dice_value[5]){
                                    System.out.println("Found 6 of kind");
                                    alike[3] = 6;
                                    break;
                                }
                            }
                        }
                    }
                }
            } else if (Dice_value[n] == Dice_value[1]){
                if (Dice_value[n] == Dice_value[2]){
                    if (Dice_value[n] == Dice_value[3]){
                        System.out.println("found 3 of kind");
//                        System.out.println(Dice_value[1]+" "+Dice_value[2]+" "+Dice_value[3]);
                        alike[0] = 3;
                        alike_value = Dice_value[n];
                        print();
                        if (Dice_value[n] == Dice_value[4]){
//                            System.out.println("Found 4 of kind");
                            alike[1] = 4;
                            if (Dice_value[n] == Dice_value[5]){
//                                System.out.println("Found 5 of kind");
                                alike[2] = 5;
                                break;
                            }
                        }
                    }
                }
            } else if (Dice_value[n] == Dice_value[2]){
                if (Dice_value[n] == Dice_value[3]){
                    if (Dice_value[n] == Dice_value[4]) {
                        System.out.println("found 3 of kind");
//                        System.out.println(Dice_value[2] + " " + Dice_value[3] + " " + Dice_value[4]);
                        alike[0] = 3;
                        alike_value = Dice_value[n];
                        print();
                        if (Dice_value[n] == Dice_value[5]){
//                            System.out.println("Found 4 of kind");
                            alike[1] = 4;
                            break;
                        }
                    }
                }
            } else if (Dice_value[n] == Dice_value[3]){
                if (Dice_value[n] == Dice_value[4]){
                    if (Dice_value[n] == Dice_value[5]){
                        System.out.println("found 3 of kind");
//                        System.out.println(Dice_value[3]+" "+Dice_value[4]+" "+Dice_value[5]);
                        alike[0] = 3;
                        alike_value = Dice_value[n];
                        print();
                        break;
                    }
                }
            }
        }
//        System.out.println("found it"+ alike_value);

//        alike_value_check();
//        score_point_value();
        return alike;
    }

    public void element_check(){

    }

//    public void alike_value_check(){
//        for (int i = 0; i < Dice_value.length; i++) {
//            if (alike_value == Dice_value[0]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            } else if (alike_value == Dice_value[1]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            } else if (alike_value == Dice_value[2]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            } else if (alike_value == Dice_value[3]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            } else if (alike_value == Dice_value[4]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            } else if (alike_value == Dice_value[5]) {
//                if (Dice_value[i] == 1) {
//                    System.out.println(Dice_value[i]+" dice = 1");
//                } else if (Dice_value[i] == 2) {
//                    System.out.println(Dice_value[i]+" dice = 2");
//                } else if (Dice_value[i] == 3) {
//                    System.out.println(Dice_value[i]+" dice = 3");
//                } else if (Dice_value[i] == 4) {
//                    System.out.println(Dice_value[i]+" dice = 4");
//                } else if (Dice_value[i] == 5) {
//                    System.out.println(Dice_value[i]+" dice = 5");
//                } else if (Dice_value[i] == 6) {
//                    System.out.println(Dice_value[i]+" dice = 6");
//                } else {
//                    break;
//                }
//            }
//        }
//    }


    public int print(){
//        System.out.println(Main_score_1);
        System.out.println(alike[0]);
        System.out.println(alike[1]);
        System.out.println(alike[2]);
        System.out.println(alike[4]);
        System.out.println(alike[5]);

        System.out.println("alike_value "+ alike_value);

        if (alike_value == Dice_value[0]){
            System.out.println("true 1");
            true_element = 1;
            element_check();
        }else if(alike_value == Dice_value[1]){
            System.out.println("true 2");
            true_element = 2;
            element_check();
        }else if(alike_value == Dice_value[2]){
            System.out.println("true 3");
            true_element = 3;
            element_check();
        }else if(alike_value == Dice_value[3]){
            System.out.println("true 4");
            true_element = 4;
            element_check();
        }else if(alike_value == Dice_value[4]){
            System.out.println("true 5");
            true_element = 5;
            element_check();
        }else if(alike_value == Dice_value[5]){
            System.out.println("true 6");
            true_element = 5;
            element_check();
        }
//        check_score();
        return true_element;
    }

    public void check_score(){
        System.out.println("entering check score \n");
        System.out.println("alike value is " + alike_value);
        System.out.println("true element is " + true_element);
//        System.out.println("element dice point 5 for 50 is true"+ Dice_point[0]);
//        System.out.println("element dice point 1 for 100 is true"+ Dice_point[1]);

        if (alike_value == 1){
            score_board(1);
            System.out.println("true 1");
            System.out.println("your score is : 300");
        } else if (alike_value == 2){
            score_board(2);
            System.out.println("true 2");
            System.out.println("your score is : 200");
        } else if (alike_value == 3){
            score_board(3);
            System.out.println("true 3");
            System.out.println("your score is : 350");
        } else if (alike_value == 4){
            score_board(4);
            System.out.println("true 4");
            System.out.println("your score is : 400");
        } else if (alike_value == 5){
            score_board(5);
            System.out.println("true 5");
            System.out.println("your score is : 500");
        } else if (alike_value == 6){
            score_board(6);
            System.out.println("true 6");
            System.out.println("your score is : 600");
        }

    }

    public void score_board(int n){
        System.out.println("finaly here");
        for(int i = 0; i < Dice_value.length; i++){
            System.out.println(Dice_value[i]);
        }
    }


    public int[] Remove_dice_v2(){

        System.out.println("Entering Removeing Dice function");
        System.out.println("You had "+Dice_value.length + "Dice");
        System.out.println("Your turn score is: "+ Turn_score);
        Dice calling_aging = new Dice();
        System.out.println("Enter the number of dice to set aside:");
        int Number_of_dice_to_remove = ask.nextInt();

        if (Number_of_dice_to_remove > Dice_value.length){
            System.out.println("You don't have that many Dice.");
            System.out.println("Try aging:");
            Remove_dice_v2();

        } else if(Number_of_dice_to_remove < Dice_value.length){
            Dice_value = new int[Dice_value.length - Number_of_dice_to_remove];
            System.out.println("you have :"+ Dice_value.length +" Dise.");

            if (Dice_value.length != 0){
                Dice_Rolling_v1(Dice_value.length);
                Dice_sorting();
//                Score_v1();
                Remove_dice_v2();
            }
        } else if (Number_of_dice_to_remove == Dice_value.length){
            System.out.println("your have 0 Dise");
            Turn();


        } else {
            System.out.println("Something wrong..");
        }
        return Dice_value;
    }

    public void Turn(){
        System.out.println("Do you wish to keep rolling (y/n)?");
        int asking = ask.nextInt();
        if (asking == 0){
            Dice_Rolling_v1(6);
            Dice_sorting();
//            Score_v1();
//            score.ask_point();
            Remove_dice_v2();
        }else {
            exit();
        }
    }

    public void Calling(){
        Dice call = new Dice();
        call.Dice_Rolling_v1(6);
//        call.Dice_sorting();
//        call.score();
//        call.Score_v1();
//        call.Remove_dice_v2();

    }
}




