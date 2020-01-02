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
 * DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestMarshaller
        implements
        Marshaller<Request<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest>, DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> {

    public Request<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> marshall(
            DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest) {

        if (describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> request = new DefaultRequest<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest>(
                describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
                .getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds();
        if (!describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsList.isEmpty()
                || !describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsList
                        .isAutoConstruct()) {
            int localGatewayRouteTableVirtualInterfaceGroupAssociationIdsListIndex = 1;

            for (String describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsListValue : describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsList) {
                if (describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsListValue != null) {
                    request.addParameter(
                            "LocalGatewayRouteTableVirtualInterfaceGroupAssociationId." + localGatewayRouteTableVirtualInterfaceGroupAssociationIdsListIndex,
                            StringUtils
                                    .fromString(describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestLocalGatewayRouteTableVirtualInterfaceGroupAssociationIdsListValue));
                }
                localGatewayRouteTableVirtualInterfaceGroupAssociationIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest
                .getFilters();
        if (!describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersList.isEmpty()
                || !describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersListValue : describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersList) {

                if (describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestFiltersListValue
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

        if (describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.getMaxResults()));
        }

        if (describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest.getNextToken()));
        }

        return request;
    }

}
