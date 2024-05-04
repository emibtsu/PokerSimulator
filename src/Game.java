import java.util.Scanner;

public class Game {
	public static void main (String[] args)
	{
		Deck deck = new Deck();
		You you = new You();
		Dealer dealer = new Dealer();
		TableCards tablecards= new TableCards();
		Scanner scan = new Scanner(System.in);
		String input = "";

		while (!input.equals("exit"))
		{

			System.out.println("WElcome to a new game!\n\n");	

			//Deal the hands
			you.setHand(deck.dealHand());
			dealer.setHand(deck.dealHand());
			tablecards.setTableCards(deck.dealTableCards());


			//print hand and deck
			System.out.println("Your Hand:");
			you.getHand();

			

			//System.out.println("Table Cards:");
			//tablecards.getTableCards();

			System.out.println("Press enter to flip over table cards");
			input = scan.nextLine();
			
			System.out.println("Flop:");
			tablecards.getFlop();

			System.out.println("Press enter to continue flipping over table cards");
			input = scan.nextLine();
			
			System.out.println("Turn:");
			tablecards.getTurn();

			System.out.println("Press enter to continue flipping over table cards");
			input = scan.nextLine();
			
			System.out.println("River:");
			tablecards.getRiver();
			
			
			//System.out.println("Remaining cards in deck:");
			//deck.getDeck();
			
			System.out.println("Press enter to flip over dealer hand");
			input = scan.nextLine();
			
			System.out.println("Dealer Hand:");
			dealer.getHand();
			
			System.out.println("Good Game!: type 'exit' to exit otherwise press enter");
			input = scan.nextLine();
		}
		
	}

}
