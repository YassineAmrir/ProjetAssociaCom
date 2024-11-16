package com.AssociaCom.helloworld.controller;

import com.AssociaCom.helloworld.model.AssociationRequest;
import com.AssociaCom.helloworld.service.AssociationRequestService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Configuration
@RequestMapping("/api/association")
public class AssociationRequestController {

    private final AssociationRequestService associationRequestService;

    @PostMapping(value="/request")
    public Boolean createRequest(@RequestBody AssociationRequest associationRequest)
    {
        return associationRequestService.createRequest(associationRequest);
    }

    @PostMapping(value="/requestAccepted")
    public Boolean acceptRequest(@RequestParam("request_Id") String request_Id)
    {
       return associationRequestService.acceptRequest(request_Id);
    }
    @PostMapping(value = "/requestRefused")
    public boolean refuseRequest(@RequestParam("request_Id") String request_Id)
    {
        return associationRequestService.requestRefused(request_Id);
    }
}
