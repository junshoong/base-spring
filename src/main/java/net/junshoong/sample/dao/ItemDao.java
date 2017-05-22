package net.junshoong.sample.dao;

import java.util.List;

import net.junshoong.sample.domain.ItemDetails;

public interface ItemDao {
	List<ItemDetails> getItems();
	
	void saveItem(ItemDetails itemDetails);
	
	void removeItem(int itemId);
	
	ItemDetails getItem(int itemId);
	
	void editItem(ItemDetails itemDetails);
}
