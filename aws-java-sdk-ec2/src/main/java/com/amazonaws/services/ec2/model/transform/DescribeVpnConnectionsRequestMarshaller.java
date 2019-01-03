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
 * DescribeVpnConnectionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpnConnectionsRequestMarshaller implements Marshaller<Request<DescribeVpnConnectionsRequest>, DescribeVpnConnectionsRequest> {

    public Request<DescribeVpnConnectionsRequest> marshall(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) {

        if (describeVpnConnectionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpnConnectionsRequest> request = new DefaultRequest<DescribeVpnConnectionsRequest>(describeVpnConnectionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpnConnections");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVpnConnectionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpnConnectionsRequest
                .getFilters();
        if (!describeVpnConnectionsRequestFiltersList.isEmpty() || !describeVpnConnectionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpnConnectionsRequestFiltersListValue : describeVpnConnectionsRequestFiltersList) {

                if (describeVpnConnectionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpnConnectionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpnConnectionsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVpnConnectionsRequestVpnConnectionIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpnConnectionsRequest
                .getVpnConnectionIds();
        if (!describeVpnConnectionsRequestVpnConnectionIdsList.isEmpty() || !describeVpnConnectionsRequestVpnConnectionIdsList.isAutoConstruct()) {
            int vpnConnectionIdsListIndex = 1;

            for (String describeVpnConnectionsRequestVpnConnectionIdsListValue : describeVpnConnectionsRequestVpnConnectionIdsList) {
                if (describeVpnConnectionsRequestVpnConnectionIdsListValue != null) {
                    request.addParameter("VpnConnectionId." + vpnConnectionIdsListIndex,
                            StringUtils.fromString(describeVpnConnectionsRequestVpnConnectionIdsListValue));
                }
                vpnConnectionIdsListIndex++;
            }
        }

        return request;
    }

}
