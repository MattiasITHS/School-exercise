import java.util.Scanner;
import java.util.ArrayList;
public class SimpleDiceGame{
  public static Scanner input = new Scanner(System.in);
  public static void main(String[]args){
    //TODO skapar en arraylist med loop som skapar anatal players
    //fråga användare hur många spelare,
    //hur många tärningar varje spelare ska ha
    //och hur många sidor tärningen ska ha
    //fråga namn på spelarna
    // ingen felhantering, anta rätt inmatning
    //spela 5 omgångar
    //spelarna gissar först ett värde, sen rullar tärningar
    //om gissning == värdet som slås = vinst
    //spelare med flest poäng efter 5e rundan vinner
    initialize();
    System.out.println(playerName.get(0));

  }
  private static ArrayList<Player> initialize(){

    String playerNames;
    ArrayList<Player> playerName = new ArrayList<Player>();

    System.out.println("How many players are playing?");
    int numberOfPlayers = input.nextInt();

    System.out.println("How many dice should each player have?");
    int numberOfDice = input.nextInt();

    System.out.println("Whats the name of the players?");
    for(int i = 0; i <= numberOfPlayers; i++){
      playerNames = input.nextLine();
      playerName.add(new Player(playerNames));
    }
    return (playerName);
  }
}
