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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Option Group Options Request Marshaller
 */
public class DescribeOptionGroupOptionsRequestMarshaller implements Marshaller<Request<DescribeOptionGroupOptionsRequest>, DescribeOptionGroupOptionsRequest> {

    public Request<DescribeOptionGroupOptionsRequest> marshall(DescribeOptionGroupOptionsRequest describeOptionGroupOptionsRequest) {

        if (describeOptionGroupOptionsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeOptionGroupOptionsRequest> request = new DefaultRequest<DescribeOptionGroupOptionsRequest>(describeOptionGroupOptionsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeOptionGroupOptions");
        request.addParameter("Version", "2014-10-31");

        if (describeOptionGroupOptionsRequest.getEngineName() != null) {
            request.addParameter("EngineName", StringUtils.fromString(describeOptionGroupOptionsRequest.getEngineName()));
        }
        if (describeOptionGroupOptionsRequest.getMajorEngineVersion() != null) {
            request.addParameter("MajorEngineVersion", StringUtils.fromString(describeOptionGroupOptionsRequest.getMajorEngineVersion()));
        }

        java.util.List<Filter> filtersList = describeOptionGroupOptionsRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filterMember.getName()));
                }

                java.util.List<String> valuesList = filterMember.getValues();
                int valuesListIndex = 1;

                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex, StringUtils.fromString(valuesListValue));
                    }

                    valuesListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describeOptionGroupOptionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeOptionGroupOptionsRequest.getMaxRecords()));
        }
        if (describeOptionGroupOptionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeOptionGroupOptionsRequest.getMarker()));
        }

        return request;
    }
}
