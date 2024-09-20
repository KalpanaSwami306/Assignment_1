/***
In Today's Assignment . We have give two task:
  1. Cricket Team Match
  2. 2048 Game
 This Program is all about Cricket Team Match
 Program_owner: kalpana Swami
 Date : 17 September 2024

 */

import java.util.*;
class Team {
    String name;
    Player[] players;
    int number_Players;
    // team function indicate the Cricket time
    // Parameter : String,Integer
    // Return-type : No Return-Type
    Team(String name, int maxPlayers) {
        this.name = name;
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
        System.out.println(input.PLAYER + name + input.COLON);
        for (int index = 0; index < number_Players; index++) {
            System.out.println(players[index].name);
        }
    }
}
class CricketTeam {
    Team team1;
    Team team2;
    ConstantInput input = new ConstantInput();
    ConstantSpaceOrError Space = new  ConstantSpaceOrError();
    // CricketTeam function  is basically a constructor to initialize the CricketTeam
    // Parameter : Object of Team
    // Return-Type : No Return-Type
    CricketTeam(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
   // Toss function is used to toss a coin between two Teams
   // Parameter :  No Parameter
   // Return-Type : No Return-Type
    void toss(){
        Scanner User_input = new Scanner(System.in);
        System.out.println(input.TOSS);
        int tossResult =  User_input.nextInt();
        if(tossResult < 0 || tossResult > 1){
            System.out.print(Space.INVALID_STRING);
            System.out.println(Character.toString(0x1F614));
        }else{
        if (tossResult == 0) {
            System.out.print(input.TEAM + team1.name + input.WINS_TOSS);
            System.out.print(Character.toString(0x1F44F));
            System.out.println(Character.toString(0x1F44F));
        } else {
            System.out.println(input.TEAM + team2.name + input.WINS_TOSS);
            System.out.print(Character.toString(0x1F44F));
            System.out.println(Character.toString(0x1F44F));
        }}
    }
    //playMatch function is used to declare Winner
    // Parameter : No Parameter
    // Return-Type : No Return-Type
    void playMatch() {
        System.out.println(input.MATCH + team1.name + input.AND + team2.name+"\n");

        int team1Score = playInnings(team1);
        int team2Score = playInnings(team2);

        System.out.println(input.FINAL);
        System.out.println(team1.name + input.COLON + team1Score);
        System.out.println(team2.name + input.COLON + team2Score);

        if (team1Score > team2Score) {
            System.out.println(team1.name + input.WIN);
            System.out.print(Character.toString(0x1F973));
            System.out.println(Character.toString(0x1F973));
        } else if (team2Score > team1Score) {
            System.out.println(team2.name + input.WIN);
            System.out.print(Character.toString(0x1F973));
            System.out.println(Character.toString(0x1F973));
        } else {
            System.out.println(input.DRAW);
        }
    }
    // PlayInnings function is used to play a match
    // Parameter : Object of Team
    // Return-Type : Integer
    private int playInnings(Team team) {
        int totalScore = 0;
        int overs ;
        int balls ;
        int wickets = 0;
        int currentBatsmanIndex = 0;
        int nextBatsmanIndex = 1;

        Scanner User_Input = new Scanner(System.in);
        System.out.println(input.ACTIVE_TEAM + team.name);
        System.out.print(input.NUMBER_OVER);
        overs = User_Input.nextInt();
        balls = overs * 6;
        int Balls = 1;

        while (balls > 0 && currentBatsmanIndex < team.number_Players) {
            System.out.println(input.CURRENT + team.players[currentBatsmanIndex].name);
            System.out.print(input.ENTER_RUN);
            String input = User_Input.next();

            ConstantInput constant = new ConstantInput();
            ConstantSpaceOrError Space = new  ConstantSpaceOrError();

            if (input.equalsIgnoreCase(constant.OUT)) {
                System.out.println(constant.REASON);
                System.out.println(constant.ENTER_REASON);
                Scanner OUT = new Scanner(System.in);
                String Out = OUT.nextLine();
                switch(Out){
                    case "1":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.IS_OUT);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "2":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_1);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "3":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_2);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "4":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_3);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "5":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_4);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "6":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_5);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "7":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_6);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "8":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_7);
                              System.out.println(Character.toString(0x1F614));
                              break;}
                    case "9":{System.out.print(constant.OH + team.players[currentBatsmanIndex].name + constant.OUT_8);
                              System.out.println(Character.toString(0x1F614));
                               break;}
                    default:
                    {   System.out.print(Space.INVALID_STRING);
                        System.out.println(Character.toString(0x1F614));
                        break;}
                }
                currentBatsmanIndex = nextBatsmanIndex;
                nextBatsmanIndex++;
                wickets++;
                if (nextBatsmanIndex >= team.number_Players) {
                    System.out.println(constant.NO_MORE);
                    break;
                }
            }
            else {
                try {
                    int runs = Integer.parseInt(input);
                    if (runs < 0 || runs > 8 ) {
                        System.out.print(Space.INVALID_RUN);
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
                        int No_ball_Run = User_Input.nextInt();
                        if(No_ball_Run < 0 || No_ball_Run > 6 ){
                            System.out.print(Space.INVALID_INPUT);
                            System.out.println(Character.toString(0x1F614));
                            totalScore -= 1;
                            continue;
                        }
                        else if(No_ball_Run == 4){
                            System.out.println(constant.FOUR);
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.println(Character.toString(0x1F483));
                        }
                        else if(No_ball_Run == 6){
                            System.out.println(constant.SIX);

                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.println(Character.toString(0x1F483));
                        }
                        team.players[currentBatsmanIndex].addRuns(No_ball_Run);
                        totalScore +=  No_ball_Run ;
                        System.out.println(constant.BALL + (Balls-1));
                        System.out.println(team.players[currentBatsmanIndex].name + constant.SCORED + No_ball_Run + constant.RUN);
                        System.out.println(constant.SCORE + totalScore + "/" + wickets);

                    }
                    else{
                        if(runs == 4){
                            System.out.println(constant.FOUR);
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.println(Character.toString(0x1F483));
                        }
                        if(runs == 6){
                            System.out.println(constant.SIX);
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.print(Character.toString(0x1F483));
                            System.out.println(Character.toString(0x1F483));
                        }
                        team.players[currentBatsmanIndex].addRuns(runs);
                        totalScore += runs;
                        System.out.println(constant.BALL + Balls);
                        System.out.println(team.players[currentBatsmanIndex].name + constant.SCORED + runs + constant.RUN);
                        System.out.println(constant.SCORE + totalScore + "/" + wickets);
                        Balls++;
                        balls--;

                        if (runs % 2 != 0) {
                            int StoreVariable = currentBatsmanIndex;
                            currentBatsmanIndex = nextBatsmanIndex - 1;
                            nextBatsmanIndex = StoreVariable + 1;
                        }

                        if (balls % 6 == 0) {
                            System.out.println(constant.END_OVER + totalScore);
                        }}
                } catch (NumberFormatException e) {
                    System.out.print(Space.INVALID_INPUT);
                    System.out.println(Character.toString(0x1F614));
                }
            }
        }

        return totalScore;
    }

}
public class CricketGame {
    public static void main(String[] args) throws InterruptedException {
        ConstantInput Input = new  ConstantInput();
        ConstantSpaceOrError Space = new ConstantSpaceOrError();
        Scanner Select = new Scanner(System.in);
        System.out.println(Space.SPACE);
        System.out.println(Space.SPACE);
        System.out.print("    "+Character.toString(0x1F3CF));
        System.out.print(Input.MAIN_STRING);
        System.out.println(Character.toString(0x1F3CF));
        System.out.println(Space.SPACE);
        System.out.println(Space.SPACE);
        Thread.sleep(1000);
        char SelectString ;
        do{
            System.out.println(Input.OPTION);
            System.out.println(Input.OPTION_1);
            System.out.println(Input.OPTION_2);
            System.out.println(Input.ENTER_CHOICE);
          String  Selectstring = Select.nextLine();
            switch(Selectstring){
                case "1" :
                    try {
                        System.out.println(Input.TEAM_NUMBER);
                        int maximum_Teams = Select.nextInt();
                        Select.nextLine();

                        if( maximum_Teams < 2){
                            System.out.print(Space.INVALID_STRING);
                            System.out.println(Character.toString(0x1F614));
                        }
                        else{
                        Team[] teams = new Team[ maximum_Teams];
                        int number_Teams = 0;

                        for (int index = 0; index <  maximum_Teams; index++) {
                            System.out.println(Input.TEAM_NAME + (index + 1) + Input.COLON);
                            String teamName = Select.nextLine();
                            System.out.println(Input.PLAYER_NUMBER + teamName + Input.TEAM);
                            int maxPlayers = Select.nextInt();
                            Select.nextLine();

                            if(maxPlayers < 0 ){
                                System.out.print(Space.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));}
                            else{
                            Team team = new Team(teamName, maxPlayers);

                            System.out.println(Input.PLAYER_TEAM + teamName + Input.COLON);
                            int numberOfPlayers = Select.nextInt();
                            Select.nextLine();
                            if(numberOfPlayers < 0){
                                System.out.print(Space.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));
                            }else{
                            for (int index1 = 0; index1 < numberOfPlayers; index1++) {
                                System.out.println(Input.ENTER_PLAYER + (index1 + 1) + Input.COLON);
                                String playerName = Select.nextLine();
                                team.addPlayer(new Player(playerName));
                            }

                            teams[number_Teams++] = team;
                            team.displayPlayers();
                            }}}
                            System.out.println(Input.SELECT_TEAM);
                            for (int index = 0; index < number_Teams; index++) {
                                System.out.println((index + 1) + ". " + teams[index].name);
                            }

                            System.out.println(Input.SELECT_TEAM_1);
                            int team1Index = Select.nextInt() - 1;
                            System.out.println(Input.SELECT_TEAM_2);
                            int team2Index = Select.nextInt() - 1;
                            if(team1Index < 0 || team2Index < 0 || team1Index == team2Index){
                                System.out.print(Space.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));
                            }
                            else{
                            Team selectedTeam1 = teams[team1Index];
                            Team selectedTeam2 = teams[team2Index];

                            CricketTeam game = new CricketTeam(selectedTeam1, selectedTeam2);
                            game.toss();
                            game.playMatch();
                            System.out.println(Space.SPACE);
                          }}
                            }catch(Exception e){
                              System.out.print(Space.INVALID_STRING);
                              System.out.println(Character.toString(0x1F614));
                              Select.nextLine();
                              }
                              break;
                case "2" :
                    System.out.println(Input.EXIT_STRING);
                    System.out.print(Character.toString(0x1F64F));
                    System.out.println(Character.toString(0x1F64F));
                    break;
                default :
                    System.out.print(Space.INVALID_STRING);
                    System.out.println(Character.toString(0x1F614));
                    System.out.println(Space.SPACE);
                    break;
            }
            System.out.println(Input.EXECUTION_CHOICE);
            SelectString = Select.next().charAt(0);
            Select.nextLine();

        }while(Objects.equals(SelectString, '1'));
    }
}
