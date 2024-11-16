package com.AssociaCom.helloworld.dao.mapper;

import com.AssociaCom.helloworld.dao.entity.ActivityEntity;
import com.AssociaCom.helloworld.model.Activity;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {
    public Activity mapTo (ActivityEntity activityEntity)
    {
        return Activity.builder()
                .association(activityEntity.getAssociation())
                .place(activityEntity.getPlace())
                .date(activityEntity.getDate())
                .description(activityEntity.getDescription())
                .name(activityEntity.getName())
                .numberParticipants(activityEntity.getNumberParticipants())
                .responsible(activityEntity.getResponsible())
                .build();
    }
    public ActivityEntity mapTo (Activity activity)
    {
        return ActivityEntity.builder()
                .association(activity.getAssociation())
                .place(activity.getPlace())
                .date(activity.getDate())
                .description(activity.getDescription())
                .name(activity.getName())
                .numberParticipants(activity.getNumberParticipants())
                .responsible(activity.getResponsible())
                .build();
    }
}
