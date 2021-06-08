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
 * DescribeTransitGatewayConnectPeersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayConnectPeersRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayConnectPeersRequest>, DescribeTransitGatewayConnectPeersRequest> {

    public Request<DescribeTransitGatewayConnectPeersRequest> marshall(DescribeTransitGatewayConnectPeersRequest describeTransitGatewayConnectPeersRequest) {

        if (describeTransitGatewayConnectPeersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayConnectPeersRequest> request = new DefaultRequest<DescribeTransitGatewayConnectPeersRequest>(
                describeTransitGatewayConnectPeersRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayConnectPeers");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayConnectPeersRequest
                .getTransitGatewayConnectPeerIds();
        if (!describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsList.isEmpty()
                || !describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsList.isAutoConstruct()) {
            int transitGatewayConnectPeerIdsListIndex = 1;

            for (String describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsListValue : describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsList) {
                if (describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsListValue != null) {
                    request.addParameter("TransitGatewayConnectPeerIds." + transitGatewayConnectPeerIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayConnectPeersRequestTransitGatewayConnectPeerIdsListValue));
                }
                transitGatewayConnectPeerIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayConnectPeersRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayConnectPeersRequest
                .getFilters();
        if (!describeTransitGatewayConnectPeersRequestFiltersList.isEmpty() || !describeTransitGatewayConnectPeersRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayConnectPeersRequestFiltersListValue : describeTransitGatewayConnectPeersRequestFiltersList) {

                if (describeTransitGatewayConnectPeersRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayConnectPeersRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayConnectPeersRequestFiltersListValue
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

        if (describeTransitGatewayConnectPeersRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayConnectPeersRequest.getMaxResults()));
        }

        if (describeTransitGatewayConnectPeersRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayConnectPeersRequest.getNextToken()));
        }

        return request;
    }

}
