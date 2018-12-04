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
 * RequestSpotInstancesRequest Marshaller
 */

public class RequestSpotInstancesRequestMarshaller
        implements
        Marshaller<Request<RequestSpotInstancesRequest>, RequestSpotInstancesRequest> {

    public Request<RequestSpotInstancesRequest> marshall(
            RequestSpotInstancesRequest requestSpotInstancesRequest) {

        if (requestSpotInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotInstancesRequest> request = new DefaultRequest<RequestSpotInstancesRequest>(
                requestSpotInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotInstances");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (requestSpotInstancesRequest.getSpotPrice() != null) {
            request.addParameter("SpotPrice", StringUtils
                    .fromString(requestSpotInstancesRequest.getSpotPrice()));
        }

        if (requestSpotInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils
                    .fromString(requestSpotInstancesRequest.getClientToken()));
        }

        if (requestSpotInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount",
                    StringUtils.fromInteger(requestSpotInstancesRequest
                            .getInstanceCount()));
        }

        if (requestSpotInstancesRequest.getType() != null) {
            request.addParameter("Type", StringUtils
                    .fromString(requestSpotInstancesRequest.getType()));
        }

        if (requestSpotInstancesRequest.getValidFrom() != null) {
            request.addParameter("ValidFrom", StringUtils
                    .fromDate(requestSpotInstancesRequest.getValidFrom()));
        }

        if (requestSpotInstancesRequest.getValidUntil() != null) {
            request.addParameter("ValidUntil", StringUtils
                    .fromDate(requestSpotInstancesRequest.getValidUntil()));
        }

        if (requestSpotInstancesRequest.getLaunchGroup() != null) {
            request.addParameter("LaunchGroup", StringUtils
                    .fromString(requestSpotInstancesRequest.getLaunchGroup()));
        }

        if (requestSpotInstancesRequest.getAvailabilityZoneGroup() != null) {
            request.addParameter("AvailabilityZoneGroup", StringUtils
                    .fromString(requestSpotInstancesRequest
                            .getAvailabilityZoneGroup()));
        }

        if (requestSpotInstancesRequest.getBlockDurationMinutes() != null) {
            request.addParameter("BlockDurationMinutes", StringUtils
                    .fromInteger(requestSpotInstancesRequest
                            .getBlockDurationMinutes()));
        }

        LaunchSpecification launchSpecification = requestSpotInstancesRequest
                .getLaunchSpecification();
        if (launchSpecification != null) {

            if (launchSpecification.getImageId() != null) {
                request.addParameter("LaunchSpecification.ImageId", StringUtils
                        .fromString(launchSpecification.getImageId()));
            }

            if (launchSpecification.getKeyName() != null) {
                request.addParameter("LaunchSpecification.KeyName", StringUtils
                        .fromString(launchSpecification.getKeyName()));
            }

            if (launchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData",
                        StringUtils.fromString(launchSpecification
                                .getUserData()));
            }

            if (launchSpecification.getAddressingType() != null) {
                request.addParameter("LaunchSpecification.AddressingType",
                        StringUtils.fromString(launchSpecification
                                .getAddressingType()));
            }

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType",
                        StringUtils.fromString(launchSpecification
                                .getInstanceType()));
            }

            SpotPlacement placement = launchSpecification.getPlacement();
            if (placement != null) {

                if (placement.getAvailabilityZone() != null) {
                    request.addParameter(
                            "LaunchSpecification.Placement.AvailabilityZone",
                            StringUtils.fromString(placement
                                    .getAvailabilityZone()));
                }

                if (placement.getGroupName() != null) {
                    request.addParameter(
                            "LaunchSpecification.Placement.GroupName",
                            StringUtils.fromString(placement.getGroupName()));
                }
            }

            if (launchSpecification.getKernelId() != null) {
                request.addParameter("LaunchSpecification.KernelId",
                        StringUtils.fromString(launchSpecification
                                .getKernelId()));
            }

            if (launchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId",
                        StringUtils.fromString(launchSpecification
                                .getRamdiskId()));
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) launchSpecification
                    .getBlockDeviceMappings();
            if (!blockDeviceMappingsList.isEmpty()
                    || !blockDeviceMappingsList.isAutoConstruct()) {
                int blockDeviceMappingsListIndex = 1;

                for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {

                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter(
                                "LaunchSpecification.BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex
                                        + ".VirtualName",
                                StringUtils
                                        .fromString(blockDeviceMappingsListValue
                                                .getVirtualName()));
                    }

                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter(
                                "LaunchSpecification.BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex
                                        + ".DeviceName",
                                StringUtils
                                        .fromString(blockDeviceMappingsListValue
                                                .getDeviceName()));
                    }

                    EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {

                        if (ebs.getSnapshotId() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.SnapshotId",
                                    StringUtils.fromString(ebs.getSnapshotId()));
                        }

                        if (ebs.getVolumeSize() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.VolumeSize", StringUtils
                                            .fromInteger(ebs.getVolumeSize()));
                        }

                        if (ebs.getDeleteOnTermination() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.DeleteOnTermination",
                                    StringUtils.fromBoolean(ebs
                                            .getDeleteOnTermination()));
                        }

                        if (ebs.getVolumeType() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.VolumeType",
                                    StringUtils.fromString(ebs.getVolumeType()));
                        }

                        if (ebs.getIops() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.Iops",
                                    StringUtils.fromInteger(ebs.getIops()));
                        }

                        if (ebs.getEncrypted() != null) {
                            request.addParameter(
                                    "LaunchSpecification.BlockDeviceMapping."
                                            + blockDeviceMappingsListIndex
                                            + ".Ebs.Encrypted",
                                    StringUtils.fromBoolean(ebs.getEncrypted()));
                        }
                    }

                    if (blockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter(
                                "LaunchSpecification.BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex
                                        + ".NoDevice",
                                StringUtils
                                        .fromString(blockDeviceMappingsListValue
                                                .getNoDevice()));
                    }
                    blockDeviceMappingsListIndex++;
                }
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId",
                        StringUtils.fromString(launchSpecification
                                .getSubnetId()));
            }

            com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) launchSpecification
                    .getNetworkInterfaces();
            if (!networkInterfacesList.isEmpty()
                    || !networkInterfacesList.isAutoConstruct()) {
                int networkInterfacesListIndex = 1;

                for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {

                    if (networkInterfacesListValue.getNetworkInterfaceId() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".NetworkInterfaceId", StringUtils
                                        .fromString(networkInterfacesListValue
                                                .getNetworkInterfaceId()));
                    }

                    if (networkInterfacesListValue.getDeviceIndex() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".DeviceIndex", StringUtils
                                        .fromInteger(networkInterfacesListValue
                                                .getDeviceIndex()));
                    }

                    if (networkInterfacesListValue.getSubnetId() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".SubnetId", StringUtils
                                        .fromString(networkInterfacesListValue
                                                .getSubnetId()));
                    }

                    if (networkInterfacesListValue.getDescription() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".Description", StringUtils
                                        .fromString(networkInterfacesListValue
                                                .getDescription()));
                    }

                    if (networkInterfacesListValue.getPrivateIpAddress() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".PrivateIpAddress", StringUtils
                                        .fromString(networkInterfacesListValue
                                                .getPrivateIpAddress()));
                    }

                    com.amazonaws.internal.SdkInternalList<String> groupsList = (com.amazonaws.internal.SdkInternalList<String>) networkInterfacesListValue
                            .getGroups();
                    if (!groupsList.isEmpty() || !groupsList.isAutoConstruct()) {
                        int groupsListIndex = 1;

                        for (String groupsListValue : groupsList) {
                            if (groupsListValue != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
                                                + networkInterfacesListIndex
                                                + ".SecurityGroupId."
                                                + groupsListIndex,
                                        StringUtils.fromString(groupsListValue));
                            }
                            groupsListIndex++;
                        }
                    }

                    if (networkInterfacesListValue.getDeleteOnTermination() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".DeleteOnTermination", StringUtils
                                        .fromBoolean(networkInterfacesListValue
                                                .getDeleteOnTermination()));
                    }

                    com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> privateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) networkInterfacesListValue
                            .getPrivateIpAddresses();
                    if (!privateIpAddressesList.isEmpty()
                            || !privateIpAddressesList.isAutoConstruct()) {
                        int privateIpAddressesListIndex = 1;

                        for (PrivateIpAddressSpecification privateIpAddressesListValue : privateIpAddressesList) {

                            if (privateIpAddressesListValue
                                    .getPrivateIpAddress() != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
                                                + networkInterfacesListIndex
                                                + ".PrivateIpAddresses."
                                                + privateIpAddressesListIndex
                                                + ".PrivateIpAddress",
                                        StringUtils
                                                .fromString(privateIpAddressesListValue
                                                        .getPrivateIpAddress()));
                            }

                            if (privateIpAddressesListValue.getPrimary() != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
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
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".SecondaryPrivateIpAddressCount",
                                StringUtils.fromInteger(networkInterfacesListValue
                                        .getSecondaryPrivateIpAddressCount()));
                    }

                    if (networkInterfacesListValue
                            .getAssociatePublicIpAddress() != null) {
                        request.addParameter(
                                "LaunchSpecification.NetworkInterface."
                                        + networkInterfacesListIndex
                                        + ".AssociatePublicIpAddress",
                                StringUtils
                                        .fromBoolean(networkInterfacesListValue
                                                .getAssociatePublicIpAddress()));
                    }
                    networkInterfacesListIndex++;
                }
            }

            IamInstanceProfileSpecification iamInstanceProfile = launchSpecification
                    .getIamInstanceProfile();
            if (iamInstanceProfile != null) {

                if (iamInstanceProfile.getArn() != null) {
                    request.addParameter(
                            "LaunchSpecification.IamInstanceProfile.Arn",
                            StringUtils.fromString(iamInstanceProfile.getArn()));
                }

                if (iamInstanceProfile.getName() != null) {
                    request.addParameter(
                            "LaunchSpecification.IamInstanceProfile.Name",
                            StringUtils.fromString(iamInstanceProfile.getName()));
                }
            }

            if (launchSpecification.getEbsOptimized() != null) {
                request.addParameter("LaunchSpecification.EbsOptimized",
                        StringUtils.fromBoolean(launchSpecification
                                .getEbsOptimized()));
            }

            com.amazonaws.internal.SdkInternalList<GroupIdentifier> allSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<GroupIdentifier>) launchSpecification
                    .getAllSecurityGroups();
            if (!allSecurityGroupsList.isEmpty()
                    || !allSecurityGroupsList.isAutoConstruct()) {
                int allSecurityGroupsListIndex = 1;

                for (GroupIdentifier allSecurityGroupsListValue : allSecurityGroupsList) {

                    if (allSecurityGroupsListValue.getGroupName() != null) {
                        request.addParameter("LaunchSpecification.GroupSet."
                                + allSecurityGroupsListIndex + ".GroupName",
                                StringUtils
                                        .fromString(allSecurityGroupsListValue
                                                .getGroupName()));
                    }

                    if (allSecurityGroupsListValue.getGroupId() != null) {
                        request.addParameter("LaunchSpecification.GroupSet."
                                + allSecurityGroupsListIndex + ".GroupId",
                                StringUtils
                                        .fromString(allSecurityGroupsListValue
                                                .getGroupId()));
                    }
                    allSecurityGroupsListIndex++;
                }
            }

            if (launchSpecification.getMonitoringEnabled() != null) {
                request.addParameter("LaunchSpecification.Monitoring.Enabled",
                        StringUtils.fromBoolean(launchSpecification
                                .getMonitoringEnabled()));
            }

            com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getSecurityGroups();
            if (!securityGroupsList.isEmpty()
                    || !securityGroupsList.isAutoConstruct()) {
                int securityGroupsListIndex = 1;

                for (String securityGroupsListValue : securityGroupsList) {
                    if (securityGroupsListValue != null) {
                        request.addParameter(
                                "LaunchSpecification.SecurityGroup."
                                        + securityGroupsListIndex,
                                StringUtils.fromString(securityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }
        }

        return request;
    }

}
