package com.laptrinhjavaweb.service;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.NewDTO;

@Service
public interface NewService {
	public NewDTO getNew(Long id);
}
