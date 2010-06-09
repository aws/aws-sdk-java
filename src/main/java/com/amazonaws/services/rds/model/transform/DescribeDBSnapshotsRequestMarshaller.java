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
 * Describe D B Snapshots Request Marshaller
 */        
public class DescribeDBSnapshotsRequestMarshaller implements Marshaller<Request<DescribeDBSnapshotsRequest>, DescribeDBSnapshotsRequest> {

    public Request<DescribeDBSnapshotsRequest> marshall(DescribeDBSnapshotsRequest describeDBSnapshotsRequest) {
        Request<DescribeDBSnapshotsRequest> request = new DefaultRequest<DescribeDBSnapshotsRequest>(describeDBSnapshotsRequest, "AmazonRDS");
        request.addParameter("Action", "DescribeDBSnapshots");
        request.addParameter("Version", "2010-01-01");
        if (describeDBSnapshotsRequest != null) {
            if (describeDBSnapshotsRequest.getDBInstanceIdentifier() != null) {
                request.addParameter("DBInstanceIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBInstanceIdentifier()));
            }
        }
        if (describeDBSnapshotsRequest != null) {
            if (describeDBSnapshotsRequest.getDBSnapshotIdentifier() != null) {
                request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(describeDBSnapshotsRequest.getDBSnapshotIdentifier()));
            }
        }
        if (describeDBSnapshotsRequest != null) {
            if (describeDBSnapshotsRequest.getMaxRecords() != null) {
                request.addParameter("MaxRecords", StringUtils.fromInteger(describeDBSnapshotsRequest.getMaxRecords()));
            }
        }
        if (describeDBSnapshotsRequest != null) {
            if (describeDBSnapshotsRequest.getMarker() != null) {
                request.addParameter("Marker", StringUtils.fromString(describeDBSnapshotsRequest.getMarker()));
            }
        }


        return request;
    }
}
