/**
 * 
 */
package com.gildedrose.kata;

/**
 * @author samirsoft
 *
 */
public class Item {
	private String name;

	private int sellIn;

	private int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public void increaseQuality() {
		if (this.getQuality() < 50) {
			this.setQuality(this.getQuality() + 1);
		}
	}

	public void decreaseSellIn() {
		setSellIn(getSellIn() - 1);
	}

	@Override
	public String toString() {
		return this.name + ", " + this.sellIn + ", " + this.quality;
	}
}
