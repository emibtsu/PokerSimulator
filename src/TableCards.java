
public class TableCards {
	Card cards[];
	
	
	public TableCards()
	{
		this.cards = new Card[5];
	}
	
	public void setTableCards(Card cards[])
	{
		this.cards=cards;
	}
	
	public void getTableCards()
	{
		for (int iLoop =0; iLoop <5; iLoop++)
		{
				System.out.println( "[" + cards[iLoop].getNumber() + " of " +  cards[iLoop].getSuit() + "]\n");
		}
	}
	
	public void getFlop()
	{
		for (int iLoop =0; iLoop <3; iLoop++)
		{
				System.out.println( "[" + cards[iLoop].getNumber() + " of " +  cards[iLoop].getSuit() + "]\n");
		}
	}
	
	public void getTurn()
	{

				System.out.println( "[" + cards[3].getNumber() + " of " +  cards[3].getSuit() + "]\n");
	}
	public void getRiver()
	{

				System.out.println( "[" + cards[4].getNumber() + " of " +  cards[4].getSuit() + "]\n");
	}
}
