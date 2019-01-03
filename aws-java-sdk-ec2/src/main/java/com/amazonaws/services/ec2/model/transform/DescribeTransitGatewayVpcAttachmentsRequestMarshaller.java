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
 * DescribeTransitGatewayVpcAttachmentsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayVpcAttachmentsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayVpcAttachmentsRequest>, DescribeTransitGatewayVpcAttachmentsRequest> {

    public Request<DescribeTransitGatewayVpcAttachmentsRequest> marshall(DescribeTransitGatewayVpcAttachmentsRequest describeTransitGatewayVpcAttachmentsRequest) {

        if (describeTransitGatewayVpcAttachmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayVpcAttachmentsRequest> request = new DefaultRequest<DescribeTransitGatewayVpcAttachmentsRequest>(
                describeTransitGatewayVpcAttachmentsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayVpcAttachments");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayVpcAttachmentsRequest
                .getTransitGatewayAttachmentIds();
        if (!describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsList.isEmpty()
                || !describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsList.isAutoConstruct()) {
            int transitGatewayAttachmentIdsListIndex = 1;

            for (String describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsListValue : describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsList) {
                if (describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsListValue != null) {
                    request.addParameter("TransitGatewayAttachmentIds." + transitGatewayAttachmentIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayVpcAttachmentsRequestTransitGatewayAttachmentIdsListValue));
                }
                transitGatewayAttachmentIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayVpcAttachmentsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayVpcAttachmentsRequest
                .getFilters();
        if (!describeTransitGatewayVpcAttachmentsRequestFiltersList.isEmpty() || !describeTransitGatewayVpcAttachmentsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayVpcAttachmentsRequestFiltersListValue : describeTransitGatewayVpcAttachmentsRequestFiltersList) {

                if (describeTransitGatewayVpcAttachmentsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayVpcAttachmentsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayVpcAttachmentsRequestFiltersListValue
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

        if (describeTransitGatewayVpcAttachmentsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayVpcAttachmentsRequest.getMaxResults()));
        }

        if (describeTransitGatewayVpcAttachmentsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayVpcAttachmentsRequest.getNextToken()));
        }

        return request;
    }

}
