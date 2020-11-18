package com.laptrinhjavaweb.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.NewRepository;

public class NewServiceImpl implements NewService  {

	@Autowired
	private NewRepository newRepository;
	
	@Override
	public NewDTO getNew(Long id) {
		NewEntity newEntity = newRepository.findById(id);
		NewDTO newDTO = new NewDTO();
		newDTO.setId(newEntity.getId());
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setContent(newEntity.getContent());
		return newDTO;
	}
}
