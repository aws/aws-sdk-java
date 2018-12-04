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
 * RunScheduledInstancesRequest Marshaller
 */

public class RunScheduledInstancesRequestMarshaller
        implements
        Marshaller<Request<RunScheduledInstancesRequest>, RunScheduledInstancesRequest> {

    public Request<RunScheduledInstancesRequest> marshall(
            RunScheduledInstancesRequest runScheduledInstancesRequest) {

        if (runScheduledInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RunScheduledInstancesRequest> request = new DefaultRequest<RunScheduledInstancesRequest>(
                runScheduledInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunScheduledInstances");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        request.addParameter("ClientToken", IdempotentUtils
                .resolveString(runScheduledInstancesRequest.getClientToken()));

        if (runScheduledInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils
                    .fromInteger(runScheduledInstancesRequest
                            .getInstanceCount()));
        }

        if (runScheduledInstancesRequest.getScheduledInstanceId() != null) {
            request.addParameter("ScheduledInstanceId", StringUtils
                    .fromString(runScheduledInstancesRequest
                            .getScheduledInstanceId()));
        }

        ScheduledInstancesLaunchSpecification launchSpecification = runScheduledInstancesRequest
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

            com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getSecurityGroupIds();
            if (!securityGroupIdsList.isEmpty()
                    || !securityGroupIdsList.isAutoConstruct()) {
                int securityGroupIdsListIndex = 1;

                for (String securityGroupIdsListValue : securityGroupIdsList) {
                    if (securityGroupIdsListValue != null) {
                        request.addParameter(
                                "LaunchSpecification.SecurityGroupId."
                                        + securityGroupIdsListIndex,
                                StringUtils
                                        .fromString(securityGroupIdsListValue));
                    }
                    securityGroupIdsListIndex++;
                }
            }

            if (launchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData",
                        StringUtils.fromString(launchSpecification
                                .getUserData()));
            }

            ScheduledInstancesPlacement placement = launchSpecification
                    .getPlacement();
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

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType",
                        StringUtils.fromString(launchSpecification
                                .getInstanceType()));
            }

            if (launchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId",
                        StringUtils.fromString(launchSpecification
                                .getRamdiskId()));
            }

            com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping>) launchSpecification
                    .getBlockDeviceMappings();
            if (!blockDeviceMappingsList.isEmpty()
                    || !blockDeviceMappingsList.isAutoConstruct()) {
                int blockDeviceMappingsListIndex = 1;

                for (ScheduledInstancesBlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {

                    if (blockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter(
                                "LaunchSpecification.BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex
                                        + ".DeviceName",
                                StringUtils
                                        .fromString(blockDeviceMappingsListValue
                                                .getDeviceName()));
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

                    if (blockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter(
                                "LaunchSpecification.BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex
                                        + ".VirtualName",
                                StringUtils
                                        .fromString(blockDeviceMappingsListValue
                                                .getVirtualName()));
                    }

                    ScheduledInstancesEbs ebs = blockDeviceMappingsListValue
                            .getEbs();
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
                    blockDeviceMappingsListIndex++;
                }
            }

            ScheduledInstancesMonitoring monitoring = launchSpecification
                    .getMonitoring();
            if (monitoring != null) {

                if (monitoring.getEnabled() != null) {
                    request.addParameter(
                            "LaunchSpecification.Monitoring.Enabled",
                            StringUtils.fromBoolean(monitoring.getEnabled()));
                }
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId",
                        StringUtils.fromString(launchSpecification
                                .getSubnetId()));
            }

            com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface> networkInterfacesList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface>) launchSpecification
                    .getNetworkInterfaces();
            if (!networkInterfacesList.isEmpty()
                    || !networkInterfacesList.isAutoConstruct()) {
                int networkInterfacesListIndex = 1;

                for (ScheduledInstancesNetworkInterface networkInterfacesListValue : networkInterfacesList) {

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

                    com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigsList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig>) networkInterfacesListValue
                            .getPrivateIpAddressConfigs();
                    if (!privateIpAddressConfigsList.isEmpty()
                            || !privateIpAddressConfigsList.isAutoConstruct()) {
                        int privateIpAddressConfigsListIndex = 1;

                        for (ScheduledInstancesPrivateIpAddressConfig privateIpAddressConfigsListValue : privateIpAddressConfigsList) {

                            if (privateIpAddressConfigsListValue
                                    .getPrivateIpAddress() != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
                                                + networkInterfacesListIndex
                                                + ".PrivateIpAddressConfig."
                                                + privateIpAddressConfigsListIndex
                                                + ".PrivateIpAddress",
                                        StringUtils
                                                .fromString(privateIpAddressConfigsListValue
                                                        .getPrivateIpAddress()));
                            }

                            if (privateIpAddressConfigsListValue.getPrimary() != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
                                                + networkInterfacesListIndex
                                                + ".PrivateIpAddressConfig."
                                                + privateIpAddressConfigsListIndex
                                                + ".Primary",
                                        StringUtils
                                                .fromBoolean(privateIpAddressConfigsListValue
                                                        .getPrimary()));
                            }
                            privateIpAddressConfigsListIndex++;
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

                    com.amazonaws.internal.SdkInternalList<String> groupsList = (com.amazonaws.internal.SdkInternalList<String>) networkInterfacesListValue
                            .getGroups();
                    if (!groupsList.isEmpty() || !groupsList.isAutoConstruct()) {
                        int groupsListIndex = 1;

                        for (String groupsListValue : groupsList) {
                            if (groupsListValue != null) {
                                request.addParameter(
                                        "LaunchSpecification.NetworkInterface."
                                                + networkInterfacesListIndex
                                                + ".Group." + groupsListIndex,
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
                    networkInterfacesListIndex++;
                }
            }

            ScheduledInstancesIamInstanceProfile iamInstanceProfile = launchSpecification
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
        }

        return request;
    }

}
