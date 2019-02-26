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
 * RequestSpotInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSpotInstancesRequestMarshaller implements Marshaller<Request<RequestSpotInstancesRequest>, RequestSpotInstancesRequest> {

    public Request<RequestSpotInstancesRequest> marshall(RequestSpotInstancesRequest requestSpotInstancesRequest) {

        if (requestSpotInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotInstancesRequest> request = new DefaultRequest<RequestSpotInstancesRequest>(requestSpotInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (requestSpotInstancesRequest.getAvailabilityZoneGroup() != null) {
            request.addParameter("AvailabilityZoneGroup", StringUtils.fromString(requestSpotInstancesRequest.getAvailabilityZoneGroup()));
        }

        if (requestSpotInstancesRequest.getBlockDurationMinutes() != null) {
            request.addParameter("BlockDurationMinutes", StringUtils.fromInteger(requestSpotInstancesRequest.getBlockDurationMinutes()));
        }

        if (requestSpotInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(requestSpotInstancesRequest.getClientToken()));
        }

        if (requestSpotInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(requestSpotInstancesRequest.getInstanceCount()));
        }

        if (requestSpotInstancesRequest.getLaunchGroup() != null) {
            request.addParameter("LaunchGroup", StringUtils.fromString(requestSpotInstancesRequest.getLaunchGroup()));
        }

        LaunchSpecification launchSpecification = requestSpotInstancesRequest.getLaunchSpecification();
        if (launchSpecification != null) {

            if (launchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(launchSpecification.getUserData()));
            }

            if (launchSpecification.getAddressingType() != null) {
                request.addParameter("LaunchSpecification.AddressingType", StringUtils.fromString(launchSpecification.getAddressingType()));
            }

            com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> launchSpecificationBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) launchSpecification
                    .getBlockDeviceMappings();
            if (!launchSpecificationBlockDeviceMappingsList.isEmpty() || !launchSpecificationBlockDeviceMappingsList.isAutoConstruct()) {
                int blockDeviceMappingsListIndex = 1;

                for (BlockDeviceMapping launchSpecificationBlockDeviceMappingsListValue : launchSpecificationBlockDeviceMappingsList) {

                    if (launchSpecificationBlockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                                StringUtils.fromString(launchSpecificationBlockDeviceMappingsListValue.getDeviceName()));
                    }

                    if (launchSpecificationBlockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                                StringUtils.fromString(launchSpecificationBlockDeviceMappingsListValue.getVirtualName()));
                    }

                    EbsBlockDevice ebs = launchSpecificationBlockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {

                        if (ebs.getDeleteOnTermination() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                    StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                        }

                        if (ebs.getIops() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops",
                                    StringUtils.fromInteger(ebs.getIops()));
                        }

                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                    StringUtils.fromString(ebs.getSnapshotId()));
                        }

                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                    StringUtils.fromInteger(ebs.getVolumeSize()));
                        }

                        if (ebs.getVolumeType() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                    StringUtils.fromString(ebs.getVolumeType()));
                        }

                        if (ebs.getEncrypted() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                    StringUtils.fromBoolean(ebs.getEncrypted()));
                        }

                        if (ebs.getKmsKeyId() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.KmsKeyId",
                                    StringUtils.fromString(ebs.getKmsKeyId()));
                        }
                    }

                    if (launchSpecificationBlockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                                StringUtils.fromString(launchSpecificationBlockDeviceMappingsListValue.getNoDevice()));
                    }
                    blockDeviceMappingsListIndex++;
                }
            }

            if (launchSpecification.getEbsOptimized() != null) {
                request.addParameter("LaunchSpecification.EbsOptimized", StringUtils.fromBoolean(launchSpecification.getEbsOptimized()));
            }

            IamInstanceProfileSpecification iamInstanceProfile = launchSpecification.getIamInstanceProfile();
            if (iamInstanceProfile != null) {

                if (iamInstanceProfile.getArn() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfile.getArn()));
                }

                if (iamInstanceProfile.getName() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfile.getName()));
                }
            }

            if (launchSpecification.getImageId() != null) {
                request.addParameter("LaunchSpecification.ImageId", StringUtils.fromString(launchSpecification.getImageId()));
            }

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecification.getInstanceType()));
            }

            if (launchSpecification.getKernelId() != null) {
                request.addParameter("LaunchSpecification.KernelId", StringUtils.fromString(launchSpecification.getKernelId()));
            }

            if (launchSpecification.getKeyName() != null) {
                request.addParameter("LaunchSpecification.KeyName", StringUtils.fromString(launchSpecification.getKeyName()));
            }

            com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> launchSpecificationNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) launchSpecification
                    .getNetworkInterfaces();
            if (!launchSpecificationNetworkInterfacesList.isEmpty() || !launchSpecificationNetworkInterfacesList.isAutoConstruct()) {
                int networkInterfacesListIndex = 1;

                for (InstanceNetworkInterfaceSpecification launchSpecificationNetworkInterfacesListValue : launchSpecificationNetworkInterfacesList) {

                    if (launchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                                StringUtils.fromBoolean(launchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination",
                                StringUtils.fromBoolean(launchSpecificationNetworkInterfacesListValue.getDeleteOnTermination()));
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getDescription() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Description",
                                StringUtils.fromString(launchSpecificationNetworkInterfacesListValue.getDescription()));
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getDeviceIndex() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex",
                                StringUtils.fromInteger(launchSpecificationNetworkInterfacesListValue.getDeviceIndex()));
                    }

                    com.amazonaws.internal.SdkInternalList<String> instanceNetworkInterfaceSpecificationGroupsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecificationNetworkInterfacesListValue
                            .getGroups();
                    if (!instanceNetworkInterfaceSpecificationGroupsList.isEmpty() || !instanceNetworkInterfaceSpecificationGroupsList.isAutoConstruct()) {
                        int groupsListIndex = 1;

                        for (String instanceNetworkInterfaceSpecificationGroupsListValue : instanceNetworkInterfaceSpecificationGroupsList) {
                            if (instanceNetworkInterfaceSpecificationGroupsListValue != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SecurityGroupId."
                                        + groupsListIndex, StringUtils.fromString(instanceNetworkInterfaceSpecificationGroupsListValue));
                            }
                            groupsListIndex++;
                        }
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Ipv6AddressCount",
                                StringUtils.fromInteger(launchSpecificationNetworkInterfacesListValue.getIpv6AddressCount()));
                    }

                    com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> instanceNetworkInterfaceSpecificationIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) launchSpecificationNetworkInterfacesListValue
                            .getIpv6Addresses();
                    if (!instanceNetworkInterfaceSpecificationIpv6AddressesList.isEmpty()
                            || !instanceNetworkInterfaceSpecificationIpv6AddressesList.isAutoConstruct()) {
                        int ipv6AddressesListIndex = 1;

                        for (InstanceIpv6Address instanceNetworkInterfaceSpecificationIpv6AddressesListValue : instanceNetworkInterfaceSpecificationIpv6AddressesList) {

                            if (instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Ipv6Addresses."
                                        + ipv6AddressesListIndex + ".Ipv6Address",
                                        StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address()));
                            }
                            ipv6AddressesListIndex++;
                        }
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId",
                                StringUtils.fromString(launchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId()));
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress",
                                StringUtils.fromString(launchSpecificationNetworkInterfacesListValue.getPrivateIpAddress()));
                    }

                    com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> instanceNetworkInterfaceSpecificationPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) launchSpecificationNetworkInterfacesListValue
                            .getPrivateIpAddresses();
                    if (!instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isEmpty()
                            || !instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isAutoConstruct()) {
                        int privateIpAddressesListIndex = 1;

                        for (PrivateIpAddressSpecification instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue : instanceNetworkInterfaceSpecificationPrivateIpAddressesList) {

                            if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses."
                                        + privateIpAddressesListIndex + ".Primary",
                                        StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary()));
                            }

                            if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses."
                                        + privateIpAddressesListIndex + ".PrivateIpAddress",
                                        StringUtils.fromString(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress()));
                            }
                            privateIpAddressesListIndex++;
                        }
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                                StringUtils.fromInteger(launchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                    }

                    if (launchSpecificationNetworkInterfacesListValue.getSubnetId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SubnetId",
                                StringUtils.fromString(launchSpecificationNetworkInterfacesListValue.getSubnetId()));
                    }
                    networkInterfacesListIndex++;
                }
            }

            SpotPlacement placement = launchSpecification.getPlacement();
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
            }

            if (launchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId", StringUtils.fromString(launchSpecification.getRamdiskId()));
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecification.getSubnetId()));
            }

            com.amazonaws.internal.SdkInternalList<GroupIdentifier> launchSpecificationAllSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<GroupIdentifier>) launchSpecification
                    .getAllSecurityGroups();
            if (!launchSpecificationAllSecurityGroupsList.isEmpty() || !launchSpecificationAllSecurityGroupsList.isAutoConstruct()) {
                int allSecurityGroupsListIndex = 1;

                for (GroupIdentifier launchSpecificationAllSecurityGroupsListValue : launchSpecificationAllSecurityGroupsList) {

                    if (launchSpecificationAllSecurityGroupsListValue.getGroupName() != null) {
                        request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupName",
                                StringUtils.fromString(launchSpecificationAllSecurityGroupsListValue.getGroupName()));
                    }

                    if (launchSpecificationAllSecurityGroupsListValue.getGroupId() != null) {
                        request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupId",
                                StringUtils.fromString(launchSpecificationAllSecurityGroupsListValue.getGroupId()));
                    }
                    allSecurityGroupsListIndex++;
                }
            }

            if (launchSpecification.getMonitoringEnabled() != null) {
                request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(launchSpecification.getMonitoringEnabled()));
            }

            com.amazonaws.internal.SdkInternalList<String> launchSpecificationSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getSecurityGroups();
            if (!launchSpecificationSecurityGroupsList.isEmpty() || !launchSpecificationSecurityGroupsList.isAutoConstruct()) {
                int securityGroupsListIndex = 1;

                for (String launchSpecificationSecurityGroupsListValue : launchSpecificationSecurityGroupsList) {
                    if (launchSpecificationSecurityGroupsListValue != null) {
                        request.addParameter("LaunchSpecification.SecurityGroup." + securityGroupsListIndex,
                                StringUtils.fromString(launchSpecificationSecurityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }
        }

        if (requestSpotInstancesRequest.getSpotPrice() != null) {
            request.addParameter("SpotPrice", StringUtils.fromString(requestSpotInstancesRequest.getSpotPrice()));
        }

        if (requestSpotInstancesRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(requestSpotInstancesRequest.getType()));
        }

        if (requestSpotInstancesRequest.getValidFrom() != null) {
            request.addParameter("ValidFrom", StringUtils.fromDate(requestSpotInstancesRequest.getValidFrom()));
        }

        if (requestSpotInstancesRequest.getValidUntil() != null) {
            request.addParameter("ValidUntil", StringUtils.fromDate(requestSpotInstancesRequest.getValidUntil()));
        }

        if (requestSpotInstancesRequest.getInstanceInterruptionBehavior() != null) {
            request.addParameter("InstanceInterruptionBehavior", StringUtils.fromString(requestSpotInstancesRequest.getInstanceInterruptionBehavior()));
        }

        return request;
    }

}
