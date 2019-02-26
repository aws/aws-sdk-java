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
 * DescribeVpcPeeringConnectionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcPeeringConnectionsRequestMarshaller implements
        Marshaller<Request<DescribeVpcPeeringConnectionsRequest>, DescribeVpcPeeringConnectionsRequest> {

    public Request<DescribeVpcPeeringConnectionsRequest> marshall(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) {

        if (describeVpcPeeringConnectionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcPeeringConnectionsRequest> request = new DefaultRequest<DescribeVpcPeeringConnectionsRequest>(describeVpcPeeringConnectionsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeVpcPeeringConnections");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcPeeringConnectionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcPeeringConnectionsRequest
                .getFilters();
        if (!describeVpcPeeringConnectionsRequestFiltersList.isEmpty() || !describeVpcPeeringConnectionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcPeeringConnectionsRequestFiltersListValue : describeVpcPeeringConnectionsRequestFiltersList) {

                if (describeVpcPeeringConnectionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcPeeringConnectionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcPeeringConnectionsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcPeeringConnectionsRequest
                .getVpcPeeringConnectionIds();
        if (!describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsList.isEmpty()
                || !describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsList.isAutoConstruct()) {
            int vpcPeeringConnectionIdsListIndex = 1;

            for (String describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsListValue : describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsList) {
                if (describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsListValue != null) {
                    request.addParameter("VpcPeeringConnectionId." + vpcPeeringConnectionIdsListIndex,
                            StringUtils.fromString(describeVpcPeeringConnectionsRequestVpcPeeringConnectionIdsListValue));
                }
                vpcPeeringConnectionIdsListIndex++;
            }
        }

        if (describeVpcPeeringConnectionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcPeeringConnectionsRequest.getNextToken()));
        }

        if (describeVpcPeeringConnectionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcPeeringConnectionsRequest.getMaxResults()));
        }

        return request;
    }

}
