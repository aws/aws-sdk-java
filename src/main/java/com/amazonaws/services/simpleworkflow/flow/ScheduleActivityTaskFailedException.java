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

import com.amazonaws.services.simpleworkflow.model.ActivityType;
import com.amazonaws.services.simpleworkflow.model.ScheduleActivityTaskFailedCause;

/**
 * Exception used to communicate that activity wasn't scheduled due to some
 * cause
 */
@SuppressWarnings("serial")
public class ScheduleActivityTaskFailedException extends ActivityTaskException {

    private ScheduleActivityTaskFailedCause failureCause;

    public ScheduleActivityTaskFailedException(String message) {
        super(message);
    }
    
    public ScheduleActivityTaskFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScheduleActivityTaskFailedException(long eventId, ActivityType activityType, String activityId, String cause) {
        super(cause, eventId, activityType, activityId);
        failureCause = ScheduleActivityTaskFailedCause.fromValue(cause);
    }

    /**
     * @return enumeration that contains the cause of the failure
     */
    public ScheduleActivityTaskFailedCause getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(ScheduleActivityTaskFailedCause failureCause) {
        this.failureCause = failureCause;
    }
}
