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
 * DescribeLocalGatewayVirtualInterfacesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayVirtualInterfacesRequestMarshaller implements
        Marshaller<Request<DescribeLocalGatewayVirtualInterfacesRequest>, DescribeLocalGatewayVirtualInterfacesRequest> {

    public Request<DescribeLocalGatewayVirtualInterfacesRequest> marshall(
            DescribeLocalGatewayVirtualInterfacesRequest describeLocalGatewayVirtualInterfacesRequest) {

        if (describeLocalGatewayVirtualInterfacesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalGatewayVirtualInterfacesRequest> request = new DefaultRequest<DescribeLocalGatewayVirtualInterfacesRequest>(
                describeLocalGatewayVirtualInterfacesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLocalGatewayVirtualInterfaces");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayVirtualInterfacesRequest
                .getLocalGatewayVirtualInterfaceIds();
        if (!describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsList.isEmpty()
                || !describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsList.isAutoConstruct()) {
            int localGatewayVirtualInterfaceIdsListIndex = 1;

            for (String describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsListValue : describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsList) {
                if (describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsListValue != null) {
                    request.addParameter("LocalGatewayVirtualInterfaceId." + localGatewayVirtualInterfaceIdsListIndex,
                            StringUtils.fromString(describeLocalGatewayVirtualInterfacesRequestLocalGatewayVirtualInterfaceIdsListValue));
                }
                localGatewayVirtualInterfaceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLocalGatewayVirtualInterfacesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLocalGatewayVirtualInterfacesRequest
                .getFilters();
        if (!describeLocalGatewayVirtualInterfacesRequestFiltersList.isEmpty() || !describeLocalGatewayVirtualInterfacesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLocalGatewayVirtualInterfacesRequestFiltersListValue : describeLocalGatewayVirtualInterfacesRequestFiltersList) {

                if (describeLocalGatewayVirtualInterfacesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLocalGatewayVirtualInterfacesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayVirtualInterfacesRequestFiltersListValue
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

        if (describeLocalGatewayVirtualInterfacesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLocalGatewayVirtualInterfacesRequest.getMaxResults()));
        }

        if (describeLocalGatewayVirtualInterfacesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLocalGatewayVirtualInterfacesRequest.getNextToken()));
        }

        return request;
    }

}
