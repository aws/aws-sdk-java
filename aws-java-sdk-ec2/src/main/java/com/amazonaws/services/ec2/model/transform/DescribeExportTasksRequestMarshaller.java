/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeExportTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportTasksRequestMarshaller implements Marshaller<Request<DescribeExportTasksRequest>, DescribeExportTasksRequest> {

    public Request<DescribeExportTasksRequest> marshall(DescribeExportTasksRequest describeExportTasksRequest) {

        if (describeExportTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeExportTasksRequest> request = new DefaultRequest<DescribeExportTasksRequest>(describeExportTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeExportTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeExportTasksRequestExportTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeExportTasksRequest
                .getExportTaskIds();
        if (!describeExportTasksRequestExportTaskIdsList.isEmpty() || !describeExportTasksRequestExportTaskIdsList.isAutoConstruct()) {
            int exportTaskIdsListIndex = 1;

            for (String describeExportTasksRequestExportTaskIdsListValue : describeExportTasksRequestExportTaskIdsList) {
                if (describeExportTasksRequestExportTaskIdsListValue != null) {
                    request.addParameter("ExportTaskId." + exportTaskIdsListIndex, StringUtils.fromString(describeExportTasksRequestExportTaskIdsListValue));
                }
                exportTaskIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeExportTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeExportTasksRequest
                .getFilters();
        if (!describeExportTasksRequestFiltersList.isEmpty() || !describeExportTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeExportTasksRequestFiltersListValue : describeExportTasksRequestFiltersList) {

                if (describeExportTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeExportTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeExportTasksRequestFiltersListValue
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
