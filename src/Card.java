/*
 * For Suit
 * 
 * 0 - heart
 * 1 - spade
 * 2 - club
 * 3 - diamond
 * 
 * 
 */

import java.math.*;

public class Card {
	int number;
	int suit;
	public Card(int number, int suit)
	{
		this.number = number;
		this.suit = suit;
	}
	
	public Card()
	{
	}

	public String getNumber()
	{
		String sNumber = "";
		
		if (this.number==11)
		{
			sNumber = "Jack";
		}
		else if (this.number==12)
		{
			sNumber = "Queen";
		}
		else if (this.number==13)
		{
			sNumber = "King";
		}
		else if (this.number==1)
		{
			sNumber = "Ace";
		}
		else
		{
			sNumber = Integer.toString(this.number);
		}
		
		return sNumber;
	}

	public String getSuit()
	{
		String suitString = "";
		if (suit == 0)
		{
			suitString = "Heart";
		}
		else if (suit == 1)
		{
			suitString = "Spade";
		}
		if (suit == 2)
		{
			suitString = "Club";
		}
		else if (suit == 3)
		{
			suitString = "Diamond";
		}

		return suitString;
	}
	
	public void setNumber(int number)
	{
		this.number = number;
	}

}
