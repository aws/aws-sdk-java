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
 * DescribeLocalGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewaysRequestMarshaller implements Marshaller<Request<DescribeLocalGatewaysRequest>, DescribeLocalGatewaysRequest> {

    public Request<DescribeLocalGatewaysRequest> marshall(DescribeLocalGatewaysRequest describeLocalGatewaysRequest) {

        if (describeLocalGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLocalGatewaysRequest> request = new DefaultRequest<DescribeLocalGatewaysRequest>(describeLocalGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeLocalGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeLocalGatewaysRequestLocalGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewaysRequest
                .getLocalGatewayIds();
        if (!describeLocalGatewaysRequestLocalGatewayIdsList.isEmpty() || !describeLocalGatewaysRequestLocalGatewayIdsList.isAutoConstruct()) {
            int localGatewayIdsListIndex = 1;

            for (String describeLocalGatewaysRequestLocalGatewayIdsListValue : describeLocalGatewaysRequestLocalGatewayIdsList) {
                if (describeLocalGatewaysRequestLocalGatewayIdsListValue != null) {
                    request.addParameter("LocalGatewayId." + localGatewayIdsListIndex,
                            StringUtils.fromString(describeLocalGatewaysRequestLocalGatewayIdsListValue));
                }
                localGatewayIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeLocalGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeLocalGatewaysRequest
                .getFilters();
        if (!describeLocalGatewaysRequestFiltersList.isEmpty() || !describeLocalGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeLocalGatewaysRequestFiltersListValue : describeLocalGatewaysRequestFiltersList) {

                if (describeLocalGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeLocalGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeLocalGatewaysRequestFiltersListValue
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

        if (describeLocalGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeLocalGatewaysRequest.getMaxResults()));
        }

        if (describeLocalGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeLocalGatewaysRequest.getNextToken()));
        }

        return request;
    }

}
