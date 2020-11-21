package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

public interface ConvertService {
	public NewDTO convertToDTO(NewEntity newEntity);
	public NewEntity convertToEntity(NewDTO newDTO);
}
