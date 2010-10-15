/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        Request<DescribeReservedDBInstancesRequest> request = new DefaultRequest<DescribeReservedDBInstancesRequest>(describeReservedDBInstancesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeReservedDBInstances");
        request.addParameter("Version", "2010-07-28");
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getReservedDBInstanceId() != null) {
                request.addParameter("ReservedDBInstanceId", StringUtils.fromString(describeReservedDBInstancesRequest.getReservedDBInstanceId()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getReservedDBInstancesOfferingId() != null) {
                request.addParameter("ReservedDBInstancesOfferingId", StringUtils.fromString(describeReservedDBInstancesRequest.getReservedDBInstancesOfferingId()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(describeReservedDBInstancesRequest.getDBInstanceClass()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getDuration() != null) {
                request.addParameter("Duration", StringUtils.fromString(describeReservedDBInstancesRequest.getDuration()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getProductDescription() != null) {
                request.addParameter("ProductDescription", StringUtils.fromString(describeReservedDBInstancesRequest.getProductDescription()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(describeReservedDBInstancesRequest.isMultiAZ()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedDBInstancesRequest.getMaxRecords()));
            }
        }
        if (describeReservedDBInstancesRequest != null) {
            if (describeReservedDBInstancesRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeReservedDBInstancesRequest.getMarker()));
            }
        }


        return request;
    }
}
