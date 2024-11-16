package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.entity.ActivityEntity;
import com.AssociaCom.helloworld.dao.mapper.ActivityMapper;
import com.AssociaCom.helloworld.dao.repository.ActivityRepository;
import com.AssociaCom.helloworld.model.Activity;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ActivityService {
    private static final Logger LOGGER = LogManager.getLogger(ActivityService.class);
    @Autowired
    ActivityRepository activityRepository;
    @Autowired
    ActivityMapper activityMapper;

    public Boolean createActivity(Activity activity) {
        try {
            activityRepository.save(activityMapper.mapTo(activity));
            return true;
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage());
            return false;
        }
    }


    public List<Activity> activityofAssociation(String functional_Id) {
        Iterable<ActivityEntity> activityEntities=activityRepository.findByAssociationFunctionalId(functional_Id);
        List<Activity> activityList = new ArrayList<>();
        for(ActivityEntity activityEntity:activityEntities)
        {
            Activity activity=activityMapper.mapTo(activityEntity);
            activityList.add(activity);
        }
        return activityList;

    }


}


