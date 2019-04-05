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
 * DescribeVpcEndpointServicesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServicesRequestMarshaller implements
        Marshaller<Request<DescribeVpcEndpointServicesRequest>, DescribeVpcEndpointServicesRequest> {

    public Request<DescribeVpcEndpointServicesRequest> marshall(DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest) {

        if (describeVpcEndpointServicesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcEndpointServicesRequest> request = new DefaultRequest<DescribeVpcEndpointServicesRequest>(describeVpcEndpointServicesRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeVpcEndpointServices");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVpcEndpointServicesRequestServiceNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointServicesRequest
                .getServiceNames();
        if (!describeVpcEndpointServicesRequestServiceNamesList.isEmpty() || !describeVpcEndpointServicesRequestServiceNamesList.isAutoConstruct()) {
            int serviceNamesListIndex = 1;

            for (String describeVpcEndpointServicesRequestServiceNamesListValue : describeVpcEndpointServicesRequestServiceNamesList) {
                if (describeVpcEndpointServicesRequestServiceNamesListValue != null) {
                    request.addParameter("ServiceName." + serviceNamesListIndex,
                            StringUtils.fromString(describeVpcEndpointServicesRequestServiceNamesListValue));
                }
                serviceNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcEndpointServicesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcEndpointServicesRequest
                .getFilters();
        if (!describeVpcEndpointServicesRequestFiltersList.isEmpty() || !describeVpcEndpointServicesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcEndpointServicesRequestFiltersListValue : describeVpcEndpointServicesRequestFiltersList) {

                if (describeVpcEndpointServicesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcEndpointServicesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointServicesRequestFiltersListValue
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

        if (describeVpcEndpointServicesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcEndpointServicesRequest.getMaxResults()));
        }

        if (describeVpcEndpointServicesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcEndpointServicesRequest.getNextToken()));
        }

        return request;
    }

}
