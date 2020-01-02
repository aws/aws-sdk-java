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
 * DescribeTransitGatewayMulticastDomainsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayMulticastDomainsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayMulticastDomainsRequest>, DescribeTransitGatewayMulticastDomainsRequest> {

    public Request<DescribeTransitGatewayMulticastDomainsRequest> marshall(
            DescribeTransitGatewayMulticastDomainsRequest describeTransitGatewayMulticastDomainsRequest) {

        if (describeTransitGatewayMulticastDomainsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayMulticastDomainsRequest> request = new DefaultRequest<DescribeTransitGatewayMulticastDomainsRequest>(
                describeTransitGatewayMulticastDomainsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayMulticastDomains");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayMulticastDomainsRequest
                .getTransitGatewayMulticastDomainIds();
        if (!describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsList.isEmpty()
                || !describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsList.isAutoConstruct()) {
            int transitGatewayMulticastDomainIdsListIndex = 1;

            for (String describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsListValue : describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsList) {
                if (describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsListValue != null) {
                    request.addParameter("TransitGatewayMulticastDomainIds." + transitGatewayMulticastDomainIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayMulticastDomainsRequestTransitGatewayMulticastDomainIdsListValue));
                }
                transitGatewayMulticastDomainIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayMulticastDomainsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayMulticastDomainsRequest
                .getFilters();
        if (!describeTransitGatewayMulticastDomainsRequestFiltersList.isEmpty() || !describeTransitGatewayMulticastDomainsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayMulticastDomainsRequestFiltersListValue : describeTransitGatewayMulticastDomainsRequestFiltersList) {

                if (describeTransitGatewayMulticastDomainsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayMulticastDomainsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayMulticastDomainsRequestFiltersListValue
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

        if (describeTransitGatewayMulticastDomainsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayMulticastDomainsRequest.getMaxResults()));
        }

        if (describeTransitGatewayMulticastDomainsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayMulticastDomainsRequest.getNextToken()));
        }

        return request;
    }

}
