/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeInstanceConnectEndpointsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceConnectEndpointsRequestMarshaller implements
        Marshaller<Request<DescribeInstanceConnectEndpointsRequest>, DescribeInstanceConnectEndpointsRequest> {

    public Request<DescribeInstanceConnectEndpointsRequest> marshall(DescribeInstanceConnectEndpointsRequest describeInstanceConnectEndpointsRequest) {

        if (describeInstanceConnectEndpointsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceConnectEndpointsRequest> request = new DefaultRequest<DescribeInstanceConnectEndpointsRequest>(
                describeInstanceConnectEndpointsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceConnectEndpoints");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeInstanceConnectEndpointsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceConnectEndpointsRequest.getMaxResults()));
        }

        if (describeInstanceConnectEndpointsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceConnectEndpointsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceConnectEndpointsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceConnectEndpointsRequest
                .getFilters();
        if (!describeInstanceConnectEndpointsRequestFiltersList.isEmpty() || !describeInstanceConnectEndpointsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceConnectEndpointsRequestFiltersListValue : describeInstanceConnectEndpointsRequestFiltersList) {

                if (describeInstanceConnectEndpointsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInstanceConnectEndpointsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceConnectEndpointsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceConnectEndpointsRequest
                .getInstanceConnectEndpointIds();
        if (!describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsList.isEmpty()
                || !describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsList.isAutoConstruct()) {
            int instanceConnectEndpointIdsListIndex = 1;

            for (String describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsListValue : describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsList) {
                if (describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsListValue != null) {
                    request.addParameter("InstanceConnectEndpointId." + instanceConnectEndpointIdsListIndex,
                            StringUtils.fromString(describeInstanceConnectEndpointsRequestInstanceConnectEndpointIdsListValue));
                }
                instanceConnectEndpointIdsListIndex++;
            }
        }

        return request;
    }

}
