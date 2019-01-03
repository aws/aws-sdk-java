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
 * DescribeNetworkInterfacesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfacesRequestMarshaller implements Marshaller<Request<DescribeNetworkInterfacesRequest>, DescribeNetworkInterfacesRequest> {

    public Request<DescribeNetworkInterfacesRequest> marshall(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) {

        if (describeNetworkInterfacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInterfacesRequest> request = new DefaultRequest<DescribeNetworkInterfacesRequest>(describeNetworkInterfacesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInterfaces");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInterfacesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInterfacesRequest
                .getFilters();
        if (!describeNetworkInterfacesRequestFiltersList.isEmpty() || !describeNetworkInterfacesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInterfacesRequestFiltersListValue : describeNetworkInterfacesRequestFiltersList) {

                if (describeNetworkInterfacesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInterfacesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInterfacesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInterfacesRequestNetworkInterfaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInterfacesRequest
                .getNetworkInterfaceIds();
        if (!describeNetworkInterfacesRequestNetworkInterfaceIdsList.isEmpty() || !describeNetworkInterfacesRequestNetworkInterfaceIdsList.isAutoConstruct()) {
            int networkInterfaceIdsListIndex = 1;

            for (String describeNetworkInterfacesRequestNetworkInterfaceIdsListValue : describeNetworkInterfacesRequestNetworkInterfaceIdsList) {
                if (describeNetworkInterfacesRequestNetworkInterfaceIdsListValue != null) {
                    request.addParameter("NetworkInterfaceId." + networkInterfaceIdsListIndex,
                            StringUtils.fromString(describeNetworkInterfacesRequestNetworkInterfaceIdsListValue));
                }
                networkInterfaceIdsListIndex++;
            }
        }

        if (describeNetworkInterfacesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInterfacesRequest.getNextToken()));
        }

        if (describeNetworkInterfacesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInterfacesRequest.getMaxResults()));
        }

        return request;
    }

}
