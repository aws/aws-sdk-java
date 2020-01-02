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
 * DescribeCoipPoolsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCoipPoolsRequestMarshaller implements Marshaller<Request<DescribeCoipPoolsRequest>, DescribeCoipPoolsRequest> {

    public Request<DescribeCoipPoolsRequest> marshall(DescribeCoipPoolsRequest describeCoipPoolsRequest) {

        if (describeCoipPoolsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCoipPoolsRequest> request = new DefaultRequest<DescribeCoipPoolsRequest>(describeCoipPoolsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCoipPools");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeCoipPoolsRequestPoolIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCoipPoolsRequest
                .getPoolIds();
        if (!describeCoipPoolsRequestPoolIdsList.isEmpty() || !describeCoipPoolsRequestPoolIdsList.isAutoConstruct()) {
            int poolIdsListIndex = 1;

            for (String describeCoipPoolsRequestPoolIdsListValue : describeCoipPoolsRequestPoolIdsList) {
                if (describeCoipPoolsRequestPoolIdsListValue != null) {
                    request.addParameter("PoolId." + poolIdsListIndex, StringUtils.fromString(describeCoipPoolsRequestPoolIdsListValue));
                }
                poolIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeCoipPoolsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeCoipPoolsRequest
                .getFilters();
        if (!describeCoipPoolsRequestFiltersList.isEmpty() || !describeCoipPoolsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeCoipPoolsRequestFiltersListValue : describeCoipPoolsRequestFiltersList) {

                if (describeCoipPoolsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeCoipPoolsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeCoipPoolsRequestFiltersListValue
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

        if (describeCoipPoolsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeCoipPoolsRequest.getMaxResults()));
        }

        if (describeCoipPoolsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeCoipPoolsRequest.getNextToken()));
        }

        return request;
    }

}
