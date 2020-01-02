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
 * SearchLocalGatewayRoutesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchLocalGatewayRoutesRequestMarshaller implements Marshaller<Request<SearchLocalGatewayRoutesRequest>, SearchLocalGatewayRoutesRequest> {

    public Request<SearchLocalGatewayRoutesRequest> marshall(SearchLocalGatewayRoutesRequest searchLocalGatewayRoutesRequest) {

        if (searchLocalGatewayRoutesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchLocalGatewayRoutesRequest> request = new DefaultRequest<SearchLocalGatewayRoutesRequest>(searchLocalGatewayRoutesRequest, "AmazonEC2");
        request.addParameter("Action", "SearchLocalGatewayRoutes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (searchLocalGatewayRoutesRequest.getLocalGatewayRouteTableId() != null) {
            request.addParameter("LocalGatewayRouteTableId", StringUtils.fromString(searchLocalGatewayRoutesRequest.getLocalGatewayRouteTableId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> searchLocalGatewayRoutesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) searchLocalGatewayRoutesRequest
                .getFilters();
        if (!searchLocalGatewayRoutesRequestFiltersList.isEmpty() || !searchLocalGatewayRoutesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter searchLocalGatewayRoutesRequestFiltersListValue : searchLocalGatewayRoutesRequestFiltersList) {

                if (searchLocalGatewayRoutesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(searchLocalGatewayRoutesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) searchLocalGatewayRoutesRequestFiltersListValue
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

        if (searchLocalGatewayRoutesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(searchLocalGatewayRoutesRequest.getMaxResults()));
        }

        if (searchLocalGatewayRoutesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(searchLocalGatewayRoutesRequest.getNextToken()));
        }

        return request;
    }

}
