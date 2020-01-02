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
 * DescribeTransitGatewayPeeringAttachmentsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayPeeringAttachmentsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayPeeringAttachmentsRequest>, DescribeTransitGatewayPeeringAttachmentsRequest> {

    public Request<DescribeTransitGatewayPeeringAttachmentsRequest> marshall(
            DescribeTransitGatewayPeeringAttachmentsRequest describeTransitGatewayPeeringAttachmentsRequest) {

        if (describeTransitGatewayPeeringAttachmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayPeeringAttachmentsRequest> request = new DefaultRequest<DescribeTransitGatewayPeeringAttachmentsRequest>(
                describeTransitGatewayPeeringAttachmentsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayPeeringAttachments");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayPeeringAttachmentsRequest
                .getTransitGatewayAttachmentIds();
        if (!describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsList.isEmpty()
                || !describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsList.isAutoConstruct()) {
            int transitGatewayAttachmentIdsListIndex = 1;

            for (String describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsListValue : describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsList) {
                if (describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsListValue != null) {
                    request.addParameter("TransitGatewayAttachmentIds." + transitGatewayAttachmentIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayPeeringAttachmentsRequestTransitGatewayAttachmentIdsListValue));
                }
                transitGatewayAttachmentIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayPeeringAttachmentsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayPeeringAttachmentsRequest
                .getFilters();
        if (!describeTransitGatewayPeeringAttachmentsRequestFiltersList.isEmpty()
                || !describeTransitGatewayPeeringAttachmentsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayPeeringAttachmentsRequestFiltersListValue : describeTransitGatewayPeeringAttachmentsRequestFiltersList) {

                if (describeTransitGatewayPeeringAttachmentsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayPeeringAttachmentsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayPeeringAttachmentsRequestFiltersListValue
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

        if (describeTransitGatewayPeeringAttachmentsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayPeeringAttachmentsRequest.getMaxResults()));
        }

        if (describeTransitGatewayPeeringAttachmentsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayPeeringAttachmentsRequest.getNextToken()));
        }

        return request;
    }

}
