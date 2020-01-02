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
 * DescribeLocalGatewayRouteTablesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayRouteTablesRequestMarshaller implements
        Marshaller<Request<DescribeLocalGatewayRouteTablesRequest>, DescribeLocalGatewayRouteTablesRequest> {

    public Request<DescribeLocalGatewayRouteTablesRequest> marshall(DescribeLocalGatewayRouteTablesRequest describeLocalGatewayRouteTablesRequest) {

        if (describeLocalGatewayRouteTablesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalGatewayRouteTablesRequest> request = new DefaultRequest<DescribeLocalGatewayRouteTablesRequest>(
                describeLocalGatewayRouteTablesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLocalGatewayRouteTables");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayRouteTablesRequest
                .getLocalGatewayRouteTableIds();
        if (!describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsList.isEmpty()
                || !describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsList.isAutoConstruct()) {
            int localGatewayRouteTableIdsListIndex = 1;

            for (String describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsListValue : describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsList) {
                if (describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsListValue != null) {
                    request.addParameter("LocalGatewayRouteTableId." + localGatewayRouteTableIdsListIndex,
                            StringUtils.fromString(describeLocalGatewayRouteTablesRequestLocalGatewayRouteTableIdsListValue));
                }
                localGatewayRouteTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLocalGatewayRouteTablesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLocalGatewayRouteTablesRequest
                .getFilters();
        if (!describeLocalGatewayRouteTablesRequestFiltersList.isEmpty() || !describeLocalGatewayRouteTablesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLocalGatewayRouteTablesRequestFiltersListValue : describeLocalGatewayRouteTablesRequestFiltersList) {

                if (describeLocalGatewayRouteTablesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLocalGatewayRouteTablesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayRouteTablesRequestFiltersListValue
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

        if (describeLocalGatewayRouteTablesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLocalGatewayRouteTablesRequest.getMaxResults()));
        }

        if (describeLocalGatewayRouteTablesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLocalGatewayRouteTablesRequest.getNextToken()));
        }

        return request;
    }

}
