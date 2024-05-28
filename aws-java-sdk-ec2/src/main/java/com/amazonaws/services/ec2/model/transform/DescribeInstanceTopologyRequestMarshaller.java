/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeInstanceTopologyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTopologyRequestMarshaller implements Marshaller<Request<DescribeInstanceTopologyRequest>, DescribeInstanceTopologyRequest> {

    public Request<DescribeInstanceTopologyRequest> marshall(DescribeInstanceTopologyRequest describeInstanceTopologyRequest) {

        if (describeInstanceTopologyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceTopologyRequest> request = new DefaultRequest<DescribeInstanceTopologyRequest>(describeInstanceTopologyRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceTopology");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeInstanceTopologyRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceTopologyRequest.getNextToken()));
        }

        if (describeInstanceTopologyRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceTopologyRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeInstanceTopologyRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTopologyRequest
                .getInstanceIds();
        if (!describeInstanceTopologyRequestInstanceIdsList.isEmpty() || !describeInstanceTopologyRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String describeInstanceTopologyRequestInstanceIdsListValue : describeInstanceTopologyRequestInstanceIdsList) {
                if (describeInstanceTopologyRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(describeInstanceTopologyRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeInstanceTopologyRequestGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTopologyRequest
                .getGroupNames();
        if (!describeInstanceTopologyRequestGroupNamesList.isEmpty() || !describeInstanceTopologyRequestGroupNamesList.isAutoConstruct()) {
            int groupNamesListIndex = 1;

            for (String describeInstanceTopologyRequestGroupNamesListValue : describeInstanceTopologyRequestGroupNamesList) {
                if (describeInstanceTopologyRequestGroupNamesListValue != null) {
                    request.addParameter("GroupName." + groupNamesListIndex, StringUtils.fromString(describeInstanceTopologyRequestGroupNamesListValue));
                }
                groupNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceTopologyRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceTopologyRequest
                .getFilters();
        if (!describeInstanceTopologyRequestFiltersList.isEmpty() || !describeInstanceTopologyRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceTopologyRequestFiltersListValue : describeInstanceTopologyRequestFiltersList) {

                if (describeInstanceTopologyRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInstanceTopologyRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTopologyRequestFiltersListValue
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
