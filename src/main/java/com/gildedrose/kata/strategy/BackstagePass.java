/**
 * 
 */
package com.gildedrose.kata.strategy;

import com.gildedrose.kata.Item;

/**
 * @author samirsoft
 *
 */
public class BackstagePass implements ItemStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gildedrose.kata.strategy.ItemStrategy#updateQuality()
	 */
	public void updateQuality(Item item) {
		if (item.getQuality() < MAX_QUALITY) {
			item.setQuality(item.getSellIn() > 0 ? getQualityValue(item) : 0);
		}
		item.decreaseSellIn();

	}

	private int getQualityValue(Item item) {
		if (item.getSellIn() > 5 && item.getSellIn() < 11) {
			return DEFAULT_QUALITY_DROP * 2 + item.getQuality();
		} else if (item.getSellIn() <= 5) {
			return item.getQuality() + DEFAULT_QUALITY_DROP * 3;
		}
		return DEFAULT_QUALITY_DROP + item.getQuality();
	}

}
