/**
 * 
 */
package com.gildedrose.kata;

import java.util.HashMap;
import java.util.Map;

import com.gildedrose.kata.strategy.AgedBrie;
import com.gildedrose.kata.strategy.BackstagePass;
import com.gildedrose.kata.strategy.Conjured;
import com.gildedrose.kata.strategy.ItemStrategy;
import com.gildedrose.kata.strategy.Sulfuras;
import com.gildedrose.kata.util.Constants;

/**
 * @author samirsoft
 *
 */
public class ItemFactory {

	static Map<String, ItemStrategy> strategyMap;
	static {
		if (strategyMap == null) {
			strategyMap = new HashMap<String, ItemStrategy>();
			strategyMap.put(Constants.AGED_BRIE, new AgedBrie());
			strategyMap.put(Constants.BACKSTAGE_PASSES, new BackstagePass());
			strategyMap.put(Constants.SULFARAS, new Sulfuras());
			strategyMap.put(Constants.CONJURED, new Conjured());
		}
	}

	public static ItemStrategy getFactory(String name) {
		return strategyMap.get(name);
	}
}
