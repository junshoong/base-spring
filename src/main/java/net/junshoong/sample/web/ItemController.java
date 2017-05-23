package net.junshoong.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.junshoong.sample.domain.ItemDetails;
import net.junshoong.sample.service.ItemService;

@Controller
@RequestMapping("/todo")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/value", method = RequestMethod.GET)
	public ModelAndView listItems() {
		Map<String, List<ItemDetails>> modelData = new HashMap<String, List<ItemDetails>>();
		modelData.put("itemList", itemService.getItems());
		return new ModelAndView("itemList", modelData);
	}
	

}
