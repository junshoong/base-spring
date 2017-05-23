package net.junshoong.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.junshoong.sample.dao.ItemDao;
import net.junshoong.sample.domain.ItemDetails;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	@Override
	public List<ItemDetails> getItems() {
		return itemDao.getItems();
	}

	@Override
	public void saveItem(ItemDetails itemDetails) {
		itemDao.saveItem(itemDetails);
	}

	@Override
	public void removeItem(int itemId) {
		itemDao.removeItem(itemId);
	}

	@Override
	public ItemDetails getItem(int itemId) {
		return itemDao.getItem(itemId);
	}

	@Override
	public void editItem(ItemDetails itemDetails) {
		itemDao.editItem(itemDetails);
	}
}
