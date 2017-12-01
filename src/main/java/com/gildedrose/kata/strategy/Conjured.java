/**
 * 
 */
package com.gildedrose.kata.strategy;

import com.gildedrose.kata.Item;

/**
 * @author samirsoft
 *
 */
public class Conjured implements ItemStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gildedrose.kata.strategy.ItemStrategy#updateQuality()
	 */
	public void updateQuality(Item item) {
		if (item.getQuality() < MAX_QUALITY) {
			item.setQuality(item.getQuality() > 0 ? item.getQuality() - DEFAULT_QUALITY_DROP * 2 : item.getQuality());
		}
		item.decreaseSellIn();

	}

}
