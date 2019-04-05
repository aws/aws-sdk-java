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
 * DescribeHostReservationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostReservationsRequestMarshaller implements Marshaller<Request<DescribeHostReservationsRequest>, DescribeHostReservationsRequest> {

    public Request<DescribeHostReservationsRequest> marshall(DescribeHostReservationsRequest describeHostReservationsRequest) {

        if (describeHostReservationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostReservationsRequest> request = new DefaultRequest<DescribeHostReservationsRequest>(describeHostReservationsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeHostReservations");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeHostReservationsRequestFilterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeHostReservationsRequest
                .getFilter();
        if (!describeHostReservationsRequestFilterList.isEmpty() || !describeHostReservationsRequestFilterList.isAutoConstruct()) {
            int filterListIndex = 1;

            for (Filter describeHostReservationsRequestFilterListValue : describeHostReservationsRequestFilterList) {

                if (describeHostReservationsRequestFilterListValue.getName() != null) {
                    request.addParameter("Filter." + filterListIndex + ".Name",
                            StringUtils.fromString(describeHostReservationsRequestFilterListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeHostReservationsRequestFilterListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filterListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filterListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> describeHostReservationsRequestHostReservationIdSetList = (com.amazonaws.internal.SdkInternalList<String>) describeHostReservationsRequest
                .getHostReservationIdSet();
        if (!describeHostReservationsRequestHostReservationIdSetList.isEmpty() || !describeHostReservationsRequestHostReservationIdSetList.isAutoConstruct()) {
            int hostReservationIdSetListIndex = 1;

            for (String describeHostReservationsRequestHostReservationIdSetListValue : describeHostReservationsRequestHostReservationIdSetList) {
                if (describeHostReservationsRequestHostReservationIdSetListValue != null) {
                    request.addParameter("HostReservationIdSet." + hostReservationIdSetListIndex,
                            StringUtils.fromString(describeHostReservationsRequestHostReservationIdSetListValue));
                }
                hostReservationIdSetListIndex++;
            }
        }

        if (describeHostReservationsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeHostReservationsRequest.getMaxResults()));
        }

        if (describeHostReservationsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeHostReservationsRequest.getNextToken()));
        }

        return request;
    }

}
