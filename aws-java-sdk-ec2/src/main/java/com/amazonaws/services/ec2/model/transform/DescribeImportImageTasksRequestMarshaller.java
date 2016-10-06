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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeImportImageTasksRequest Marshaller
 */

public class DescribeImportImageTasksRequestMarshaller implements Marshaller<Request<DescribeImportImageTasksRequest>, DescribeImportImageTasksRequest> {

    public Request<DescribeImportImageTasksRequest> marshall(DescribeImportImageTasksRequest describeImportImageTasksRequest) {

        if (describeImportImageTasksRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeImportImageTasksRequest> request = new DefaultRequest<DescribeImportImageTasksRequest>(describeImportImageTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImportImageTasks");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeImportImageTasksRequestImportTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeImportImageTasksRequest
                .getImportTaskIds();
        if (!describeImportImageTasksRequestImportTaskIdsList.isEmpty() || !describeImportImageTasksRequestImportTaskIdsList.isAutoConstruct()) {
            int importTaskIdsListIndex = 1;

            for (String describeImportImageTasksRequestImportTaskIdsListValue : describeImportImageTasksRequestImportTaskIdsList) {
                if (describeImportImageTasksRequestImportTaskIdsListValue != null) {
                    request.addParameter("ImportTaskId." + importTaskIdsListIndex,
                            StringUtils.fromString(describeImportImageTasksRequestImportTaskIdsListValue));
                }
                importTaskIdsListIndex++;
            }
        }

        if (describeImportImageTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeImportImageTasksRequest.getNextToken()));
        }

        if (describeImportImageTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeImportImageTasksRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeImportImageTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeImportImageTasksRequest
                .getFilters();
        if (!describeImportImageTasksRequestFiltersList.isEmpty() || !describeImportImageTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeImportImageTasksRequestFiltersListValue : describeImportImageTasksRequestFiltersList) {

                if (describeImportImageTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filters." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeImportImageTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeImportImageTasksRequestFiltersListValue
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
