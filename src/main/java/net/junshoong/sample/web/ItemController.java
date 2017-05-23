package net.junshoong.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.junshoong.sample.domain.ItemDetails;
import net.junshoong.sample.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listItems() {
		Map<String, List<ItemDetails>> modelData = new HashMap<String, List<ItemDetails>>();
		modelData.put("itemList", itemService.getItems());
		return new ModelAndView("itemList", modelData);
	}
	
	@RequestMapping(params = "itemAction=create", method = RequestMethod.POST)
	public ModelAndView createItem(@RequestParam Map<String, String> params) {
		String content = params.get("content");
		String level = params.get("level");
		
		Map<String, Object> errorData = new HashMap<String, Object>();
		
		if (content == null) {
			errorData.put("error.content", "enter a String");
		}
		if (level == null) {
			errorData.put("error.content", "enter a String");
		}
		
		ItemDetails itemDetails = new ItemDetails();
		itemDetails.setContent(content);
		itemDetails.setLevel(level);
		
		if (errorData.size() > 0) {
			errorData.put("itemDetail", itemDetails);
			return new ModelAndView("itemList", errorData);
		} else {
			itemService.saveItem(itemDetails);
			return new ModelAndView("redirect:/item/list");
		}
		

	}


}
