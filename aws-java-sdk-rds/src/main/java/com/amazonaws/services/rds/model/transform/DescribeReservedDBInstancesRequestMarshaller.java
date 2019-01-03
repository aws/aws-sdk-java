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
package com.amazonaws.services.rds.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeReservedDBInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservedDBInstancesRequestMarshaller implements
        Marshaller<Request<DescribeReservedDBInstancesRequest>, DescribeReservedDBInstancesRequest> {

    public Request<DescribeReservedDBInstancesRequest> marshall(DescribeReservedDBInstancesRequest describeReservedDBInstancesRequest) {

        if (describeReservedDBInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeReservedDBInstancesRequest> request = new DefaultRequest<DescribeReservedDBInstancesRequest>(describeReservedDBInstancesRequest,
                "AmazonRDS");
        request.addParameter("Action", "DescribeReservedDBInstances");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

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

        if (describeReservedDBInstancesRequest.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(describeReservedDBInstancesRequest.getMultiAZ()));
        }

        if (!describeReservedDBInstancesRequest.getFilters().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Filter>) describeReservedDBInstancesRequest.getFilters()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Filter> filtersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeReservedDBInstancesRequest
                    .getFilters();
            int filtersListIndex = 1;

            for (Filter filtersListValue : filtersList) {

                if (filtersListValue.getName() != null) {
                    request.addParameter("Filters.Filter." + filtersListIndex + ".Name", StringUtils.fromString(filtersListValue.getName()));
                }

                if (!filtersListValue.getValues().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<String> valuesList = (com.amazonaws.internal.SdkInternalList<String>) filtersListValue.getValues();
                    int valuesListIndex = 1;

                    for (String valuesListValue : valuesList) {
                        if (valuesListValue != null) {
                            request.addParameter("Filters.Filter." + filtersListIndex + ".Values.Value." + valuesListIndex,
                                    StringUtils.fromString(valuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
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
