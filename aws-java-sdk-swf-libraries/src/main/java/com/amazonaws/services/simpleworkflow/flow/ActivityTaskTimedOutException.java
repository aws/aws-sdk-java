/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.model.ActivityTaskTimeoutType;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

/**
 * Exception that indicates Activity time out.
 */
@SuppressWarnings("serial")
public class ActivityTaskTimedOutException extends ActivityTaskException {

    private ActivityTaskTimeoutType timeoutType;

    private String details;

    public ActivityTaskTimedOutException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActivityTaskTimedOutException(String message) {
        super(message);
    }

    public ActivityTaskTimedOutException(long eventId, ActivityType activityType, String activityId, String timeoutType,
            String details) {
        super(timeoutType, eventId, activityType, activityId);
        this.timeoutType = ActivityTaskTimeoutType.fromValue(timeoutType);
        this.details = details;
    }

    public ActivityTaskTimeoutType getTimeoutType() {
        return timeoutType;
    }

    public void setTimeoutType(ActivityTaskTimeoutType timeoutType) {
        this.timeoutType = timeoutType;
    }

    /**
     * @return The value from the last activity heartbeat details field.
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}
