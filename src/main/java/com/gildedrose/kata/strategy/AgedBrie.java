/**
 * 
 */
package com.gildedrose.kata.strategy;

import com.gildedrose.kata.Item;

/**
 * @author samirsoft
 *
 */
public class AgedBrie implements ItemStrategy {

	public void updateQuality(Item item) {
		item.increaseQuality();
		item.decreaseSellIn();

	}

}
