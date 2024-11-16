package com.AssociaCom.helloworld.controller;

import com.AssociaCom.helloworld.model.Association;
import com.AssociaCom.helloworld.service.AssociationService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@Configuration
@RestController
@RequestMapping("api/association")
@AllArgsConstructor
public class AssociationController {
    private final AssociationService associationService;

    @PostMapping(value = "/create")
    public boolean create(@RequestBody Association association) {

        return associationService.create(association);
    }

    @PostMapping (value = "/home")
    public Optional<Association> home(@RequestBody String email)
    {
        return associationService.informationAssociation(email);
    }

   /* @PostMapping(value = "/retrieve")
    public boolean retrieveAllAssociations() {
        return null;
    }

    */
}
