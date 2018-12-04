/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
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
 * DescribeScheduledInstanceAvailabilityRequest Marshaller
 */

public class DescribeScheduledInstanceAvailabilityRequestMarshaller
        implements
        Marshaller<Request<DescribeScheduledInstanceAvailabilityRequest>, DescribeScheduledInstanceAvailabilityRequest> {

    public Request<DescribeScheduledInstanceAvailabilityRequest> marshall(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest) {

        if (describeScheduledInstanceAvailabilityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledInstanceAvailabilityRequest> request = new DefaultRequest<DescribeScheduledInstanceAvailabilityRequest>(
                describeScheduledInstanceAvailabilityRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeScheduledInstanceAvailability");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        ScheduledInstanceRecurrenceRequest recurrence = describeScheduledInstanceAvailabilityRequest
                .getRecurrence();
        if (recurrence != null) {

            if (recurrence.getFrequency() != null) {
                request.addParameter("Recurrence.Frequency",
                        StringUtils.fromString(recurrence.getFrequency()));
            }

            if (recurrence.getInterval() != null) {
                request.addParameter("Recurrence.Interval",
                        StringUtils.fromInteger(recurrence.getInterval()));
            }

            com.amazonaws.internal.SdkInternalList<Integer> occurrenceDaysList = (com.amazonaws.internal.SdkInternalList<Integer>) recurrence
                    .getOccurrenceDays();
            if (!occurrenceDaysList.isEmpty()
                    || !occurrenceDaysList.isAutoConstruct()) {
                int occurrenceDaysListIndex = 1;

                for (Integer occurrenceDaysListValue : occurrenceDaysList) {
                    if (occurrenceDaysListValue != null) {
                        request.addParameter("Recurrence.OccurrenceDay."
                                + occurrenceDaysListIndex, StringUtils
                                .fromInteger(occurrenceDaysListValue));
                    }
                    occurrenceDaysListIndex++;
                }
            }

            if (recurrence.getOccurrenceRelativeToEnd() != null) {
                request.addParameter("Recurrence.OccurrenceRelativeToEnd",
                        StringUtils.fromBoolean(recurrence
                                .getOccurrenceRelativeToEnd()));
            }

            if (recurrence.getOccurrenceUnit() != null) {
                request.addParameter("Recurrence.OccurrenceUnit",
                        StringUtils.fromString(recurrence.getOccurrenceUnit()));
            }
        }

        SlotDateTimeRangeRequest firstSlotStartTimeRange = describeScheduledInstanceAvailabilityRequest
                .getFirstSlotStartTimeRange();
        if (firstSlotStartTimeRange != null) {

            if (firstSlotStartTimeRange.getEarliestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.EarliestTime",
                        StringUtils.fromDate(firstSlotStartTimeRange
                                .getEarliestTime()));
            }

            if (firstSlotStartTimeRange.getLatestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.LatestTime",
                        StringUtils.fromDate(firstSlotStartTimeRange
                                .getLatestTime()));
            }
        }

        if (describeScheduledInstanceAvailabilityRequest
                .getMinSlotDurationInHours() != null) {
            request.addParameter("MinSlotDurationInHours", StringUtils
                    .fromInteger(describeScheduledInstanceAvailabilityRequest
                            .getMinSlotDurationInHours()));
        }

        if (describeScheduledInstanceAvailabilityRequest
                .getMaxSlotDurationInHours() != null) {
            request.addParameter("MaxSlotDurationInHours", StringUtils
                    .fromInteger(describeScheduledInstanceAvailabilityRequest
                            .getMaxSlotDurationInHours()));
        }

        if (describeScheduledInstanceAvailabilityRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils
                    .fromString(describeScheduledInstanceAvailabilityRequest
                            .getNextToken()));
        }

        if (describeScheduledInstanceAvailabilityRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils
                    .fromInteger(describeScheduledInstanceAvailabilityRequest
                            .getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeScheduledInstanceAvailabilityRequest
                .getFilters();
        if (!filtersList.isEmpty() || !filtersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter(
                            "Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(filtersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue
                        .getValues();
                if (!valuesList.isEmpty() || !valuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex
                                    + ".Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
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
