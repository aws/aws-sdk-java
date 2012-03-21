/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describe D B Instances Request Marshaller
 */
public class DescribeDBInstancesRequestMarshaller implements Marshaller<Request<DescribeDBInstancesRequest>, DescribeDBInstancesRequest> {

    public Request<DescribeDBInstancesRequest> marshall(DescribeDBInstancesRequest describeDBInstancesRequest) {

        if (describeDBInstancesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeDBInstancesRequest> request = new DefaultRequest<DescribeDBInstancesRequest>(describeDBInstancesRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBInstances");
        request.addParameter("Version", "2012-01-15");

        if (describeDBInstancesRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBInstancesRequest.getDBInstanceIdentifier()));
        }
        if (describeDBInstancesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBInstancesRequest.getMaxRecords()));
        }
        if (describeDBInstancesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeDBInstancesRequest.getMarker()));
        }


        return request;
    }
}
