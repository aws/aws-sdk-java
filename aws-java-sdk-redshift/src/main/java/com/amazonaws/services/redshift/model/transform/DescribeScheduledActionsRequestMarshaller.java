/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeScheduledActionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsRequestMarshaller implements Marshaller<Request<DescribeScheduledActionsRequest>, DescribeScheduledActionsRequest> {

    public Request<DescribeScheduledActionsRequest> marshall(DescribeScheduledActionsRequest describeScheduledActionsRequest) {

        if (describeScheduledActionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeScheduledActionsRequest> request = new DefaultRequest<DescribeScheduledActionsRequest>(describeScheduledActionsRequest,
                "AmazonRedshift");
        request.addParameter("Action", "DescribeScheduledActions");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (describeScheduledActionsRequest.getScheduledActionName() != null) {
            request.addParameter("ScheduledActionName", StringUtils.fromString(describeScheduledActionsRequest.getScheduledActionName()));
        }

        if (describeScheduledActionsRequest.getTargetActionType() != null) {
            request.addParameter("TargetActionType", StringUtils.fromString(describeScheduledActionsRequest.getTargetActionType()));
        }

        if (describeScheduledActionsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeScheduledActionsRequest.getStartTime()));
        }

        if (describeScheduledActionsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeScheduledActionsRequest.getEndTime()));
        }

        if (describeScheduledActionsRequest.getActive() != null) {
            request.addParameter("Active", StringUtils.fromBoolean(describeScheduledActionsRequest.getActive()));
        }

        if (!describeScheduledActionsRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<ScheduledActionFilter>) describeScheduledActionsRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<ScheduledActionFilter> filtersList = (com.amazonaws.internal.SdkInternalList<ScheduledActionFilter>) describeScheduledActionsRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (ScheduledActionFilter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters.ScheduledActionFilter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters.ScheduledActionFilter." + filtersListIndex + ".Values.item." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeScheduledActionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeScheduledActionsRequest.getMarker()));
        }

        if (describeScheduledActionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeScheduledActionsRequest.getMaxRecords()));
        }

        return request;
    }

}
