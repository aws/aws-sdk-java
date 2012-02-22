/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.model.ActivityType;


/**
 * Exception used to communicate failure of remote activity.
 */
@SuppressWarnings("serial")
public abstract class ActivityTaskException extends DecisionException {
    
    private ActivityType activityType;

    private String activityId;
    
    public ActivityTaskException(String message) {
        super(message);
    }
    
    public ActivityTaskException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ActivityTaskException(String message, long eventId, ActivityType activityType, String activityId) {
        super(message + " for activityId=\"" + activityId + "\" of activityType=" + activityType, eventId);
        this.activityType = activityType;
        this.activityId = activityId;
    }
    
    public ActivityType getActivityType() {
        return activityType;
    }
    
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    public String getActivityId() {
        return activityId;
    }
    
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
}
