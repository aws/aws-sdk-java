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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ImportSnapshotRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSnapshotRequestMarshaller implements Marshaller<Request<ImportSnapshotRequest>, ImportSnapshotRequest> {

    public Request<ImportSnapshotRequest> marshall(ImportSnapshotRequest importSnapshotRequest) {

        if (importSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportSnapshotRequest> request = new DefaultRequest<ImportSnapshotRequest>(importSnapshotRequest, "AmazonEC2");
        request.addParameter("Action", "ImportSnapshot");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        ClientData clientData = importSnapshotRequest.getClientData();
        if (clientData != null) {

            if (clientData.getComment() != null) {
                request.addParameter("ClientData.Comment", StringUtils.fromString(clientData.getComment()));
            }

            if (clientData.getUploadEnd() != null) {
                request.addParameter("ClientData.UploadEnd", StringUtils.fromDate(clientData.getUploadEnd()));
            }

            if (clientData.getUploadSize() != null) {
                request.addParameter("ClientData.UploadSize", StringUtils.fromDouble(clientData.getUploadSize()));
            }

            if (clientData.getUploadStart() != null) {
                request.addParameter("ClientData.UploadStart", StringUtils.fromDate(clientData.getUploadStart()));
            }
        }

        if (importSnapshotRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(importSnapshotRequest.getClientToken()));
        }

        if (importSnapshotRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importSnapshotRequest.getDescription()));
        }

        SnapshotDiskContainer diskContainer = importSnapshotRequest.getDiskContainer();
        if (diskContainer != null) {

            if (diskContainer.getDescription() != null) {
                request.addParameter("DiskContainer.Description", StringUtils.fromString(diskContainer.getDescription()));
            }

            if (diskContainer.getFormat() != null) {
                request.addParameter("DiskContainer.Format", StringUtils.fromString(diskContainer.getFormat()));
            }

            if (diskContainer.getUrl() != null) {
                request.addParameter("DiskContainer.Url", StringUtils.fromString(diskContainer.getUrl()));
            }

            UserBucket userBucket = diskContainer.getUserBucket();
            if (userBucket != null) {

                if (userBucket.getS3Bucket() != null) {
                    request.addParameter("DiskContainer.UserBucket.S3Bucket", StringUtils.fromString(userBucket.getS3Bucket()));
                }

                if (userBucket.getS3Key() != null) {
                    request.addParameter("DiskContainer.UserBucket.S3Key", StringUtils.fromString(userBucket.getS3Key()));
                }
            }
        }

        if (importSnapshotRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(importSnapshotRequest.getEncrypted()));
        }

        if (importSnapshotRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(importSnapshotRequest.getKmsKeyId()));
        }

        if (importSnapshotRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(importSnapshotRequest.getRoleName()));
        }

        return request;
    }

}
