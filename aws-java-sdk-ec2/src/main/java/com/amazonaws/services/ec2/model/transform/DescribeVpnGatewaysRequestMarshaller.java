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
 * DescribeVpnGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpnGatewaysRequestMarshaller implements Marshaller<Request<DescribeVpnGatewaysRequest>, DescribeVpnGatewaysRequest> {

    public Request<DescribeVpnGatewaysRequest> marshall(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) {

        if (describeVpnGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpnGatewaysRequest> request = new DefaultRequest<DescribeVpnGatewaysRequest>(describeVpnGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpnGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeVpnGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpnGatewaysRequest
                .getFilters();
        if (!describeVpnGatewaysRequestFiltersList.isEmpty() || !describeVpnGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpnGatewaysRequestFiltersListValue : describeVpnGatewaysRequestFiltersList) {

                if (describeVpnGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeVpnGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpnGatewaysRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeVpnGatewaysRequestVpnGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpnGatewaysRequest
                .getVpnGatewayIds();
        if (!describeVpnGatewaysRequestVpnGatewayIdsList.isEmpty() || !describeVpnGatewaysRequestVpnGatewayIdsList.isAutoConstruct()) {
            int vpnGatewayIdsListIndex = 1;

            for (String describeVpnGatewaysRequestVpnGatewayIdsListValue : describeVpnGatewaysRequestVpnGatewayIdsList) {
                if (describeVpnGatewaysRequestVpnGatewayIdsListValue != null) {
                    request.addParameter("VpnGatewayId." + vpnGatewayIdsListIndex, StringUtils.fromString(describeVpnGatewaysRequestVpnGatewayIdsListValue));
                }
                vpnGatewayIdsListIndex++;
            }
        }

        return request;
    }

}
