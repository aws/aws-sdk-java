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
 * DescribeReservedInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedInstancesRequestMarshaller implements Marshaller<Request<DescribeReservedInstancesRequest>, DescribeReservedInstancesRequest> {

    public Request<DescribeReservedInstancesRequest> marshall(DescribeReservedInstancesRequest describeReservedInstancesRequest) {

        if (describeReservedInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedInstancesRequest> request = new DefaultRequest<DescribeReservedInstancesRequest>(describeReservedInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeReservedInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeReservedInstancesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReservedInstancesRequest
                .getFilters();
        if (!describeReservedInstancesRequestFiltersList.isEmpty() || !describeReservedInstancesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeReservedInstancesRequestFiltersListValue : describeReservedInstancesRequestFiltersList) {

                if (describeReservedInstancesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeReservedInstancesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesRequestFiltersListValue
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

        if (describeReservedInstancesRequest.getOfferingClass() != null) {
            request.addParameter("OfferingClass", StringUtils.fromString(describeReservedInstancesRequest.getOfferingClass()));
        }

        com.amazonaws.internal.SdkInternalList<String> describeReservedInstancesRequestReservedInstancesIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeReservedInstancesRequest
                .getReservedInstancesIds();
        if (!describeReservedInstancesRequestReservedInstancesIdsList.isEmpty() || !describeReservedInstancesRequestReservedInstancesIdsList.isAutoConstruct()) {
            int reservedInstancesIdsListIndex = 1;

            for (String describeReservedInstancesRequestReservedInstancesIdsListValue : describeReservedInstancesRequestReservedInstancesIdsList) {
                if (describeReservedInstancesRequestReservedInstancesIdsListValue != null) {
                    request.addParameter("ReservedInstancesId." + reservedInstancesIdsListIndex,
                            StringUtils.fromString(describeReservedInstancesRequestReservedInstancesIdsListValue));
                }
                reservedInstancesIdsListIndex++;
            }
        }

        if (describeReservedInstancesRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedInstancesRequest.getOfferingType()));
        }

        return request;
    }

}
