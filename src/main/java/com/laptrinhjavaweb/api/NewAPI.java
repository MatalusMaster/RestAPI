package com.laptrinhjavaweb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.laptrinhjavaweb.dto.NewDTO;

@Controller
public class NewAPI {
	@RequestMapping(value = "/news", method = RequestMethod.POST)
	@ResponseBody
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}

	@RequestMapping(value = "/news", method = RequestMethod.PUT)
	@ResponseBody
	public NewDTO updateNew(@RequestBody NewDTO model) {
		return model;
	}

	@GetMapping("/news")
	@ResponseBody
	public String createGet(@RequestParam int id) {
		return "ID:" + id;
	}
	
	@GetMapping("/news/keyword={keyword}&page={pagenumber}")
	@ResponseBody
	public String createGetMulti(@PathVariable(name = "keyword") String keyword,@PathVariable(name = "pagenumber") int pagenumber ) {
		return "keyword:" + keyword + " pagenumber: " + pagenumber;
	}

	@RequestMapping(value = "/news", method = RequestMethod.DELETE)
   @ResponseBody
   public String createDelete(@RequestParam int id) {
	   return "ID:" + id;
   }
}