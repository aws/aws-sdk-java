/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * RequestSpotFleetRequest Marshaller
 */

public class RequestSpotFleetRequestMarshaller implements
        Marshaller<Request<RequestSpotFleetRequest>, RequestSpotFleetRequest> {

    public Request<RequestSpotFleetRequest> marshall(
            RequestSpotFleetRequest requestSpotFleetRequest) {

        if (requestSpotFleetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotFleetRequest> request = new DefaultRequest<RequestSpotFleetRequest>(
                requestSpotFleetRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotFleet");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        SpotFleetRequestConfigData spotFleetRequestConfig = requestSpotFleetRequest
                .getSpotFleetRequestConfig();
        if (spotFleetRequestConfig != null) {

            if (spotFleetRequestConfig.getClientToken() != null) {
                request.addParameter("SpotFleetRequestConfig.ClientToken",
                        StringUtils.fromString(spotFleetRequestConfig
                                .getClientToken()));
            }

            if (spotFleetRequestConfig.getSpotPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.SpotPrice",
                        StringUtils.fromString(spotFleetRequestConfig
                                .getSpotPrice()));
            }

            if (spotFleetRequestConfig.getTargetCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.TargetCapacity",
                        StringUtils.fromInteger(spotFleetRequestConfig
                                .getTargetCapacity()));
            }

            if (spotFleetRequestConfig.getValidFrom() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidFrom",
                        StringUtils.fromDate(spotFleetRequestConfig
                                .getValidFrom()));
            }

            if (spotFleetRequestConfig.getValidUntil() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidUntil",
                        StringUtils.fromDate(spotFleetRequestConfig
                                .getValidUntil()));
            }

            if (spotFleetRequestConfig.getTerminateInstancesWithExpiration() != null) {
                request.addParameter(
                        "SpotFleetRequestConfig.TerminateInstancesWithExpiration",
                        StringUtils.fromBoolean(spotFleetRequestConfig
                                .getTerminateInstancesWithExpiration()));
            }

            if (spotFleetRequestConfig.getIamFleetRole() != null) {
                request.addParameter("SpotFleetRequestConfig.IamFleetRole",
                        StringUtils.fromString(spotFleetRequestConfig
                                .getIamFleetRole()));
            }

            com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification> launchSpecificationsList = (com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>) spotFleetRequestConfig
                    .getLaunchSpecifications();
            if (!launchSpecificationsList.isEmpty()
                    || !launchSpecificationsList.isAutoConstruct()) {
                int launchSpecificationsListIndex = 1;

                for (SpotFleetLaunchSpecification launchSpecificationsListValue : launchSpecificationsList) {

                    if (launchSpecificationsListValue.getImageId() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".ImageId",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getImageId()));
                    }

                    if (launchSpecificationsListValue.getKeyName() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".KeyName",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getKeyName()));
                    }

                    com.amazonaws.internal.SdkInternalList<GroupIdentifier> securityGroupsList = (com.amazonaws.internal.SdkInternalList<GroupIdentifier>) launchSpecificationsListValue
                            .getSecurityGroups();
                    if (!securityGroupsList.isEmpty()
                            || !securityGroupsList.isAutoConstruct()) {
                        int securityGroupsListIndex = 1;

                        for (GroupIdentifier securityGroupsListValue : securityGroupsList) {

                            if (securityGroupsListValue.getGroupName() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".GroupSet."
                                                + securityGroupsListIndex
                                                + ".GroupName",
                                        StringUtils
                                                .fromString(securityGroupsListValue
                                                        .getGroupName()));
                            }

                            if (securityGroupsListValue.getGroupId() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".GroupSet."
                                                + securityGroupsListIndex
                                                + ".GroupId",
                                        StringUtils
                                                .fromString(securityGroupsListValue
                                                        .getGroupId()));
                            }
                            securityGroupsListIndex++;
                        }
                    }

                    if (launchSpecificationsListValue.getUserData() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".UserData",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getUserData()));
                    }

                    if (launchSpecificationsListValue.getAddressingType() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".AddressingType",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getAddressingType()));
                    }

                    if (launchSpecificationsListValue.getInstanceType() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".InstanceType",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getInstanceType()));
                    }

                    SpotPlacement placement = launchSpecificationsListValue
                            .getPlacement();
                    if (placement != null) {

                        if (placement.getAvailabilityZone() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications."
                                            + launchSpecificationsListIndex
                                            + ".Placement.AvailabilityZone",
                                    StringUtils.fromString(placement
                                            .getAvailabilityZone()));
                        }

                        if (placement.getGroupName() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications."
                                            + launchSpecificationsListIndex
                                            + ".Placement.GroupName",
                                    StringUtils.fromString(placement
                                            .getGroupName()));
                        }
                    }

                    if (launchSpecificationsListValue.getKernelId() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".KernelId",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getKernelId()));
                    }

                    if (launchSpecificationsListValue.getRamdiskId() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".RamdiskId",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getRamdiskId()));
                    }

                    com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) launchSpecificationsListValue
                            .getBlockDeviceMappings();
                    if (!blockDeviceMappingsList.isEmpty()
                            || !blockDeviceMappingsList.isAutoConstruct()) {
                        int blockDeviceMappingsListIndex = 1;

                        for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {

                            if (blockDeviceMappingsListValue.getVirtualName() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".BlockDeviceMapping."
                                                + blockDeviceMappingsListIndex
                                                + ".VirtualName",
                                        StringUtils
                                                .fromString(blockDeviceMappingsListValue
                                                        .getVirtualName()));
                            }

                            if (blockDeviceMappingsListValue.getDeviceName() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".BlockDeviceMapping."
                                                + blockDeviceMappingsListIndex
                                                + ".DeviceName",
                                        StringUtils
                                                .fromString(blockDeviceMappingsListValue
                                                        .getDeviceName()));
                            }

                            EbsBlockDevice ebs = blockDeviceMappingsListValue
                                    .getEbs();
                            if (ebs != null) {

                                if (ebs.getSnapshotId() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.SnapshotId",
                                            StringUtils.fromString(ebs
                                                    .getSnapshotId()));
                                }

                                if (ebs.getVolumeSize() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.VolumeSize",
                                            StringUtils.fromInteger(ebs
                                                    .getVolumeSize()));
                                }

                                if (ebs.getDeleteOnTermination() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.DeleteOnTermination",
                                            StringUtils.fromBoolean(ebs
                                                    .getDeleteOnTermination()));
                                }

                                if (ebs.getVolumeType() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.VolumeType",
                                            StringUtils.fromString(ebs
                                                    .getVolumeType()));
                                }

                                if (ebs.getIops() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.Iops", StringUtils
                                                    .fromInteger(ebs.getIops()));
                                }

                                if (ebs.getEncrypted() != null) {
                                    request.addParameter(
                                            "SpotFleetRequestConfig.LaunchSpecifications."
                                                    + launchSpecificationsListIndex
                                                    + ".BlockDeviceMapping."
                                                    + blockDeviceMappingsListIndex
                                                    + ".Ebs.Encrypted",
                                            StringUtils.fromBoolean(ebs
                                                    .getEncrypted()));
                                }
                            }

                            if (blockDeviceMappingsListValue.getNoDevice() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".BlockDeviceMapping."
                                                + blockDeviceMappingsListIndex
                                                + ".NoDevice",
                                        StringUtils
                                                .fromString(blockDeviceMappingsListValue
                                                        .getNoDevice()));
                            }
                            blockDeviceMappingsListIndex++;
                        }
                    }

                    SpotFleetMonitoring monitoring = launchSpecificationsListValue
                            .getMonitoring();
                    if (monitoring != null) {

                        if (monitoring.getEnabled() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications."
                                            + launchSpecificationsListIndex
                                            + ".Monitoring.Enabled",
                                    StringUtils.fromBoolean(monitoring
                                            .getEnabled()));
                        }
                    }

                    if (launchSpecificationsListValue.getSubnetId() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".SubnetId",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getSubnetId()));
                    }

                    com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) launchSpecificationsListValue
                            .getNetworkInterfaces();
                    if (!networkInterfacesList.isEmpty()
                            || !networkInterfacesList.isAutoConstruct()) {
                        int networkInterfacesListIndex = 1;

                        for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {

                            if (networkInterfacesListValue
                                    .getNetworkInterfaceId() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".NetworkInterfaceId",
                                        StringUtils
                                                .fromString(networkInterfacesListValue
                                                        .getNetworkInterfaceId()));
                            }

                            if (networkInterfacesListValue.getDeviceIndex() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".DeviceIndex",
                                        StringUtils
                                                .fromInteger(networkInterfacesListValue
                                                        .getDeviceIndex()));
                            }

                            if (networkInterfacesListValue.getSubnetId() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".SubnetId",
                                        StringUtils
                                                .fromString(networkInterfacesListValue
                                                        .getSubnetId()));
                            }

                            if (networkInterfacesListValue.getDescription() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".Description",
                                        StringUtils
                                                .fromString(networkInterfacesListValue
                                                        .getDescription()));
                            }

                            if (networkInterfacesListValue
                                    .getPrivateIpAddress() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".PrivateIpAddress",
                                        StringUtils
                                                .fromString(networkInterfacesListValue
                                                        .getPrivateIpAddress()));
                            }

                            com.amazonaws.internal.SdkInternalList<String> groupsList = (com.amazonaws.internal.SdkInternalList<String>) networkInterfacesListValue
                                    .getGroups();
                            if (!groupsList.isEmpty()
                                    || !groupsList.isAutoConstruct()) {
                                int groupsListIndex = 1;

                                for (String groupsListValue : groupsList) {
                                    if (groupsListValue != null) {
                                        request.addParameter(
                                                "SpotFleetRequestConfig.LaunchSpecifications."
                                                        + launchSpecificationsListIndex
                                                        + ".NetworkInterfaceSet."
                                                        + networkInterfacesListIndex
                                                        + ".SecurityGroupId."
                                                        + groupsListIndex,
                                                StringUtils
                                                        .fromString(groupsListValue));
                                    }
                                    groupsListIndex++;
                                }
                            }

                            if (networkInterfacesListValue
                                    .getDeleteOnTermination() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".DeleteOnTermination",
                                        StringUtils
                                                .fromBoolean(networkInterfacesListValue
                                                        .getDeleteOnTermination()));
                            }

                            com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> privateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) networkInterfacesListValue
                                    .getPrivateIpAddresses();
                            if (!privateIpAddressesList.isEmpty()
                                    || !privateIpAddressesList
                                            .isAutoConstruct()) {
                                int privateIpAddressesListIndex = 1;

                                for (PrivateIpAddressSpecification privateIpAddressesListValue : privateIpAddressesList) {

                                    if (privateIpAddressesListValue
                                            .getPrivateIpAddress() != null) {
                                        request.addParameter(
                                                "SpotFleetRequestConfig.LaunchSpecifications."
                                                        + launchSpecificationsListIndex
                                                        + ".NetworkInterfaceSet."
                                                        + networkInterfacesListIndex
                                                        + ".PrivateIpAddresses."
                                                        + privateIpAddressesListIndex
                                                        + ".PrivateIpAddress",
                                                StringUtils
                                                        .fromString(privateIpAddressesListValue
                                                                .getPrivateIpAddress()));
                                    }

                                    if (privateIpAddressesListValue
                                            .getPrimary() != null) {
                                        request.addParameter(
                                                "SpotFleetRequestConfig.LaunchSpecifications."
                                                        + launchSpecificationsListIndex
                                                        + ".NetworkInterfaceSet."
                                                        + networkInterfacesListIndex
                                                        + ".PrivateIpAddresses."
                                                        + privateIpAddressesListIndex
                                                        + ".Primary",
                                                StringUtils
                                                        .fromBoolean(privateIpAddressesListValue
                                                                .getPrimary()));
                                    }
                                    privateIpAddressesListIndex++;
                                }
                            }

                            if (networkInterfacesListValue
                                    .getSecondaryPrivateIpAddressCount() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".SecondaryPrivateIpAddressCount",
                                        StringUtils
                                                .fromInteger(networkInterfacesListValue
                                                        .getSecondaryPrivateIpAddressCount()));
                            }

                            if (networkInterfacesListValue
                                    .getAssociatePublicIpAddress() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.LaunchSpecifications."
                                                + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet."
                                                + networkInterfacesListIndex
                                                + ".AssociatePublicIpAddress",
                                        StringUtils
                                                .fromBoolean(networkInterfacesListValue
                                                        .getAssociatePublicIpAddress()));
                            }
                            networkInterfacesListIndex++;
                        }
                    }

                    IamInstanceProfileSpecification iamInstanceProfile = launchSpecificationsListValue
                            .getIamInstanceProfile();
                    if (iamInstanceProfile != null) {

                        if (iamInstanceProfile.getArn() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications."
                                            + launchSpecificationsListIndex
                                            + ".IamInstanceProfile.Arn",
                                    StringUtils.fromString(iamInstanceProfile
                                            .getArn()));
                        }

                        if (iamInstanceProfile.getName() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications."
                                            + launchSpecificationsListIndex
                                            + ".IamInstanceProfile.Name",
                                    StringUtils.fromString(iamInstanceProfile
                                            .getName()));
                        }
                    }

                    if (launchSpecificationsListValue.getEbsOptimized() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".EbsOptimized",
                                StringUtils
                                        .fromBoolean(launchSpecificationsListValue
                                                .getEbsOptimized()));
                    }

                    if (launchSpecificationsListValue.getWeightedCapacity() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".WeightedCapacity",
                                StringUtils
                                        .fromDouble(launchSpecificationsListValue
                                                .getWeightedCapacity()));
                    }

                    if (launchSpecificationsListValue.getSpotPrice() != null) {
                        request.addParameter(
                                "SpotFleetRequestConfig.LaunchSpecifications."
                                        + launchSpecificationsListIndex
                                        + ".SpotPrice",
                                StringUtils
                                        .fromString(launchSpecificationsListValue
                                                .getSpotPrice()));
                    }
                    launchSpecificationsListIndex++;
                }
            }

            if (spotFleetRequestConfig.getExcessCapacityTerminationPolicy() != null) {
                request.addParameter(
                        "SpotFleetRequestConfig.ExcessCapacityTerminationPolicy",
                        StringUtils.fromString(spotFleetRequestConfig
                                .getExcessCapacityTerminationPolicy()));
            }

            if (spotFleetRequestConfig.getAllocationStrategy() != null) {
                request.addParameter(
                        "SpotFleetRequestConfig.AllocationStrategy",
                        StringUtils.fromString(spotFleetRequestConfig
                                .getAllocationStrategy()));
            }
        }

        return request;
    }

}
