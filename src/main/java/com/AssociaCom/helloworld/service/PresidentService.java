package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.mapper.PresidentMapper;
import com.AssociaCom.helloworld.dao.repository.PresidentRepository;
import com.AssociaCom.helloworld.model.President;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class PresidentService {

	private PresidentRepository repository;
	private PresidentMapper presidentMapper;
	private static final Logger LOGGER = LogManager.getLogger(PresidentService.class);

	public Optional<President> find(President president) {
		return repository.findByFirstName(president.getFirstName()).map(presidentMapper::mapTo);
	}

	public boolean isRegistered(President president) {
		return  repository.findByFirstName(president.getFirstName()).isPresent();
	}

	public boolean create(President president) {
		try {
			repository.save(presidentMapper.mapTo(president));
			return true;
		}
		catch (Exception exception) {
			LOGGER.error(exception.getMessage());
			return false;
		}
	}
	
}
