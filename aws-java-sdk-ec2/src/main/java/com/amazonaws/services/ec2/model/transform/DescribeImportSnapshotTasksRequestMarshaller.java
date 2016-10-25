/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeImportSnapshotTasksRequest Marshaller
 */

public class DescribeImportSnapshotTasksRequestMarshaller implements
        Marshaller<Request<DescribeImportSnapshotTasksRequest>, DescribeImportSnapshotTasksRequest> {

    public Request<DescribeImportSnapshotTasksRequest> marshall(DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest) {

        if (describeImportSnapshotTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeImportSnapshotTasksRequest> request = new DefaultRequest<DescribeImportSnapshotTasksRequest>(describeImportSnapshotTasksRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeImportSnapshotTasks");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeImportSnapshotTasksRequestImportTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeImportSnapshotTasksRequest
                .getImportTaskIds();
        if (!describeImportSnapshotTasksRequestImportTaskIdsList.isEmpty() || !describeImportSnapshotTasksRequestImportTaskIdsList.isAutoConstruct()) {
            int importTaskIdsListIndex = 1;

            for (String describeImportSnapshotTasksRequestImportTaskIdsListValue : describeImportSnapshotTasksRequestImportTaskIdsList) {
                if (describeImportSnapshotTasksRequestImportTaskIdsListValue != null) {
                    request.addParameter("ImportTaskId." + importTaskIdsListIndex,
                            StringUtils.fromString(describeImportSnapshotTasksRequestImportTaskIdsListValue));
                }
                importTaskIdsListIndex++;
            }
        }

        if (describeImportSnapshotTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeImportSnapshotTasksRequest.getNextToken()));
        }

        if (describeImportSnapshotTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeImportSnapshotTasksRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeImportSnapshotTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeImportSnapshotTasksRequest
                .getFilters();
        if (!describeImportSnapshotTasksRequestFiltersList.isEmpty() || !describeImportSnapshotTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeImportSnapshotTasksRequestFiltersListValue : describeImportSnapshotTasksRequestFiltersList) {

                if (describeImportSnapshotTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filters." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeImportSnapshotTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeImportSnapshotTasksRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filters." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
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
