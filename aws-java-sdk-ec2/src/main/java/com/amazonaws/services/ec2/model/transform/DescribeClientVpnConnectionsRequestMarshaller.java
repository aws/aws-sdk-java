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
 * DescribeClientVpnConnectionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientVpnConnectionsRequestMarshaller implements
        Marshaller<Request<DescribeClientVpnConnectionsRequest>, DescribeClientVpnConnectionsRequest> {

    public Request<DescribeClientVpnConnectionsRequest> marshall(DescribeClientVpnConnectionsRequest describeClientVpnConnectionsRequest) {

        if (describeClientVpnConnectionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClientVpnConnectionsRequest> request = new DefaultRequest<DescribeClientVpnConnectionsRequest>(describeClientVpnConnectionsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeClientVpnConnections");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClientVpnConnectionsRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(describeClientVpnConnectionsRequest.getClientVpnEndpointId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeClientVpnConnectionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeClientVpnConnectionsRequest
                .getFilters();
        if (!describeClientVpnConnectionsRequestFiltersList.isEmpty() || !describeClientVpnConnectionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeClientVpnConnectionsRequestFiltersListValue : describeClientVpnConnectionsRequestFiltersList) {

                if (describeClientVpnConnectionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeClientVpnConnectionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClientVpnConnectionsRequestFiltersListValue
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

        if (describeClientVpnConnectionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeClientVpnConnectionsRequest.getNextToken()));
        }

        if (describeClientVpnConnectionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeClientVpnConnectionsRequest.getMaxResults()));
        }

        return request;
    }

}
