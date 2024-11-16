package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.repository.SingInRepository;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class SingInService {

	private static final Logger LOGGER = LogManager.getLogger(AssociationService.class);

	private SingInMapper singInMapper;
	private SingInRepository singInRepository;
	
	public boolean singIn(SingIn singIn)
	{
		try {
			singInRepository.findByEmailAndPassword(singIn.getEmail(), singIn.getPassword()).map(singInMapper::mapTo);
	        return true;
		}
		catch (Exception exception){
			LOGGER.error(exception.getMessage());
			return false;
		}
	}
	
}