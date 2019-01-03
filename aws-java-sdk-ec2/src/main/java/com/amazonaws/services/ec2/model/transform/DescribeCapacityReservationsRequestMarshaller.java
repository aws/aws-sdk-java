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
 * DescribeCapacityReservationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityReservationsRequestMarshaller implements
        Marshaller<Request<DescribeCapacityReservationsRequest>, DescribeCapacityReservationsRequest> {

    public Request<DescribeCapacityReservationsRequest> marshall(DescribeCapacityReservationsRequest describeCapacityReservationsRequest) {

        if (describeCapacityReservationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCapacityReservationsRequest> request = new DefaultRequest<DescribeCapacityReservationsRequest>(describeCapacityReservationsRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeCapacityReservations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeCapacityReservationsRequestCapacityReservationIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeCapacityReservationsRequest
                .getCapacityReservationIds();
        if (!describeCapacityReservationsRequestCapacityReservationIdsList.isEmpty()
                || !describeCapacityReservationsRequestCapacityReservationIdsList.isAutoConstruct()) {
            int capacityReservationIdsListIndex = 1;

            for (String describeCapacityReservationsRequestCapacityReservationIdsListValue : describeCapacityReservationsRequestCapacityReservationIdsList) {
                if (describeCapacityReservationsRequestCapacityReservationIdsListValue != null) {
                    request.addParameter("CapacityReservationId." + capacityReservationIdsListIndex,
                            StringUtils.fromString(describeCapacityReservationsRequestCapacityReservationIdsListValue));
                }
                capacityReservationIdsListIndex++;
            }
        }

        if (describeCapacityReservationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeCapacityReservationsRequest.getNextToken()));
        }

        if (describeCapacityReservationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeCapacityReservationsRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeCapacityReservationsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeCapacityReservationsRequest
                .getFilters();
        if (!describeCapacityReservationsRequestFiltersList.isEmpty() || !describeCapacityReservationsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeCapacityReservationsRequestFiltersListValue : describeCapacityReservationsRequestFiltersList) {

                if (describeCapacityReservationsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeCapacityReservationsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeCapacityReservationsRequestFiltersListValue
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
