/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Import Snapshot Request Marshaller
 */
public class ImportSnapshotRequestMarshaller implements Marshaller<Request<ImportSnapshotRequest>, ImportSnapshotRequest> {

    public Request<ImportSnapshotRequest> marshall(ImportSnapshotRequest importSnapshotRequest) {

        if (importSnapshotRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportSnapshotRequest> request = new DefaultRequest<ImportSnapshotRequest>(importSnapshotRequest, "AmazonEC2");
        request.addParameter("Action", "ImportSnapshot");
        request.addParameter("Version", "2015-03-01");

        if (importSnapshotRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importSnapshotRequest.getDescription()));
        }
        SnapshotDiskContainer snapshotDiskContainerDiskContainer = importSnapshotRequest.getDiskContainer();
        if (snapshotDiskContainerDiskContainer != null) {
            if (snapshotDiskContainerDiskContainer.getDescription() != null) {
                request.addParameter("DiskContainer.Description", StringUtils.fromString(snapshotDiskContainerDiskContainer.getDescription()));
            }
            if (snapshotDiskContainerDiskContainer.getFormat() != null) {
                request.addParameter("DiskContainer.Format", StringUtils.fromString(snapshotDiskContainerDiskContainer.getFormat()));
            }
            if (snapshotDiskContainerDiskContainer.getUrl() != null) {
                request.addParameter("DiskContainer.Url", StringUtils.fromString(snapshotDiskContainerDiskContainer.getUrl()));
            }
            UserBucket userBucketUserBucket = snapshotDiskContainerDiskContainer.getUserBucket();
            if (userBucketUserBucket != null) {
                if (userBucketUserBucket.getS3Bucket() != null) {
                    request.addParameter("DiskContainer.UserBucket.S3Bucket", StringUtils.fromString(userBucketUserBucket.getS3Bucket()));
                }
                if (userBucketUserBucket.getS3Key() != null) {
                    request.addParameter("DiskContainer.UserBucket.S3Key", StringUtils.fromString(userBucketUserBucket.getS3Key()));
                }
            }
        }
        ClientData clientDataClientData = importSnapshotRequest.getClientData();
        if (clientDataClientData != null) {
            if (clientDataClientData.getUploadStart() != null) {
                request.addParameter("ClientData.UploadStart", StringUtils.fromDate(clientDataClientData.getUploadStart()));
            }
            if (clientDataClientData.getUploadEnd() != null) {
                request.addParameter("ClientData.UploadEnd", StringUtils.fromDate(clientDataClientData.getUploadEnd()));
            }
            if (clientDataClientData.getUploadSize() != null) {
                request.addParameter("ClientData.UploadSize", StringUtils.fromDouble(clientDataClientData.getUploadSize()));
            }
            if (clientDataClientData.getComment() != null) {
                request.addParameter("ClientData.Comment", StringUtils.fromString(clientDataClientData.getComment()));
            }
        }
        if (importSnapshotRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(importSnapshotRequest.getClientToken()));
        }
        if (importSnapshotRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(importSnapshotRequest.getRoleName()));
        }

        return request;
    }
}
