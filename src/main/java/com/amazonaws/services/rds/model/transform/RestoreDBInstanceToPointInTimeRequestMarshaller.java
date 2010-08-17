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
 * Restore D B Instance To Point In Time Request Marshaller
 */
public class RestoreDBInstanceToPointInTimeRequestMarshaller implements Marshaller<Request<RestoreDBInstanceToPointInTimeRequest>, RestoreDBInstanceToPointInTimeRequest> {

    public Request<RestoreDBInstanceToPointInTimeRequest> marshall(RestoreDBInstanceToPointInTimeRequest restoreDBInstanceToPointInTimeRequest) {
        Request<RestoreDBInstanceToPointInTimeRequest> request = new DefaultRequest<RestoreDBInstanceToPointInTimeRequest>(restoreDBInstanceToPointInTimeRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceToPointInTime");
        request.addParameter("Version", "2010-06-28");
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getSourceDBInstanceIdentifier() != null) {
                request.addParameter("SourceDBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getSourceDBInstanceIdentifier()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getTargetDBInstanceIdentifier() != null) {
                request.addParameter("TargetDBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getTargetDBInstanceIdentifier()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getRestoreTime() != null) {
                request.addParameter("RestoreTime", StringUtils.fromDate(restoreDBInstanceToPointInTimeRequest.getRestoreTime()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.isUseLatestRestorableTime() != null) {
                request.addParameter("UseLatestRestorableTime", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.isUseLatestRestorableTime()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getDBInstanceClass() != null) {
                request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getDBInstanceClass()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getPort() != null) {
                request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceToPointInTimeRequest.getPort()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.getAvailabilityZone() != null) {
                request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceToPointInTimeRequest.getAvailabilityZone()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.isMultiAZ() != null) {
                request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.isMultiAZ()));
            }
        }
        if (restoreDBInstanceToPointInTimeRequest != null) {
            if (restoreDBInstanceToPointInTimeRequest.isAutoMinorVersionUpgrade() != null) {
                request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(restoreDBInstanceToPointInTimeRequest.isAutoMinorVersionUpgrade()));
            }
        }


        return request;
    }
}
