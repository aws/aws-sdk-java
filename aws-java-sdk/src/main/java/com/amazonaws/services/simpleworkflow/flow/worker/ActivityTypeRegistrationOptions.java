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
package com.amazonaws.services.simpleworkflow.flow.worker;

public class ActivityTypeRegistrationOptions {
	
	private String defaultTaskList;
	
	private String description;
	
	private Long defaultTaskHeartbeatTimeoutSeconds;
	
	private Long defaultTaskScheduleToCloseTimeoutSeconds;
	
    private Long defaultTaskScheduleToStartTimeoutSeconds;
    
	private Long defaultTaskStartToCloseTimeoutSeconds;
	
	public String getDefaultTaskList() {
        return defaultTaskList;
    }
    
    public void setDefaultTaskList(String defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
	
    public Long getDefaultTaskHeartbeatTimeoutSeconds() {
        return defaultTaskHeartbeatTimeoutSeconds;
    }

    public void setDefaultTaskHeartbeatTimeoutSeconds(Long defaultTaskHeartbeatTimeoutSeconds) {
        this.defaultTaskHeartbeatTimeoutSeconds = defaultTaskHeartbeatTimeoutSeconds;
    }
    
    public Long getDefaultTaskScheduleToCloseTimeoutSeconds() {
        return defaultTaskScheduleToCloseTimeoutSeconds;
    }
    
    public void setDefaultTaskScheduleToCloseTimeoutSeconds(Long defaultTaskScheduleToCloseTimeoutSeconds) {
        this.defaultTaskScheduleToCloseTimeoutSeconds = defaultTaskScheduleToCloseTimeoutSeconds;
    }
    
    public Long getDefaultTaskScheduleToStartTimeoutSeconds() {
        return defaultTaskScheduleToStartTimeoutSeconds;
    }

    public void setDefaultTaskScheduleToStartTimeoutSeconds(Long defaultTaskScheduleToStartTimeoutSeconds) {
        this.defaultTaskScheduleToStartTimeoutSeconds = defaultTaskScheduleToStartTimeoutSeconds;
    }
    
    public Long getDefaultTaskStartToCloseTimeoutSeconds() {
        return defaultTaskStartToCloseTimeoutSeconds;
    }

    public void setDefaultTaskStartToCloseTimeoutSeconds(Long defaultTaskStartToCloseTimeoutSeconds) {
        this.defaultTaskStartToCloseTimeoutSeconds = defaultTaskStartToCloseTimeoutSeconds;
    }
    
    @Override
    public String toString() {
        return "ActivityTypeRegistrationOptions [defaultTaskList=" + ((defaultTaskList != null) ? defaultTaskList.toString() : "null") 
        + ", description=" + description
        + ", defaultTaskHeartbeatTimeoutSeconds=" + defaultTaskHeartbeatTimeoutSeconds
        + ", defaultTaskScheduleToCloseTimeoutSeconds=" + defaultTaskScheduleToCloseTimeoutSeconds
        + ", defaultTaskScheduleToStartTimeoutSeconds=" + defaultTaskScheduleToStartTimeoutSeconds
        + ", defaultTaskStartToCloseTimeoutSeconds=" + defaultTaskStartToCloseTimeoutSeconds
        + "]";
    }

}
