package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.mapper.AssociationMapper;
import com.AssociaCom.helloworld.dao.repository.AssociationRepository;
import com.AssociaCom.helloworld.model.Association;
import com.AssociaCom.helloworld.model.State;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class AssociationService {

    private static final Logger LOGGER = LogManager.getLogger(AssociationService.class);
    private final AssociationRepository repository;
    private final AssociationMapper associationMapper;

    public boolean create(Association association) {
        try {
            association.setState(State.WAITING);
            repository.save(associationMapper.mapTo(association));
            return true;
        }
        catch (Exception exception) {
            LOGGER.error(exception.getMessage());
            return false;
        }
    }

    public Optional<Association> informationAssociation(String email)
    {
        return repository.findByEmail(email).map(associationMapper::mapTo);
    }


    /*
    public Optional changerEmail(Authentication authentication, String NewEmail)
    {
      if(authenticationService.singIn(authentication).isPresent())
         {
             return associationRepository.updateEmail(NewEmail,authentication.getEmail());
          }
      else
      {
          return null;
      }
    }
     */
   // public List<Association> viewAllAssociations(){
      /*  return associationRepository.findAll().stream().map(associationEntity -> associationMapper.mapTo(associationEntity));*/
       // return associationRepository.findAll().stream().map(associationMapper::mapTo).collect(Collectors.toList());
   // }
   /*
    public List<Association> viewAllAssociationsValid() {
        /*  return associationRepository.findAll().stream().map(associationEntity -> associationMapper.mapTo(associationEntity));
        return associationRepository.findByState("Accepted").stream().map(associationMapper::mapTo).collect(Collectors.toList());
    }
    */
        /*
    public List<Association> viewAllAssociationsNonValid(){
        // return associationRepository.findAll().stream().map(associationEntity -> associationMapper.mapTo(associationEntity));
        return associationRepository.findByState("Refused").stream().map(associationMapper::mapTo).collect(Collectors.toList());
    }
    */
    /*
    public void updateState(Association association)
    {
       // if(decision == refuse ){
            // call update with status = refused
       // }
      //  else{
            // call update with status = accepted
        //}
        //associationRepository.delete(associationMapper.mapTo(association));
   //   associationRepository.deleteByFunctionalId(associationMapper.mapTo(association).getName());
    }
}
*/
}
