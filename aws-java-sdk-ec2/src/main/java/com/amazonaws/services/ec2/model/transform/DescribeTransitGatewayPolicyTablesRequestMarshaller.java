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
 * DescribeTransitGatewayPolicyTablesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayPolicyTablesRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayPolicyTablesRequest>, DescribeTransitGatewayPolicyTablesRequest> {

    public Request<DescribeTransitGatewayPolicyTablesRequest> marshall(DescribeTransitGatewayPolicyTablesRequest describeTransitGatewayPolicyTablesRequest) {

        if (describeTransitGatewayPolicyTablesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayPolicyTablesRequest> request = new DefaultRequest<DescribeTransitGatewayPolicyTablesRequest>(
                describeTransitGatewayPolicyTablesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayPolicyTables");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayPolicyTablesRequest
                .getTransitGatewayPolicyTableIds();
        if (!describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsList.isEmpty()
                || !describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsList.isAutoConstruct()) {
            int transitGatewayPolicyTableIdsListIndex = 1;

            for (String describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsListValue : describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsList) {
                if (describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsListValue != null) {
                    request.addParameter("TransitGatewayPolicyTableIds." + transitGatewayPolicyTableIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayPolicyTablesRequestTransitGatewayPolicyTableIdsListValue));
                }
                transitGatewayPolicyTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayPolicyTablesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayPolicyTablesRequest
                .getFilters();
        if (!describeTransitGatewayPolicyTablesRequestFiltersList.isEmpty() || !describeTransitGatewayPolicyTablesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayPolicyTablesRequestFiltersListValue : describeTransitGatewayPolicyTablesRequestFiltersList) {

                if (describeTransitGatewayPolicyTablesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayPolicyTablesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayPolicyTablesRequestFiltersListValue
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

        if (describeTransitGatewayPolicyTablesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayPolicyTablesRequest.getMaxResults()));
        }

        if (describeTransitGatewayPolicyTablesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayPolicyTablesRequest.getNextToken()));
        }

        return request;
    }

}
