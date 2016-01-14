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
 * Describe Scheduled Instances Request Marshaller
 */
public class DescribeScheduledInstancesRequestMarshaller implements Marshaller<Request<DescribeScheduledInstancesRequest>, DescribeScheduledInstancesRequest> {

    public Request<DescribeScheduledInstancesRequest> marshall(DescribeScheduledInstancesRequest describeScheduledInstancesRequest) {

        if (describeScheduledInstancesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledInstancesRequest> request = new DefaultRequest<DescribeScheduledInstancesRequest>(describeScheduledInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeScheduledInstances");
        request.addParameter("Version", "2015-10-01");

        java.util.List<String> scheduledInstanceIdsList = describeScheduledInstancesRequest.getScheduledInstanceIds();
        int scheduledInstanceIdsListIndex = 1;

        for (String scheduledInstanceIdsListValue : scheduledInstanceIdsList) {
            if (scheduledInstanceIdsListValue != null) {
                request.addParameter("ScheduledInstanceId." + scheduledInstanceIdsListIndex, StringUtils.fromString(scheduledInstanceIdsListValue));
            }

            scheduledInstanceIdsListIndex++;
        }
        SlotStartTimeRangeRequest slotStartTimeRangeRequestSlotStartTimeRange = describeScheduledInstancesRequest.getSlotStartTimeRange();
        if (slotStartTimeRangeRequestSlotStartTimeRange != null) {
            if (slotStartTimeRangeRequestSlotStartTimeRange.getEarliestTime() != null) {
                request.addParameter("SlotStartTimeRange.EarliestTime", StringUtils.fromDate(slotStartTimeRangeRequestSlotStartTimeRange.getEarliestTime()));
            }
            if (slotStartTimeRangeRequestSlotStartTimeRange.getLatestTime() != null) {
                request.addParameter("SlotStartTimeRange.LatestTime", StringUtils.fromDate(slotStartTimeRangeRequestSlotStartTimeRange.getLatestTime()));
            }
        }
        if (describeScheduledInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScheduledInstancesRequest.getNextToken()));
        }
        if (describeScheduledInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeScheduledInstancesRequest.getMaxResults()));
        }

        java.util.List<Filter> filtersList = describeScheduledInstancesRequest.getFilters();
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
