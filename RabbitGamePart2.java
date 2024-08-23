package Project2;

import java.util.Scanner;

public class RabbitGamePart2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter S value");
        int s = scn.nextInt();
        //GAME CHART
        for (int i = 1; i <= s; i++) {

            for (int j = s; j > i; j--) {
                System.out.print("     ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("[" + i + "," + j + "]");
            }

            System.out.println("");

        }
        System.out.println("");

        //LOCATIONS   
        int[] player1 = new int[7];
        int[] player2 = new int[7];
        int playerS1 = (int) (Math.random() * s + 1);
        int playerJ1 = (int) (Math.random() * (2 * playerS1 - 1) + 1);
        int carrotCounter1 = 0;
        int gamePoints1 = 0;
        int playerS2 = (int) (Math.random() * s + 1);
        int playerJ2 = (int) (Math.random() * (2 * playerS2 - 1) + 1);
        int carrotCounter2 = 0;
        int gamePoints2 = 0;
        int visitedRabbit1 = 0;
        int visitedRat1 = 0;
        int visitedCarrot1 = 0;
        int visitedRabbit2 = 0;
        int visitedRat2 = 0;
        int visitedCarrot2 = 0;

        int rabbit1s = (int) ((Math.random() * (s - 1)) + 1);
        int rabbit1j = (int) ((Math.random() * (2 * rabbit1s - 1)) + 1);
        int rabbit2s = (int) ((Math.random() * (s - 1)) + 1);
        int rabbit2j = (int) (Math.random() * (2 * rabbit2s - 1) + 1);
        int rabbit3s = (int) ((Math.random() * (s - 1)) + 1);
        int rabbit3j = (int) ((Math.random() * (2 * rabbit3s - 1)) + 1);
        int rat1s = (int) ((Math.random() * (s - 1)) + 1);
        int rat1j = (int) ((Math.random() * (2 * rat1s - 1)) + 1);
        int heavenS = (int) (Math.random() * (s - 1) + 1);
        int heavenJ = (int) (Math.random() * (2 * heavenS - 1) + 1);
        int rat2s = (int) ((Math.random() * (s - 1)) + 1);
        int rat2j = (int) ((Math.random() * (2 * rat2s - 1)) + 1);
        int hellS = (int) (Math.random() * (s - 1) + 1);
        int hellJ = (int) (Math.random() * (2 * hellS - 1) + 1);
        while (hellS == heavenS && hellJ == heavenJ
                || hellS % 2 == 0 && hellJ % 2 == 0 || heavenS % 2 == 0 && heavenJ % 2 == 0
                || playerS1 == hellS && player1[1] == hellJ
                || playerS1 == heavenS && player1[1] == heavenJ || rat1s == rat2s && rat1j == rat2j
                || rat1s % 2 == 0 && rat1j % 2 == 0 || rat2s % 2 == 0 && rat2j % 2 == 0 || rabbit1s == rabbit2s && rabbit1j == rabbit2j
                || rabbit1s == rabbit3s && rabbit1j == rabbit3j
                || rabbit2s == rabbit3s && rabbit2j == rabbit3j
                || rabbit1s % 2 == 0 && rabbit1j % 2 == 0 || rabbit2s % 2 == 0 && rabbit2j % 2 == 0
                || rabbit3s % 2 == 0 && rabbit3j % 2 == 0 || rat1s == playerS1 && rat1j == playerJ1 || rat2s == playerJ1 && rat2j == playerJ1
                || (rabbit1s == playerS1) && rabbit1j == playerJ1 || rabbit2s == playerS1 && rabbit2j == playerS1 || rabbit3s == playerS1 && rabbit3j == playerJ1
                || rabbit1s == hellS && rabbit1j == hellJ || rabbit2s == hellS && rabbit2j == hellJ
                || rabbit3s == hellS && rabbit3j == hellJ || rabbit1s == heavenS && rabbit1j == heavenJ
                || rabbit2s == heavenS && rabbit2j == heavenJ || rabbit3s == heavenS && rabbit3j == heavenJ
                || rat1s == hellS && rat1j == hellJ || rat2s == hellS && rat2j == hellJ
                || rat1s == heavenS && rat1j == heavenJ || rat2s == heavenS && rat2j == heavenJ
                || rat1s == rabbit1s && rat1j == rabbit1j || rat1s == rabbit2s && rat1j == rabbit2j
                || rat1s == rabbit3s && rat1j == rabbit3j || rat2s == rabbit1s && rat2j == rabbit1j
                || rat2s == rabbit2s && rat2j == rabbit2j || rat2s == rabbit3s && rat2j == rabbit3j || playerS2 == hellS && playerJ2 == hellJ
                || playerS2 == heavenS && playerJ2 == heavenJ || rat1s == playerS2 && rat1j == playerJ2 || rat2s == playerS2 && rat2j == playerJ2
                || rabbit1s == playerS2 && rabbit1j == playerJ2 || rabbit2s == playerS2 && rabbit2j == playerJ2 || rabbit3s == playerS2 && rabbit3j == playerJ2) {
            rabbit1s = (int) ((Math.random() * (s - 1)) + 1);
            rabbit1j = (int) ((Math.random() * (2 * rabbit1s - 1)) + 1);
            rabbit2s = (int) ((Math.random() * (s - 1)) + 1);
            rabbit2j = (int) (Math.random() * (2 * rabbit2s - 1) + 1);
            rabbit3s = (int) ((Math.random() * (s - 1)) + 1);
            rabbit3j = (int) ((Math.random() * (2 * rabbit3s - 1)) + 1);
            rat1s = (int) ((Math.random() * (s - 1)) + 1);
            rat1j = (int) ((Math.random() * (2 * rat1s - 1)) + 1);
            heavenS = (int) (Math.random() * (s - 1) + 1);
            heavenJ = (int) (Math.random() * (2 * heavenS - 1) + 1);
            rat2s = (int) ((Math.random() * (s - 1)) + 1);
            rat2j = (int) ((Math.random() * (2 * rat2s - 1)) + 1);
            hellS = (int) (Math.random() * (s - 1) + 1);
            hellJ = (int) (Math.random() * (2 * hellS - 1) + 1);
            playerS1 = (int) (Math.random() * s + 1);
            playerJ1 = (int) (Math.random() * (2 * playerS1 - 1) + 1);
            playerS2 = (int) (Math.random() * s + 1);
            playerJ2 = (int) (Math.random() * (2 * playerS2 - 1) + 1);
        }
        //Player1
        player1[0] = playerS1;
        player1[1] = playerJ1;
        player1[2] = carrotCounter1;
        player1[3] = gamePoints1;
        player1[4] = visitedRabbit1;
        player1[5] = visitedRat1;
        player1[6] = visitedCarrot1;
        //Player2
        player2[0] = playerS2;
        player2[1] = playerJ2;
        player2[2] = carrotCounter2;
        player2[3] = gamePoints2;
        player1[4] = visitedRabbit2;
        player1[5] = visitedRat2;
        player1[6] = visitedCarrot2;
        System.out.println("Player 1 [" + player1[0] + "," + player1[1] + "]");
        System.out.println("");
        System.out.println("Player 2 [" + player2[0] + "," + player2[1] + "]");

        while ((player1[0] != heavenS || player1[1] != heavenJ) && (player1[0] != hellS || player1[1] != hellJ) && (player2[0] != heavenS || player2[1] != heavenJ) && (player2[0] != hellS || player2[1] != hellJ)) {
            System.out.println("");
            System.out.println("Player 1's location [" + player1[0] + "," + player1[1] + "] :[8]Up [2]Down [4]Left [6]Right [5]Display Gates Location");
            int move = scn.nextInt();
            //PLAYER 1 MOVE
            switch (move) {
                case 5:
                    System.out.println(displayGate(hellJ, hellS, heavenJ, heavenS));
                    break;
                case 8:
                    if (canMove(player1[0], player1[1], s, move) == false) {

                        break;
                    } else {
                        player1[0] = player1[0] - 1;
                        player1[1] = player1[1] - 1;
                        System.out.println("Player1's current location" + "[" + player1[0] + "," + player1[1] + "] and you have " + player1[2] + " carrots!");
                        break;
                    }
                case 2:
                    if (canMove(player1[0], player1[1], s, move) == false) {

                        break;
                    } else {
                        player1[0] = player1[0] + 1;
                        player1[1] = player1[1] + 1;
                        System.out.println("Player1's current location" + "[" + player1[0] + "," + player1[1] + "] and you have " + player1[2] + " carrots!");
                        break;
                    }
                case 6:
                    if (canMove(player1[0], player1[1], s, move) == false) {

                        break;
                    } else {
                        player1[1] = player1[1] + 1;
                        System.out.println("Player1's current location" + "[" + player1[0] + "," + player1[1] + "] and you have " + player1[2] + " carrots!");
                        break;
                    }
                case 4:
                    if (canMove(player1[0], player1[1], s, move) == false) {

                        break;
                    } else {
                        player1[1] = player1[1] - 1;
                        System.out.println("Player1'S current location" + "[" + player1[0] + "," + player1[1] + "] and you have " + player1[2] + " carrots!");
                        break;
                    }
            }//PLAYER1 CARROT
            if (isThereACarrot(player1[0], player1[1]) == true) {
                if (generateAQuestion() == true) {
                    player1[2]++;
                    player1[6]++;
                }
                System.out.println("You have " + player1[2] + " carrots.");
            }
            //PLAYER1 RABBIT
            if (isThereARabbit(rabbit1s, rabbit1j, rabbit2s, rabbit2j, rabbit3s, rabbit3j, player1[0], player1[1]) == true) {
                System.out.println("You step on a rabit you should feed it!");
                int rabbitEat = (int) (Math.random() * 2 + 1);
                if (player1[2] >= rabbitEat) {
                    player1[2] -= rabbitEat;
                    player1[3]++;
                    player1[4]++;
                    System.out.println("You feed it,you earn a game point and now you have " + player1[2] + " carrots and " + player1[3] + " game points.");
                } else {
                    player1[3]--;
                    System.out.println("You dont have enough carrots to feed the rabit.You have " + player1[2] + " carrots " + player1[3] + " game points.");

                }
            }
            //TELEPORT METHOD 1 
            if (player1[2] % 5 == 0 && player1[2] != 0) {
                if (TeleportToHeaven(player1[1], player1[2], heavenS, heavenJ, player1[2]) == true) {
                    player1[0] = heavenS;
                    player1[1] = heavenJ;
                }

            }
            //RAT PLAYER1
            if (isThereARat(rat1s, rat1j, rat2s, rat2j, player1[0], player1[1]) == true) {
                int ratEat = (int) (Math.random() * 2 + 1);
                if (ratEat < player1[2]) {
                    player1[2] -= ratEat;
                    System.out.println("You stepped on a rat.You are going to lose " + player1[2] + " carrots.");
                } else if (player1[2] < ratEat) {
                    player1[2] = 0;
                    System.out.println("You stepped on a rat.You are going to lose " + player1[2] + " carrots.");
                }
                player1[5]++;
            }
            //SWAP LOCATIONS METHOD
            if (player1[2] % 6 == 0 && player1[2] !=0) {
                if (swapLocs(player1[0], player1[1], player2[0], player2[1]) == true) {
                    int temp1 = 0;
                    int temp2 = 0;
                    temp1 = player1[0];
                    temp2 = player1[1];
                    player1[0] = player2[0];
                    player1[1] = player2[1];
                    player2[0] = temp1;
                    player2[1] = temp2;
                    
                }

            }
            System.out.println("Player 2's location [" + player2[0] + "," + player2[1] + "] :[8]Up [2]Down [4]Left [6]Right [5]Display Gates Location");
            int move2 = scn.nextInt();
            //PLAYER2 MOVE           
            switch (move2) {
                case 5:
                    System.out.println(displayGate(hellJ, hellS, heavenJ, heavenS));
                    break;
                case 8:
                    if (canMove(player2[0], player2[1], s, move2) == false) {

                        break;
                    } else {
                        player2[0] = player2[0] - 1;
                        player2[1] = player2[1] - 1;
                        System.out.println("Player2's current location" + "[" + player2[0] + "," + player2[1] + "] and you have " + player2[2] + " carrots!");
                        break;
                    }
                case 2:
                    if (canMove(player2[0], player2[1], s, move2) == false) {

                        break;
                    } else {
                        player2[0] = player2[0] + 1;
                        player2[1] = player2[1] + 1;
                        System.out.println("Player2's current location" + "[" + player2[0] + "," + player2[1] + "] and you have " + player2[2] + " carrots!");
                        break;
                    }
                case 6:
                    if (canMove(player2[0], player2[1], s, move2) == false) {

                        break;
                    } else {
                        player2[1] = player2[1] + 1;
                        System.out.println("Player2's current location" + "[" + player2[0] + "," + player2[1] + "] and you have " + player2[2] + " carrots!");
                        break;
                    }
                case 4:
                    if (canMove(player2[0], player2[1], s, move2) == false) {

                        break;
                    } else {
                        player2[1] = player2[1] - 1;
                        System.out.println("Player2's current location" + "[" + player2[0] + "," + player2[1] + "] and you have " + player2[2] + " carrots!");
                        break;
                    }
                default:
                    System.out.println("Enter a valid number.");
                    break;
            }
            //PLAYER2 CARROT
            if (isThereACarrot(player2[0], player2[1]) == true) {
                if (generateAQuestion() == true) {
                    player2[2]++;
                    player2[6]++;
                }
                System.out.println("You have " + player2[2] + " carrots.");
            }//PLAYER2 RABBIT
            if (isThereARabbit(rabbit1s, rabbit1j, rabbit2s, rabbit2j, rabbit3s, rabbit3j, player2[0], player2[1]) == true) {
                System.out.println("You step on a rabit you should feed it!");

                int rabbitEat = (int) (Math.random() * 2 + 1);
                if (player2[2] >= rabbitEat) {
                    player2[2] -= rabbitEat;
                    player2[3]++;
                    System.out.println("You feed it,you earn a game point and now you have " + player2[2] + " carrots and " + player2[3] + " game points.");
                } else {
                    player2[3]--;
                    System.out.println("You dont have enough carrots to feed the rabit.You have " + player2[2] + " carrots and " + player2[3] + " game points.");
                }
                player2[4]++;
            }//TELEPORT METHOD 2
            if (player2[2] % 5 == 0 && player2[2] != 0) {
                if (TeleportToHeaven(player2[0], player2[1], heavenS, heavenJ, player2[2]) == true) {
                    player2[0] = heavenS;
                    player2[1] = heavenJ;
                }
            }//RAT PLAYER2
            if (isThereARat(rat1s, rat1j, rat2s, rat2j, player2[0], player2[1]) == true) {
                int ratEat = (int) (Math.random() * 2 + 1);
                if (ratEat < player2[2]) {
                    player1[2] -= ratEat;
                    System.out.println("You stepped on a rat.You are going to lose " + player2[2] + " carrots.");
                } else if (player2[2] < ratEat) {
                    player2[2] = 0;
                    System.out.println("You stepped on a rat.You are going to lose " + player2[2] + " carrots.");
                }
                player2[5]++;
            }
            //SWAP LOCATIONS METHOD
            if (player1[2] % 6 == 0) {
                if (swapLocs(player2[0], player2[1], player1[0], player1[1]) == true) {
                    int temp1 = 0;
                    int temp2 = 0;
                    temp1 = player2[0];
                    temp2 = player2[1];
                    player2[0] = player1[0];
                    player2[1] = player1[1];
                    player1[0] = temp1;
                    player1[1] = temp2;
                    
                }

            }

        }
        findWinner(player1[0], player1[1], player2[0], player2[1], hellS, hellJ, heavenS, heavenJ, player1[3], player2[3]);
        System.out.println("");
        System.out.println("rabbit1 :" + rabbit1s + "," + rabbit1j);
        System.out.println("");
        System.out.println("rabbit2 :" + rabbit2s + "," + rabbit2j);
        System.out.println("");
        System.out.println("rabbit3 :" + rabbit3s + "," + rabbit3j);
        System.out.println("");
        System.out.println("rat1 :" + rat1s + "," + rat1j);
        System.out.println("");
        System.out.println("rat2 :" + rat2s + "," + rat2j);
        System.out.println("");
        System.out.println("hell :" + hellS + "," + hellJ);
        System.out.println("");
        System.out.println("heavenl :" + heavenS + "," + heavenJ);
        System.out.println("-----------------------------");
        findCarrotCollector(player1[6], player2[6]);
        System.out.println("------------------------------");
        findRabbitFeeder(player1[4], player2[4]);
        System.out.println("------------------------------");
        findRatVisitor(player1[5], player2[5]);
        System.out.println("------------------------------");
        gamePoints(player1[3], player2[3]);
        System.out.println("------------------------------");
        for (int i = 1; i <= s; i++) {

            for (int j = s; j > i; j--) {
                System.out.print("     ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("[" + i + "," + j + "]");
            }

            System.out.println("");

        }
        System.out.println("");
    }

    public static boolean isThereARabbit(int rabbit1s, int rabbit1j, int rabbit2s, int rabbit2j, int rabbit3s, int rabbit3j, int playerS, int playerJ) {
        if (rabbit1s == playerS && rabbit1j == playerJ) {
            return true;
        }
        if (rabbit2s == playerS && rabbit2j == playerJ) {
            return true;
        }
        if (rabbit3s == playerS && rabbit3j == playerJ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean canMove(int playerS, int playerJ, int s, int move) {

        switch (move) {
            case 8:
                if (playerJ == 1 || playerS == 1 || playerJ == 2 * s - 1) {
                    System.out.println("");
                    System.out.println("You cannot move there because there is no tile left.");
                    return false;
                } else {
                    return true;
                }
            case 2:
                if (playerS == s) {
                    System.out.println("");
                    System.out.println("You cannot move there because there is no tile left.");
                    return false;
                } else {
                    return true;
                }
            case 6:
                if (playerJ == 2 * playerS - 1) {
                    System.out.println("");
                    System.out.println("You cannot move there because there is no tile left.");
                    return false;
                } else {
                    return true;
                }
            case 4:
                if (playerJ == 1) {
                    System.out.println("");
                    System.out.println("You cannot move there because there is no tile left.");
                    return false;
                } else {
                    return true;
                }
            default:
                System.out.println("Enter a valid number!");
                return false;
        }
    }

    public static boolean generateAQuestion() {
        Scanner scn = new Scanner(System.in);
        int q1 = (int) (Math.random() * 9 + 1);
        int q2 = (int) (Math.random() * 4 + 1);
        int question = (int) (Math.random() * 3);
        int result;
        switch (question) {
            case 0:
                System.out.println("Question is:" + q1 + "+" + q2 + "?");
                result = q1 + q2;
                int answer1 = scn.nextInt();
                if (answer1 == result) {
                    System.out.println("You answered right you got a carrot!");

                    return true;
                } else {
                    System.out.println("You answered wrong try another tile!");
                    return false;
                }

            case 1:
                System.out.println("Question is:" + q1 + "-" + q2 + "?");
                result = q1 - q2;
                int answer2 = scn.nextInt();
                if (answer2 == result) {
                    System.out.println("You answered right you got a carrot!");

                    return true;
                } else {
                    System.out.println("You answered wrong try another tile!");
                    return false;
                }

            case 2:
                System.out.println("Question is:" + q1 + "*" + q2 + "?");
                result = q1 * q2;
                int answer3 = scn.nextInt();
                if (answer3 == result) {
                    System.out.println("You answered right you got a carrot!");

                    return true;
                } else {
                    System.out.println("You answered wrong try another tile!");
                    return false;
                }

            case 3:
                System.out.println("Question is:" + q1 + "/" + q2 + "?");
                result = q1 / q2;
                int answer4 = scn.nextInt();
                if (answer4 == result) {
                    System.out.println("You answered right you got a carrot!");
                    return true;
                } else {
                    System.out.println("You answered wrong try another tile!");
                    return true;
                }
        }
        return false;
    }

    public static boolean isThereACarrot(int playerS, int playerJ) {
        if (playerJ % 2 == 0 && playerS % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isThereARat(int rat1s, int rat1j, int rat2s, int rat2j, int playerS, int playerJ) {
        if (rat1s == playerS && rat2j == playerJ) {
            return true;
        }
        if (rat2s == playerS && rat2j == playerJ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean HellExit(int playerS, int playerJ, int hellS, int hellJ) {
        if (playerS == hellS && playerJ == hellJ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean HeavenExit(int playerS, int playerJ, int heavenS, int heavenJ) {
        if (playerS == heavenS && playerJ == heavenJ) {
            return true;
        } else {
            return false;
        }
    }

    public static String Rules() {
        String rules = "1-In each even-even tile there is a carrot."
                + "\n2-To obtain carrot you should guess right the question."
                + "\n3-There is 3 rabbits and 2 rats in this game."
                + "\n4-Rabbits and rats eats carrots between 1-3."
                + "\n5-If you enter the heaven gate you win and can see the results."
                + "\n6-If you enter the hell gate you lose and can't see the results."
                + "\n7.If you want to go to the heaven gate directly it costs 5 carrots and asks u in every 5 carrots.";
        return rules;

    }

    public static boolean swapLocs(int player1s, int player1j, int player2s, int player2j) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Would you like to swap locations with other playerIt costs 3 carrots?\n[1]Yes \n[2]No");
        int choose = scn.nextInt();
        if (choose == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static String displayGate(int hellJ, int hellS, int heavenJ, int heavenS) {
        String hell = "Hell gates location is [" + hellS + "," + hellJ + "].";
        String heaven = "Heaven gates location is [" + heavenS + "," + heavenJ + "].";
        return hell + heaven;
    }

    public static boolean TeleportToHeaven(int playerS, int playerJ, int heavenS, int heavenJ, int carrotCounter) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Would you like to go to heaven gate directly,it costs 5 carrots?\n[1]Yes \n[2]No");
        int choose = scn.nextInt();
        if (choose == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void findWinner(int player1s, int player1j, int player2s, int player2j, int hellS, int hellJ, int heavenS, int heavenJ, int gamePoint1, int gamePoint2) {
        if (HellExit(player1s, player1j, hellS, hellJ)) {
            System.out.println("Player1 entered the Hell Gate!Player 2 wins!");
        }
        if (HellExit(player2s, player2j, hellS, hellJ)) {
            System.out.println("Player2 entered the Hell Gate!Player1 wins!");
        }
        if (HeavenExit(player1s, player1j, heavenS, heavenJ)) {
            System.out.println("Player 1 entered the heaven location calculating the winner!");
            if (gamePoint1 >= gamePoint2) {
                System.out.println("Player 1 wins the game!");
            } else if (gamePoint1 < gamePoint2) {
                System.out.println("Player 2 is the winner!");
            }
            if (HeavenExit(player2s, player2j, heavenS, heavenJ)) {
                System.out.println("Player 1 entered the heaven location calculating the winner!");
                if (gamePoint2 >= gamePoint1) {
                    System.out.println("Player 2 wins the game!");
                } else if (gamePoint2 < gamePoint1) {
                    System.out.println("Player 1 is the winner!");
                }
            }
        }
    }

    public static void findCarrotCollector(int player1Carrot, int player2Carrot) {
        if (player1Carrot > player2Carrot) {
            System.out.println("Player 1 is collected most carrots with " + player1Carrot + " carrots!");
        } else if (player1Carrot < player2Carrot) {
            System.out.println("Player 2 is collected most carrots with " + player2Carrot + " carrots!");
        } else {
            System.out.println("Both of them collected the same carrots with " + player1Carrot + " carrots.");
        }
    }

    public static void findRabbitFeeder(int player1Rabbit, int player2Rabbit) {
        if (player1Rabbit > player2Rabbit) {
            System.out.println("Player 1 feeded most rabbits," + player1Rabbit + " times!");
        } else if (player1Rabbit < player2Rabbit) {
            System.out.println("Player 2 feeded most rabbits," + player2Rabbit + " times!");
        } else {
            System.out.println("Both of them feeded the rabbits," + player1Rabbit + " times.");
        }
    }

    public static void findRatVisitor(int player1Rat, int player2Rat) {
        if (player1Rat > player2Rat) {
            System.out.println("Player 1 most visited the rats," + player1Rat + " times!");
        } else if (player1Rat < player2Rat) {
            System.out.println("Player 2 most visited the rats," + player2Rat + " times!");
        } else {
            System.out.println("Both of them visited the same rats ," + player1Rat + " times.");
        }
    }

    public static void gamePoints(int gamePoint1, int gamePoint2) {
        System.out.println("Player 1's game point is " + gamePoint1 + " points.");
        System.out.println("Player 2's game point is " + gamePoint2 + " points.");
    }
}
