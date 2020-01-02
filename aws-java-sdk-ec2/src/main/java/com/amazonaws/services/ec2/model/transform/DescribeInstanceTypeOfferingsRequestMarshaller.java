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
 * DescribeInstanceTypeOfferingsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceTypeOfferingsRequestMarshaller implements
        Marshaller<Request<DescribeInstanceTypeOfferingsRequest>, DescribeInstanceTypeOfferingsRequest> {

    public Request<DescribeInstanceTypeOfferingsRequest> marshall(DescribeInstanceTypeOfferingsRequest describeInstanceTypeOfferingsRequest) {

        if (describeInstanceTypeOfferingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeInstanceTypeOfferingsRequest> request = new DefaultRequest<DescribeInstanceTypeOfferingsRequest>(describeInstanceTypeOfferingsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeInstanceTypeOfferings");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeInstanceTypeOfferingsRequest.getLocationType() != null) {
            request.addParameter("LocationType", StringUtils.fromString(describeInstanceTypeOfferingsRequest.getLocationType()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeInstanceTypeOfferingsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeInstanceTypeOfferingsRequest
                .getFilters();
        if (!describeInstanceTypeOfferingsRequestFiltersList.isEmpty() || !describeInstanceTypeOfferingsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeInstanceTypeOfferingsRequestFiltersListValue : describeInstanceTypeOfferingsRequestFiltersList) {

                if (describeInstanceTypeOfferingsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeInstanceTypeOfferingsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeInstanceTypeOfferingsRequestFiltersListValue
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

        if (describeInstanceTypeOfferingsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeInstanceTypeOfferingsRequest.getMaxResults()));
        }

        if (describeInstanceTypeOfferingsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeInstanceTypeOfferingsRequest.getNextToken()));
        }

        return request;
    }

}
