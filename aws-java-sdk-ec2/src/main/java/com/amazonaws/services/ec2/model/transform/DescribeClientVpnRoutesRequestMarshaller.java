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
 * DescribeClientVpnRoutesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientVpnRoutesRequestMarshaller implements Marshaller<Request<DescribeClientVpnRoutesRequest>, DescribeClientVpnRoutesRequest> {

    public Request<DescribeClientVpnRoutesRequest> marshall(DescribeClientVpnRoutesRequest describeClientVpnRoutesRequest) {

        if (describeClientVpnRoutesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeClientVpnRoutesRequest> request = new DefaultRequest<DescribeClientVpnRoutesRequest>(describeClientVpnRoutesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeClientVpnRoutes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeClientVpnRoutesRequest.getClientVpnEndpointId() != null) {
            request.addParameter("ClientVpnEndpointId", StringUtils.fromString(describeClientVpnRoutesRequest.getClientVpnEndpointId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeClientVpnRoutesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeClientVpnRoutesRequest
                .getFilters();
        if (!describeClientVpnRoutesRequestFiltersList.isEmpty() || !describeClientVpnRoutesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeClientVpnRoutesRequestFiltersListValue : describeClientVpnRoutesRequestFiltersList) {

                if (describeClientVpnRoutesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeClientVpnRoutesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeClientVpnRoutesRequestFiltersListValue
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

        if (describeClientVpnRoutesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeClientVpnRoutesRequest.getMaxResults()));
        }

        if (describeClientVpnRoutesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeClientVpnRoutesRequest.getNextToken()));
        }

        return request;
    }

}
