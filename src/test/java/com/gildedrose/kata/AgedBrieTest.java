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
public class AgedBrieTest {

	/**
	 * Test method for
	 * {@link com.gildedrose.kata.strategy.AgedBrie#updateQuality(com.gildedrose.kata.Item)}.
	 */
	ItemStrategy agedBrie = ItemFactory.getFactory(Constants.AGED_BRIE);

	@Test
	public void increaseAgieBrieQuality() {
		Item item = new Item(Constants.AGED_BRIE, 8, 2);
		agedBrie.updateQuality(item);
		// check if the Aged Brie's quality has increased
		assertThat(item.getQuality(), is(3));
		// check if the Aged Brie's sellIn has decreased
		assertThat(item.getSellIn(), is(7));
	}

	/**
	 * never increase Agie Brie's quality (Quality of an item is never more than
	 * 50)
	 */
	@Test
	public void neverIncreaseAgieBrieQuality() {
		Item item = new Item(Constants.AGED_BRIE, 0, 50);
		agedBrie.updateQuality(item);
		assertThat(item.getQuality(), is(50));

	}

}
