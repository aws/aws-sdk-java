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
 * RunInstancesRequest Marshaller
 */

public class RunInstancesRequestMarshaller implements
        Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(
            RunInstancesRequest runInstancesRequest) {

        if (runInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(
                runInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunInstances");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (runInstancesRequest.getImageId() != null) {
            request.addParameter("ImageId",
                    StringUtils.fromString(runInstancesRequest.getImageId()));
        }

        if (runInstancesRequest.getMinCount() != null) {
            request.addParameter("MinCount",
                    StringUtils.fromInteger(runInstancesRequest.getMinCount()));
        }

        if (runInstancesRequest.getMaxCount() != null) {
            request.addParameter("MaxCount",
                    StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
        }

        if (runInstancesRequest.getKeyName() != null) {
            request.addParameter("KeyName",
                    StringUtils.fromString(runInstancesRequest.getKeyName()));
        }

        com.amazonaws.internal.SdkInternalList<String> securityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) runInstancesRequest
                .getSecurityGroups();
        if (!securityGroupsList.isEmpty()
                || !securityGroupsList.isAutoConstruct()) {
            int securityGroupsListIndex = 1;

            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("SecurityGroup."
                            + securityGroupsListIndex,
                            StringUtils.fromString(securityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> securityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) runInstancesRequest
                .getSecurityGroupIds();
        if (!securityGroupIdsList.isEmpty()
                || !securityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId."
                            + securityGroupIdsListIndex,
                            StringUtils.fromString(securityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (runInstancesRequest.getUserData() != null) {
            request.addParameter("UserData",
                    StringUtils.fromString(runInstancesRequest.getUserData()));
        }

        if (runInstancesRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils
                    .fromString(runInstancesRequest.getInstanceType()));
        }

        Placement placement = runInstancesRequest.getPlacement();
        if (placement != null) {

            if (placement.getAvailabilityZone() != null) {
                request.addParameter("Placement.AvailabilityZone",
                        StringUtils.fromString(placement.getAvailabilityZone()));
            }

            if (placement.getGroupName() != null) {
                request.addParameter("Placement.GroupName",
                        StringUtils.fromString(placement.getGroupName()));
            }

            if (placement.getTenancy() != null) {
                request.addParameter("Placement.Tenancy",
                        StringUtils.fromString(placement.getTenancy()));
            }

            if (placement.getHostId() != null) {
                request.addParameter("Placement.HostId",
                        StringUtils.fromString(placement.getHostId()));
            }

            if (placement.getAffinity() != null) {
                request.addParameter("Placement.Affinity",
                        StringUtils.fromString(placement.getAffinity()));
            }
        }

        if (runInstancesRequest.getKernelId() != null) {
            request.addParameter("KernelId",
                    StringUtils.fromString(runInstancesRequest.getKernelId()));
        }

        if (runInstancesRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId",
                    StringUtils.fromString(runInstancesRequest.getRamdiskId()));
        }

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) runInstancesRequest
                .getBlockDeviceMappings();
        if (!blockDeviceMappingsList.isEmpty()
                || !blockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {

                if (blockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping."
                            + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(blockDeviceMappingsListValue
                                    .getVirtualName()));
                }

                if (blockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping."
                            + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(blockDeviceMappingsListValue
                                    .getDeviceName()));
                }

                EbsBlockDevice ebs = blockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex
                                + ".Ebs.SnapshotId",
                                StringUtils.fromString(ebs.getSnapshotId()));
                    }

                    if (ebs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex
                                + ".Ebs.VolumeSize",
                                StringUtils.fromInteger(ebs.getVolumeSize()));
                    }

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex
                                + ".Ebs.DeleteOnTermination", StringUtils
                                .fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex
                                + ".Ebs.VolumeType",
                                StringUtils.fromString(ebs.getVolumeType()));
                    }

                    if (ebs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex + ".Ebs.Iops",
                                StringUtils.fromInteger(ebs.getIops()));
                    }

                    if (ebs.getEncrypted() != null) {
                        request.addParameter("BlockDeviceMapping."
                                + blockDeviceMappingsListIndex
                                + ".Ebs.Encrypted",
                                StringUtils.fromBoolean(ebs.getEncrypted()));
                    }
                }

                if (blockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping."
                            + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(blockDeviceMappingsListValue
                                    .getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (runInstancesRequest.getMonitoring() != null) {
            request.addParameter("Monitoring.Enabled", StringUtils
                    .fromBoolean(runInstancesRequest.getMonitoring()));
        }

        if (runInstancesRequest.getSubnetId() != null) {
            request.addParameter("SubnetId",
                    StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }

        if (runInstancesRequest.getDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination",
                    StringUtils.fromBoolean(runInstancesRequest
                            .getDisableApiTermination()));
        }

        if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior",
                    StringUtils.fromString(runInstancesRequest
                            .getInstanceInitiatedShutdownBehavior()));
        }

        if (runInstancesRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils
                    .fromString(runInstancesRequest.getPrivateIpAddress()));
        }

        if (runInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils
                    .fromString(runInstancesRequest.getClientToken()));
        }

        if (runInstancesRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils
                    .fromString(runInstancesRequest.getAdditionalInfo()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) runInstancesRequest
                .getNetworkInterfaces();
        if (!networkInterfacesList.isEmpty()
                || !networkInterfacesList.isAutoConstruct()) {
            int networkInterfacesListIndex = 1;

            for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {

                if (networkInterfacesListValue.getNetworkInterfaceId() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex
                            + ".NetworkInterfaceId", StringUtils
                            .fromString(networkInterfacesListValue
                                    .getNetworkInterfaceId()));
                }

                if (networkInterfacesListValue.getDeviceIndex() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex + ".DeviceIndex",
                            StringUtils.fromInteger(networkInterfacesListValue
                                    .getDeviceIndex()));
                }

                if (networkInterfacesListValue.getSubnetId() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex + ".SubnetId",
                            StringUtils.fromString(networkInterfacesListValue
                                    .getSubnetId()));
                }

                if (networkInterfacesListValue.getDescription() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex + ".Description",
                            StringUtils.fromString(networkInterfacesListValue
                                    .getDescription()));
                }

                if (networkInterfacesListValue.getPrivateIpAddress() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex + ".PrivateIpAddress",
                            StringUtils.fromString(networkInterfacesListValue
                                    .getPrivateIpAddress()));
                }

                com.amazonaws.internal.SdkInternalList<String> groupsList = (com.amazonaws.internal.SdkInternalList<String>) networkInterfacesListValue
                        .getGroups();
                if (!groupsList.isEmpty() || !groupsList.isAutoConstruct()) {
                    int groupsListIndex = 1;

                    for (String groupsListValue : groupsList) {
                        if (groupsListValue != null) {
                            request.addParameter("NetworkInterface."
                                    + networkInterfacesListIndex
                                    + ".SecurityGroupId." + groupsListIndex,
                                    StringUtils.fromString(groupsListValue));
                        }
                        groupsListIndex++;
                    }
                }

                if (networkInterfacesListValue.getDeleteOnTermination() != null) {
                    request.addParameter("NetworkInterface."
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

                        if (privateIpAddressesListValue.getPrivateIpAddress() != null) {
                            request.addParameter("NetworkInterface."
                                    + networkInterfacesListIndex
                                    + ".PrivateIpAddresses."
                                    + privateIpAddressesListIndex
                                    + ".PrivateIpAddress", StringUtils
                                    .fromString(privateIpAddressesListValue
                                            .getPrivateIpAddress()));
                        }

                        if (privateIpAddressesListValue.getPrimary() != null) {
                            request.addParameter(
                                    "NetworkInterface."
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
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex
                            + ".SecondaryPrivateIpAddressCount", StringUtils
                            .fromInteger(networkInterfacesListValue
                                    .getSecondaryPrivateIpAddressCount()));
                }

                if (networkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                    request.addParameter("NetworkInterface."
                            + networkInterfacesListIndex
                            + ".AssociatePublicIpAddress", StringUtils
                            .fromBoolean(networkInterfacesListValue
                                    .getAssociatePublicIpAddress()));
                }
                networkInterfacesListIndex++;
            }
        }

        IamInstanceProfileSpecification iamInstanceProfile = runInstancesRequest
                .getIamInstanceProfile();
        if (iamInstanceProfile != null) {

            if (iamInstanceProfile.getArn() != null) {
                request.addParameter("IamInstanceProfile.Arn",
                        StringUtils.fromString(iamInstanceProfile.getArn()));
            }

            if (iamInstanceProfile.getName() != null) {
                request.addParameter("IamInstanceProfile.Name",
                        StringUtils.fromString(iamInstanceProfile.getName()));
            }
        }

        if (runInstancesRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils
                    .fromBoolean(runInstancesRequest.getEbsOptimized()));
        }

        return request;
    }

}
