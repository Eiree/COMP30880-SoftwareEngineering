
package com.cardsharps;

// This package provides classes necessary for implementing a game system for playing poker


public class FourOfAKind extends PokerHand {
	
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// Constructors
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public FourOfAKind(Card[] hand, DeckOfCards deck) {
		super(hand, deck);
	}


	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// What is the riskworthiness of this hand?
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public int getRiskWorthiness() 	{
		return 100 - PokerHand.FOURS_RISK; 
	}

	
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// What is the value of this hand?
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public int getValue()	{
		if (getCard(0).getRank() == getCard(3).getRank())
			return PokerHand.FOURS_VALUE + getCard(0).getValue();
		else
			return PokerHand.FOURS_VALUE + getCard(1).getValue();
	}
	

	//--------------------------------------------------------------------//
    //--------------------------------------------------------------------//
	// Discard and redeal some cards
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public PokerHand discard()	{
		if (getCard(0).getRank() == getCard(3).getRank())
			return discard(4);
		else
			return discard(0);
	}

	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// Display
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public String toString() 	{
		return "Four of a kind: " + super.toString();
	}
	
}

