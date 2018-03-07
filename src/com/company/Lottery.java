package com.company;

import java.util.Scanner;

public class Lottery {
    private static Scanner scanner = new Scanner(System.in);
    public void lottery(){
       boolean  quit = false;

       while (!quit){
        final int answer = (int)(Math.random() * 400);
        System.out.println("Enter your guess(From 0 to 400)");
        int guess1 = scanner.nextInt();
        if (guess1 == answer){
            System.out.println("You won the lottery! You get $ 40,000,000!!!");
            break;

        }else{
            if (guess1 > answer)
                tooBig();
            else if (guess1 < answer)
                tooSmall();

            if (guess1 > answer)
                tooBig();
            else if (guess1 < answer)
                tooSmall();
            System.out.println("Renter your guess(From 0 to 400)");
            int guess2 = scanner.nextInt();
            if (guess2 == answer){
                System.out.println("You got second in the lottery! You get $ 10,000,000!");
                break;

            }else {
                if (guess2 > answer)
                    tooBig();
                else if (guess2 < answer)
                    tooSmall();

                if (guess2 > answer)
                    tooBig();
                else if (guess1 < answer)
                    tooSmall();
                System.out.println("Renter your guess(From 0 to 400)");
                int guess3 = scanner.nextInt();
                if (guess3 == answer) {
                    System.out.println("You got third in the lottery! You get $ 5,000,000!");
                    break;

                } else {
                    if (guess3 > answer)
                        tooBig();
                    else if (guess3 < answer)
                        tooSmall();

                    if (guess3 > answer)
                        tooBig();
                    else if (guess3 < answer)
                        tooSmall();

                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess4 = scanner.nextInt();
                if (guess4 == answer) {
                    System.out.println("You got fourth in the lottery! You get $ 1,000,000!");
                    break;

                } else {
                    if (guess4 > answer)
                        tooBig();
                    else if (guess4 < answer)
                        tooSmall();

                    if (guess4 > answer)
                        tooBig();
                    else if (guess1 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess5 = scanner.nextInt();
                if (guess5 == answer) {
                    System.out.println("You got fifth in the lottery! You get $ 500,000!");
                    break;

                } else {
                    if (guess5 > answer)
                        tooBig();
                    else if (guess5 < answer)
                        tooSmall();

                    if (guess5 > answer)
                        tooBig();
                    else if (guess1 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess6 = scanner.nextInt();
                if (guess6 == answer) {
                    System.out.println("You got sixth in the lottery! You get $ 100,000!");
                    break;

                } else {
                    if (guess6 > answer)
                        tooBig();
                    else if (guess6 < answer)
                        tooSmall();

                    if (guess6 > answer)
                        tooBig();
                    else if (guess1 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess7 = scanner.nextInt();
                if (guess7 == answer) {
                    System.out.println("You got seventh in the lottery! You get $ 50,000!");
                    break;

                } else {
                    if (guess7 > answer)
                        tooBig();
                    else if (guess7 < answer)
                        tooSmall();

                    if (guess7 > answer)
                        tooBig();
                    else if (guess7 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess8 = scanner.nextInt();
                if (guess8 == answer) {
                    System.out.println("You got eighth in the lottery! You get $ 25,000!");
                    break;

                } else {
                    if (guess8 > answer)
                        tooBig();
                    else if (guess8 < answer)
                        tooSmall();

                    if (guess8 > answer)
                        tooBig();
                    else if (guess8 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess9 = scanner.nextInt();
                if (guess9 == answer) {
                    System.out.println("You got ninth in the lottery! You get $ 10,000!");
                    break;

                } else {
                    if (guess9 > answer)
                        tooBig();
                    else if (guess9 < answer)
                        tooSmall();

                    if (guess9 > answer)
                        tooBig();
                    else if (guess9 < answer)
                        tooSmall();
                }
                System.out.println("Renter your guess(From 0 to 400)");
                int guess10 = scanner.nextInt();
                if (guess10 == answer) {
                    System.out.println("You got tenth in the lottery! You get $ 5,000!");
                    break;

                } else {
                    if (guess10 > answer)
                        tooBig();
                    else if (guess10 < answer)
                        tooSmall();

                    if (guess10 > answer) {
                        tooBig();
                        System.out.println("Sorry.No matches.Come back later.The answer was actually " + answer);
                    } else if (guess10 < answer) {
                        tooSmall();
                        System.out.println("Sorry.No matches.Come back later.The answer was actually " + answer);
                    }

                }

            }



            }
        }

    }

    public void tooBig(){
        System.out.println("The number you entered was too big.Please try again.");

    }

    public void tooSmall(){

        System.out.println("The number you entered was too small.Please try again.");
    }






}
