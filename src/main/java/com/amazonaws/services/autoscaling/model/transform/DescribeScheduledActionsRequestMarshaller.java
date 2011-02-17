/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Scheduled Actions Request Marshaller
 */
public class DescribeScheduledActionsRequestMarshaller implements Marshaller<Request<DescribeScheduledActionsRequest>, DescribeScheduledActionsRequest> {

    public Request<DescribeScheduledActionsRequest> marshall(DescribeScheduledActionsRequest describeScheduledActionsRequest) {
        Request<DescribeScheduledActionsRequest> request = new DefaultRequest<DescribeScheduledActionsRequest>(describeScheduledActionsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScheduledActions");
        request.addParameter("Version", "2010-08-01");
        if (describeScheduledActionsRequest != null) {
            if (describeScheduledActionsRequest.getAutoScalingGroupName() != null) {
                request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeScheduledActionsRequest.getAutoScalingGroupName()));
            }
        }
        if (describeScheduledActionsRequest != null) {
            java.util.List<String> scheduledActionNamesList = describeScheduledActionsRequest.getScheduledActionNames();
            int scheduledActionNamesListIndex = 1;

            for (String scheduledActionNamesListValue : scheduledActionNamesList) {
                if (scheduledActionNamesListValue != null) {
                    request.addParameter("ScheduledActionNames.member." + scheduledActionNamesListIndex, StringUtils.fromString(scheduledActionNamesListValue));
                }
                scheduledActionNamesListIndex++;
            }
        }
        if (describeScheduledActionsRequest != null) {
            if (describeScheduledActionsRequest.getStartTime() != null) {
                request.addParameter("StartTime", StringUtils.fromDate(describeScheduledActionsRequest.getStartTime()));
            }
        }
        if (describeScheduledActionsRequest != null) {
            if (describeScheduledActionsRequest.getEndTime() != null) {
                request.addParameter("EndTime", StringUtils.fromDate(describeScheduledActionsRequest.getEndTime()));
            }
        }
        if (describeScheduledActionsRequest != null) {
            if (describeScheduledActionsRequest.getNextToken() != null) {
                request.addParameter("NextToken", StringUtils.fromString(describeScheduledActionsRequest.getNextToken()));
            }
        }
        if (describeScheduledActionsRequest != null) {
            if (describeScheduledActionsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeScheduledActionsRequest.getMaxRecords()));
            }
        }


        return request;
    }
}
