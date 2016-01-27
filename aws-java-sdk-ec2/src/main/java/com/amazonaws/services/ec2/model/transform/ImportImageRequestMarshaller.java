/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Import Image Request Marshaller
 */
public class ImportImageRequestMarshaller implements Marshaller<Request<ImportImageRequest>, ImportImageRequest> {

    public Request<ImportImageRequest> marshall(ImportImageRequest importImageRequest) {

        if (importImageRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportImageRequest> request = new DefaultRequest<ImportImageRequest>(importImageRequest, "AmazonEC2");
        request.addParameter("Action", "ImportImage");
        request.addParameter("Version", "2015-10-01");

        if (importImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importImageRequest.getDescription()));
        }

        java.util.List<ImageDiskContainer> diskContainersList = importImageRequest.getDiskContainers();
        int diskContainersListIndex = 1;

        for (ImageDiskContainer diskContainersListValue : diskContainersList) {
            ImageDiskContainer imageDiskContainerMember = diskContainersListValue;
            if (imageDiskContainerMember != null) {
                if (imageDiskContainerMember.getDescription() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Description", StringUtils.fromString(imageDiskContainerMember.getDescription()));
                }
                if (imageDiskContainerMember.getFormat() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Format", StringUtils.fromString(imageDiskContainerMember.getFormat()));
                }
                if (imageDiskContainerMember.getUrl() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Url", StringUtils.fromString(imageDiskContainerMember.getUrl()));
                }
                UserBucket userBucketUserBucket = imageDiskContainerMember.getUserBucket();
                if (userBucketUserBucket != null) {
                    if (userBucketUserBucket.getS3Bucket() != null) {
                        request.addParameter("DiskContainer." + diskContainersListIndex + ".UserBucket.S3Bucket", StringUtils.fromString(userBucketUserBucket.getS3Bucket()));
                    }
                    if (userBucketUserBucket.getS3Key() != null) {
                        request.addParameter("DiskContainer." + diskContainersListIndex + ".UserBucket.S3Key", StringUtils.fromString(userBucketUserBucket.getS3Key()));
                    }
                }
                if (imageDiskContainerMember.getDeviceName() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".DeviceName", StringUtils.fromString(imageDiskContainerMember.getDeviceName()));
                }
                if (imageDiskContainerMember.getSnapshotId() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".SnapshotId", StringUtils.fromString(imageDiskContainerMember.getSnapshotId()));
                }
            }

            diskContainersListIndex++;
        }
        if (importImageRequest.getLicenseType() != null) {
            request.addParameter("LicenseType", StringUtils.fromString(importImageRequest.getLicenseType()));
        }
        if (importImageRequest.getHypervisor() != null) {
            request.addParameter("Hypervisor", StringUtils.fromString(importImageRequest.getHypervisor()));
        }
        if (importImageRequest.getArchitecture() != null) {
            request.addParameter("Architecture", StringUtils.fromString(importImageRequest.getArchitecture()));
        }
        if (importImageRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(importImageRequest.getPlatform()));
        }
        ClientData clientDataClientData = importImageRequest.getClientData();
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
        if (importImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(importImageRequest.getClientToken()));
        }
        if (importImageRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(importImageRequest.getRoleName()));
        }

        return request;
    }
}
