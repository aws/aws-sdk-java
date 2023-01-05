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
 * DescribeIpamPoolsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamPoolsRequestMarshaller implements Marshaller<Request<DescribeIpamPoolsRequest>, DescribeIpamPoolsRequest> {

    public Request<DescribeIpamPoolsRequest> marshall(DescribeIpamPoolsRequest describeIpamPoolsRequest) {

        if (describeIpamPoolsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpamPoolsRequest> request = new DefaultRequest<DescribeIpamPoolsRequest>(describeIpamPoolsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpamPools");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeIpamPoolsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpamPoolsRequest
                .getFilters();
        if (!describeIpamPoolsRequestFiltersList.isEmpty() || !describeIpamPoolsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpamPoolsRequestFiltersListValue : describeIpamPoolsRequestFiltersList) {

                if (describeIpamPoolsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeIpamPoolsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamPoolsRequestFiltersListValue
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

        if (describeIpamPoolsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpamPoolsRequest.getMaxResults()));
        }

        if (describeIpamPoolsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpamPoolsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeIpamPoolsRequestIpamPoolIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamPoolsRequest
                .getIpamPoolIds();
        if (!describeIpamPoolsRequestIpamPoolIdsList.isEmpty() || !describeIpamPoolsRequestIpamPoolIdsList.isAutoConstruct()) {
            int ipamPoolIdsListIndex = 1;

            for (String describeIpamPoolsRequestIpamPoolIdsListValue : describeIpamPoolsRequestIpamPoolIdsList) {
                if (describeIpamPoolsRequestIpamPoolIdsListValue != null) {
                    request.addParameter("IpamPoolId." + ipamPoolIdsListIndex, StringUtils.fromString(describeIpamPoolsRequestIpamPoolIdsListValue));
                }
                ipamPoolIdsListIndex++;
            }
        }

        return request;
    }

}
