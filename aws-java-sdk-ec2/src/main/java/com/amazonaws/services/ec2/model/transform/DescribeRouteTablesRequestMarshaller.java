/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeRouteTablesRequest Marshaller
 */

public class DescribeRouteTablesRequestMarshaller implements Marshaller<Request<DescribeRouteTablesRequest>, DescribeRouteTablesRequest> {

    public Request<DescribeRouteTablesRequest> marshall(DescribeRouteTablesRequest describeRouteTablesRequest) {

        if (describeRouteTablesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRouteTablesRequest> request = new DefaultRequest<DescribeRouteTablesRequest>(describeRouteTablesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeRouteTables");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeRouteTablesRequestRouteTableIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeRouteTablesRequest
                .getRouteTableIds();
        if (!describeRouteTablesRequestRouteTableIdsList.isEmpty() || !describeRouteTablesRequestRouteTableIdsList.isAutoConstruct()) {
            int routeTableIdsListIndex = 1;

            for (String describeRouteTablesRequestRouteTableIdsListValue : describeRouteTablesRequestRouteTableIdsList) {
                if (describeRouteTablesRequestRouteTableIdsListValue != null) {
                    request.addParameter("RouteTableId." + routeTableIdsListIndex, StringUtils.fromString(describeRouteTablesRequestRouteTableIdsListValue));
                }
                routeTableIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeRouteTablesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeRouteTablesRequest
                .getFilters();
        if (!describeRouteTablesRequestFiltersList.isEmpty() || !describeRouteTablesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeRouteTablesRequestFiltersListValue : describeRouteTablesRequestFiltersList) {

                if (describeRouteTablesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeRouteTablesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeRouteTablesRequestFiltersListValue
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
