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
 * ImportInstanceRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceRequestMarshaller implements Marshaller<Request<ImportInstanceRequest>, ImportInstanceRequest> {

    public Request<ImportInstanceRequest> marshall(ImportInstanceRequest importInstanceRequest) {

        if (importInstanceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportInstanceRequest> request = new DefaultRequest<ImportInstanceRequest>(importInstanceRequest, "AmazonEC2");
        request.addParameter("Action", "ImportInstance");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (importInstanceRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(importInstanceRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<DiskImage> importInstanceRequestDiskImagesList = (com.amazonaws.internal.SdkInternalList<DiskImage>) importInstanceRequest
                .getDiskImages();
        if (!importInstanceRequestDiskImagesList.isEmpty() || !importInstanceRequestDiskImagesList.isAutoConstruct()) {
            int diskImagesListIndex = 1;

            for (DiskImage importInstanceRequestDiskImagesListValue : importInstanceRequestDiskImagesList) {

                if (importInstanceRequestDiskImagesListValue.getDescription() != null) {
                    request.addParameter("DiskImage." + diskImagesListIndex + ".Description",
                            StringUtils.fromString(importInstanceRequestDiskImagesListValue.getDescription()));
                }

                DiskImageDetail image = importInstanceRequestDiskImagesListValue.getImage();
                if (image != null) {

                    if (image.getBytes() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Bytes", StringUtils.fromLong(image.getBytes()));
                    }

                    if (image.getFormat() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.Format", StringUtils.fromString(image.getFormat()));
                    }

                    if (image.getImportManifestUrl() != null) {
                        request.addParameter("DiskImage." + diskImagesListIndex + ".Image.ImportManifestUrl",
                                StringUtils.fromString(image.getImportManifestUrl()));
                    }
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

        ImportInstanceLaunchSpecification launchSpecification = importInstanceRequest.getLaunchSpecification();
        if (launchSpecification != null) {

            if (launchSpecification.getAdditionalInfo() != null) {
                request.addParameter("LaunchSpecification.AdditionalInfo", StringUtils.fromString(launchSpecification.getAdditionalInfo()));
            }

            if (launchSpecification.getArchitecture() != null) {
                request.addParameter("LaunchSpecification.Architecture", StringUtils.fromString(launchSpecification.getArchitecture()));
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

            if (launchSpecification.getInstanceInitiatedShutdownBehavior() != null) {
                request.addParameter("LaunchSpecification.InstanceInitiatedShutdownBehavior",
                        StringUtils.fromString(launchSpecification.getInstanceInitiatedShutdownBehavior()));
            }

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecification.getInstanceType()));
            }

            if (launchSpecification.getMonitoring() != null) {
                request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(launchSpecification.getMonitoring()));
            }

            Placement placement = launchSpecification.getPlacement();
            if (placement != null) {

                if (placement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                }

                if (placement.getAffinity() != null) {
                    request.addParameter("LaunchSpecification.Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
                }

                if (placement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                }

                if (placement.getPartitionNumber() != null) {
                    request.addParameter("LaunchSpecification.Placement.PartitionNumber", StringUtils.fromInteger(placement.getPartitionNumber()));
                }

                if (placement.getHostId() != null) {
                    request.addParameter("LaunchSpecification.Placement.HostId", StringUtils.fromString(placement.getHostId()));
                }

                if (placement.getTenancy() != null) {
                    request.addParameter("LaunchSpecification.Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
                }

                if (placement.getSpreadDomain() != null) {
                    request.addParameter("LaunchSpecification.Placement.SpreadDomain", StringUtils.fromString(placement.getSpreadDomain()));
                }
            }

            if (launchSpecification.getPrivateIpAddress() != null) {
                request.addParameter("LaunchSpecification.PrivateIpAddress", StringUtils.fromString(launchSpecification.getPrivateIpAddress()));
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecification.getSubnetId()));
            }

            UserData userData = launchSpecification.getUserData();
            if (userData != null) {

                if (userData.getData() != null) {
                    request.addParameter("LaunchSpecification.UserData.Data", StringUtils.fromString(userData.getData()));
                }
            }
        }

        if (importInstanceRequest.getPlatform() != null) {
            request.addParameter("Platform", StringUtils.fromString(importInstanceRequest.getPlatform()));
        }

        return request;
    }

}
