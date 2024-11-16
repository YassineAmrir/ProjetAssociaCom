package com.AssociaCom.helloworld.service;

import com.AssociaCom.helloworld.dao.mapper.ActivityMapper;
import com.AssociaCom.helloworld.dao.repository.ActivityRepository;
import com.AssociaCom.helloworld.model.Activity;
import com.AssociaCom.helloworld.model.Association;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ActivityService {
    @Autowired
    ActivityRepository activityRepository;
    @Autowired
    ActivityMapper activityMapper;
    public void createActivity(Activity activity)
    {
         activityRepository.save(activityMapper.mapTo(activity));
    }
    public List<Activity> activityofAssociation(Association association)
    {
        return activityRepository.findByAssociation(association.getName()).stream().map(activityMapper::mapTo).collect(Collectors.toList());

    }
}
