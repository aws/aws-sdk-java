/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DescribeScheduledInstancesRequest Marshaller
 */

public class DescribeScheduledInstancesRequestMarshaller implements Marshaller<Request<DescribeScheduledInstancesRequest>, DescribeScheduledInstancesRequest> {

    public Request<DescribeScheduledInstancesRequest> marshall(DescribeScheduledInstancesRequest describeScheduledInstancesRequest) {

        if (describeScheduledInstancesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledInstancesRequest> request = new DefaultRequest<DescribeScheduledInstancesRequest>(describeScheduledInstancesRequest,
                "AmazonEC2");
        request.addParameter("Action", "DescribeScheduledInstances");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeScheduledInstancesRequestScheduledInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeScheduledInstancesRequest
                .getScheduledInstanceIds();
        if (!describeScheduledInstancesRequestScheduledInstanceIdsList.isEmpty()
                || !describeScheduledInstancesRequestScheduledInstanceIdsList.isAutoConstruct()) {
            int scheduledInstanceIdsListIndex = 1;

            for (String describeScheduledInstancesRequestScheduledInstanceIdsListValue : describeScheduledInstancesRequestScheduledInstanceIdsList) {
                if (describeScheduledInstancesRequestScheduledInstanceIdsListValue != null) {
                    request.addParameter("ScheduledInstanceId." + scheduledInstanceIdsListIndex,
                            StringUtils.fromString(describeScheduledInstancesRequestScheduledInstanceIdsListValue));
                }
                scheduledInstanceIdsListIndex++;
            }
        }

        SlotStartTimeRangeRequest slotStartTimeRange = describeScheduledInstancesRequest.getSlotStartTimeRange();
        if (slotStartTimeRange != null) {

            if (slotStartTimeRange.getEarliestTime() != null) {
                request.addParameter("SlotStartTimeRange.EarliestTime", StringUtils.fromDate(slotStartTimeRange.getEarliestTime()));
            }

            if (slotStartTimeRange.getLatestTime() != null) {
                request.addParameter("SlotStartTimeRange.LatestTime", StringUtils.fromDate(slotStartTimeRange.getLatestTime()));
            }
        }

        if (describeScheduledInstancesRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeScheduledInstancesRequest.getNextToken()));
        }

        if (describeScheduledInstancesRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeScheduledInstancesRequest.getMaxResults()));
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeScheduledInstancesRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeScheduledInstancesRequest
                .getFilters();
        if (!describeScheduledInstancesRequestFiltersList.isEmpty() || !describeScheduledInstancesRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeScheduledInstancesRequestFiltersListValue : describeScheduledInstancesRequestFiltersList) {

                if (describeScheduledInstancesRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeScheduledInstancesRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeScheduledInstancesRequestFiltersListValue
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
