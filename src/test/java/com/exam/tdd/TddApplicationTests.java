package com.exam.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	
	HandEvaluator evaluator = new HandEvaluator();
	
	 @Test
	    void shouldReturnHighestCardWhenNoCombinationExists() {
	        Hand hand = new Hand(List.of(
	            new Card(3, Suite.TREFLE),
	            new Card(8, Suite.CARREAU),
	            new Card(10, Suite.COEUR),
	            new Card(12, Suite.PIQUE),
	            new Card(13, Suite.TREFLE)
	        ));

	        assertEquals(0, evaluator.evaluate(hand));
	    }
	 
	 @Test
	 void shouldReturn30PointsForThreeOfAKind() {
	     Hand hand = new Hand(List.of(
	         new Card(7, Suite.TREFLE),
	         new Card(7, Suite.CARREAU),
	         new Card(7, Suite.COEUR),
	         new Card(10, Suite.PIQUE),
	         new Card(13, Suite.TREFLE)
	     ));

	     assertEquals(30, evaluator.evaluate(hand));
	 }
	 

}
