package com.gildedrose

interface ItemUpdater {
    fun update(item: Item)
}

class AgedBrieUpdater : ItemUpdater {
    override fun update(item: Item) {
        if (item.quality < 50) item.quality++
        item.sellIn--
        if (item.sellIn < 0 && item.quality < 50) item.quality++
    }
}

class BackstagePassUpdater : ItemUpdater {
    override fun update(item: Item) {
        if (item.quality < 50) item.quality++
        if (item.sellIn < 11 && item.quality < 50) item.quality++
        if (item.sellIn < 6 && item.quality < 50) item.quality++
        item.sellIn--
        if (item.sellIn < 0) item.quality = 0
    }
}

class SulfurasUpdater : ItemUpdater {
    override fun update(item: Item) {
        // Legendary item, does not change
    }
}

class DefaultUpdater : ItemUpdater {
    override fun update(item: Item) {
        if (item.quality > 0) item.quality--
        item.sellIn--
        if (item.sellIn < 0 && item.quality > 0) item.quality--
    }
}

class GildedRose(val items: List<Item>) {
    private val updaters = mapOf(
        "Aged Brie" to AgedBrieUpdater(),
        "Backstage passes to a TAFKAL80ETC concert" to BackstagePassUpdater(),
        "Sulfuras, Hand of Ragnaros" to SulfurasUpdater()
    )
    private val defaultUpdater = DefaultUpdater()

    fun updateQuality() {
        for (item in items) {
            val updater = updaters[item.name] ?: defaultUpdater
            updater.update(item)
        }
    }
}

