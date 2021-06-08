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
 * GetTransitGatewayPrefixListReferencesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayPrefixListReferencesRequestMarshaller implements
        Marshaller<Request<GetTransitGatewayPrefixListReferencesRequest>, GetTransitGatewayPrefixListReferencesRequest> {

    public Request<GetTransitGatewayPrefixListReferencesRequest> marshall(
            GetTransitGatewayPrefixListReferencesRequest getTransitGatewayPrefixListReferencesRequest) {

        if (getTransitGatewayPrefixListReferencesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetTransitGatewayPrefixListReferencesRequest> request = new DefaultRequest<GetTransitGatewayPrefixListReferencesRequest>(
                getTransitGatewayPrefixListReferencesRequest, "AmazonEC2");
        request.addParameter("Action", "GetTransitGatewayPrefixListReferences");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getTransitGatewayPrefixListReferencesRequest.getTransitGatewayRouteTableId() != null) {
            request.addParameter("TransitGatewayRouteTableId",
                    StringUtils.fromString(getTransitGatewayPrefixListReferencesRequest.getTransitGatewayRouteTableId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getTransitGatewayPrefixListReferencesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getTransitGatewayPrefixListReferencesRequest
                .getFilters();
        if (!getTransitGatewayPrefixListReferencesRequestFiltersList.isEmpty() || !getTransitGatewayPrefixListReferencesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getTransitGatewayPrefixListReferencesRequestFiltersListValue : getTransitGatewayPrefixListReferencesRequestFiltersList) {

                if (getTransitGatewayPrefixListReferencesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getTransitGatewayPrefixListReferencesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getTransitGatewayPrefixListReferencesRequestFiltersListValue
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

        if (getTransitGatewayPrefixListReferencesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getTransitGatewayPrefixListReferencesRequest.getMaxResults()));
        }

        if (getTransitGatewayPrefixListReferencesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getTransitGatewayPrefixListReferencesRequest.getNextToken()));
        }

        return request;
    }

}
