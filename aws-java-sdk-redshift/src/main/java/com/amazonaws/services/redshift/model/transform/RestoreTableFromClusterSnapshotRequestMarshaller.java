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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RestoreTableFromClusterSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableFromClusterSnapshotRequestMarshaller implements
        Marshaller<Request<RestoreTableFromClusterSnapshotRequest>, RestoreTableFromClusterSnapshotRequest> {

    public Request<RestoreTableFromClusterSnapshotRequest> marshall(RestoreTableFromClusterSnapshotRequest restoreTableFromClusterSnapshotRequest) {

        if (restoreTableFromClusterSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RestoreTableFromClusterSnapshotRequest> request = new DefaultRequest<RestoreTableFromClusterSnapshotRequest>(
                restoreTableFromClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "RestoreTableFromClusterSnapshot");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (restoreTableFromClusterSnapshotRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getClusterIdentifier()));
        }

        if (restoreTableFromClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getSnapshotIdentifier()));
        }

        if (restoreTableFromClusterSnapshotRequest.getSourceDatabaseName() != null) {
            request.addParameter("SourceDatabaseName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getSourceDatabaseName()));
        }

        if (restoreTableFromClusterSnapshotRequest.getSourceSchemaName() != null) {
            request.addParameter("SourceSchemaName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getSourceSchemaName()));
        }

        if (restoreTableFromClusterSnapshotRequest.getSourceTableName() != null) {
            request.addParameter("SourceTableName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getSourceTableName()));
        }

        if (restoreTableFromClusterSnapshotRequest.getTargetDatabaseName() != null) {
            request.addParameter("TargetDatabaseName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getTargetDatabaseName()));
        }

        if (restoreTableFromClusterSnapshotRequest.getTargetSchemaName() != null) {
            request.addParameter("TargetSchemaName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getTargetSchemaName()));
        }

        if (restoreTableFromClusterSnapshotRequest.getNewTableName() != null) {
            request.addParameter("NewTableName", StringUtils.fromString(restoreTableFromClusterSnapshotRequest.getNewTableName()));
        }

        return request;
    }

}
