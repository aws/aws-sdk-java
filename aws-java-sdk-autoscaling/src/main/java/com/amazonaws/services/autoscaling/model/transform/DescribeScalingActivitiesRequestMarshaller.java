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
 * DescribeScalingActivitiesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScalingActivitiesRequestMarshaller implements Marshaller<Request<DescribeScalingActivitiesRequest>, DescribeScalingActivitiesRequest> {

    public Request<DescribeScalingActivitiesRequest> marshall(DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {

        if (describeScalingActivitiesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScalingActivitiesRequest> request = new DefaultRequest<DescribeScalingActivitiesRequest>(describeScalingActivitiesRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScalingActivities");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!describeScalingActivitiesRequest.getActivityIds().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeScalingActivitiesRequest.getActivityIds()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> activityIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeScalingActivitiesRequest
                    .getActivityIds();
            int activityIdsListIndex = 1;

            for (String activityIdsListValue : activityIdsList) {
                if (activityIdsListValue != null) {
                    request.addParameter("ActivityIds.member." + activityIdsListIndex, StringUtils.fromString(activityIdsListValue));
                }
                activityIdsListIndex++;
            }
        }

        if (describeScalingActivitiesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeScalingActivitiesRequest.getAutoScalingGroupName()));
        }

        if (describeScalingActivitiesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeScalingActivitiesRequest.getMaxRecords()));
        }

        if (describeScalingActivitiesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScalingActivitiesRequest.getNextToken()));
        }

        return request;
    }

}
