package com.AssociaCom.helloworld.controller;

import com.AssociaCom.helloworld.dao.entity.ActivityEntity;
import com.AssociaCom.helloworld.model.Activity;
import com.AssociaCom.helloworld.service.ActivityService;
import jakarta.persistence.PostRemove;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@Configuration
@RestController
@RequestMapping("api/association")
@AllArgsConstructor
public class ActivityController {
    private final ActivityService activityService;

    @PostMapping(value="/createActivity")
    public Boolean createActivity (@RequestBody Activity activity)
    {
        return activityService.createActivity(activity);
    }

}
