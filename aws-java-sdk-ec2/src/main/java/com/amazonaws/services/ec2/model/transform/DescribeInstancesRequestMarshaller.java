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
 * DescribeInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancesRequestMarshaller implements Marshaller<Request<DescribeInstancesRequest>, DescribeInstancesRequest> {

    public Request<DescribeInstancesRequest> marshall(DescribeInstancesRequest describeInstancesRequest) {

        if (describeInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstancesRequest> request = new DefaultRequest<DescribeInstancesRequest>(describeInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeInstancesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstancesRequest
                .getFilters();
        if (!describeInstancesRequestFiltersList.isEmpty() || !describeInstancesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstancesRequestFiltersListValue : describeInstancesRequestFiltersList) {

                if (describeInstancesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeInstancesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstancesRequestFiltersListValue
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

        com.amazonaws.internal.SdkInternalList<String> describeInstancesRequestInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeInstancesRequest
                .getInstanceIds();
        if (!describeInstancesRequestInstanceIdsList.isEmpty() || !describeInstancesRequestInstanceIdsList.isAutoConstruct()) {
            int instanceIdsListIndex = 1;

            for (String describeInstancesRequestInstanceIdsListValue : describeInstancesRequestInstanceIdsList) {
                if (describeInstancesRequestInstanceIdsListValue != null) {
                    request.addParameter("InstanceId." + instanceIdsListIndex, StringUtils.fromString(describeInstancesRequestInstanceIdsListValue));
                }
                instanceIdsListIndex++;
            }
        }

        if (describeInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstancesRequest.getMaxResults()));
        }

        if (describeInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstancesRequest.getNextToken()));
        }

        return request;
    }

}
