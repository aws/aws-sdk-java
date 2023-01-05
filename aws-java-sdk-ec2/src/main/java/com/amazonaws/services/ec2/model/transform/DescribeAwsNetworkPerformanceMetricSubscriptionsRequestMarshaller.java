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
 * DescribeAwsNetworkPerformanceMetricSubscriptionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAwsNetworkPerformanceMetricSubscriptionsRequestMarshaller implements
        Marshaller<Request<DescribeAwsNetworkPerformanceMetricSubscriptionsRequest>, DescribeAwsNetworkPerformanceMetricSubscriptionsRequest> {

    public Request<DescribeAwsNetworkPerformanceMetricSubscriptionsRequest> marshall(
            DescribeAwsNetworkPerformanceMetricSubscriptionsRequest describeAwsNetworkPerformanceMetricSubscriptionsRequest) {

        if (describeAwsNetworkPerformanceMetricSubscriptionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeAwsNetworkPerformanceMetricSubscriptionsRequest> request = new DefaultRequest<DescribeAwsNetworkPerformanceMetricSubscriptionsRequest>(
                describeAwsNetworkPerformanceMetricSubscriptionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeAwsNetworkPerformanceMetricSubscriptions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeAwsNetworkPerformanceMetricSubscriptionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeAwsNetworkPerformanceMetricSubscriptionsRequest.getMaxResults()));
        }

        if (describeAwsNetworkPerformanceMetricSubscriptionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeAwsNetworkPerformanceMetricSubscriptionsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeAwsNetworkPerformanceMetricSubscriptionsRequest
                .getFilters();
        if (!describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersList.isEmpty()
                || !describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersListValue : describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersList) {

                if (describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeAwsNetworkPerformanceMetricSubscriptionsRequestFiltersListValue
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
