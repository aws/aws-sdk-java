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
 * DescribeInternetGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInternetGatewaysRequestMarshaller implements Marshaller<Request<DescribeInternetGatewaysRequest>, DescribeInternetGatewaysRequest> {

    public Request<DescribeInternetGatewaysRequest> marshall(DescribeInternetGatewaysRequest describeInternetGatewaysRequest) {

        if (describeInternetGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInternetGatewaysRequest> request = new DefaultRequest<DescribeInternetGatewaysRequest>(describeInternetGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInternetGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeInternetGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInternetGatewaysRequest
                .getFilters();
        if (!describeInternetGatewaysRequestFiltersList.isEmpty() || !describeInternetGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInternetGatewaysRequestFiltersListValue : describeInternetGatewaysRequestFiltersList) {

                if (describeInternetGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInternetGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInternetGatewaysRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeInternetGatewaysRequestInternetGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInternetGatewaysRequest
                .getInternetGatewayIds();
        if (!describeInternetGatewaysRequestInternetGatewayIdsList.isEmpty() || !describeInternetGatewaysRequestInternetGatewayIdsList.isAutoConstruct()) {
            int internetGatewayIdsListIndex = 1;

            for (String describeInternetGatewaysRequestInternetGatewayIdsListValue : describeInternetGatewaysRequestInternetGatewayIdsList) {
                if (describeInternetGatewaysRequestInternetGatewayIdsListValue != null) {
                    request.addParameter("InternetGatewayId." + internetGatewayIdsListIndex,
                            StringUtils.fromString(describeInternetGatewaysRequestInternetGatewayIdsListValue));
                }
                internetGatewayIdsListIndex++;
            }
        }

        if (describeInternetGatewaysRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInternetGatewaysRequest.getNextToken()));
        }

        if (describeInternetGatewaysRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInternetGatewaysRequest.getMaxResults()));
        }

        return request;
    }

}
