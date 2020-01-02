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
 * DescribeInstanceTypesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypesRequestMarshaller implements Marshaller<Request<DescribeInstanceTypesRequest>, DescribeInstanceTypesRequest> {

    public Request<DescribeInstanceTypesRequest> marshall(DescribeInstanceTypesRequest describeInstanceTypesRequest) {

        if (describeInstanceTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceTypesRequest> request = new DefaultRequest<DescribeInstanceTypesRequest>(describeInstanceTypesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceTypes");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeInstanceTypesRequestInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTypesRequest
                .getInstanceTypes();
        if (!describeInstanceTypesRequestInstanceTypesList.isEmpty() || !describeInstanceTypesRequestInstanceTypesList.isAutoConstruct()) {
            int instanceTypesListIndex = 1;

            for (String describeInstanceTypesRequestInstanceTypesListValue : describeInstanceTypesRequestInstanceTypesList) {
                if (describeInstanceTypesRequestInstanceTypesListValue != null) {
                    request.addParameter("InstanceType." + instanceTypesListIndex, StringUtils.fromString(describeInstanceTypesRequestInstanceTypesListValue));
                }
                instanceTypesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceTypesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceTypesRequest
                .getFilters();
        if (!describeInstanceTypesRequestFiltersList.isEmpty() || !describeInstanceTypesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceTypesRequestFiltersListValue : describeInstanceTypesRequestFiltersList) {

                if (describeInstanceTypesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeInstanceTypesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTypesRequestFiltersListValue
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

        if (describeInstanceTypesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceTypesRequest.getMaxResults()));
        }

        if (describeInstanceTypesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceTypesRequest.getNextToken()));
        }

        return request;
    }

}
