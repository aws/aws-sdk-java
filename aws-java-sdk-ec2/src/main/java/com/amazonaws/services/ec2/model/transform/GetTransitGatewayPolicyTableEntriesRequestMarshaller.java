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
 * GetTransitGatewayPolicyTableEntriesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayPolicyTableEntriesRequestMarshaller implements
        Marshaller<Request<GetTransitGatewayPolicyTableEntriesRequest>, GetTransitGatewayPolicyTableEntriesRequest> {

    public Request<GetTransitGatewayPolicyTableEntriesRequest> marshall(GetTransitGatewayPolicyTableEntriesRequest getTransitGatewayPolicyTableEntriesRequest) {

        if (getTransitGatewayPolicyTableEntriesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetTransitGatewayPolicyTableEntriesRequest> request = new DefaultRequest<GetTransitGatewayPolicyTableEntriesRequest>(
                getTransitGatewayPolicyTableEntriesRequest, "AmazonEC2");
        request.addParameter("Action", "GetTransitGatewayPolicyTableEntries");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getTransitGatewayPolicyTableEntriesRequest.getTransitGatewayPolicyTableId() != null) {
            request.addParameter("TransitGatewayPolicyTableId",
                    StringUtils.fromString(getTransitGatewayPolicyTableEntriesRequest.getTransitGatewayPolicyTableId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getTransitGatewayPolicyTableEntriesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getTransitGatewayPolicyTableEntriesRequest
                .getFilters();
        if (!getTransitGatewayPolicyTableEntriesRequestFiltersList.isEmpty() || !getTransitGatewayPolicyTableEntriesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getTransitGatewayPolicyTableEntriesRequestFiltersListValue : getTransitGatewayPolicyTableEntriesRequestFiltersList) {

                if (getTransitGatewayPolicyTableEntriesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getTransitGatewayPolicyTableEntriesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getTransitGatewayPolicyTableEntriesRequestFiltersListValue
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

        if (getTransitGatewayPolicyTableEntriesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getTransitGatewayPolicyTableEntriesRequest.getMaxResults()));
        }

        if (getTransitGatewayPolicyTableEntriesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getTransitGatewayPolicyTableEntriesRequest.getNextToken()));
        }

        return request;
    }

}
