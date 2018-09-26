public class Yahtzee{
	private int dice1;
	private int dice2;
	
	Dice newDice = new Dice();
	Dice newDice2 = new Dice();
	
	public void setDice(){
		dice1 = newDice.dice;
		dice2 = newDice2.dice;
	}
	
	public int getDice(){
		return dice1;
	}
	
	public String roll(){
		if(dice1 == 6 && dice2 ==6)
		return "You rolled a " + dice1 + " and " + dice2;
	}
}