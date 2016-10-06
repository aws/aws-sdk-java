/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ImportInstanceRequest Marshaller
 */

public class ImportInstanceRequestMarshaller implements Marshaller<Request<ImportInstanceRequest>, ImportInstanceRequest> {

    public Request<ImportInstanceRequest> marshall(ImportInstanceRequest importInstanceRequest) {

        if (importInstanceRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportInstanceRequest> request = new DefaultRequest<ImportInstanceRequest>(importInstanceRequest, "AmazonEC2");
        request.addParameter("Action", "ImportInstance");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (importInstanceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importInstanceRequest.getDescription()));
        }

        ImportInstanceLaunchSpecification launchSpecification = importInstanceRequest.getLaunchSpecification();
        if (launchSpecification != null) {

            if (launchSpecification.getArchitecture() != null) {
                request.addParameter("LaunchSpecification.Architecture", StringUtils.fromString(launchSpecification.getArchitecture()));
            }

            com.amazonaws.internal.SdkInternalList<String> importInstanceLaunchSpecificationGroupNamesList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getGroupNames();
            if (!importInstanceLaunchSpecificationGroupNamesList.isEmpty() || !importInstanceLaunchSpecificationGroupNamesList.isAutoConstruct()) {
                int groupNamesListIndex = 1;

                for (String importInstanceLaunchSpecificationGroupNamesListValue : importInstanceLaunchSpecificationGroupNamesList) {
                    if (importInstanceLaunchSpecificationGroupNamesListValue != null) {
                        request.addParameter("LaunchSpecification.GroupName." + groupNamesListIndex,
                                StringUtils.fromString(importInstanceLaunchSpecificationGroupNamesListValue));
                    }
                    groupNamesListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> importInstanceLaunchSpecificationGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getGroupIds();
            if (!importInstanceLaunchSpecificationGroupIdsList.isEmpty() || !importInstanceLaunchSpecificationGroupIdsList.isAutoConstruct()) {
                int groupIdsListIndex = 1;

                for (String importInstanceLaunchSpecificationGroupIdsListValue : importInstanceLaunchSpecificationGroupIdsList) {
                    if (importInstanceLaunchSpecificationGroupIdsListValue != null) {
                        request.addParameter("LaunchSpecification.GroupId." + groupIdsListIndex,
                                StringUtils.fromString(importInstanceLaunchSpecificationGroupIdsListValue));
                    }
                    groupIdsListIndex++;
                }
            }

            if (launchSpecification.getAdditionalInfo() != null) {
                request.addParameter("LaunchSpecification.AdditionalInfo", StringUtils.fromString(launchSpecification.getAdditionalInfo()));
            }

            UserData userData = launchSpecification.getUserData();
            if (userData != null) {

                if (userData.getData() != null) {
                    request.addParameter("LaunchSpecification.UserData.Data", StringUtils.fromString(userData.getData()));
                }
            }

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecification.getInstanceType()));
            }

            Placement placement = launchSpecification.getPlacement();
            if (placement != null) {

                if (placement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                }

                if (placement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                }

                if (placement.getTenancy() != null) {
                    request.addParameter("LaunchSpecification.Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
                }

                if (placement.getHostId() != null) {
                    request.addParameter("LaunchSpecification.Placement.HostId", StringUtils.fromString(placement.getHostId()));
                }

                if (placement.getAffinity() != null) {
                    request.addParameter("LaunchSpecification.Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
                }
            }

            if (launchSpecification.getMonitoring() != null) {
                request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(launchSpecification.getMonitoring()));
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecification.getSubnetId()));
            }

            if (launchSpecification.getInstanceInitiatedShutdownBehavior() != null) {
                request.addParameter("LaunchSpecification.InstanceInitiatedShutdownBehavior",
                        StringUtils.fromString(launchSpecification.getInstanceInitiatedShutdownBehavior()));
            }

            if (launchSpecification.getPrivateIpAddress() != null) {
                request.addParameter("LaunchSpecification.PrivateIpAddress", StringUtils.fromString(launchSpecification.getPrivateIpAddress()));
            }
        }

        com.amazonaws.internal.SdkInternalList<DiskImage> importInstanceRequestDiskImagesList = (com.amazonaws.internal.SdkInternalList<DiskImage>) importInstanceRequest
                .getDiskImages();
        if (!importInstanceRequestDiskImagesList.isEmpty() || !importInstanceRequestDiskImagesList.isAutoConstruct()) {
            int diskImagesListIndex = 1;

            for (DiskImage importInstanceRequestDiskImagesListValue : importInstanceRequestDiskImagesList) {

                DiskImageDetail image = importInstanceRequestDiskImagesListValue.getImage();
                if (image != null) {

                    if (image.getFormat() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Format", StringUtils.fromString(image.getFormat()));
                    }

                    if (image.getBytes() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Bytes", StringUtils.fromLong(image.getBytes()));
                    }

                    if (image.getImportManifestUrl() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.ImportManifestUrl",
                                StringUtils.fromString(image.getImportManifestUrl()));
                    }
                }

                if (importInstanceRequestDiskImagesListValue.getDescription() != null) {
                    request.addParameter("DiskImage." + diskImagesListIndex + ".Description",
                            StringUtils.fromString(importInstanceRequestDiskImagesListValue.getDescription()));
                }

                VolumeDetail volume = importInstanceRequestDiskImagesListValue.getVolume();
                if (volume != null) {

                    if (volume.getSize() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Volume.Size", StringUtils.fromLong(volume.getSize()));
                    }
                }
                diskImagesListIndex++;
            }
        }

        if (importInstanceRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(importInstanceRequest.getPlatform()));
        }

        return request;
    }

}
