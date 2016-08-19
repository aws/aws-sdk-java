/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeHostReservationsRequest Marshaller
 */

public class DescribeHostReservationsRequestMarshaller
        implements
        Marshaller<Request<DescribeHostReservationsRequest>, DescribeHostReservationsRequest> {

    public Request<DescribeHostReservationsRequest> marshall(
            DescribeHostReservationsRequest describeHostReservationsRequest) {

        if (describeHostReservationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostReservationsRequest> request = new DefaultRequest<DescribeHostReservationsRequest>(
                describeHostReservationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeHostReservations");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> hostReservationIdSetList = (com.amazonaws.internal.SdkInternalList<String>) describeHostReservationsRequest
                .getHostReservationIdSet();
        if (!hostReservationIdSetList.isEmpty()
                || !hostReservationIdSetList.isAutoConstruct()) {
            int hostReservationIdSetListIndex = 1;

            for (String hostReservationIdSetListValue : hostReservationIdSetList) {
                if (hostReservationIdSetListValue != null) {
                    request.addParameter("HostReservationIdSet."
                            + hostReservationIdSetListIndex, StringUtils
                            .fromString(hostReservationIdSetListValue));
                }
                hostReservationIdSetListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> filterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeHostReservationsRequest
                .getFilter();
        if (!filterList.isEmpty() || !filterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter filterListValue : filterList) {

                if (filterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name",
                            StringUtils.fromString(filterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filterListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filterListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filterListIndex++;
            }
        }

        if (describeHostReservationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeHostReservationsRequest
                            .getMaxResults()));
        }

        if (describeHostReservationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeHostReservationsRequest.getNextToken()));
        }

        return request;
    }

}
