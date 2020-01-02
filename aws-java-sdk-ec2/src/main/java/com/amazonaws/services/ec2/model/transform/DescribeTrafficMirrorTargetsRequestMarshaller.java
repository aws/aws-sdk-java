/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeTrafficMirrorTargetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficMirrorTargetsRequestMarshaller implements
        Marshaller<Request<DescribeTrafficMirrorTargetsRequest>, DescribeTrafficMirrorTargetsRequest> {

    public Request<DescribeTrafficMirrorTargetsRequest> marshall(DescribeTrafficMirrorTargetsRequest describeTrafficMirrorTargetsRequest) {

        if (describeTrafficMirrorTargetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTrafficMirrorTargetsRequest> request = new DefaultRequest<DescribeTrafficMirrorTargetsRequest>(describeTrafficMirrorTargetsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeTrafficMirrorTargets");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorTargetsRequest
                .getTrafficMirrorTargetIds();
        if (!describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsList.isEmpty()
                || !describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsList.isAutoConstruct()) {
            int trafficMirrorTargetIdsListIndex = 1;

            for (String describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsListValue : describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsList) {
                if (describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsListValue != null) {
                    request.addParameter("TrafficMirrorTargetId." + trafficMirrorTargetIdsListIndex,
                            StringUtils.fromString(describeTrafficMirrorTargetsRequestTrafficMirrorTargetIdsListValue));
                }
                trafficMirrorTargetIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTrafficMirrorTargetsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTrafficMirrorTargetsRequest
                .getFilters();
        if (!describeTrafficMirrorTargetsRequestFiltersList.isEmpty() || !describeTrafficMirrorTargetsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTrafficMirrorTargetsRequestFiltersListValue : describeTrafficMirrorTargetsRequestFiltersList) {

                if (describeTrafficMirrorTargetsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTrafficMirrorTargetsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTrafficMirrorTargetsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeTrafficMirrorTargetsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTrafficMirrorTargetsRequest.getMaxResults()));
        }

        if (describeTrafficMirrorTargetsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTrafficMirrorTargetsRequest.getNextToken()));
        }

        return request;
    }

}
