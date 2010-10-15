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
 * Delete D B Snapshot Request Marshaller
 */
public class DeleteDBSnapshotRequestMarshaller implements Marshaller<Request<DeleteDBSnapshotRequest>, DeleteDBSnapshotRequest> {

    public Request<DeleteDBSnapshotRequest> marshall(DeleteDBSnapshotRequest deleteDBSnapshotRequest) {
        Request<DeleteDBSnapshotRequest> request = new DefaultRequest<DeleteDBSnapshotRequest>(deleteDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "DeleteDBSnapshot");
        request.addParameter("Version", "2010-07-28");
        if (deleteDBSnapshotRequest != null) {
            if (deleteDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
                request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(deleteDBSnapshotRequest.getDBSnapshotIdentifier()));
            }
        }


        return request;
    }
}
