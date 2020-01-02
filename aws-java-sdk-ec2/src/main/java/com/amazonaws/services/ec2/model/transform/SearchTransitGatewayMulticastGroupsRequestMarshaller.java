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
 * SearchTransitGatewayMulticastGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchTransitGatewayMulticastGroupsRequestMarshaller implements
        Marshaller<Request<SearchTransitGatewayMulticastGroupsRequest>, SearchTransitGatewayMulticastGroupsRequest> {

    public Request<SearchTransitGatewayMulticastGroupsRequest> marshall(SearchTransitGatewayMulticastGroupsRequest searchTransitGatewayMulticastGroupsRequest) {

        if (searchTransitGatewayMulticastGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SearchTransitGatewayMulticastGroupsRequest> request = new DefaultRequest<SearchTransitGatewayMulticastGroupsRequest>(
                searchTransitGatewayMulticastGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "SearchTransitGatewayMulticastGroups");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (searchTransitGatewayMulticastGroupsRequest.getTransitGatewayMulticastDomainId() != null) {
            request.addParameter("TransitGatewayMulticastDomainId",
                    StringUtils.fromString(searchTransitGatewayMulticastGroupsRequest.getTransitGatewayMulticastDomainId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> searchTransitGatewayMulticastGroupsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) searchTransitGatewayMulticastGroupsRequest
                .getFilters();
        if (!searchTransitGatewayMulticastGroupsRequestFiltersList.isEmpty() || !searchTransitGatewayMulticastGroupsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter searchTransitGatewayMulticastGroupsRequestFiltersListValue : searchTransitGatewayMulticastGroupsRequestFiltersList) {

                if (searchTransitGatewayMulticastGroupsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(searchTransitGatewayMulticastGroupsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) searchTransitGatewayMulticastGroupsRequestFiltersListValue
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

        if (searchTransitGatewayMulticastGroupsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(searchTransitGatewayMulticastGroupsRequest.getMaxResults()));
        }

        if (searchTransitGatewayMulticastGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(searchTransitGatewayMulticastGroupsRequest.getNextToken()));
        }

        return request;
    }

}
