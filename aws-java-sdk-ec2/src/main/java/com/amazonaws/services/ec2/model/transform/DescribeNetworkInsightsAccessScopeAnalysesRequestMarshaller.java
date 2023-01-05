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
 * DescribeNetworkInsightsAccessScopeAnalysesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAccessScopeAnalysesRequestMarshaller implements
        Marshaller<Request<DescribeNetworkInsightsAccessScopeAnalysesRequest>, DescribeNetworkInsightsAccessScopeAnalysesRequest> {

    public Request<DescribeNetworkInsightsAccessScopeAnalysesRequest> marshall(
            DescribeNetworkInsightsAccessScopeAnalysesRequest describeNetworkInsightsAccessScopeAnalysesRequest) {

        if (describeNetworkInsightsAccessScopeAnalysesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInsightsAccessScopeAnalysesRequest> request = new DefaultRequest<DescribeNetworkInsightsAccessScopeAnalysesRequest>(
                describeNetworkInsightsAccessScopeAnalysesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInsightsAccessScopeAnalyses");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAccessScopeAnalysesRequest
                .getNetworkInsightsAccessScopeAnalysisIds();
        if (!describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsList.isEmpty()
                || !describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsList.isAutoConstruct()) {
            int networkInsightsAccessScopeAnalysisIdsListIndex = 1;

            for (String describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsListValue : describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsList) {
                if (describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsListValue != null) {
                    request.addParameter("NetworkInsightsAccessScopeAnalysisId." + networkInsightsAccessScopeAnalysisIdsListIndex,
                            StringUtils.fromString(describeNetworkInsightsAccessScopeAnalysesRequestNetworkInsightsAccessScopeAnalysisIdsListValue));
                }
                networkInsightsAccessScopeAnalysisIdsListIndex++;
            }
        }

        if (describeNetworkInsightsAccessScopeAnalysesRequest.getNetworkInsightsAccessScopeId() != null) {
            request.addParameter("NetworkInsightsAccessScopeId",
                    StringUtils.fromString(describeNetworkInsightsAccessScopeAnalysesRequest.getNetworkInsightsAccessScopeId()));
        }

        if (describeNetworkInsightsAccessScopeAnalysesRequest.getAnalysisStartTimeBegin() != null) {
            request.addParameter("AnalysisStartTimeBegin", StringUtils.fromDate(describeNetworkInsightsAccessScopeAnalysesRequest.getAnalysisStartTimeBegin()));
        }

        if (describeNetworkInsightsAccessScopeAnalysesRequest.getAnalysisStartTimeEnd() != null) {
            request.addParameter("AnalysisStartTimeEnd", StringUtils.fromDate(describeNetworkInsightsAccessScopeAnalysesRequest.getAnalysisStartTimeEnd()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInsightsAccessScopeAnalysesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInsightsAccessScopeAnalysesRequest
                .getFilters();
        if (!describeNetworkInsightsAccessScopeAnalysesRequestFiltersList.isEmpty()
                || !describeNetworkInsightsAccessScopeAnalysesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInsightsAccessScopeAnalysesRequestFiltersListValue : describeNetworkInsightsAccessScopeAnalysesRequestFiltersList) {

                if (describeNetworkInsightsAccessScopeAnalysesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInsightsAccessScopeAnalysesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAccessScopeAnalysesRequestFiltersListValue
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

        if (describeNetworkInsightsAccessScopeAnalysesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInsightsAccessScopeAnalysesRequest.getMaxResults()));
        }

        if (describeNetworkInsightsAccessScopeAnalysesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInsightsAccessScopeAnalysesRequest.getNextToken()));
        }

        return request;
    }

}
