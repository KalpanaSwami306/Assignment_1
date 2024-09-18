/***
In Today's Assignment . We have give two task:
  1. Cricket Team Match
  2. 2048 Game

 Program_owner: kalpana Swami
 Date : 17 September 2024

 */

import java.util.*;
class Team {
    String name;
    Player[] players;
    int numPlayers;

    Team(String name, int maxPlayers) {
        this.name = name;
        this.players = new Player[maxPlayers];
        this.numPlayers = 0;
    }

    void addPlayer(Player player) {
        ConstantInput input = new ConstantInput();
        if (numPlayers < players.length) {
            players[numPlayers++] = player;
        } else {
            System.out.println(input.TEAM_FULL);
        }
    }

//    void displayPlayers() {
//        ConstantInput input = new ConstantInput();
//        System.out.println(input.PLAYER + name + ":");
//        for (int i = 0; i < numPlayers; i++) {
//            System.out.println(players[i].name);
//        }
//    }
}
public class CricketGame {
    public static void main(String[] args) {
        ConstantInput Input = new  ConstantInput();
        ConstantSpaceOrError Space = new ConstantSpaceOrError();
        Scanner Select = new Scanner(System.in);
        System.out.println(Space.SPACE);
        System.out.println(Input.MAIN_STRING);
        System.out.println(Space.SPACE);
        String SelectString ;
        do{
            System.out.println(Input.OPTION);
            System.out.println(Input.OPTION_1);
            System.out.println(Input.OPTION_2);
            System.out.println(Input.OPTION_3);
            System.out.println(Input.ENTER_CHOICE);
            SelectString = Select.nextLine();
            switch(SelectString){
                case "1" :
                    break;
                case "2" :
                    try {
                        System.out.println(Input.TEAM_NUMBER);
                        int maxTeams = Select.nextInt();
                        Select.nextLine();
                        if(maxTeams<0){
                            System.out.println(Space.INVALID_STRING);}
                        else{
                        Team[] teams = new Team[maxTeams];
                        int numTeams = 0;

                        for (int index = 0; index < maxTeams; index++) {
                            System.out.println(Input.TEAM_NAME + (index + 1) + ":");
                            String teamName = Select.nextLine();
                            System.out.println(Input.PLAYER_NUMBER + teamName + Input.TEAM);
                            int maxPlayers = Select.nextInt();
                            Select.nextLine();

                            if(maxPlayers<0){
                                System.out.println(Space.INVALID_STRING);}
                            else{
                            Team team = new Team(teamName, maxPlayers);

                            System.out.println(Input.PLAYER_TEAM + teamName + ":");
                            int numberOfPlayers = Select.nextInt();
                            Select.nextLine();
                            if(numberOfPlayers<0){
                                System.out.println(Space.INVALID_STRING);
                            }else{
                            for (int index1 = 0; index1 < numberOfPlayers; index1++) {
                                System.out.println(Input.ENTER_PLAYER + (index1 + 1) + ":");
                                String playerName = Select.nextLine();
                                team.addPlayer(new Player(playerName));
                            }

                            teams[numTeams++] = team;
                        }}}}
                    }catch(InputMismatchException e){
                        System.out.println(Space.INVALID_STRING);
                    }
                    break;
                case "3" :
                    System.out.println(Input.EXIT_STRING);
                    break;
                default :
                    System.out.println(Space.INVALID_STRING);
                    System.out.println(Space.SPACE);
                    break;
            }
            System.out.println(Input.EXECUTION_CHOICE);
            SelectString = Select.nextLine();

        }while(Objects.equals(SelectString, "1"));
    }
}
