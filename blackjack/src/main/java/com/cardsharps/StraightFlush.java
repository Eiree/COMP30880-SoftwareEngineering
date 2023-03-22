
package com.cardsharps;

// This package provides classes necessary for implementing a game system for playing poker


public class StraightFlush extends PokerHand {
	
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// Constructors
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public StraightFlush(Card[] hand, DeckOfCards deck)	{
		super(hand, deck);
	}

	

	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// What is the riskworthiness of this hand?
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public int getRiskWorthiness() {
		return 100 - PokerHand.STRAIGHTFLUSH_RISK; 
	}

	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// What is the value of this hand?
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public int getValue() {
		return PokerHand.STRAIGHTFLUSH_VALUE + getCard(0).getValue();
	}
	
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	// Display
	//--------------------------------------------------------------------//
	//--------------------------------------------------------------------//
	
	public String toString() {
		return "StraightFlush " + super.toString();
	}
	
}

