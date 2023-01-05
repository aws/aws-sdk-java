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
 * DescribeTransitGatewayRouteTableAnnouncementsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayRouteTableAnnouncementsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayRouteTableAnnouncementsRequest>, DescribeTransitGatewayRouteTableAnnouncementsRequest> {

    public Request<DescribeTransitGatewayRouteTableAnnouncementsRequest> marshall(
            DescribeTransitGatewayRouteTableAnnouncementsRequest describeTransitGatewayRouteTableAnnouncementsRequest) {

        if (describeTransitGatewayRouteTableAnnouncementsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayRouteTableAnnouncementsRequest> request = new DefaultRequest<DescribeTransitGatewayRouteTableAnnouncementsRequest>(
                describeTransitGatewayRouteTableAnnouncementsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayRouteTableAnnouncements");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayRouteTableAnnouncementsRequest
                .getTransitGatewayRouteTableAnnouncementIds();
        if (!describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsList.isEmpty()
                || !describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsList.isAutoConstruct()) {
            int transitGatewayRouteTableAnnouncementIdsListIndex = 1;

            for (String describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsListValue : describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsList) {
                if (describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsListValue != null) {
                    request.addParameter("TransitGatewayRouteTableAnnouncementIds." + transitGatewayRouteTableAnnouncementIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayRouteTableAnnouncementsRequestTransitGatewayRouteTableAnnouncementIdsListValue));
                }
                transitGatewayRouteTableAnnouncementIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayRouteTableAnnouncementsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayRouteTableAnnouncementsRequest
                .getFilters();
        if (!describeTransitGatewayRouteTableAnnouncementsRequestFiltersList.isEmpty()
                || !describeTransitGatewayRouteTableAnnouncementsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayRouteTableAnnouncementsRequestFiltersListValue : describeTransitGatewayRouteTableAnnouncementsRequestFiltersList) {

                if (describeTransitGatewayRouteTableAnnouncementsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayRouteTableAnnouncementsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayRouteTableAnnouncementsRequestFiltersListValue
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

        if (describeTransitGatewayRouteTableAnnouncementsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayRouteTableAnnouncementsRequest.getMaxResults()));
        }

        if (describeTransitGatewayRouteTableAnnouncementsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayRouteTableAnnouncementsRequest.getNextToken()));
        }

        return request;
    }

}
