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
 * ImportImageRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportImageRequestMarshaller implements Marshaller<Request<ImportImageRequest>, ImportImageRequest> {

    public Request<ImportImageRequest> marshall(ImportImageRequest importImageRequest) {

        if (importImageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportImageRequest> request = new DefaultRequest<ImportImageRequest>(importImageRequest, "AmazonEC2");
        request.addParameter("Action", "ImportImage");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (importImageRequest.getArchitecture() != null) {
            request.addParameter("Architecture", StringUtils.fromString(importImageRequest.getArchitecture()));
        }

        ClientData clientData = importImageRequest.getClientData();
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

        if (importImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(importImageRequest.getClientToken()));
        }

        if (importImageRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importImageRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<ImageDiskContainer> importImageRequestDiskContainersList = (com.amazonaws.internal.SdkInternalList<ImageDiskContainer>) importImageRequest
                .getDiskContainers();
        if (!importImageRequestDiskContainersList.isEmpty() || !importImageRequestDiskContainersList.isAutoConstruct()) {
            int diskContainersListIndex = 1;

            for (ImageDiskContainer importImageRequestDiskContainersListValue : importImageRequestDiskContainersList) {

                if (importImageRequestDiskContainersListValue.getDescription() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Description",
                            StringUtils.fromString(importImageRequestDiskContainersListValue.getDescription()));
                }

                if (importImageRequestDiskContainersListValue.getDeviceName() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".DeviceName",
                            StringUtils.fromString(importImageRequestDiskContainersListValue.getDeviceName()));
                }

                if (importImageRequestDiskContainersListValue.getFormat() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Format",
                            StringUtils.fromString(importImageRequestDiskContainersListValue.getFormat()));
                }

                if (importImageRequestDiskContainersListValue.getSnapshotId() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".SnapshotId",
                            StringUtils.fromString(importImageRequestDiskContainersListValue.getSnapshotId()));
                }

                if (importImageRequestDiskContainersListValue.getUrl() != null) {
                    request.addParameter("DiskContainer." + diskContainersListIndex + ".Url",
                            StringUtils.fromString(importImageRequestDiskContainersListValue.getUrl()));
                }

                UserBucket userBucket = importImageRequestDiskContainersListValue.getUserBucket();
                if (userBucket != null) {

                    if (userBucket.getS3Bucket() != null) {
                        request.addParameter("DiskContainer." + diskContainersListIndex + ".UserBucket.S3Bucket",
                                StringUtils.fromString(userBucket.getS3Bucket()));
                    }

                    if (userBucket.getS3Key() != null) {
                        request.addParameter("DiskContainer." + diskContainersListIndex + ".UserBucket.S3Key", StringUtils.fromString(userBucket.getS3Key()));
                    }
                }
                diskContainersListIndex++;
            }
        }

        if (importImageRequest.getEncrypted() != null) {
            request.addParameter("Encrypted", StringUtils.fromBoolean(importImageRequest.getEncrypted()));
        }

        if (importImageRequest.getHypervisor() != null) {
            request.addParameter("Hypervisor", StringUtils.fromString(importImageRequest.getHypervisor()));
        }

        if (importImageRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils.fromString(importImageRequest.getKmsKeyId()));
        }

        if (importImageRequest.getLicenseType() != null) {
            request.addParameter("LicenseType", StringUtils.fromString(importImageRequest.getLicenseType()));
        }

        if (importImageRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(importImageRequest.getPlatform()));
        }

        if (importImageRequest.getRoleName() != null) {
            request.addParameter("RoleName", StringUtils.fromString(importImageRequest.getRoleName()));
        }

        return request;
    }

}
