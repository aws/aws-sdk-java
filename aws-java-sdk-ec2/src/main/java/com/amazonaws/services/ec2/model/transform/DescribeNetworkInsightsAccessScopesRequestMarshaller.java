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
 * DescribeNetworkInsightsAccessScopesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsAccessScopesRequestMarshaller implements
        Marshaller<Request<DescribeNetworkInsightsAccessScopesRequest>, DescribeNetworkInsightsAccessScopesRequest> {

    public Request<DescribeNetworkInsightsAccessScopesRequest> marshall(DescribeNetworkInsightsAccessScopesRequest describeNetworkInsightsAccessScopesRequest) {

        if (describeNetworkInsightsAccessScopesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNetworkInsightsAccessScopesRequest> request = new DefaultRequest<DescribeNetworkInsightsAccessScopesRequest>(
                describeNetworkInsightsAccessScopesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNetworkInsightsAccessScopes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAccessScopesRequest
                .getNetworkInsightsAccessScopeIds();
        if (!describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsList.isEmpty()
                || !describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsList.isAutoConstruct()) {
            int networkInsightsAccessScopeIdsListIndex = 1;

            for (String describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsListValue : describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsList) {
                if (describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsListValue != null) {
                    request.addParameter("NetworkInsightsAccessScopeId." + networkInsightsAccessScopeIdsListIndex,
                            StringUtils.fromString(describeNetworkInsightsAccessScopesRequestNetworkInsightsAccessScopeIdsListValue));
                }
                networkInsightsAccessScopeIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeNetworkInsightsAccessScopesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNetworkInsightsAccessScopesRequest
                .getFilters();
        if (!describeNetworkInsightsAccessScopesRequestFiltersList.isEmpty() || !describeNetworkInsightsAccessScopesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeNetworkInsightsAccessScopesRequestFiltersListValue : describeNetworkInsightsAccessScopesRequestFiltersList) {

                if (describeNetworkInsightsAccessScopesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeNetworkInsightsAccessScopesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNetworkInsightsAccessScopesRequestFiltersListValue
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

        if (describeNetworkInsightsAccessScopesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNetworkInsightsAccessScopesRequest.getMaxResults()));
        }

        if (describeNetworkInsightsAccessScopesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNetworkInsightsAccessScopesRequest.getNextToken()));
        }

        return request;
    }

}
