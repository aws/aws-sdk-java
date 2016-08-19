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
 * DescribeHostReservationOfferingsRequest Marshaller
 */

public class DescribeHostReservationOfferingsRequestMarshaller
        implements
        Marshaller<Request<DescribeHostReservationOfferingsRequest>, DescribeHostReservationOfferingsRequest> {

    public Request<DescribeHostReservationOfferingsRequest> marshall(
            DescribeHostReservationOfferingsRequest describeHostReservationOfferingsRequest) {

        if (describeHostReservationOfferingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeHostReservationOfferingsRequest> request = new DefaultRequest<DescribeHostReservationOfferingsRequest>(
                describeHostReservationOfferingsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeHostReservationOfferings");
        request.addParameter("Version", "2016-04-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeHostReservationOfferingsRequest.getOfferingId() != null) {
            request.addParameter("OfferingId", StringUtils
                    .fromString(describeHostReservationOfferingsRequest
                            .getOfferingId()));
        }

        if (describeHostReservationOfferingsRequest.getMinDuration() != null) {
            request.addParameter("MinDuration", StringUtils
                    .fromInteger(describeHostReservationOfferingsRequest
                            .getMinDuration()));
        }

        if (describeHostReservationOfferingsRequest.getMaxDuration() != null) {
            request.addParameter("MaxDuration", StringUtils
                    .fromInteger(describeHostReservationOfferingsRequest
                            .getMaxDuration()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> filterList = (com.amazonaws.internal.SdkInternalList<Filter>) describeHostReservationOfferingsRequest
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

        if (describeHostReservationOfferingsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeHostReservationOfferingsRequest
                            .getMaxResults()));
        }

        if (describeHostReservationOfferingsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeHostReservationOfferingsRequest
                            .getNextToken()));
        }

        return request;
    }

}
