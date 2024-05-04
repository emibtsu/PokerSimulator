import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	Card cards[];
	int cardIndexDealed = 0;
	public Deck()
	{
		int cardCount = 0;
		this.cards = new Card[52];
		for (int iLoop = 0; iLoop <=3; iLoop++)
		{
			for (int jLoop = 1; jLoop <=13; jLoop++)
			{
				this.cards[cardCount] = new Card (jLoop, iLoop);
				cardCount++;
			}
		}
		shuffle();
	}
	
	public void getDeck()
	{
		for (int iLoop = cardIndexDealed; iLoop <52; iLoop++)
		{
			System.out.println( "[" + cards[iLoop].getNumber() + " of " +  cards[iLoop].getSuit() + "]\n");
		}
	}
	
	public void shuffle()
	{
		List<Card> cardList = Arrays.asList(cards);
		Collections.shuffle(cardList);
		this.cards = cardList.toArray(Card[]::new);
		cardIndexDealed = 0;
	}
	
	public Hands dealHand()
	{
		Card card1 = new Card();
		Card card2 = new Card();

		card1 = this.cards[cardIndexDealed];
		cardIndexDealed++;

		card2 = this.cards[cardIndexDealed];
		cardIndexDealed++;

		Hands hand = new Hands(card1, card2);
		return hand;
	}
	
	public Card[] dealTableCards()
	{
		Card[] cards = new Card[5];

		for (int iLoop = 0; iLoop < 5; iLoop++)
		{
			cards[iLoop] = this.cards[cardIndexDealed];
			cardIndexDealed++;
		}
		return cards;
	}
	

}
