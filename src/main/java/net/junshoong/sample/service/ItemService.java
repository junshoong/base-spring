package net.junshoong.sample.service;

import net.junshoong.sample.domain.Item;
import net.junshoong.sample.mapper.ItemMapper;

public class ItemService {
	
	private ItemMapper itemMapper;

	public void setItemMapper(ItemMapper itemMapper) {
		this.itemMapper = itemMapper;
	}
	
	public Item getItemMapper(String itemId) {
		return itemMapper.getItem(itemId);
	}
	
	
}
