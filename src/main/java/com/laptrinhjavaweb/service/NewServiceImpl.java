package com.laptrinhjavaweb.service;

import static java.util.logging.Logger.getLogger;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.NewRepository;

@Service
public class NewServiceImpl implements NewService {

	String name;

	private static Logger logger = Logger.getGlobal();

	@Autowired
	private NewRepository newRepository;

	@Autowired
	private ConvertService convertService;

	@Override
	public NewDTO getNew(Long id) {
		NewEntity newEntity = newRepository.findById(id);
		if (newEntity == null) {
			logger.info("newEntity is empty");
			return null;
		} else {
			NewDTO newDTO = convertService.convertToDTO(newEntity);
			return newDTO;
		}
	}

}
