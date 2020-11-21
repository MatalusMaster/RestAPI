package com.laptrinhjavaweb.service;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
@Service
public class ConvertServiceImpl implements ConvertService {

	@Override
	public NewDTO convertToDTO(NewEntity newEntity) {
		NewDTO newDTO = new NewDTO();
		newDTO.setId(newEntity.getId());
		newDTO.setTitle(newEntity.getTitle());
		newDTO.setContent(newEntity.getContent());
		return newDTO;
	}

	@Override
	public NewEntity convertToEntity(NewDTO newDTO) {
		NewEntity newEntity = new NewEntity();
		newEntity.setId(newDTO.getId());
		newEntity.setTitle(newDTO.getTitle());
		newEntity.setContent(newDTO.getContent());
		return newEntity;
	}
	
	
	
}
