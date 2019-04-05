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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeScheduledActionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsRequestMarshaller implements Marshaller<Request<DescribeScheduledActionsRequest>, DescribeScheduledActionsRequest> {

    public Request<DescribeScheduledActionsRequest> marshall(DescribeScheduledActionsRequest describeScheduledActionsRequest) {

        if (describeScheduledActionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledActionsRequest> request = new DefaultRequest<DescribeScheduledActionsRequest>(describeScheduledActionsRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScheduledActions");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeScheduledActionsRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeScheduledActionsRequest.getAutoScalingGroupName()));
        }

        if (!describeScheduledActionsRequest.getScheduledActionNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeScheduledActionsRequest.getScheduledActionNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> scheduledActionNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeScheduledActionsRequest
                    .getScheduledActionNames();
            int scheduledActionNamesListIndex = 1;

            for (String scheduledActionNamesListValue : scheduledActionNamesList) {
                if (scheduledActionNamesListValue != null) {
                    request.addParameter("ScheduledActionNames.member." + scheduledActionNamesListIndex, StringUtils.fromString(scheduledActionNamesListValue));
                }
                scheduledActionNamesListIndex++;
            }
        }

        if (describeScheduledActionsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeScheduledActionsRequest.getStartTime()));
        }

        if (describeScheduledActionsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeScheduledActionsRequest.getEndTime()));
        }

        if (describeScheduledActionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScheduledActionsRequest.getNextToken()));
        }

        if (describeScheduledActionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeScheduledActionsRequest.getMaxRecords()));
        }

        return request;
    }

}
