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
 * DescribeCarrierGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCarrierGatewaysRequestMarshaller implements Marshaller<Request<DescribeCarrierGatewaysRequest>, DescribeCarrierGatewaysRequest> {

    public Request<DescribeCarrierGatewaysRequest> marshall(DescribeCarrierGatewaysRequest describeCarrierGatewaysRequest) {

        if (describeCarrierGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCarrierGatewaysRequest> request = new DefaultRequest<DescribeCarrierGatewaysRequest>(describeCarrierGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCarrierGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeCarrierGatewaysRequestCarrierGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCarrierGatewaysRequest
                .getCarrierGatewayIds();
        if (!describeCarrierGatewaysRequestCarrierGatewayIdsList.isEmpty() || !describeCarrierGatewaysRequestCarrierGatewayIdsList.isAutoConstruct()) {
            int carrierGatewayIdsListIndex = 1;

            for (String describeCarrierGatewaysRequestCarrierGatewayIdsListValue : describeCarrierGatewaysRequestCarrierGatewayIdsList) {
                if (describeCarrierGatewaysRequestCarrierGatewayIdsListValue != null) {
                    request.addParameter("CarrierGatewayId." + carrierGatewayIdsListIndex,
                            StringUtils.fromString(describeCarrierGatewaysRequestCarrierGatewayIdsListValue));
                }
                carrierGatewayIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeCarrierGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeCarrierGatewaysRequest
                .getFilters();
        if (!describeCarrierGatewaysRequestFiltersList.isEmpty() || !describeCarrierGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeCarrierGatewaysRequestFiltersListValue : describeCarrierGatewaysRequestFiltersList) {

                if (describeCarrierGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeCarrierGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeCarrierGatewaysRequestFiltersListValue
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

        if (describeCarrierGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeCarrierGatewaysRequest.getMaxResults()));
        }

        if (describeCarrierGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeCarrierGatewaysRequest.getNextToken()));
        }

        return request;
    }

}
