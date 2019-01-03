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
 * DescribeSpotPriceHistoryRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotPriceHistoryRequestMarshaller implements Marshaller<Request<DescribeSpotPriceHistoryRequest>, DescribeSpotPriceHistoryRequest> {

    public Request<DescribeSpotPriceHistoryRequest> marshall(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) {

        if (describeSpotPriceHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSpotPriceHistoryRequest> request = new DefaultRequest<DescribeSpotPriceHistoryRequest>(describeSpotPriceHistoryRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSpotPriceHistory");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeSpotPriceHistoryRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeSpotPriceHistoryRequest
                .getFilters();
        if (!describeSpotPriceHistoryRequestFiltersList.isEmpty() || !describeSpotPriceHistoryRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeSpotPriceHistoryRequestFiltersListValue : describeSpotPriceHistoryRequestFiltersList) {

                if (describeSpotPriceHistoryRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeSpotPriceHistoryRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeSpotPriceHistoryRequestFiltersListValue
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

        if (describeSpotPriceHistoryRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(describeSpotPriceHistoryRequest.getAvailabilityZone()));
        }

        if (describeSpotPriceHistoryRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeSpotPriceHistoryRequest.getEndTime()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeSpotPriceHistoryRequestInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) describeSpotPriceHistoryRequest
                .getInstanceTypes();
        if (!describeSpotPriceHistoryRequestInstanceTypesList.isEmpty() || !describeSpotPriceHistoryRequestInstanceTypesList.isAutoConstruct()) {
            int instanceTypesListIndex = 1;

            for (String describeSpotPriceHistoryRequestInstanceTypesListValue : describeSpotPriceHistoryRequestInstanceTypesList) {
                if (describeSpotPriceHistoryRequestInstanceTypesListValue != null) {
                    request.addParameter("InstanceType." + instanceTypesListIndex,
                            StringUtils.fromString(describeSpotPriceHistoryRequestInstanceTypesListValue));
                }
                instanceTypesListIndex++;
            }
        }

        if (describeSpotPriceHistoryRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSpotPriceHistoryRequest.getMaxResults()));
        }

        if (describeSpotPriceHistoryRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSpotPriceHistoryRequest.getNextToken()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeSpotPriceHistoryRequestProductDescriptionsList = (com.amazonaws.internal.SdkInternalList<String>) describeSpotPriceHistoryRequest
                .getProductDescriptions();
        if (!describeSpotPriceHistoryRequestProductDescriptionsList.isEmpty() || !describeSpotPriceHistoryRequestProductDescriptionsList.isAutoConstruct()) {
            int productDescriptionsListIndex = 1;

            for (String describeSpotPriceHistoryRequestProductDescriptionsListValue : describeSpotPriceHistoryRequestProductDescriptionsList) {
                if (describeSpotPriceHistoryRequestProductDescriptionsListValue != null) {
                    request.addParameter("ProductDescription." + productDescriptionsListIndex,
                            StringUtils.fromString(describeSpotPriceHistoryRequestProductDescriptionsListValue));
                }
                productDescriptionsListIndex++;
            }
        }

        if (describeSpotPriceHistoryRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeSpotPriceHistoryRequest.getStartTime()));
        }

        return request;
    }

}
