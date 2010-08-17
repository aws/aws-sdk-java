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
 * Describe Reserved D B Instances Offerings Request Marshaller
 */
public class DescribeReservedDBInstancesOfferingsRequestMarshaller implements Marshaller<Request<DescribeReservedDBInstancesOfferingsRequest>, DescribeReservedDBInstancesOfferingsRequest> {

    public Request<DescribeReservedDBInstancesOfferingsRequest> marshall(DescribeReservedDBInstancesOfferingsRequest describeReservedDBInstancesOfferingsRequest) {
        Request<DescribeReservedDBInstancesOfferingsRequest> request = new DefaultRequest<DescribeReservedDBInstancesOfferingsRequest>(describeReservedDBInstancesOfferingsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeReservedDBInstancesOfferings");
        request.addParameter("Version", "2010-06-28");
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getReservedDBInstancesOfferingId() != null) {
                request.addParameter("ReservedDBInstancesOfferingId", StringUtils.fromString(describeReservedDBInstancesOfferingsRequest.getReservedDBInstancesOfferingId()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(describeReservedDBInstancesOfferingsRequest.getDBInstanceClass()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getDuration() != null) {
                request.addParameter("Duration", StringUtils.fromString(describeReservedDBInstancesOfferingsRequest.getDuration()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getProductDescription() != null) {
                request.addParameter("ProductDescription", StringUtils.fromString(describeReservedDBInstancesOfferingsRequest.getProductDescription()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(describeReservedDBInstancesOfferingsRequest.isMultiAZ()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedDBInstancesOfferingsRequest.getMaxRecords()));
            }
        }
        if (describeReservedDBInstancesOfferingsRequest != null) {
            if (describeReservedDBInstancesOfferingsRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeReservedDBInstancesOfferingsRequest.getMarker()));
            }
        }


        return request;
    }
}
