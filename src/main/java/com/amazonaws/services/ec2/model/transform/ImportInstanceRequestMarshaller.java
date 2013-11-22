/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Import Instance Request Marshaller
 */
public class ImportInstanceRequestMarshaller implements Marshaller<Request<ImportInstanceRequest>, ImportInstanceRequest> {

    public Request<ImportInstanceRequest> marshall(ImportInstanceRequest importInstanceRequest) {

        if (importInstanceRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ImportInstanceRequest> request = new DefaultRequest<ImportInstanceRequest>(importInstanceRequest, "AmazonEC2");
        request.addParameter("Action", "ImportInstance");
        request.addParameter("Version", "2013-10-15");

        if (importInstanceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importInstanceRequest.getDescription()));
        }
        ImportInstanceLaunchSpecification importInstanceLaunchSpecificationLaunchSpecification = importInstanceRequest.getLaunchSpecification();
        if (importInstanceLaunchSpecificationLaunchSpecification != null) {
            if (importInstanceLaunchSpecificationLaunchSpecification.getArchitecture() != null) {
                request.addParameter("LaunchSpecification.Architecture", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getArchitecture()));
            }

            java.util.List<String> groupNamesList = importInstanceLaunchSpecificationLaunchSpecification.getGroupNames();
            int groupNamesListIndex = 1;

            for (String groupNamesListValue : groupNamesList) {
                if (groupNamesListValue != null) {
                    request.addParameter("LaunchSpecification.GroupName." + groupNamesListIndex, StringUtils.fromString(groupNamesListValue));
                }

                groupNamesListIndex++;
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getAdditionalInfo() != null) {
                request.addParameter("LaunchSpecification.AdditionalInfo", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getAdditionalInfo()));
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getUserData()));
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getInstanceType()));
            }
            Placement placementPlacement = importInstanceLaunchSpecificationLaunchSpecification.getPlacement();
            if (placementPlacement != null) {
                if (placementPlacement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(placementPlacement.getAvailabilityZone()));
                }
                if (placementPlacement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(placementPlacement.getGroupName()));
                }
                if (placementPlacement.getTenancy() != null) {
                    request.addParameter("LaunchSpecification.Placement.Tenancy", StringUtils.fromString(placementPlacement.getTenancy()));
                }
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.isMonitoring() != null) {
                request.addParameter("LaunchSpecification.Monitoring", StringUtils.fromBoolean(importInstanceLaunchSpecificationLaunchSpecification.isMonitoring()));
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getSubnetId()));
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getInstanceInitiatedShutdownBehavior() != null) {
                request.addParameter("LaunchSpecification.InstanceInitiatedShutdownBehavior", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getInstanceInitiatedShutdownBehavior()));
            }
            if (importInstanceLaunchSpecificationLaunchSpecification.getPrivateIpAddress() != null) {
                request.addParameter("LaunchSpecification.PrivateIpAddress", StringUtils.fromString(importInstanceLaunchSpecificationLaunchSpecification.getPrivateIpAddress()));
            }
        }

        java.util.List<DiskImage> diskImagesList = importInstanceRequest.getDiskImages();
        int diskImagesListIndex = 1;

        for (DiskImage diskImagesListValue : diskImagesList) {
            DiskImage diskImageMember = diskImagesListValue;
            if (diskImageMember != null) {
                DiskImageDetail diskImageDetailImage = diskImageMember.getImage();
                if (diskImageDetailImage != null) {
                    if (diskImageDetailImage.getFormat() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Format", StringUtils.fromString(diskImageDetailImage.getFormat()));
                    }
                    if (diskImageDetailImage.getBytes() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Bytes", StringUtils.fromLong(diskImageDetailImage.getBytes()));
                    }
                    if (diskImageDetailImage.getImportManifestUrl() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.ImportManifestUrl", StringUtils.fromString(diskImageDetailImage.getImportManifestUrl()));
                    }
                }
                if (diskImageMember.getDescription() != null) {
                    request.addParameter("DiskImage." + diskImagesListIndex + ".Description", StringUtils.fromString(diskImageMember.getDescription()));
                }
                VolumeDetail volumeDetailVolume = diskImageMember.getVolume();
                if (volumeDetailVolume != null) {
                    if (volumeDetailVolume.getSize() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Volume.Size", StringUtils.fromLong(volumeDetailVolume.getSize()));
                    }
                }
            }

            diskImagesListIndex++;
        }
        if (importInstanceRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(importInstanceRequest.getPlatform()));
        }


        return request;
    }
}
