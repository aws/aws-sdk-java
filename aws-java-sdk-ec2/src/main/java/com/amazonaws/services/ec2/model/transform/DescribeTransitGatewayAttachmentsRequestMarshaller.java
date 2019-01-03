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
 * DescribeTransitGatewayAttachmentsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayAttachmentsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayAttachmentsRequest>, DescribeTransitGatewayAttachmentsRequest> {

    public Request<DescribeTransitGatewayAttachmentsRequest> marshall(DescribeTransitGatewayAttachmentsRequest describeTransitGatewayAttachmentsRequest) {

        if (describeTransitGatewayAttachmentsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayAttachmentsRequest> request = new DefaultRequest<DescribeTransitGatewayAttachmentsRequest>(
                describeTransitGatewayAttachmentsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayAttachments");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayAttachmentsRequest
                .getTransitGatewayAttachmentIds();
        if (!describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsList.isEmpty()
                || !describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsList.isAutoConstruct()) {
            int transitGatewayAttachmentIdsListIndex = 1;

            for (String describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsListValue : describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsList) {
                if (describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsListValue != null) {
                    request.addParameter("TransitGatewayAttachmentIds." + transitGatewayAttachmentIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayAttachmentsRequestTransitGatewayAttachmentIdsListValue));
                }
                transitGatewayAttachmentIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayAttachmentsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayAttachmentsRequest
                .getFilters();
        if (!describeTransitGatewayAttachmentsRequestFiltersList.isEmpty() || !describeTransitGatewayAttachmentsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayAttachmentsRequestFiltersListValue : describeTransitGatewayAttachmentsRequestFiltersList) {

                if (describeTransitGatewayAttachmentsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayAttachmentsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayAttachmentsRequestFiltersListValue
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

        if (describeTransitGatewayAttachmentsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayAttachmentsRequest.getMaxResults()));
        }

        if (describeTransitGatewayAttachmentsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayAttachmentsRequest.getNextToken()));
        }

        return request;
    }

}
