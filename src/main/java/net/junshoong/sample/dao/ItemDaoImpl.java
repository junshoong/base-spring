package net.junshoong.sample.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import net.junshoong.sample.domain.ItemDetails;

@Repository
public class ItemDaoImpl implements ItemDao {
	private List<ItemDetails> itemList;
	
	public ItemDaoImpl() {
		itemList = new ArrayList<ItemDetails>();
		itemList.add(new ItemDetails(1, "테스트 할일 1", "Hard"));
		itemList.add(new ItemDetails(2, "Test To Do Item 2", "Middle"));
		itemList.add(new ItemDetails(1, "테스트 To Do 3", "Easy"));
	}

	@Override
	public List<ItemDetails> getItems() {
		return itemList;
	}

	@Override
	public void saveItem(ItemDetails itemDetails) {
		Random random = new Random();
		long id = random.nextInt();
		itemDetails.setId(id);
		itemList.add(itemDetails);
	}

	@Override
	public void removeItem(int itemId) {
		for (ItemDetails itemDetails: itemList) {
			if (itemDetails.getId() == itemId) {
				itemList.remove(itemDetails);
				break;
			}
		}
		
	}

	@Override
	public ItemDetails getItem(int itemId) {
		ItemDetails matchingItemDetails = null;
		for (ItemDetails itemDetails: itemList) {
			if (itemDetails.getId() == itemId) {
				matchingItemDetails = itemDetails;
				break;
			}
		}
		return matchingItemDetails;
	}

	@Override
	public void editItem(ItemDetails modifiedItemDetails) {
		for (ItemDetails itemDetails: itemList) {
			if (itemDetails.getId() == modifiedItemDetails.getId()) {
				itemList.remove(itemDetails);
				break;
			}
		}
		itemList.add(modifiedItemDetails);
	}
}
