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
 * DescribeVerifiedAccessInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessInstancesRequestMarshaller implements
        Marshaller<Request<DescribeVerifiedAccessInstancesRequest>, DescribeVerifiedAccessInstancesRequest> {

    public Request<DescribeVerifiedAccessInstancesRequest> marshall(DescribeVerifiedAccessInstancesRequest describeVerifiedAccessInstancesRequest) {

        if (describeVerifiedAccessInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVerifiedAccessInstancesRequest> request = new DefaultRequest<DescribeVerifiedAccessInstancesRequest>(
                describeVerifiedAccessInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeVerifiedAccessInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessInstancesRequest
                .getVerifiedAccessInstanceIds();
        if (!describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsList.isEmpty()
                || !describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsList.isAutoConstruct()) {
            int verifiedAccessInstanceIdsListIndex = 1;

            for (String describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsListValue : describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsList) {
                if (describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsListValue != null) {
                    request.addParameter("VerifiedAccessInstanceId." + verifiedAccessInstanceIdsListIndex,
                            StringUtils.fromString(describeVerifiedAccessInstancesRequestVerifiedAccessInstanceIdsListValue));
                }
                verifiedAccessInstanceIdsListIndex++;
            }
        }

        if (describeVerifiedAccessInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVerifiedAccessInstancesRequest.getMaxResults()));
        }

        if (describeVerifiedAccessInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVerifiedAccessInstancesRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVerifiedAccessInstancesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVerifiedAccessInstancesRequest
                .getFilters();
        if (!describeVerifiedAccessInstancesRequestFiltersList.isEmpty() || !describeVerifiedAccessInstancesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVerifiedAccessInstancesRequestFiltersListValue : describeVerifiedAccessInstancesRequestFiltersList) {

                if (describeVerifiedAccessInstancesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVerifiedAccessInstancesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessInstancesRequestFiltersListValue
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
