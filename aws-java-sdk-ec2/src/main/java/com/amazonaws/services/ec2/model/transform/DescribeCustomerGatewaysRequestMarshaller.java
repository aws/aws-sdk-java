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
 * DescribeCustomerGatewaysRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomerGatewaysRequestMarshaller implements Marshaller<Request<DescribeCustomerGatewaysRequest>, DescribeCustomerGatewaysRequest> {

    public Request<DescribeCustomerGatewaysRequest> marshall(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) {

        if (describeCustomerGatewaysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCustomerGatewaysRequest> request = new DefaultRequest<DescribeCustomerGatewaysRequest>(describeCustomerGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCustomerGateways");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeCustomerGatewaysRequestCustomerGatewayIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCustomerGatewaysRequest
                .getCustomerGatewayIds();
        if (!describeCustomerGatewaysRequestCustomerGatewayIdsList.isEmpty() || !describeCustomerGatewaysRequestCustomerGatewayIdsList.isAutoConstruct()) {
            int customerGatewayIdsListIndex = 1;

            for (String describeCustomerGatewaysRequestCustomerGatewayIdsListValue : describeCustomerGatewaysRequestCustomerGatewayIdsList) {
                if (describeCustomerGatewaysRequestCustomerGatewayIdsListValue != null) {
                    request.addParameter("CustomerGatewayId." + customerGatewayIdsListIndex,
                            StringUtils.fromString(describeCustomerGatewaysRequestCustomerGatewayIdsListValue));
                }
                customerGatewayIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeCustomerGatewaysRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeCustomerGatewaysRequest
                .getFilters();
        if (!describeCustomerGatewaysRequestFiltersList.isEmpty() || !describeCustomerGatewaysRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeCustomerGatewaysRequestFiltersListValue : describeCustomerGatewaysRequestFiltersList) {

                if (describeCustomerGatewaysRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeCustomerGatewaysRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeCustomerGatewaysRequestFiltersListValue
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

        return request;
    }

}
