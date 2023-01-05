/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeCapacityReservationFleetsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityReservationFleetsRequestMarshaller implements
        Marshaller<Request<DescribeCapacityReservationFleetsRequest>, DescribeCapacityReservationFleetsRequest> {

    public Request<DescribeCapacityReservationFleetsRequest> marshall(DescribeCapacityReservationFleetsRequest describeCapacityReservationFleetsRequest) {

        if (describeCapacityReservationFleetsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCapacityReservationFleetsRequest> request = new DefaultRequest<DescribeCapacityReservationFleetsRequest>(
                describeCapacityReservationFleetsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeCapacityReservationFleets");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeCapacityReservationFleetsRequestCapacityReservationFleetIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCapacityReservationFleetsRequest
                .getCapacityReservationFleetIds();
        if (!describeCapacityReservationFleetsRequestCapacityReservationFleetIdsList.isEmpty()
                || !describeCapacityReservationFleetsRequestCapacityReservationFleetIdsList.isAutoConstruct()) {
            int capacityReservationFleetIdsListIndex = 1;

            for (String describeCapacityReservationFleetsRequestCapacityReservationFleetIdsListValue : describeCapacityReservationFleetsRequestCapacityReservationFleetIdsList) {
                if (describeCapacityReservationFleetsRequestCapacityReservationFleetIdsListValue != null) {
                    request.addParameter("CapacityReservationFleetId." + capacityReservationFleetIdsListIndex,
                            StringUtils.fromString(describeCapacityReservationFleetsRequestCapacityReservationFleetIdsListValue));
                }
                capacityReservationFleetIdsListIndex++;
            }
        }

        if (describeCapacityReservationFleetsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeCapacityReservationFleetsRequest.getNextToken()));
        }

        if (describeCapacityReservationFleetsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeCapacityReservationFleetsRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeCapacityReservationFleetsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeCapacityReservationFleetsRequest
                .getFilters();
        if (!describeCapacityReservationFleetsRequestFiltersList.isEmpty() || !describeCapacityReservationFleetsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeCapacityReservationFleetsRequestFiltersListValue : describeCapacityReservationFleetsRequestFiltersList) {

                if (describeCapacityReservationFleetsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeCapacityReservationFleetsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeCapacityReservationFleetsRequestFiltersListValue
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
