/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Reserved D B Instances Request Marshaller
 */
public class DescribeReservedDBInstancesRequestMarshaller implements Marshaller<Request<DescribeReservedDBInstancesRequest>, DescribeReservedDBInstancesRequest> {

    public Request<DescribeReservedDBInstancesRequest> marshall(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) {

        if (describeReservedDBInstancesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeReservedDBInstancesRequest> request = new DefaultRequest<DescribeReservedDBInstancesRequest>(describeReservedDBInstancesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeReservedDBInstances");
        request.addParameter("Version", "2013-09-09");

        if (describeReservedDBInstancesRequest.getReservedDBInstanceId() != null) {
            request.addParameter("ReservedDBInstanceId", StringUtils.fromString(describeReservedDBInstancesRequest.getReservedDBInstanceId()));
        }
        if (describeReservedDBInstancesRequest.getReservedDBInstancesOfferingId() != null) {
            request.addParameter("ReservedDBInstancesOfferingId", StringUtils.fromString(describeReservedDBInstancesRequest.getReservedDBInstancesOfferingId()));
        }
        if (describeReservedDBInstancesRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(describeReservedDBInstancesRequest.getDBInstanceClass()));
        }
        if (describeReservedDBInstancesRequest.getDuration() != null) {
            request.addParameter("Duration", StringUtils.fromString(describeReservedDBInstancesRequest.getDuration()));
        }
        if (describeReservedDBInstancesRequest.getProductDescription() != null) {
            request.addParameter("ProductDescription", StringUtils.fromString(describeReservedDBInstancesRequest.getProductDescription()));
        }
        if (describeReservedDBInstancesRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedDBInstancesRequest.getOfferingType()));
        }
        if (describeReservedDBInstancesRequest.isMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(describeReservedDBInstancesRequest.isMultiAZ()));
        }

        java.util.List<Filter> filtersList = describeReservedDBInstancesRequest.getFilters();
        int filtersListIndex = 1;

        for (Filter filtersListValue : filtersList) {
            Filter filterMember = filtersListValue;
            if (filterMember != null) {
                if (filterMember.getFilterName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".FilterName", StringUtils.fromString(filterMember.getFilterName()));
                }

                java.util.List<String> filterValueList = filterMember.getFilterValue();
                int filterValueListIndex = 1;

                for (String filterValueListValue : filterValueList) {
                    if (filterValueListValue != null) {
                        request.addParameter("Filters.Filter." + filtersListIndex + ".FilterValue.Value." + filterValueListIndex, StringUtils.fromString(filterValueListValue));
                    }

                    filterValueListIndex++;
                }
            }

            filtersListIndex++;
        }
        if (describeReservedDBInstancesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedDBInstancesRequest.getMaxRecords()));
        }
        if (describeReservedDBInstancesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeReservedDBInstancesRequest.getMarker()));
        }


        return request;
    }
}
