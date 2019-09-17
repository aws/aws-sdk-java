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
 * DescribeNatGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNatGatewaysRequestMarshaller implements Marshaller<Request<DescribeNatGatewaysRequest>, DescribeNatGatewaysRequest> {

    public Request<DescribeNatGatewaysRequest> marshall(DescribeNatGatewaysRequest describeNatGatewaysRequest) {

        if (describeNatGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNatGatewaysRequest> request = new DefaultRequest<DescribeNatGatewaysRequest>(describeNatGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNatGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeNatGatewaysRequestFilterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeNatGatewaysRequest
                .getFilter();
        if (!describeNatGatewaysRequestFilterList.isEmpty() || !describeNatGatewaysRequestFilterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter describeNatGatewaysRequestFilterListValue : describeNatGatewaysRequestFilterList) {

                if (describeNatGatewaysRequestFilterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name", StringUtils.fromString(describeNatGatewaysRequestFilterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeNatGatewaysRequestFilterListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filterListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filterListIndex++;
            }
        }

        if (describeNatGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNatGatewaysRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeNatGatewaysRequestNatGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeNatGatewaysRequest
                .getNatGatewayIds();
        if (!describeNatGatewaysRequestNatGatewayIdsList.isEmpty() || !describeNatGatewaysRequestNatGatewayIdsList.isAutoConstruct()) {
            int natGatewayIdsListIndex = 1;

            for (String describeNatGatewaysRequestNatGatewayIdsListValue : describeNatGatewaysRequestNatGatewayIdsList) {
                if (describeNatGatewaysRequestNatGatewayIdsListValue != null) {
                    request.addParameter("NatGatewayId." + natGatewayIdsListIndex, StringUtils.fromString(describeNatGatewaysRequestNatGatewayIdsListValue));
                }
                natGatewayIdsListIndex++;
            }
        }

        if (describeNatGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNatGatewaysRequest.getNextToken()));
        }

        return request;
    }

}
