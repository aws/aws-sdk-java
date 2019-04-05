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
 * DescribeSecurityGroupsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityGroupsRequestMarshaller implements Marshaller<Request<DescribeSecurityGroupsRequest>, DescribeSecurityGroupsRequest> {

    public Request<DescribeSecurityGroupsRequest> marshall(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) {

        if (describeSecurityGroupsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSecurityGroupsRequest> request = new DefaultRequest<DescribeSecurityGroupsRequest>(describeSecurityGroupsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSecurityGroups");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeSecurityGroupsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSecurityGroupsRequest
                .getFilters();
        if (!describeSecurityGroupsRequestFiltersList.isEmpty() || !describeSecurityGroupsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSecurityGroupsRequestFiltersListValue : describeSecurityGroupsRequestFiltersList) {

                if (describeSecurityGroupsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeSecurityGroupsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSecurityGroupsRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeSecurityGroupsRequestGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeSecurityGroupsRequest
                .getGroupIds();
        if (!describeSecurityGroupsRequestGroupIdsList.isEmpty() || !describeSecurityGroupsRequestGroupIdsList.isAutoConstruct()) {
            int groupIdsListIndex = 1;

            for (String describeSecurityGroupsRequestGroupIdsListValue : describeSecurityGroupsRequestGroupIdsList) {
                if (describeSecurityGroupsRequestGroupIdsListValue != null) {
                    request.addParameter("GroupId." + groupIdsListIndex, StringUtils.fromString(describeSecurityGroupsRequestGroupIdsListValue));
                }
                groupIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeSecurityGroupsRequestGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeSecurityGroupsRequest
                .getGroupNames();
        if (!describeSecurityGroupsRequestGroupNamesList.isEmpty() || !describeSecurityGroupsRequestGroupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String describeSecurityGroupsRequestGroupNamesListValue : describeSecurityGroupsRequestGroupNamesList) {
                if (describeSecurityGroupsRequestGroupNamesListValue != null) {
                    request.addParameter("GroupName." + groupNamesListIndex, StringUtils.fromString(describeSecurityGroupsRequestGroupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        if (describeSecurityGroupsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSecurityGroupsRequest.getNextToken()));
        }

        if (describeSecurityGroupsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSecurityGroupsRequest.getMaxResults()));
        }

        return request;
    }

}
