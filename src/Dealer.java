
public class Dealer {
Hands hand;
	public Dealer()
	{

	}
	public void setHand(Hands hand)
	{
		this.hand=hand;
	}
	
	public void getHand()
	{
		System.out.println( "[" + hand.card1.getNumber() + " of " +  hand.card1.getSuit() + "]\n");
		System.out.println( "[" + hand.card2.getNumber() + " of " +  hand.card2.getSuit() + "]\n");
	}
}
