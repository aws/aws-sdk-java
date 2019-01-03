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
package com.amazonaws.services.neptune.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.neptune.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeEventsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsRequestMarshaller implements Marshaller<Request<DescribeEventsRequest>, DescribeEventsRequest> {

    public Request<DescribeEventsRequest> marshall(DescribeEventsRequest describeEventsRequest) {

        if (describeEventsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeEventsRequest> request = new DefaultRequest<DescribeEventsRequest>(describeEventsRequest, "AmazonNeptune");
        request.addParameter("Action", "DescribeEvents");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeEventsRequest.getSourceIdentifier() != null) {
            request.addParameter("SourceIdentifier", StringUtils.fromString(describeEventsRequest.getSourceIdentifier()));
        }

        if (describeEventsRequest.getSourceType() != null) {
            request.addParameter("SourceType", StringUtils.fromString(describeEventsRequest.getSourceType()));
        }

        if (describeEventsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeEventsRequest.getStartTime()));
        }

        if (describeEventsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeEventsRequest.getEndTime()));
        }

        if (describeEventsRequest.getDuration() != null) {
            request.addParameter("Duration", StringUtils.fromInteger(describeEventsRequest.getDuration()));
        }

        if (describeEventsRequest.getEventCategories() != null) {
            java.util.List<String> eventCategoriesList = describeEventsRequest.getEventCategories();
            if (eventCategoriesList.isEmpty()) {
                request.addParameter("EventCategories", "");
            } else {
                int eventCategoriesListIndex = 1;

                for (String eventCategoriesListValue : eventCategoriesList) {
                    if (eventCategoriesListValue != null) {
                        request.addParameter("EventCategories.EventCategory." + eventCategoriesListIndex, StringUtils.fromString(eventCategoriesListValue));
                    }
                    eventCategoriesListIndex++;
                }
            }
        }

        if (describeEventsRequest.getFilters() != null) {
            java.util.List<Filter> filtersList = describeEventsRequest.getFilters();
            if (filtersList.isEmpty()) {
                request.addParameter("Filters", "");
            } else {
                int filtersListIndex = 1;

                for (Filter filtersListValue : filtersList) {

                    if (filtersListValue.getName() != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                    }

                    if (filtersListValue.getValues() != null) {
                        java.util.List<String> valuesList = filtersListValue.getValues();
                        if (valuesList.isEmpty()) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Values", "");
                        } else {
                            int valuesListIndex = 1;

                            for (String valuesListValue : valuesList) {
                                if (valuesListValue != null) {
                                    request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                            StringUtils.fromString(valuesListValue));
                                }
                                valuesListIndex++;
                            }
                        }
                    }
                    filtersListIndex++;
                }
            }
        }

        if (describeEventsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeEventsRequest.getMaxRecords()));
        }

        if (describeEventsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeEventsRequest.getMarker()));
        }

        return request;
    }

}
