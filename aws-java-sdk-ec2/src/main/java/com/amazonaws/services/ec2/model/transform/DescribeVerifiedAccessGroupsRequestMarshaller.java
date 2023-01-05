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
 * DescribeVerifiedAccessGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessGroupsRequestMarshaller implements
        Marshaller<Request<DescribeVerifiedAccessGroupsRequest>, DescribeVerifiedAccessGroupsRequest> {

    public Request<DescribeVerifiedAccessGroupsRequest> marshall(DescribeVerifiedAccessGroupsRequest describeVerifiedAccessGroupsRequest) {

        if (describeVerifiedAccessGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeVerifiedAccessGroupsRequest> request = new DefaultRequest<DescribeVerifiedAccessGroupsRequest>(describeVerifiedAccessGroupsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeVerifiedAccessGroups");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessGroupsRequest
                .getVerifiedAccessGroupIds();
        if (!describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsList.isEmpty()
                || !describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsList.isAutoConstruct()) {
            int verifiedAccessGroupIdsListIndex = 1;

            for (String describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsListValue : describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsList) {
                if (describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsListValue != null) {
                    request.addParameter("VerifiedAccessGroupId." + verifiedAccessGroupIdsListIndex,
                            StringUtils.fromString(describeVerifiedAccessGroupsRequestVerifiedAccessGroupIdsListValue));
                }
                verifiedAccessGroupIdsListIndex++;
            }
        }

        if (describeVerifiedAccessGroupsRequest.getVerifiedAccessInstanceId() != null) {
            request.addParameter("VerifiedAccessInstanceId", StringUtils.fromString(describeVerifiedAccessGroupsRequest.getVerifiedAccessInstanceId()));
        }

        if (describeVerifiedAccessGroupsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeVerifiedAccessGroupsRequest.getMaxResults()));
        }

        if (describeVerifiedAccessGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeVerifiedAccessGroupsRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeVerifiedAccessGroupsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeVerifiedAccessGroupsRequest
                .getFilters();
        if (!describeVerifiedAccessGroupsRequestFiltersList.isEmpty() || !describeVerifiedAccessGroupsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeVerifiedAccessGroupsRequestFiltersListValue : describeVerifiedAccessGroupsRequestFiltersList) {

                if (describeVerifiedAccessGroupsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeVerifiedAccessGroupsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeVerifiedAccessGroupsRequestFiltersListValue
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
