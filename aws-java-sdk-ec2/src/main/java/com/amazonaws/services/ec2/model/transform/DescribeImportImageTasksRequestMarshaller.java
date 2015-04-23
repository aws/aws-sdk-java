/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Import Image Tasks Request Marshaller
 */
public class DescribeImportImageTasksRequestMarshaller implements Marshaller<Request<DescribeImportImageTasksRequest>, DescribeImportImageTasksRequest> {

    public Request<DescribeImportImageTasksRequest> marshall(DescribeImportImageTasksRequest describeImportImageTasksRequest) {

        if (describeImportImageTasksRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeImportImageTasksRequest> request = new DefaultRequest<DescribeImportImageTasksRequest>(describeImportImageTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeImportImageTasks");
        request.addParameter("Version", "2015-03-01");

        java.util.List<String> importTaskIdsList = describeImportImageTasksRequest.getImportTaskIds();
        int importTaskIdsListIndex = 1;

        for (String importTaskIdsListValue : importTaskIdsList) {
            if (importTaskIdsListValue != null) {
                request.addParameter("ImportTaskId." + importTaskIdsListIndex, StringUtils.fromString(importTaskIdsListValue));
            }

            importTaskIdsListIndex++;
        }
        if (describeImportImageTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeImportImageTasksRequest.getNextToken()));
        }
        if (describeImportImageTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeImportImageTasksRequest.getMaxResults()));
        }

        java.util.List<Filter> filtersList = describeImportImageTasksRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filters." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filters." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }

        return request;
    }
}
