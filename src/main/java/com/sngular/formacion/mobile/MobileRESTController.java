package com.sngular.formacion.mobile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sngular.formacion.mobile.dto.Mobile;

@Controller
@RequestMapping("v1/mobile")
public class MobileRESTController {

	@ResponseBody
	@RequestMapping(method=RequestMethod.POST)
	public Mobile create(@RequestBody Mobile mobile) {
		
		return mobile.setId(1L);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	@ResponseBody
	public Mobile get(@PathVariable Long id) {
		
		return new Mobile()
					.setId(id)
					.setName("Samsung Galaxy S7")
					.setDesc("Super cool mobile")
					.setPrice(750.0);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public List<Mobile> getAll() {
		
		List<Mobile> list = new ArrayList<Mobile>();
		list.add(new Mobile()
				.setId(1L)
				.setName("Samsung Galaxy S7")
				.setDesc("Super cool mobile")
				.setPrice(750.0));
		
		list.add(new Mobile()
				.setId(2L)
				.setName("Samsung Galaxy S6")
				.setDesc("not so super cool mobile")
				.setPrice(750.0));
		
		return list;
	}
}
