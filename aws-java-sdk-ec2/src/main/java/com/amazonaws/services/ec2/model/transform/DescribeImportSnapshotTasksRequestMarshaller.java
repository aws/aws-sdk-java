/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
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

public class DescribeImportSnapshotTasksRequestMarshaller
        implements
        Marshaller<Request<DescribeImportSnapshotTasksRequest>, DescribeImportSnapshotTasksRequest> {

    public Request<DescribeImportSnapshotTasksRequest> marshall(
            DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest) {

        if (describeImportSnapshotTasksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeImportSnapshotTasksRequest> request = new DefaultRequest<DescribeImportSnapshotTasksRequest>(
                describeImportSnapshotTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImportSnapshotTasks");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> importTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeImportSnapshotTasksRequest
                .getImportTaskIds();
        if (!importTaskIdsList.isEmpty()
                || !importTaskIdsList.isAutoConstruct()) {
            int importTaskIdsListIndex = 1;

            for (String importTaskIdsListValue : importTaskIdsList) {
                if (importTaskIdsListValue != null) {
                    request.addParameter("ImportTaskId."
                            + importTaskIdsListIndex,
                            StringUtils.fromString(importTaskIdsListValue));
                }
                importTaskIdsListIndex++;
            }
        }

        if (describeImportSnapshotTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeImportSnapshotTasksRequest
                            .getNextToken()));
        }

        if (describeImportSnapshotTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeImportSnapshotTasksRequest
                            .getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeImportSnapshotTasksRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters." + filtersListIndex
                            + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
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
