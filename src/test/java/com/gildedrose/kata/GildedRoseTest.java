/**
 * 
 */
package com.gildedrose.kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.gildedrose.kata.util.Constants;

/**
 * @author samirsoft
 *
 */
public class GildedRoseTest {

	/**
	 * Test method for {@link com.gildedrose.kata.GildedRose#updateQuality()}.
	 */
	GildedRose gildedRose = new GildedRose();

	@Test
	public void increaseAgieBrieQuality() {
		Item item = new Item(Constants.AGED_BRIE, 2, 0);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(3));
	}

	/**
	 * never increase Agie Brie's quality (Quality of an item is never more than
	 * 50)
	 */
	@Test
	public void neverIncreaseAgieBrieQuality() {
		Item item = new Item(Constants.AGED_BRIE, 50, 0);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(50));
	}

	/**
	 * increase the backStage quality
	 */
	@Test
	public void increaseBackstagePassQuality() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 15, 20);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(16));
	}

	/**
	 * increase the backStage quality by two when there are 10 days or less
	 */
	@Test
	public void increaseBackstagePassQualityByTwo() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 15, 10);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(17));
	}

	/**
	 * increase the backStage quality by three when there are 5 days or less
	 */
	@Test
	public void increaseBackstagePassQualityByThree() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 15, 5);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(18));
	}

	/**
	 * set the backstage's quality to Zero when sellIn < 0
	 */
	@Test
	public void setBackstagePassQualityToZero() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 15, 0);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(0));
	}

	@Test
	public void neverIncreaseBackstagePassQuality() {
		Item item = new Item(Constants.BACKSTAGE_PASSES, 50, 5);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(50));
	}

	/**
	 * never Decrease Quality By Two For All Sulfaras Items
	 */
	@Test
	public void neverChangeSulfurasQuality() {
		Item item = new Item(Constants.SULFARAS, 12, 80);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(12));
	}

	/**
	 * Decrease Quality By Two For All Conjured Items
	 */
	@Test
	public void DecreaseQualityByTwo() {
		Item item = new Item(Constants.CONJURED, 12, 80);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(12));
	}

	@Test
	public void NeverSetQualityForLessThanZero() {
		Item item = new Item(Constants.CONJURED, 0, 4);
		gildedRose.updateQuality(item);
		assertThat(item.getQuality(), is(0));
	}

}
