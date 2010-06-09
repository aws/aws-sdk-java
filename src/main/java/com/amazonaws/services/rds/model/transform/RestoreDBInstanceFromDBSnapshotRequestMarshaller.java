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
 * Restore D B Instance From D B Snapshot Request Marshaller
 */        
public class RestoreDBInstanceFromDBSnapshotRequestMarshaller implements Marshaller<Request<RestoreDBInstanceFromDBSnapshotRequest>, RestoreDBInstanceFromDBSnapshotRequest> {

    public Request<RestoreDBInstanceFromDBSnapshotRequest> marshall(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) {
        Request<RestoreDBInstanceFromDBSnapshotRequest> request = new DefaultRequest<RestoreDBInstanceFromDBSnapshotRequest>(restoreDBInstanceFromDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceFromDBSnapshot");
        request.addParameter("Version", "2010-01-01");
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier() != null) {
                request.addParameter("DBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier()));
            }
        }
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
                request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier()));
            }
        }
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass()));
            }
        }
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.getPort() != null) {
                request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceFromDBSnapshotRequest.getPort()));
            }
        }
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone() != null) {
                request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone()));
            }
        }
        if (restoreDBInstanceFromDBSnapshotRequest != null) {
            if (restoreDBInstanceFromDBSnapshotRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.isMultiAZ()));
            }
        }


        return request;
    }
}
