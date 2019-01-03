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
 * DescribeTransitGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewaysRequestMarshaller implements Marshaller<Request<DescribeTransitGatewaysRequest>, DescribeTransitGatewaysRequest> {

    public Request<DescribeTransitGatewaysRequest> marshall(DescribeTransitGatewaysRequest describeTransitGatewaysRequest) {

        if (describeTransitGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewaysRequest> request = new DefaultRequest<DescribeTransitGatewaysRequest>(describeTransitGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewaysRequestTransitGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewaysRequest
                .getTransitGatewayIds();
        if (!describeTransitGatewaysRequestTransitGatewayIdsList.isEmpty() || !describeTransitGatewaysRequestTransitGatewayIdsList.isAutoConstruct()) {
            int transitGatewayIdsListIndex = 1;

            for (String describeTransitGatewaysRequestTransitGatewayIdsListValue : describeTransitGatewaysRequestTransitGatewayIdsList) {
                if (describeTransitGatewaysRequestTransitGatewayIdsListValue != null) {
                    request.addParameter("TransitGatewayIds." + transitGatewayIdsListIndex,
                            StringUtils.fromString(describeTransitGatewaysRequestTransitGatewayIdsListValue));
                }
                transitGatewayIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewaysRequest
                .getFilters();
        if (!describeTransitGatewaysRequestFiltersList.isEmpty() || !describeTransitGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewaysRequestFiltersListValue : describeTransitGatewaysRequestFiltersList) {

                if (describeTransitGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewaysRequestFiltersListValue
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

        if (describeTransitGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewaysRequest.getMaxResults()));
        }

        if (describeTransitGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewaysRequest.getNextToken()));
        }

        return request;
    }

}
