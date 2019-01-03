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
 * DescribeTransitGatewayRouteTablesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayRouteTablesRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayRouteTablesRequest>, DescribeTransitGatewayRouteTablesRequest> {

    public Request<DescribeTransitGatewayRouteTablesRequest> marshall(DescribeTransitGatewayRouteTablesRequest describeTransitGatewayRouteTablesRequest) {

        if (describeTransitGatewayRouteTablesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayRouteTablesRequest> request = new DefaultRequest<DescribeTransitGatewayRouteTablesRequest>(
                describeTransitGatewayRouteTablesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayRouteTables");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayRouteTablesRequest
                .getTransitGatewayRouteTableIds();
        if (!describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsList.isEmpty()
                || !describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsList.isAutoConstruct()) {
            int transitGatewayRouteTableIdsListIndex = 1;

            for (String describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsListValue : describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsList) {
                if (describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsListValue != null) {
                    request.addParameter("TransitGatewayRouteTableIds." + transitGatewayRouteTableIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayRouteTablesRequestTransitGatewayRouteTableIdsListValue));
                }
                transitGatewayRouteTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayRouteTablesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayRouteTablesRequest
                .getFilters();
        if (!describeTransitGatewayRouteTablesRequestFiltersList.isEmpty() || !describeTransitGatewayRouteTablesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayRouteTablesRequestFiltersListValue : describeTransitGatewayRouteTablesRequestFiltersList) {

                if (describeTransitGatewayRouteTablesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayRouteTablesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayRouteTablesRequestFiltersListValue
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

        if (describeTransitGatewayRouteTablesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayRouteTablesRequest.getMaxResults()));
        }

        if (describeTransitGatewayRouteTablesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayRouteTablesRequest.getNextToken()));
        }

        return request;
    }

}
