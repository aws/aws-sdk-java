/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeVerifiedAccessEndpointsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessEndpointsRequestMarshaller implements
        Marshaller<Request<DescribeVerifiedAccessEndpointsRequest>, DescribeVerifiedAccessEndpointsRequest> {

    public Request<DescribeVerifiedAccessEndpointsRequest> marshall(DescribeVerifiedAccessEndpointsRequest describeVerifiedAccessEndpointsRequest) {

        if (describeVerifiedAccessEndpointsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVerifiedAccessEndpointsRequest> request = new DefaultRequest<DescribeVerifiedAccessEndpointsRequest>(
                describeVerifiedAccessEndpointsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVerifiedAccessEndpoints");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessEndpointsRequest
                .getVerifiedAccessEndpointIds();
        if (!describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsList.isEmpty()
                || !describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsList.isAutoConstruct()) {
            int verifiedAccessEndpointIdsListIndex = 1;

            for (String describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsListValue : describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsList) {
                if (describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsListValue != null) {
                    request.addParameter("VerifiedAccessEndpointId." + verifiedAccessEndpointIdsListIndex,
                            StringUtils.fromString(describeVerifiedAccessEndpointsRequestVerifiedAccessEndpointIdsListValue));
                }
                verifiedAccessEndpointIdsListIndex++;
            }
        }

        if (describeVerifiedAccessEndpointsRequest.getVerifiedAccessInstanceId() != null) {
            request.addParameter("VerifiedAccessInstanceId", StringUtils.fromString(describeVerifiedAccessEndpointsRequest.getVerifiedAccessInstanceId()));
        }

        if (describeVerifiedAccessEndpointsRequest.getVerifiedAccessGroupId() != null) {
            request.addParameter("VerifiedAccessGroupId", StringUtils.fromString(describeVerifiedAccessEndpointsRequest.getVerifiedAccessGroupId()));
        }

        if (describeVerifiedAccessEndpointsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVerifiedAccessEndpointsRequest.getMaxResults()));
        }

        if (describeVerifiedAccessEndpointsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVerifiedAccessEndpointsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVerifiedAccessEndpointsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVerifiedAccessEndpointsRequest
                .getFilters();
        if (!describeVerifiedAccessEndpointsRequestFiltersList.isEmpty() || !describeVerifiedAccessEndpointsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVerifiedAccessEndpointsRequestFiltersListValue : describeVerifiedAccessEndpointsRequestFiltersList) {

                if (describeVerifiedAccessEndpointsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVerifiedAccessEndpointsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessEndpointsRequestFiltersListValue
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
