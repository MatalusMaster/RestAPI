package com.laptrinhjavaweb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.laptrinhjavaweb.dto.NewDTO;

@Controller
public class NewAPI {
	NewDTO sang = new NewDTO();

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	@ResponseBody
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.PUT)
	@ResponseBody
	public NewDTO updateNew(@RequestBody NewDTO model) {
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	@ResponseBody
	public NewDTO createGet(@RequestBody NewDTO model) {

		sang.setId(12);
		sang.setTitle("Sang");
		sang.setContent("SangHo");

		return sang;
	}

	@RequestMapping(value = "/new", method = RequestMethod.DELETE)
   @ResponseBody
   public NewDTO createDelete(@RequestBody NewDTO model) {
	   sang.setId(0);
	   return sang;
   }
}