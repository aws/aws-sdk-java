/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeTrafficSourcesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficSourcesRequestMarshaller implements Marshaller<Request<DescribeTrafficSourcesRequest>, DescribeTrafficSourcesRequest> {

    public Request<DescribeTrafficSourcesRequest> marshall(DescribeTrafficSourcesRequest describeTrafficSourcesRequest) {

        if (describeTrafficSourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrafficSourcesRequest> request = new DefaultRequest<DescribeTrafficSourcesRequest>(describeTrafficSourcesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeTrafficSources");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeTrafficSourcesRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(describeTrafficSourcesRequest.getAutoScalingGroupName()));
        }

        if (describeTrafficSourcesRequest.getTrafficSourceType() != null) {
            request.addParameter("TrafficSourceType", StringUtils.fromString(describeTrafficSourcesRequest.getTrafficSourceType()));
        }

        if (describeTrafficSourcesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTrafficSourcesRequest.getNextToken()));
        }

        if (describeTrafficSourcesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeTrafficSourcesRequest.getMaxRecords()));
        }

        return request;
    }

}
