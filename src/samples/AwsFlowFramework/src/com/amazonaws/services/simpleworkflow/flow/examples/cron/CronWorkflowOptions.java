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
package com.amazonaws.services.simpleworkflow.flow.examples.cron;

import com.amazonaws.services.simpleworkflow.model.ActivityType;

/**
 * See {@link ExponentialRetryPolicy} for description of retry related
 * properties.
 * 
 * @author fateev
 */
public class CronWorkflowOptions {

    private ActivityType activity;

    private Object[] activityArguments;

    private String cronExpression;

    private String timeZone;
    
    private int continueAsNewAfterSeconds;

    public ActivityType getActivity() {
        return activity;
    }

    public void setActivity(ActivityType activity) {
        this.activity = activity;
    }

    public Object[] getActivityArguments() {
        return activityArguments;
    }

    public void setActivityArguments(Object[] activityArguments) {
        this.activityArguments = activityArguments;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getContinueAsNewAfterSeconds() {
        return continueAsNewAfterSeconds;
    }

    public void setContinueAsNewAfterSeconds(int continueAsNewAfterSeconds) {
        this.continueAsNewAfterSeconds = continueAsNewAfterSeconds;
    }

}
