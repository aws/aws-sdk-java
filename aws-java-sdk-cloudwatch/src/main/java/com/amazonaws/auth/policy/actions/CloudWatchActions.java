/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for CloudWatch.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum CloudWatchActions implements Action {

    /** Represents any action executed on CloudWatch. */
    AllCloudWatchActions("cloudwatch:*"),

    /** Action for the DeleteAlarms operation. */
    DeleteAlarms("cloudwatch:DeleteAlarms"),
    /** Action for the DeleteDashboards operation. */
    DeleteDashboards("cloudwatch:DeleteDashboards"),
    /** Action for the DescribeAlarmHistory operation. */
    DescribeAlarmHistory("cloudwatch:DescribeAlarmHistory"),
    /** Action for the DescribeAlarms operation. */
    DescribeAlarms("cloudwatch:DescribeAlarms"),
    /** Action for the DescribeAlarmsForMetric operation. */
    DescribeAlarmsForMetric("cloudwatch:DescribeAlarmsForMetric"),
    /** Action for the DisableAlarmActions operation. */
    DisableAlarmActions("cloudwatch:DisableAlarmActions"),
    /** Action for the EnableAlarmActions operation. */
    EnableAlarmActions("cloudwatch:EnableAlarmActions"),
    /** Action for the GetDashboard operation. */
    GetDashboard("cloudwatch:GetDashboard"),
    /** Action for the GetMetricData operation. */
    GetMetricData("cloudwatch:GetMetricData"),
    /** Action for the GetMetricStatistics operation. */
    GetMetricStatistics("cloudwatch:GetMetricStatistics"),
    /** Action for the GetMetricWidgetImage operation. */
    GetMetricWidgetImage("cloudwatch:GetMetricWidgetImage"),
    /** Action for the ListDashboards operation. */
    ListDashboards("cloudwatch:ListDashboards"),
    /** Action for the ListMetrics operation. */
    ListMetrics("cloudwatch:ListMetrics"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("cloudwatch:ListTagsForResource"),
    /** Action for the PutDashboard operation. */
    PutDashboard("cloudwatch:PutDashboard"),
    /** Action for the PutMetricAlarm operation. */
    PutMetricAlarm("cloudwatch:PutMetricAlarm"),
    /** Action for the PutMetricData operation. */
    PutMetricData("cloudwatch:PutMetricData"),
    /** Action for the SetAlarmState operation. */
    SetAlarmState("cloudwatch:SetAlarmState"),
    /** Action for the TagResource operation. */
    TagResource("cloudwatch:TagResource"),
    /** Action for the UntagResource operation. */
    UntagResource("cloudwatch:UntagResource"),

    ;

    private final String action;

    private CloudWatchActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
