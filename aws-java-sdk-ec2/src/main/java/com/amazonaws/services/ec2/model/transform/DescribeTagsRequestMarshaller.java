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
 * DescribeTagsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequestMarshaller implements Marshaller<Request<DescribeTagsRequest>, DescribeTagsRequest> {

    public Request<DescribeTagsRequest> marshall(DescribeTagsRequest describeTagsRequest) {

        if (describeTagsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTagsRequest> request = new DefaultRequest<DescribeTagsRequest>(describeTagsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTags");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeTagsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTagsRequest
                .getFilters();
        if (!describeTagsRequestFiltersList.isEmpty() || !describeTagsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTagsRequestFiltersListValue : describeTagsRequestFiltersList) {

                if (describeTagsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeTagsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTagsRequestFiltersListValue
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

        if (describeTagsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTagsRequest.getMaxResults()));
        }

        if (describeTagsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTagsRequest.getNextToken()));
        }

        return request;
    }

}
