/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Scheduled Instance Availability Request Marshaller
 */
public class DescribeScheduledInstanceAvailabilityRequestMarshaller implements Marshaller<Request<DescribeScheduledInstanceAvailabilityRequest>, DescribeScheduledInstanceAvailabilityRequest> {

    public Request<DescribeScheduledInstanceAvailabilityRequest> marshall(DescribeScheduledInstanceAvailabilityRequest describeScheduledInstanceAvailabilityRequest) {

        if (describeScheduledInstanceAvailabilityRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledInstanceAvailabilityRequest> request = new DefaultRequest<DescribeScheduledInstanceAvailabilityRequest>(describeScheduledInstanceAvailabilityRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeScheduledInstanceAvailability");
        request.addParameter("Version", "2015-10-01");

        ScheduledInstanceRecurrenceRequest scheduledInstanceRecurrenceRequestRecurrence = describeScheduledInstanceAvailabilityRequest.getRecurrence();
        if (scheduledInstanceRecurrenceRequestRecurrence != null) {
            if (scheduledInstanceRecurrenceRequestRecurrence.getFrequency() != null) {
                request.addParameter("Recurrence.Frequency", StringUtils.fromString(scheduledInstanceRecurrenceRequestRecurrence.getFrequency()));
            }
            if (scheduledInstanceRecurrenceRequestRecurrence.getInterval() != null) {
                request.addParameter("Recurrence.Interval", StringUtils.fromInteger(scheduledInstanceRecurrenceRequestRecurrence.getInterval()));
            }

            java.util.List<Integer> occurrenceDaysList = scheduledInstanceRecurrenceRequestRecurrence.getOccurrenceDays();
            int occurrenceDaysListIndex = 1;

            for (Integer occurrenceDaysListValue : occurrenceDaysList) {
                if (occurrenceDaysListValue != null) {
                    request.addParameter("Recurrence.OccurrenceDay." + occurrenceDaysListIndex, StringUtils.fromInteger(occurrenceDaysListValue));
                }

                occurrenceDaysListIndex++;
            }
            if (scheduledInstanceRecurrenceRequestRecurrence.isOccurrenceRelativeToEnd() != null) {
                request.addParameter("Recurrence.OccurrenceRelativeToEnd", StringUtils.fromBoolean(scheduledInstanceRecurrenceRequestRecurrence.isOccurrenceRelativeToEnd()));
            }
            if (scheduledInstanceRecurrenceRequestRecurrence.getOccurrenceUnit() != null) {
                request.addParameter("Recurrence.OccurrenceUnit", StringUtils.fromString(scheduledInstanceRecurrenceRequestRecurrence.getOccurrenceUnit()));
            }
        }
        SlotDateTimeRangeRequest slotDateTimeRangeRequestFirstSlotStartTimeRange = describeScheduledInstanceAvailabilityRequest.getFirstSlotStartTimeRange();
        if (slotDateTimeRangeRequestFirstSlotStartTimeRange != null) {
            if (slotDateTimeRangeRequestFirstSlotStartTimeRange.getEarliestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.EarliestTime", StringUtils.fromDate(slotDateTimeRangeRequestFirstSlotStartTimeRange.getEarliestTime()));
            }
            if (slotDateTimeRangeRequestFirstSlotStartTimeRange.getLatestTime() != null) {
                request.addParameter("FirstSlotStartTimeRange.LatestTime", StringUtils.fromDate(slotDateTimeRangeRequestFirstSlotStartTimeRange.getLatestTime()));
            }
        }
        if (describeScheduledInstanceAvailabilityRequest.getMinSlotDurationInHours() != null) {
            request.addParameter("MinSlotDurationInHours", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMinSlotDurationInHours()));
        }
        if (describeScheduledInstanceAvailabilityRequest.getMaxSlotDurationInHours() != null) {
            request.addParameter("MaxSlotDurationInHours", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMaxSlotDurationInHours()));
        }
        if (describeScheduledInstanceAvailabilityRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScheduledInstanceAvailabilityRequest.getNextToken()));
        }
        if (describeScheduledInstanceAvailabilityRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeScheduledInstanceAvailabilityRequest.getMaxResults()));
        }

        java.util.List<Filter> filtersList = describeScheduledInstanceAvailabilityRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }

        return request;
    }
}
