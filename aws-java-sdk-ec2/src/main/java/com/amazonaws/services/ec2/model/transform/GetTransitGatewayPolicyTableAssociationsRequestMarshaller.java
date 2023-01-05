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
 * GetTransitGatewayPolicyTableAssociationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayPolicyTableAssociationsRequestMarshaller implements
        Marshaller<Request<GetTransitGatewayPolicyTableAssociationsRequest>, GetTransitGatewayPolicyTableAssociationsRequest> {

    public Request<GetTransitGatewayPolicyTableAssociationsRequest> marshall(
            GetTransitGatewayPolicyTableAssociationsRequest getTransitGatewayPolicyTableAssociationsRequest) {

        if (getTransitGatewayPolicyTableAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetTransitGatewayPolicyTableAssociationsRequest> request = new DefaultRequest<GetTransitGatewayPolicyTableAssociationsRequest>(
                getTransitGatewayPolicyTableAssociationsRequest, "AmazonEC2");
        request.addParameter("Action", "GetTransitGatewayPolicyTableAssociations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getTransitGatewayPolicyTableAssociationsRequest.getTransitGatewayPolicyTableId() != null) {
            request.addParameter("TransitGatewayPolicyTableId",
                    StringUtils.fromString(getTransitGatewayPolicyTableAssociationsRequest.getTransitGatewayPolicyTableId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> getTransitGatewayPolicyTableAssociationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) getTransitGatewayPolicyTableAssociationsRequest
                .getFilters();
        if (!getTransitGatewayPolicyTableAssociationsRequestFiltersList.isEmpty()
                || !getTransitGatewayPolicyTableAssociationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter getTransitGatewayPolicyTableAssociationsRequestFiltersListValue : getTransitGatewayPolicyTableAssociationsRequestFiltersList) {

                if (getTransitGatewayPolicyTableAssociationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(getTransitGatewayPolicyTableAssociationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) getTransitGatewayPolicyTableAssociationsRequestFiltersListValue
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

        if (getTransitGatewayPolicyTableAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getTransitGatewayPolicyTableAssociationsRequest.getMaxResults()));
        }

        if (getTransitGatewayPolicyTableAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getTransitGatewayPolicyTableAssociationsRequest.getNextToken()));
        }

        return request;
    }

}
