/**
 * 
 */
package com.gildedrose.kata;

import com.gildedrose.kata.strategy.ItemStrategy;
import com.gildedrose.kata.util.Constants;

/**
 * @author samirsoft
 *
 */
public class GildedRose {

	public GildedRose() {
	}

	public void updateQuality(Item item) {
		ItemStrategy itemStrategy = ItemFactory.getFactory(item.getName());
		itemStrategy.updateQuality(item);
	}

}