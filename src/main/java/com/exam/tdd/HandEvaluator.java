
package com.exam.tdd;

import java.util.List;

public class HandEvaluator {

	public int evaluate(Hand hand) {
	    int[] frequences = new int[15];

	    for (Card carte : hand.cards()) {
	        frequences[carte.value()]++;
	    }

	    for (int frequence : frequences) {
	        if (frequence == 3) {
	            return 30;
	        }
	    }

	    return 0;
	}}