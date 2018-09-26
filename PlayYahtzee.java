import java.util.Scanner;

public class PlayYahtzee{
	public static void main(String[] args){
		//Dice first = new Dice();
		Scanner Input1 = new Scanner (System.in);
		int userOpt = 0;
		boolean keepGoing = true;
		
		while(keepGoing == true){
		System.out.println("Welcome to Yahtzee, please enter your option");
		System.out.println("1 - Play\n2 - Quit");
		userOpt = Input1.nextInt();
		
		if(userOpt ==1){
		Yahtzee newGame = new Yahtzee();
		System.out.println(newGame.roll());
		}
		
		if(userOpt ==2){
			keepGoing = false;
		}
		
		}
	}
}