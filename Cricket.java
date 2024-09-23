/***
 * This File is contain all the Classes and Methods

 * Program-Owner : Kalpana Swami
 * Date : 17 September 2024
 */
import java.util.*;
class Player {
    String Player_name;
    int runs;
    // Player function contain Player name and Run
    // Parameter : String
    // Return-type : No Return-Type
    Player(String name) {
        this.Player_name = name;
        this.runs = 0;
    }
    //  AddRuns function  add the run in totalScore
    // Parameter : Integer
    // Return-type : No Return-Type
    void addRuns(int runs) {
        this.runs += runs;
    }
}
class Team {
    String Player_name;
    Player[] players;
    int number_Players;
    // team function indicate the Cricket time
    // Parameter : String,Integer
    // Return-type : No Return-Type
    Team(String Player_name, int maxPlayers) {
        this.Player_name = Player_name;
        this.players = new Player[maxPlayers];
        this.number_Players = 0;
    }
    // AddPlayer function add the players in the Team
    // Parameter : StringArray
    // Return-Type : No Return-Type
    void addPlayer(Player player) {
        ConstantInput input = new ConstantInput();
        if (number_Players < players.length) {
            players[number_Players++] = player;
        } else {
            System.out.println(input.TEAM_FULL);
        }
    }
    // DisplayPlayer function print the players of the Team
    // Parameter :  No Parameter
    // Return-Type : No Return-Type
    void displayPlayers() {
        ConstantInput input = new ConstantInput();
        System.out.println(input.PLAYER + Player_name + input.COLON);
        for (int index = 0; index < number_Players; index++) {
            System.out.println(players[index].Player_name);
        }
    }
}
class CricketTeam {
    Team team1;
    Team team2;
    ConstantInput input = new ConstantInput();
    // CricketTeam function  is basically a constructor to initialize the CricketTeam
    // Parameter : Object of Team
    // Return-Type : No Return-Type
    CricketTeam(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    // Toss function is used to toss a coin between two Teams
    // Parameter :  Integer
    // Return-Type : No Return-Type
        void toss(int tossResult){
            if(tossResult == 0) {
                System.out.println(input.TEAM + team1.Player_name + input.WINS_TOSS);
            } else {
                System.out.println(input.TEAM + team2.Player_name + input.WINS_TOSS);
            }
            System.out.print(Character.toString(0x1F44F));
            System.out.println(Character.toString(0x1F44F));
        }
    //playMatch function is used to declare Winner
    // Parameter : No Parameter
    // Return-Type : No Return-Type
    void playMatch() {
        int overs;
        Scanner scanner = new Scanner(System.in);
        System.out.print(input.NUMBER_OVER);
        overs = scanner.nextInt();
        System.out.println(input.MATCH + team1.Player_name + input.AND + team2.Player_name);

        int team1Score = playInnings(team1,overs);
        int team2Score = playInnings(team2,overs);

        System.out.println(input.FINAL);
        System.out.println(team1.Player_name + input.COLON + team1Score);
        System.out.println(team2.Player_name + input.COLON + team2Score);

        if (team1Score > team2Score) {
            System.out.print(team1.Player_name + input.WIN);
            CricketGame.emoji2();
        } else if (team2Score > team1Score) {
            System.out.print(team2.Player_name + input.WIN);
            CricketGame.emoji2();
        } else {
            System.out.print(input.DRAW);
            System.out.println(Character.toString(0x1F973));
        }
    }
    // PlayInnings function is used to play a match
    // Parameter : Object of Team , Integer
    // Return-Type : Integer
    private int playInnings(Team team,int overs) {
        int totalScore = 0;
        int balls ;
        int six = 0;
        int four = 0;
        int wickets = 0;
        int currentBatsmanIndex = 0;
        int nextBatsmanIndex = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + input.ACTIVE_TEAM + team.Player_name);
        balls = overs * 6;
        int Balls = 1;

        while (balls > 0 && currentBatsmanIndex < team.number_Players && nextBatsmanIndex < team.number_Players) {
            System.out.println(input.CURRENT + team.players[currentBatsmanIndex].Player_name);
            System.out.println(input.NON_STRIKER + team.players[nextBatsmanIndex].Player_name);
            System.out.print(input.ENTER_RUN);
            String input = scanner.next();

            ConstantInput constant = new ConstantInput();
            ConstantSpaceOrError EmptyString = new  ConstantSpaceOrError();

            if (input.equalsIgnoreCase(constant.OUT)) {
                System.out.println(constant.REASON);
                System.out.println(constant.ENTER_REASON);
                Scanner OUT = new Scanner(System.in);
                String Out = OUT.nextLine();
                switch(Out){
                    case "1":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.IS_OUT);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "2":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_1);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "3":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_2);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "4":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_3);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "5":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_4);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "6":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_5);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "7":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_6);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "8":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_7);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    case "9":{
                        System.out.print(constant.OH + team.players[currentBatsmanIndex].Player_name + constant.OUT_8);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                    default:
                    {   System.out.print(EmptyString.INVALID_STRING);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                }
                currentBatsmanIndex = nextBatsmanIndex;
                nextBatsmanIndex++;
                wickets++;
                if (nextBatsmanIndex > team.number_Players) {
                    System.out.println(constant.NO_MORE);
                    break;
                }
            }
            else {
                try {
                    int runs = Integer.parseInt(input);
                    if (runs < 0 || runs > 8 ) {
                        System.out.print(EmptyString.INVALID_RUN);
                        System.out.println(Character.toString(0x1F614));
                    }
                    else
                    if(runs == 7){
                        System.out.println(constant.WIDE_BALL);
                        System.out.print(constant.RUN_1);
                        System.out.print(Character.toString(0x1F483));
                        System.out.println(Character.toString(0x1F483));
                        totalScore += 1;
                    }
                    else if(runs == 8){
                        System.out.println(constant.NO_BALL);
                        System.out.print(constant.RUN_1);
                        System.out.print(Character.toString(0x1F483));
                        System.out.println(Character.toString(0x1F483));
                        totalScore += 1;
                        System.out.println(constant.BALL_RUN);
                        int No_ball_Run = scanner.nextInt();
                        if(No_ball_Run < 0 || No_ball_Run > 6 ){
                            System.out.print(EmptyString.INVALID_INPUT);
                            System.out.println(Character.toString(0x1F614));
                            totalScore -= 1;
                            continue;
                        }
                        else if(No_ball_Run == 4){
                            System.out.println(constant.FOUR);
                            CricketGame.emoji();
                            System.out.print("\n");
                            four++;
                        }
                        else if(No_ball_Run == 6){
                            System.out.println(constant.SIX);
                            CricketGame.emoji();
                            System.out.print("\n");
                            six++;
                        }
                        team.players[currentBatsmanIndex].addRuns(No_ball_Run);
                        totalScore +=  No_ball_Run ;
                        System.out.println(constant.BALL + (Balls-1));
                        System.out.println(team.players[currentBatsmanIndex].Player_name + constant.SCORED + No_ball_Run + constant.RUN);
                        System.out.println(constant.SCORE + totalScore + "/" + wickets);
                        System.out.println(constant.TOTAL_FOUR + four + constant.TOTAL_SIX + six);

                    }
                    else{
                        if(runs == 4){
                            System.out.println(constant.FOUR);
                            CricketGame.emoji();
                            System.out.print("\n");
                            four++;
                        }
                        if(runs == 6){
                            System.out.println(constant.SIX);
                            CricketGame.emoji();
                            System.out.print("\n");
                            six++;
                        }
                        team.players[currentBatsmanIndex].addRuns(runs);
                        totalScore += runs;
                        System.out.println(constant.BALL + Balls);
                        System.out.println(team.players[currentBatsmanIndex].Player_name + constant.SCORED + runs + constant.RUN);
                        System.out.println(constant.SCORE + totalScore + "/" + wickets);
                        System.out.println(constant.TOTAL_FOUR + four + constant.TOTAL_SIX + six);
                        Balls++;
                        balls--;

                        if (runs % 2 != 0 || balls % 6 == 0) {
                            int StoreVariable = currentBatsmanIndex;
                            currentBatsmanIndex = nextBatsmanIndex ;
                            nextBatsmanIndex = StoreVariable ;
                        }

                        if (balls % 6 == 0) {
                            System.out.println(constant.END_OVER + totalScore);
                        }}
                } catch (NumberFormatException e) {
                    System.out.print(EmptyString.INVALID_INPUT);
                    System.out.println(Character.toString(0x1F614));
                }
            }
        }

        return totalScore;
    }

}



