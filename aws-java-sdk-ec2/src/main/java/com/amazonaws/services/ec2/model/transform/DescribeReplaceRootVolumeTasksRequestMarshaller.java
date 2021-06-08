/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeReplaceRootVolumeTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplaceRootVolumeTasksRequestMarshaller implements
        Marshaller<Request<DescribeReplaceRootVolumeTasksRequest>, DescribeReplaceRootVolumeTasksRequest> {

    public Request<DescribeReplaceRootVolumeTasksRequest> marshall(DescribeReplaceRootVolumeTasksRequest describeReplaceRootVolumeTasksRequest) {

        if (describeReplaceRootVolumeTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReplaceRootVolumeTasksRequest> request = new DefaultRequest<DescribeReplaceRootVolumeTasksRequest>(
                describeReplaceRootVolumeTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReplaceRootVolumeTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeReplaceRootVolumeTasksRequest
                .getReplaceRootVolumeTaskIds();
        if (!describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsList.isEmpty()
                || !describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsList.isAutoConstruct()) {
            int replaceRootVolumeTaskIdsListIndex = 1;

            for (String describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsListValue : describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsList) {
                if (describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsListValue != null) {
                    request.addParameter("ReplaceRootVolumeTaskId." + replaceRootVolumeTaskIdsListIndex,
                            StringUtils.fromString(describeReplaceRootVolumeTasksRequestReplaceRootVolumeTaskIdsListValue));
                }
                replaceRootVolumeTaskIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeReplaceRootVolumeTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReplaceRootVolumeTasksRequest
                .getFilters();
        if (!describeReplaceRootVolumeTasksRequestFiltersList.isEmpty() || !describeReplaceRootVolumeTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeReplaceRootVolumeTasksRequestFiltersListValue : describeReplaceRootVolumeTasksRequestFiltersList) {

                if (describeReplaceRootVolumeTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeReplaceRootVolumeTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeReplaceRootVolumeTasksRequestFiltersListValue
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

        if (describeReplaceRootVolumeTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeReplaceRootVolumeTasksRequest.getMaxResults()));
        }

        if (describeReplaceRootVolumeTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeReplaceRootVolumeTasksRequest.getNextToken()));
        }

        return request;
    }

}
