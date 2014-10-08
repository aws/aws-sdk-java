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


public class ActivitySchedulingOptions {
    
    private Long heartbeatTimeoutSeconds;
    
    private Long scheduleToCloseTimeoutSeconds;
    
    private Long scheduleToStartTimeoutSeconds;
	
    private Long startToCloseTimeoutSeconds;
	
    private String taskList;
	
	public Long getHeartbeatTimeoutSeconds() {
        return heartbeatTimeoutSeconds;
    }

    public void setHeartbeatTimeoutSeconds(Long heartbeatTimeoutSeconds) {
        this.heartbeatTimeoutSeconds = heartbeatTimeoutSeconds;
    }
    
    public ActivitySchedulingOptions withHeartbeatTimeoutSeconds(Long heartbeatTimeoutSeconds) {
        this.heartbeatTimeoutSeconds = heartbeatTimeoutSeconds;
        return this;
    }
	
	public Long getScheduleToCloseTimeoutSeconds() {
		return scheduleToCloseTimeoutSeconds;
	}
	
	public void setScheduleToCloseTimeoutSeconds(Long scheduleToCloseTimeoutSeconds) {
		this.scheduleToCloseTimeoutSeconds = scheduleToCloseTimeoutSeconds;
	}
	
	public ActivitySchedulingOptions withScheduleToCloseTimeoutSeconds(Long scheduleToCloseTimeoutSeconds) {
		this.scheduleToCloseTimeoutSeconds = scheduleToCloseTimeoutSeconds;
		return this;
	}
	
	public Long getScheduleToStartTimeoutSeconds() {
		return scheduleToStartTimeoutSeconds;
	}
	
	public void setScheduleToStartTimeoutSeconds(Long scheduleToStartTimeoutSeconds) {
		this.scheduleToStartTimeoutSeconds = scheduleToStartTimeoutSeconds;
	}
	
	public ActivitySchedulingOptions withScheduleToStartTimeoutSeconds(Long scheduleToStartTimeoutSeconds) {
		this.scheduleToStartTimeoutSeconds = scheduleToStartTimeoutSeconds;
		return this;
	}
	
	public Long getStartToCloseTimeoutSeconds() {
        return startToCloseTimeoutSeconds;
    }

    public void setStartToCloseTimeoutSeconds(Long startToCloseTimeoutSeconds) {
        this.startToCloseTimeoutSeconds = startToCloseTimeoutSeconds;
    }
    
    public ActivitySchedulingOptions withStartToCloseTimeoutSeconds(Long startToCloseTimeoutSeconds) {
        this.startToCloseTimeoutSeconds = startToCloseTimeoutSeconds;
        return this;
    }
	
	public String getTaskList() {
		return taskList;
	}
	
	public void setTaskList(String taskList) {
		this.taskList = taskList;
	}
	
	public ActivitySchedulingOptions withTaskList(String taskList) {
		this.taskList = taskList;
		return this;
	}
}
