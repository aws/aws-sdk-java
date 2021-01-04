/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeNetworkInsightsAnalysesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAnalysesRequestMarshaller implements
        Marshaller<Request<DescribeNetworkInsightsAnalysesRequest>, DescribeNetworkInsightsAnalysesRequest> {

    public Request<DescribeNetworkInsightsAnalysesRequest> marshall(DescribeNetworkInsightsAnalysesRequest describeNetworkInsightsAnalysesRequest) {

        if (describeNetworkInsightsAnalysesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInsightsAnalysesRequest> request = new DefaultRequest<DescribeNetworkInsightsAnalysesRequest>(
                describeNetworkInsightsAnalysesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInsightsAnalyses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAnalysesRequest
                .getNetworkInsightsAnalysisIds();
        if (!describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsList.isEmpty()
                || !describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsList.isAutoConstruct()) {
            int networkInsightsAnalysisIdsListIndex = 1;

            for (String describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsListValue : describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsList) {
                if (describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsListValue != null) {
                    request.addParameter("NetworkInsightsAnalysisId." + networkInsightsAnalysisIdsListIndex,
                            StringUtils.fromString(describeNetworkInsightsAnalysesRequestNetworkInsightsAnalysisIdsListValue));
                }
                networkInsightsAnalysisIdsListIndex++;
            }
        }

        if (describeNetworkInsightsAnalysesRequest.getNetworkInsightsPathId() != null) {
            request.addParameter("NetworkInsightsPathId", StringUtils.fromString(describeNetworkInsightsAnalysesRequest.getNetworkInsightsPathId()));
        }

        if (describeNetworkInsightsAnalysesRequest.getAnalysisStartTime() != null) {
            request.addParameter("AnalysisStartTime", StringUtils.fromDate(describeNetworkInsightsAnalysesRequest.getAnalysisStartTime()));
        }

        if (describeNetworkInsightsAnalysesRequest.getAnalysisEndTime() != null) {
            request.addParameter("AnalysisEndTime", StringUtils.fromDate(describeNetworkInsightsAnalysesRequest.getAnalysisEndTime()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInsightsAnalysesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInsightsAnalysesRequest
                .getFilters();
        if (!describeNetworkInsightsAnalysesRequestFiltersList.isEmpty() || !describeNetworkInsightsAnalysesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInsightsAnalysesRequestFiltersListValue : describeNetworkInsightsAnalysesRequestFiltersList) {

                if (describeNetworkInsightsAnalysesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInsightsAnalysesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAnalysesRequestFiltersListValue
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

        if (describeNetworkInsightsAnalysesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInsightsAnalysesRequest.getMaxResults()));
        }

        if (describeNetworkInsightsAnalysesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInsightsAnalysesRequest.getNextToken()));
        }

        return request;
    }

}
