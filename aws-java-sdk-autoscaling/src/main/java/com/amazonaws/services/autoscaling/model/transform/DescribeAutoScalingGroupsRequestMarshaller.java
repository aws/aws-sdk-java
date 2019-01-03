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
 * DescribeAutoScalingGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoScalingGroupsRequestMarshaller implements Marshaller<Request<DescribeAutoScalingGroupsRequest>, DescribeAutoScalingGroupsRequest> {

    public Request<DescribeAutoScalingGroupsRequest> marshall(DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest) {

        if (describeAutoScalingGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAutoScalingGroupsRequest> request = new DefaultRequest<DescribeAutoScalingGroupsRequest>(describeAutoScalingGroupsRequest,
                "AmazonAutoScaling");
        request.addParameter("Action", "DescribeAutoScalingGroups");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!describeAutoScalingGroupsRequest.getAutoScalingGroupNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeAutoScalingGroupsRequest.getAutoScalingGroupNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> autoScalingGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeAutoScalingGroupsRequest
                    .getAutoScalingGroupNames();
            int autoScalingGroupNamesListIndex = 1;

            for (String autoScalingGroupNamesListValue : autoScalingGroupNamesList) {
                if (autoScalingGroupNamesListValue != null) {
                    request.addParameter("AutoScalingGroupNames.member." + autoScalingGroupNamesListIndex,
                            StringUtils.fromString(autoScalingGroupNamesListValue));
                }
                autoScalingGroupNamesListIndex++;
            }
        }

        if (describeAutoScalingGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeAutoScalingGroupsRequest.getNextToken()));
        }

        if (describeAutoScalingGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeAutoScalingGroupsRequest.getMaxRecords()));
        }

        return request;
    }

}
