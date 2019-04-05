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
 * DescribeVpcEndpointsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointsRequestMarshaller implements Marshaller<Request<DescribeVpcEndpointsRequest>, DescribeVpcEndpointsRequest> {

    public Request<DescribeVpcEndpointsRequest> marshall(DescribeVpcEndpointsRequest describeVpcEndpointsRequest) {

        if (describeVpcEndpointsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVpcEndpointsRequest> request = new DefaultRequest<DescribeVpcEndpointsRequest>(describeVpcEndpointsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVpcEndpoints");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVpcEndpointsRequestVpcEndpointIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointsRequest
                .getVpcEndpointIds();
        if (!describeVpcEndpointsRequestVpcEndpointIdsList.isEmpty() || !describeVpcEndpointsRequestVpcEndpointIdsList.isAutoConstruct()) {
            int vpcEndpointIdsListIndex = 1;

            for (String describeVpcEndpointsRequestVpcEndpointIdsListValue : describeVpcEndpointsRequestVpcEndpointIdsList) {
                if (describeVpcEndpointsRequestVpcEndpointIdsListValue != null) {
                    request.addParameter("VpcEndpointId." + vpcEndpointIdsListIndex, StringUtils.fromString(describeVpcEndpointsRequestVpcEndpointIdsListValue));
                }
                vpcEndpointIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVpcEndpointsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVpcEndpointsRequest
                .getFilters();
        if (!describeVpcEndpointsRequestFiltersList.isEmpty() || !describeVpcEndpointsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVpcEndpointsRequestFiltersListValue : describeVpcEndpointsRequestFiltersList) {

                if (describeVpcEndpointsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeVpcEndpointsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVpcEndpointsRequestFiltersListValue
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

        if (describeVpcEndpointsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVpcEndpointsRequest.getMaxResults()));
        }

        if (describeVpcEndpointsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVpcEndpointsRequest.getNextToken()));
        }

        return request;
    }

}
