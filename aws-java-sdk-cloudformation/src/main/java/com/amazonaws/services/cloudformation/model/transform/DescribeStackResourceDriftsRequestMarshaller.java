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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeStackResourceDriftsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourceDriftsRequestMarshaller implements
        Marshaller<Request<DescribeStackResourceDriftsRequest>, DescribeStackResourceDriftsRequest> {

    public Request<DescribeStackResourceDriftsRequest> marshall(DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest) {

        if (describeStackResourceDriftsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStackResourceDriftsRequest> request = new DefaultRequest<DescribeStackResourceDriftsRequest>(describeStackResourceDriftsRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "DescribeStackResourceDrifts");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeStackResourceDriftsRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(describeStackResourceDriftsRequest.getStackName()));
        }

        if (describeStackResourceDriftsRequest.getStackResourceDriftStatusFilters().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) describeStackResourceDriftsRequest.getStackResourceDriftStatusFilters())
                        .isAutoConstruct()) {
            request.addParameter("StackResourceDriftStatusFilters", "");
        }
        if (!describeStackResourceDriftsRequest.getStackResourceDriftStatusFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeStackResourceDriftsRequest.getStackResourceDriftStatusFilters())
                        .isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> stackResourceDriftStatusFiltersList = (com.amazonaws.internal.SdkInternalList<String>) describeStackResourceDriftsRequest
                    .getStackResourceDriftStatusFilters();
            int stackResourceDriftStatusFiltersListIndex = 1;

            for (String stackResourceDriftStatusFiltersListValue : stackResourceDriftStatusFiltersList) {
                if (stackResourceDriftStatusFiltersListValue != null) {
                    request.addParameter("StackResourceDriftStatusFilters.member." + stackResourceDriftStatusFiltersListIndex,
                            StringUtils.fromString(stackResourceDriftStatusFiltersListValue));
                }
                stackResourceDriftStatusFiltersListIndex++;
            }
        }

        if (describeStackResourceDriftsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeStackResourceDriftsRequest.getNextToken()));
        }

        if (describeStackResourceDriftsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeStackResourceDriftsRequest.getMaxResults()));
        }

        return request;
    }

}
