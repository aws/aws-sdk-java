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
 * DescribeIpv6PoolsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpv6PoolsRequestMarshaller implements Marshaller<Request<DescribeIpv6PoolsRequest>, DescribeIpv6PoolsRequest> {

    public Request<DescribeIpv6PoolsRequest> marshall(DescribeIpv6PoolsRequest describeIpv6PoolsRequest) {

        if (describeIpv6PoolsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpv6PoolsRequest> request = new DefaultRequest<DescribeIpv6PoolsRequest>(describeIpv6PoolsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpv6Pools");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeIpv6PoolsRequestPoolIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpv6PoolsRequest
                .getPoolIds();
        if (!describeIpv6PoolsRequestPoolIdsList.isEmpty() || !describeIpv6PoolsRequestPoolIdsList.isAutoConstruct()) {
            int poolIdsListIndex = 1;

            for (String describeIpv6PoolsRequestPoolIdsListValue : describeIpv6PoolsRequestPoolIdsList) {
                if (describeIpv6PoolsRequestPoolIdsListValue != null) {
                    request.addParameter("PoolId." + poolIdsListIndex, StringUtils.fromString(describeIpv6PoolsRequestPoolIdsListValue));
                }
                poolIdsListIndex++;
            }
        }

        if (describeIpv6PoolsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpv6PoolsRequest.getNextToken()));
        }

        if (describeIpv6PoolsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpv6PoolsRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeIpv6PoolsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpv6PoolsRequest
                .getFilters();
        if (!describeIpv6PoolsRequestFiltersList.isEmpty() || !describeIpv6PoolsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpv6PoolsRequestFiltersListValue : describeIpv6PoolsRequestFiltersList) {

                if (describeIpv6PoolsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeIpv6PoolsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpv6PoolsRequestFiltersListValue
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

        return request;
    }

}
