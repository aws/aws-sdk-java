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
 * DescribeExportImageTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportImageTasksRequestMarshaller implements Marshaller<Request<DescribeExportImageTasksRequest>, DescribeExportImageTasksRequest> {

    public Request<DescribeExportImageTasksRequest> marshall(DescribeExportImageTasksRequest describeExportImageTasksRequest) {

        if (describeExportImageTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeExportImageTasksRequest> request = new DefaultRequest<DescribeExportImageTasksRequest>(describeExportImageTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeExportImageTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeExportImageTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeExportImageTasksRequest
                .getFilters();
        if (!describeExportImageTasksRequestFiltersList.isEmpty() || !describeExportImageTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeExportImageTasksRequestFiltersListValue : describeExportImageTasksRequestFiltersList) {

                if (describeExportImageTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeExportImageTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeExportImageTasksRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeExportImageTasksRequestExportImageTaskIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeExportImageTasksRequest
                .getExportImageTaskIds();
        if (!describeExportImageTasksRequestExportImageTaskIdsList.isEmpty() || !describeExportImageTasksRequestExportImageTaskIdsList.isAutoConstruct()) {
            int exportImageTaskIdsListIndex = 1;

            for (String describeExportImageTasksRequestExportImageTaskIdsListValue : describeExportImageTasksRequestExportImageTaskIdsList) {
                if (describeExportImageTasksRequestExportImageTaskIdsListValue != null) {
                    request.addParameter("ExportImageTaskId." + exportImageTaskIdsListIndex,
                            StringUtils.fromString(describeExportImageTasksRequestExportImageTaskIdsListValue));
                }
                exportImageTaskIdsListIndex++;
            }
        }

        if (describeExportImageTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeExportImageTasksRequest.getMaxResults()));
        }

        if (describeExportImageTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeExportImageTasksRequest.getNextToken()));
        }

        return request;
    }

}
