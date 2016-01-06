/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Nat Gateways Request Marshaller
 */
public class DescribeNatGatewaysRequestMarshaller implements Marshaller<Request<DescribeNatGatewaysRequest>, DescribeNatGatewaysRequest> {

    public Request<DescribeNatGatewaysRequest> marshall(DescribeNatGatewaysRequest describeNatGatewaysRequest) {

        if (describeNatGatewaysRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeNatGatewaysRequest> request = new DefaultRequest<DescribeNatGatewaysRequest>(describeNatGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeNatGateways");
        request.addParameter("Version", "2015-10-01");

        java.util.List<String> natGatewayIdsList = describeNatGatewaysRequest.getNatGatewayIds();
        int natGatewayIdsListIndex = 1;

        for (String natGatewayIdsListValue : natGatewayIdsList) {
            if (natGatewayIdsListValue != null) {
                request.addParameter("NatGatewayId." + natGatewayIdsListIndex, StringUtils.fromString(natGatewayIdsListValue));
            }

            natGatewayIdsListIndex++;
        }

        java.util.List<Filter> filterList = describeNatGatewaysRequest.getFilter();
        int filterListIndex = 1;

        for (Filter filterListValue : filterList) {
            Filter filterMember = filterListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filter." + filterListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filterListIndex++;
        }
        if (describeNatGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeNatGatewaysRequest.getMaxResults()));
        }
        if (describeNatGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeNatGatewaysRequest.getNextToken()));
        }

        return request;
    }
}
