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
 * DescribeIpamScopesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamScopesRequestMarshaller implements Marshaller<Request<DescribeIpamScopesRequest>, DescribeIpamScopesRequest> {

    public Request<DescribeIpamScopesRequest> marshall(DescribeIpamScopesRequest describeIpamScopesRequest) {

        if (describeIpamScopesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeIpamScopesRequest> request = new DefaultRequest<DescribeIpamScopesRequest>(describeIpamScopesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeIpamScopes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeIpamScopesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeIpamScopesRequest
                .getFilters();
        if (!describeIpamScopesRequestFiltersList.isEmpty() || !describeIpamScopesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeIpamScopesRequestFiltersListValue : describeIpamScopesRequestFiltersList) {

                if (describeIpamScopesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeIpamScopesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamScopesRequestFiltersListValue
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

        if (describeIpamScopesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeIpamScopesRequest.getMaxResults()));
        }

        if (describeIpamScopesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeIpamScopesRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeIpamScopesRequestIpamScopeIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeIpamScopesRequest
                .getIpamScopeIds();
        if (!describeIpamScopesRequestIpamScopeIdsList.isEmpty() || !describeIpamScopesRequestIpamScopeIdsList.isAutoConstruct()) {
            int ipamScopeIdsListIndex = 1;

            for (String describeIpamScopesRequestIpamScopeIdsListValue : describeIpamScopesRequestIpamScopeIdsList) {
                if (describeIpamScopesRequestIpamScopeIdsListValue != null) {
                    request.addParameter("IpamScopeId." + ipamScopeIdsListIndex, StringUtils.fromString(describeIpamScopesRequestIpamScopeIdsListValue));
                }
                ipamScopeIdsListIndex++;
            }
        }

        return request;
    }

}
