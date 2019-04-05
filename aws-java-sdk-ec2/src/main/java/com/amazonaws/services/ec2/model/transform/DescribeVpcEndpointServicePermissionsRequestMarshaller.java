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
 * DescribeVpcEndpointServicePermissionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServicePermissionsRequestMarshaller implements
        Marshaller<Request<DescribeVpcEndpointServicePermissionsRequest>, DescribeVpcEndpointServicePermissionsRequest> {

    public Request<DescribeVpcEndpointServicePermissionsRequest> marshall(
            DescribeVpcEndpointServicePermissionsRequest describeVpcEndpointServicePermissionsRequest) {

        if (describeVpcEndpointServicePermissionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcEndpointServicePermissionsRequest> request = new DefaultRequest<DescribeVpcEndpointServicePermissionsRequest>(
                describeVpcEndpointServicePermissionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcEndpointServicePermissions");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeVpcEndpointServicePermissionsRequest.getServiceId() != null) {
            request.addParameter("ServiceId", StringUtils.fromString(describeVpcEndpointServicePermissionsRequest.getServiceId()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcEndpointServicePermissionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcEndpointServicePermissionsRequest
                .getFilters();
        if (!describeVpcEndpointServicePermissionsRequestFiltersList.isEmpty() || !describeVpcEndpointServicePermissionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcEndpointServicePermissionsRequestFiltersListValue : describeVpcEndpointServicePermissionsRequestFiltersList) {

                if (describeVpcEndpointServicePermissionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcEndpointServicePermissionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointServicePermissionsRequestFiltersListValue
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

        if (describeVpcEndpointServicePermissionsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcEndpointServicePermissionsRequest.getMaxResults()));
        }

        if (describeVpcEndpointServicePermissionsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcEndpointServicePermissionsRequest.getNextToken()));
        }

        return request;
    }

}
