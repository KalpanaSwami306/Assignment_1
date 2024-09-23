/***
In Today's Assignment . We have give two task:
  1. Cricket Team Match
  2. 2048 Game
 This Program is all about Cricket Team Match
 Program_owner: kalpana Swami
 Date : 17 September 2024

 */
import java.util.*;
public class CricketGame {
    public static void emoji(){
        for(int index = 0 ; index < 4 ; index++) {
            System.out.print(Character.toString(0x1F483));
        }
    }
    public static void emoji2(){
        System.out.println(Character.toString(0x1F3C6));
        System.out.print(Character.toString(0x1F973));
        System.out.println(Character.toString(0x1F973));
    }
    public static void main(String[] args) throws InterruptedException {
        ConstantInput ConstantString = new  ConstantInput();
        ConstantSpaceOrError EmptyString = new ConstantSpaceOrError();
        Scanner SelectOption = new Scanner(System.in);
        System.out.println( EmptyString.SPACE);
        System.out.println( EmptyString.SPACE);
        System.out.print("    "+Character.toString(0x1F3CF));
        System.out.print(ConstantString.MAIN_STRING);
        System.out.println(Character.toString(0x1F3CF));
        System.out.println( EmptyString.SPACE);
        System.out.println( EmptyString.SPACE);
        Thread.sleep(1000);
        char Choice ;
        do{
            System.out.println(ConstantString.OPTION);
            System.out.println(ConstantString.OPTION_1);
            System.out.println(ConstantString.OPTION_2);
            System.out.println(EmptyString.WARNING);
            System.out.println(ConstantString.ENTER_CHOICE);
            String  UserChoice = SelectOption.nextLine();
            switch(UserChoice){
                case "1" :
                    try {
                        System.out.println(ConstantString.TEAM_NUMBER);
                        int maximum_Teams = SelectOption.nextInt();
                        SelectOption.nextLine();

                        if( maximum_Teams < 2){
                            System.out.print( EmptyString.INVALID_STRING);
                            System.out.println(Character.toString(0x1F614));
                        }
                        else{
                        Team[] teams = new Team[ maximum_Teams];
                        int number_Teams = 0;

                        for (int index = 0; index <  maximum_Teams; index++) {
                            System.out.println(ConstantString.TEAM_NAME + (index + 1) + ConstantString.COLON);
                            String teamName = SelectOption.nextLine();
                            System.out.println(ConstantString.PLAYER_NUMBER + teamName + ConstantString.TEAM);
                            int maxPlayers = SelectOption.nextInt();
                            SelectOption.nextLine();

                            if(maxPlayers < 0 ){
                                System.out.print( EmptyString.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));}
                            else{
                                Team team = new Team(teamName, maxPlayers);

                                System.out.println(ConstantString.PLAYER_TEAM + teamName + ConstantString.COLON);
                                int numberOfPlayers = SelectOption.nextInt();
                                SelectOption.nextLine();
                                if(numberOfPlayers < 0){
                                   System.out.print( EmptyString.INVALID_STRING);
                                   System.out.println(Character.toString(0x1F614));
                                }
                                else{
                                 for (int index1 = 0; index1 < numberOfPlayers; index1++) {
                                 System.out.println(ConstantString.ENTER_PLAYER + (index1 + 1) + ConstantString.COLON);
                                 String playerName = SelectOption.nextLine();
                                 team.addPlayer(new Player(playerName));
                                 }

                                 teams[number_Teams++] = team;
                                 team.displayPlayers();
                            }}}
                            System.out.println(ConstantString.SELECT_TEAM);
                            for (int index = 0; index < number_Teams; index++) {
                                System.out.println((index + 1) + ". " + teams[index].Player_name);
                            }

                            System.out.println(ConstantString.SELECT_TEAM_1);
                            int team1Index = SelectOption.nextInt() - 1;
                            System.out.println(ConstantString.SELECT_TEAM_2);
                            int team2Index = SelectOption.nextInt() - 1;
                            if(team1Index < 0 || team2Index < 0 || team1Index == team2Index){
                                System.out.print( EmptyString.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));
                            }
                            else{
                            Team selectedTeam1 = teams[team1Index];
                            Team selectedTeam2 = teams[team2Index];

                            CricketTeam game = new CricketTeam(selectedTeam1, selectedTeam2);
                            System.out.println(ConstantString.TOSS);
                            int tossResult = SelectOption.nextInt();
                            if(tossResult < 0 || tossResult > 1){
                                System.out.print(EmptyString.INVALID_STRING);
                                System.out.println(Character.toString(0x1F614));
                            }else{
                            game.toss(tossResult);
                            game.playMatch();
                            System.out.println(EmptyString.SPACE);}
                          }}
                            }catch(Exception e){
                              System.out.print(EmptyString.INVALID_STRING);
                              System.out.println(Character.toString(0x1F614));
                              SelectOption.nextLine();
                              }
                              break;
                case "2" :
                    System.out.println(ConstantString.EXIT_STRING);
                    System.out.print(Character.toString(0x1F64F));
                    System.out.println(Character.toString(0x1F64F));
                    break;
                default :
                    System.out.print(EmptyString.INVALID_STRING);
                    System.out.println(Character.toString(0x1F614));
                    System.out.println(EmptyString.SPACE);
                    break;
            }
            System.out.println(ConstantString.EXECUTION_CHOICE);
            Choice = SelectOption.next().charAt(0);
            SelectOption.nextLine();

        }while(Objects.equals(Choice, '1'));
    }
}
