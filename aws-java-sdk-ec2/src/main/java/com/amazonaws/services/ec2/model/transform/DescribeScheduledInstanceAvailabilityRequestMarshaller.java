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
 * DescribeScheduledInstanceAvailabilityRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledInstanceAvailabilityRequestMarshaller implements
        Marshaller<Request<DescribeScheduledInstanceAvailabilityRequest>, DescribeScheduledInstanceAvailabilityRequest> {

    public Request<DescribeScheduledInstanceAvailabilityRequest> marshall(
            DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest) {

        if (describeScheduledInstanceAvailabilityRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledInstanceAvailabilityRequest> request = new DefaultRequest<DescribeScheduledInstanceAvailabilityRequest>(
                describeScheduledInstanceAvailabilityRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeScheduledInstanceAvailability");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<Filter> describeScheduledInstanceAvailabilityRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeScheduledInstanceAvailabilityRequest
                .getFilters();
        if (!describeScheduledInstanceAvailabilityRequestFiltersList.isEmpty() || !describeScheduledInstanceAvailabilityRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeScheduledInstanceAvailabilityRequestFiltersListValue : describeScheduledInstanceAvailabilityRequestFiltersList) {

                if (describeScheduledInstanceAvailabilityRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeScheduledInstanceAvailabilityRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeScheduledInstanceAvailabilityRequestFiltersListValue
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

        SlotDateTimeRangeRequest firstSlotStartTimeRange = describeScheduledInstanceAvailabilityRequest.getFirstSlotStartTimeRange();
        if (firstSlotStartTimeRange != null) {

            if (firstSlotStartTimeRange.getEarliestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.EarliestTime", StringUtils.fromDate(firstSlotStartTimeRange.getEarliestTime()));
            }

            if (firstSlotStartTimeRange.getLatestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.LatestTime", StringUtils.fromDate(firstSlotStartTimeRange.getLatestTime()));
            }
        }

        if (describeScheduledInstanceAvailabilityRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMaxResults()));
        }

        if (describeScheduledInstanceAvailabilityRequest.getMaxSlotDurationInHours() != null) {
            request.addParameter("MaxSlotDurationInHours", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMaxSlotDurationInHours()));
        }

        if (describeScheduledInstanceAvailabilityRequest.getMinSlotDurationInHours() != null) {
            request.addParameter("MinSlotDurationInHours", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMinSlotDurationInHours()));
        }

        if (describeScheduledInstanceAvailabilityRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScheduledInstanceAvailabilityRequest.getNextToken()));
        }

        ScheduledInstanceRecurrenceRequest recurrence = describeScheduledInstanceAvailabilityRequest.getRecurrence();
        if (recurrence != null) {

            if (recurrence.getFrequency() != null) {
                request.addParameter("Recurrence.Frequency", StringUtils.fromString(recurrence.getFrequency()));
            }

            if (recurrence.getInterval() != null) {
                request.addParameter("Recurrence.Interval", StringUtils.fromInteger(recurrence.getInterval()));
            }

            com.amazonaws.internal.SdkInternalList<Integer> scheduledInstanceRecurrenceRequestOccurrenceDaysList = (com.amazonaws.internal.SdkInternalList<Integer>) recurrence
                    .getOccurrenceDays();
            if (!scheduledInstanceRecurrenceRequestOccurrenceDaysList.isEmpty() || !scheduledInstanceRecurrenceRequestOccurrenceDaysList.isAutoConstruct()) {
                int occurrenceDaysListIndex = 1;

                for (Integer scheduledInstanceRecurrenceRequestOccurrenceDaysListValue : scheduledInstanceRecurrenceRequestOccurrenceDaysList) {
                    if (scheduledInstanceRecurrenceRequestOccurrenceDaysListValue != null) {
                        request.addParameter("Recurrence.OccurrenceDay." + occurrenceDaysListIndex,
                                StringUtils.fromInteger(scheduledInstanceRecurrenceRequestOccurrenceDaysListValue));
                    }
                    occurrenceDaysListIndex++;
                }
            }

            if (recurrence.getOccurrenceRelativeToEnd() != null) {
                request.addParameter("Recurrence.OccurrenceRelativeToEnd", StringUtils.fromBoolean(recurrence.getOccurrenceRelativeToEnd()));
            }

            if (recurrence.getOccurrenceUnit() != null) {
                request.addParameter("Recurrence.OccurrenceUnit", StringUtils.fromString(recurrence.getOccurrenceUnit()));
            }
        }

        return request;
    }

}
