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
 * DescribeStoreImageTasksRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStoreImageTasksRequestMarshaller implements Marshaller<Request<DescribeStoreImageTasksRequest>, DescribeStoreImageTasksRequest> {

    public Request<DescribeStoreImageTasksRequest> marshall(DescribeStoreImageTasksRequest describeStoreImageTasksRequest) {

        if (describeStoreImageTasksRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeStoreImageTasksRequest> request = new DefaultRequest<DescribeStoreImageTasksRequest>(describeStoreImageTasksRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeStoreImageTasks");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeStoreImageTasksRequestImageIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeStoreImageTasksRequest
                .getImageIds();
        if (!describeStoreImageTasksRequestImageIdsList.isEmpty() || !describeStoreImageTasksRequestImageIdsList.isAutoConstruct()) {
            int imageIdsListIndex = 1;

            for (String describeStoreImageTasksRequestImageIdsListValue : describeStoreImageTasksRequestImageIdsList) {
                if (describeStoreImageTasksRequestImageIdsListValue != null) {
                    request.addParameter("ImageId." + imageIdsListIndex, StringUtils.fromString(describeStoreImageTasksRequestImageIdsListValue));
                }
                imageIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeStoreImageTasksRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeStoreImageTasksRequest
                .getFilters();
        if (!describeStoreImageTasksRequestFiltersList.isEmpty() || !describeStoreImageTasksRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeStoreImageTasksRequestFiltersListValue : describeStoreImageTasksRequestFiltersList) {

                if (describeStoreImageTasksRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeStoreImageTasksRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeStoreImageTasksRequestFiltersListValue
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

        if (describeStoreImageTasksRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeStoreImageTasksRequest.getNextToken()));
        }

        if (describeStoreImageTasksRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeStoreImageTasksRequest.getMaxResults()));
        }

        return request;
    }

}
