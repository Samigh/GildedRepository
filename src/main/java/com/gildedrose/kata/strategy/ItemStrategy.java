package com.gildedrose.kata.strategy;

import com.gildedrose.kata.Item;

public interface ItemStrategy {
	int MAX_QUALITY = 50;
	int DEFAULT_QUALITY_VALUE = 1;
	int DEFAULT_QUALITY_DROP = 1;

	public void updateQuality(Item item);
}
