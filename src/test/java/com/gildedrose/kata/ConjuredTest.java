/**
 * 
 */
package com.gildedrose.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.gildedrose.kata.strategy.ItemStrategy;
import com.gildedrose.kata.util.Constants;

/**
 * @author samirsoft
 *
 */
public class ConjuredTest {
	ItemStrategy conjured = ItemFactory.getFactory(Constants.CONJURED);

	 
	/**
	 * Decrease Quality By Two For All Conjured Items
	 */
	@Test
	public void DecreaseQualityByTwo() {
		Item item = new Item(Constants.CONJURED, 3, 6);
		conjured.updateQuality(item);
		assertThat(item.getQuality(), is(4));
	}

	@Test
	public void NeverSetQualityForLessThanZero() {
		Item item = new Item(Constants.CONJURED, 4, 0);
		conjured.updateQuality(item);
		assertThat(item.getQuality(), is(0));
	}

}
