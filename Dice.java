import java.util.Random;

public class Dice{
	Random random = new Random();
	
	 public int dice = random.nextInt(6) - 1;
	
}