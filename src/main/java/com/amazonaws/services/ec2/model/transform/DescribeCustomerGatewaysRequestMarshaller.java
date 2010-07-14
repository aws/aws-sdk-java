/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Customer Gateways Request Marshaller
 */        
public class DescribeCustomerGatewaysRequestMarshaller implements Marshaller<Request<DescribeCustomerGatewaysRequest>, DescribeCustomerGatewaysRequest> {

    public Request<DescribeCustomerGatewaysRequest> marshall(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) {
        Request<DescribeCustomerGatewaysRequest> request = new DefaultRequest<DescribeCustomerGatewaysRequest>(describeCustomerGatewaysRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCustomerGateways");
        request.addParameter("Version", "2010-06-15");
        if (describeCustomerGatewaysRequest != null) {
            java.util.List<String> customerGatewayIdsList = describeCustomerGatewaysRequest.getCustomerGatewayIds();
            int customerGatewayIdsListIndex = 1;
            for (String customerGatewayIdsListValue : customerGatewayIdsList) { 
                if (customerGatewayIdsListValue != null) {
                    request.addParameter("CustomerGatewayId." + customerGatewayIdsListIndex, StringUtils.fromString(customerGatewayIdsListValue));
                }
                customerGatewayIdsListIndex++;
            }
        }

        if (describeCustomerGatewaysRequest != null) {
            java.util.List<Filter> filtersList = describeCustomerGatewaysRequest.getFilters();
            int filtersListIndex = 1;
            for (Filter filtersListValue : filtersList) { 
                if (filtersListValue != null) {
                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }
                }
                if (filtersListValue != null) {
                    java.util.List<String> valuesList = filtersListValue.getValues();
                    int valuesListIndex = 1;
                    for (String valuesListValue : valuesList) { 
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
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
