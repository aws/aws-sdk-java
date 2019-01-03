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
 * DescribeVpcEndpointServiceConfigurationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServiceConfigurationsRequestMarshaller implements
        Marshaller<Request<DescribeVpcEndpointServiceConfigurationsRequest>, DescribeVpcEndpointServiceConfigurationsRequest> {

    public Request<DescribeVpcEndpointServiceConfigurationsRequest> marshall(
            DescribeVpcEndpointServiceConfigurationsRequest describeVpcEndpointServiceConfigurationsRequest) {

        if (describeVpcEndpointServiceConfigurationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcEndpointServiceConfigurationsRequest> request = new DefaultRequest<DescribeVpcEndpointServiceConfigurationsRequest>(
                describeVpcEndpointServiceConfigurationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcEndpointServiceConfigurations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVpcEndpointServiceConfigurationsRequestServiceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointServiceConfigurationsRequest
                .getServiceIds();
        if (!describeVpcEndpointServiceConfigurationsRequestServiceIdsList.isEmpty()
                || !describeVpcEndpointServiceConfigurationsRequestServiceIdsList.isAutoConstruct()) {
            int serviceIdsListIndex = 1;

            for (String describeVpcEndpointServiceConfigurationsRequestServiceIdsListValue : describeVpcEndpointServiceConfigurationsRequestServiceIdsList) {
                if (describeVpcEndpointServiceConfigurationsRequestServiceIdsListValue != null) {
                    request.addParameter("ServiceId." + serviceIdsListIndex,
                            StringUtils.fromString(describeVpcEndpointServiceConfigurationsRequestServiceIdsListValue));
                }
                serviceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcEndpointServiceConfigurationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcEndpointServiceConfigurationsRequest
                .getFilters();
        if (!describeVpcEndpointServiceConfigurationsRequestFiltersList.isEmpty()
                || !describeVpcEndpointServiceConfigurationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcEndpointServiceConfigurationsRequestFiltersListValue : describeVpcEndpointServiceConfigurationsRequestFiltersList) {

                if (describeVpcEndpointServiceConfigurationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVpcEndpointServiceConfigurationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointServiceConfigurationsRequestFiltersListValue
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

        if (describeVpcEndpointServiceConfigurationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcEndpointServiceConfigurationsRequest.getMaxResults()));
        }

        if (describeVpcEndpointServiceConfigurationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcEndpointServiceConfigurationsRequest.getNextToken()));
        }

        return request;
    }

}
