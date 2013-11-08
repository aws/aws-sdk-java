/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon CloudWatch.
 */
public enum CloudWatchActions implements Action {
    /** Represents any action executed on Amazon CloudWatch. */
    AllCloudWatchActions("CloudWatch:*"),

    /** Action for the DeleteAlarms operation. */
    DeleteAlarms("CloudWatch:DeleteAlarms"),

    /** Action for the DescribeAlarmHistory operation. */
    DescribeAlarmHistory("CloudWatch:DescribeAlarmHistory"),

    /** Action for the DescribeAlarms operation. */
    DescribeAlarms("CloudWatch:DescribeAlarms"),

    /** Action for the DescribeAlarmsForMetric operation. */
    DescribeAlarmsForMetric("CloudWatch:DescribeAlarmsForMetric"),

    /** Action for the DisableAlarmActions operation. */
    DisableAlarmActions("CloudWatch:DisableAlarmActions"),

    /** Action for the EnableAlarmActions operation. */
    EnableAlarmActions("CloudWatch:EnableAlarmActions"),

    /** Action for the GetMetricStatistics operation. */
    GetMetricStatistics("CloudWatch:GetMetricStatistics"),

    /** Action for the ListMetrics operation. */
    ListMetrics("CloudWatch:ListMetrics"),

    /** Action for the PutMetricAlarm operation. */
    PutMetricAlarm("CloudWatch:PutMetricAlarm"),

    /** Action for the PutMetricData operation. */
    PutMetricData("CloudWatch:PutMetricData"),

    /** Action for the SetAlarmState operation. */
    SetAlarmState("CloudWatch:SetAlarmState");

    private final String action;

    private CloudWatchActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
