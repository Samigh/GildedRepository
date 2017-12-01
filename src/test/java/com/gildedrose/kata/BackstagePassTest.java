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
public class BackstagePassTest {

	ItemStrategy backStage = ItemFactory.getFactory(Constants.BACKSTAGE_PASSES);

	/**
	 * Test method for
	 * {@link com.backStage.kata.strategy.BackstagePass#updateQuality(com.backStage.kata.Item)}.
	 */

	/**
	 * increase the backStage quality
	 */
	@Test
	public void increaseBackstagePassQuality() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 20, 15);
		backStage.updateQuality(item);
		assertThat(item.getQuality(), is(16));
	}

	/**
	 * increase the backStage quality by two when there are 10 days or less
	 */
	@Test
	public void increaseBackstagePassQualityByTwo() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 10, 15);
		backStage.updateQuality(item);
		assertThat(item.getQuality(), is(17));
	}

	/**
	 * increase the backStage quality by three when there are 5 days or less
	 */
	@Test
	public void increaseBackstagePassQualityByThree() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 5, 15);
		backStage.updateQuality(item);
		assertThat(item.getQuality(), is(18));
	}

	/**
	 * set the backstage's quality to Zero when sellIn < 0
	 */
	@Test
	public void setBackstagePassQualityToZero() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 0, 15);
		backStage.updateQuality(item);
		assertThat(item.getQuality(), is(0));
	}

	@Test
	public void neverIncreaseBackstagePassQuality() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 5, 50);
		backStage.updateQuality(item);
		assertThat(item.getQuality(), is(50));
	}

}
