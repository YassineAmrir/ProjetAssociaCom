package com.AssociaCom.helloworld.controller;

import com.AssociaCom.helloworld.model.Activity;
import com.AssociaCom.helloworld.model.Association;
import com.AssociaCom.helloworld.service.ActivityService;
import com.AssociaCom.helloworld.service.AssociationService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@Configuration
@RestController
@RequestMapping("api/association")
@AllArgsConstructor
public class AssociationController {
    private final AssociationService associationService;
    private final ActivityService activityService;

    @PostMapping(value = "/create")
    public boolean create(@RequestBody Association association) {

        System.out.println(association);
        return associationService.create(association);
    }

    @GetMapping (value = "/home")
    public Optional<Association> home(@RequestParam("functional_Id") String functional_Id)
    {
        return associationService.informationAssociation(functional_Id);
    }

    @GetMapping(value = "associations")
    public List<Association> getAllAssociation()
    {
        return associationService.getAll();
    }



    @GetMapping (value="/activities")
    public List<Activity> AllActivity (@RequestParam("functional_Id")String functional_Id)
    {
        return activityService.activityofAssociation(functional_Id) ;
    }



   /* @PostMapping(value = "/retrieve")
    public boolean retrieveAllAssociations() {
        return null;
    }

    */
}
