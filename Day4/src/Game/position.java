package Game;
import java.util.Random;
public class position {

	public static void main(String[] args) {
		int Position;
		for(Position = 0; Position <= 100; Position++)
		{
			Random rand = new Random();
			int dice = rand.nextInt((6)+1);
					Position = Position + dice;
					System.out.println("Roll dice:" + dice);
		}
			
		System.out.println("Winpoint: " + Position);

	}

}
