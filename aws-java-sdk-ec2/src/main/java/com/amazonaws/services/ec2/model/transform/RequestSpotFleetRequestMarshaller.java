/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * RequestSpotFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSpotFleetRequestMarshaller implements Marshaller<Request<RequestSpotFleetRequest>, RequestSpotFleetRequest> {

    public Request<RequestSpotFleetRequest> marshall(RequestSpotFleetRequest requestSpotFleetRequest) {

        if (requestSpotFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotFleetRequest> request = new DefaultRequest<RequestSpotFleetRequest>(requestSpotFleetRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        SpotFleetRequestConfigData spotFleetRequestConfig = requestSpotFleetRequest.getSpotFleetRequestConfig();
        if (spotFleetRequestConfig != null) {

            if (spotFleetRequestConfig.getAllocationStrategy() != null) {
                request.addParameter("SpotFleetRequestConfig.AllocationStrategy", StringUtils.fromString(spotFleetRequestConfig.getAllocationStrategy()));
            }

            if (spotFleetRequestConfig.getOnDemandAllocationStrategy() != null) {
                request.addParameter("SpotFleetRequestConfig.OnDemandAllocationStrategy",
                        StringUtils.fromString(spotFleetRequestConfig.getOnDemandAllocationStrategy()));
            }

            SpotMaintenanceStrategies spotMaintenanceStrategies = spotFleetRequestConfig.getSpotMaintenanceStrategies();
            if (spotMaintenanceStrategies != null) {

                SpotCapacityRebalance capacityRebalance = spotMaintenanceStrategies.getCapacityRebalance();
                if (capacityRebalance != null) {

                    if (capacityRebalance.getReplacementStrategy() != null) {
                        request.addParameter("SpotFleetRequestConfig.SpotMaintenanceStrategies.CapacityRebalance.ReplacementStrategy",
                                StringUtils.fromString(capacityRebalance.getReplacementStrategy()));
                    }

                    if (capacityRebalance.getTerminationDelay() != null) {
                        request.addParameter("SpotFleetRequestConfig.SpotMaintenanceStrategies.CapacityRebalance.TerminationDelay",
                                StringUtils.fromInteger(capacityRebalance.getTerminationDelay()));
                    }
                }
            }

            if (spotFleetRequestConfig.getClientToken() != null) {
                request.addParameter("SpotFleetRequestConfig.ClientToken", StringUtils.fromString(spotFleetRequestConfig.getClientToken()));
            }

            if (spotFleetRequestConfig.getExcessCapacityTerminationPolicy() != null) {
                request.addParameter("SpotFleetRequestConfig.ExcessCapacityTerminationPolicy",
                        StringUtils.fromString(spotFleetRequestConfig.getExcessCapacityTerminationPolicy()));
            }

            if (spotFleetRequestConfig.getFulfilledCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.FulfilledCapacity", StringUtils.fromDouble(spotFleetRequestConfig.getFulfilledCapacity()));
            }

            if (spotFleetRequestConfig.getOnDemandFulfilledCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.OnDemandFulfilledCapacity",
                        StringUtils.fromDouble(spotFleetRequestConfig.getOnDemandFulfilledCapacity()));
            }

            if (spotFleetRequestConfig.getIamFleetRole() != null) {
                request.addParameter("SpotFleetRequestConfig.IamFleetRole", StringUtils.fromString(spotFleetRequestConfig.getIamFleetRole()));
            }

            com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification> spotFleetRequestConfigDataLaunchSpecificationsList = (com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>) spotFleetRequestConfig
                    .getLaunchSpecifications();
            if (!spotFleetRequestConfigDataLaunchSpecificationsList.isEmpty() || !spotFleetRequestConfigDataLaunchSpecificationsList.isAutoConstruct()) {
                int launchSpecificationsListIndex = 1;

                for (SpotFleetLaunchSpecification spotFleetRequestConfigDataLaunchSpecificationsListValue : spotFleetRequestConfigDataLaunchSpecificationsList) {

                    com.amazonaws.internal.SdkInternalList<GroupIdentifier> spotFleetLaunchSpecificationSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<GroupIdentifier>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getSecurityGroups();
                    if (!spotFleetLaunchSpecificationSecurityGroupsList.isEmpty() || !spotFleetLaunchSpecificationSecurityGroupsList.isAutoConstruct()) {
                        int securityGroupsListIndex = 1;

                        for (GroupIdentifier spotFleetLaunchSpecificationSecurityGroupsListValue : spotFleetLaunchSpecificationSecurityGroupsList) {

                            if (spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet."
                                        + securityGroupsListIndex + ".GroupName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupName()));
                            }

                            if (spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet."
                                        + securityGroupsListIndex + ".GroupId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupId()));
                            }
                            securityGroupsListIndex++;
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getAddressingType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".AddressingType",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getAddressingType()));
                    }

                    com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> spotFleetLaunchSpecificationBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getBlockDeviceMappings();
                    if (!spotFleetLaunchSpecificationBlockDeviceMappingsList.isEmpty()
                            || !spotFleetLaunchSpecificationBlockDeviceMappingsList.isAutoConstruct()) {
                        int blockDeviceMappingsListIndex = 1;

                        for (BlockDeviceMapping spotFleetLaunchSpecificationBlockDeviceMappingsListValue : spotFleetLaunchSpecificationBlockDeviceMappingsList) {

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".DeviceName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName()));
                            }

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".VirtualName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName()));
                            }

                            EbsBlockDevice ebs = spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getEbs();
                            if (ebs != null) {

                                if (ebs.getDeleteOnTermination() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                            StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                                }

                                if (ebs.getIops() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                                }

                                if (ebs.getSnapshotId() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                            StringUtils.fromString(ebs.getSnapshotId()));
                                }

                                if (ebs.getVolumeSize() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                            StringUtils.fromInteger(ebs.getVolumeSize()));
                                }

                                if (ebs.getVolumeType() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                            StringUtils.fromString(ebs.getVolumeType()));
                                }

                                if (ebs.getKmsKeyId() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.KmsKeyId",
                                            StringUtils.fromString(ebs.getKmsKeyId()));
                                }

                                if (ebs.getThroughput() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Throughput",
                                            StringUtils.fromInteger(ebs.getThroughput()));
                                }

                                if (ebs.getOutpostArn() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.OutpostArn",
                                            StringUtils.fromString(ebs.getOutpostArn()));
                                }

                                if (ebs.getEncrypted() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                            StringUtils.fromBoolean(ebs.getEncrypted()));
                                }
                            }

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".NoDevice",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice()));
                            }
                            blockDeviceMappingsListIndex++;
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getEbsOptimized() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".EbsOptimized",
                                StringUtils.fromBoolean(spotFleetRequestConfigDataLaunchSpecificationsListValue.getEbsOptimized()));
                    }

                    IamInstanceProfileSpecification iamInstanceProfile = spotFleetRequestConfigDataLaunchSpecificationsListValue.getIamInstanceProfile();
                    if (iamInstanceProfile != null) {

                        if (iamInstanceProfile.getArn() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Arn",
                                    StringUtils.fromString(iamInstanceProfile.getArn()));
                        }

                        if (iamInstanceProfile.getName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Name",
                                    StringUtils.fromString(iamInstanceProfile.getName()));
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getImageId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".ImageId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getImageId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getInstanceType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".InstanceType",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getInstanceType()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getKernelId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KernelId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getKernelId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getKeyName() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KeyName",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getKeyName()));
                    }

                    SpotFleetMonitoring monitoring = spotFleetRequestConfigDataLaunchSpecificationsListValue.getMonitoring();
                    if (monitoring != null) {

                        if (monitoring.getEnabled() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Monitoring.Enabled",
                                    StringUtils.fromBoolean(monitoring.getEnabled()));
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> spotFleetLaunchSpecificationNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getNetworkInterfaces();
                    if (!spotFleetLaunchSpecificationNetworkInterfacesList.isEmpty() || !spotFleetLaunchSpecificationNetworkInterfacesList.isAutoConstruct()) {
                        int networkInterfacesListIndex = 1;

                        for (InstanceNetworkInterfaceSpecification spotFleetLaunchSpecificationNetworkInterfacesListValue : spotFleetLaunchSpecificationNetworkInterfacesList) {

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                                        StringUtils.fromBoolean(spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".DeleteOnTermination",
                                        StringUtils.fromBoolean(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDescription() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Description",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDescription()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".DeviceIndex",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex()));
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceNetworkInterfaceSpecificationGroupsList = (com.amazonaws.internal.SdkInternalList<String>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getGroups();
                            if (!instanceNetworkInterfaceSpecificationGroupsList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationGroupsList.isAutoConstruct()) {
                                int groupsListIndex = 1;

                                for (String instanceNetworkInterfaceSpecificationGroupsListValue : instanceNetworkInterfaceSpecificationGroupsList) {
                                    if (instanceNetworkInterfaceSpecificationGroupsListValue != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex,
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationGroupsListValue));
                                    }
                                    groupsListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Ipv6AddressCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount()));
                            }

                            com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> instanceNetworkInterfaceSpecificationIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getIpv6Addresses();
                            if (!instanceNetworkInterfaceSpecificationIpv6AddressesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationIpv6AddressesList.isAutoConstruct()) {
                                int ipv6AddressesListIndex = 1;

                                for (InstanceIpv6Address instanceNetworkInterfaceSpecificationIpv6AddressesListValue : instanceNetworkInterfaceSpecificationIpv6AddressesList) {

                                    if (instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".Ipv6Addresses." + ipv6AddressesListIndex
                                                + ".Ipv6Address",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address()));
                                    }
                                    ipv6AddressesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".NetworkInterfaceId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".PrivateIpAddress",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress()));
                            }

                            com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> instanceNetworkInterfaceSpecificationPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getPrivateIpAddresses();
                            if (!instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isAutoConstruct()) {
                                int privateIpAddressesListIndex = 1;

                                for (PrivateIpAddressSpecification instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue : instanceNetworkInterfaceSpecificationPrivateIpAddressesList) {

                                    if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                                + ".Primary",
                                                StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary()));
                                    }

                                    if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                                + ".PrivateIpAddress",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress()));
                                    }
                                    privateIpAddressesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getSubnetId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".SubnetId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getSubnetId()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociateCarrierIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".AssociateCarrierIpAddress",
                                        StringUtils.fromBoolean(spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociateCarrierIpAddress()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getInterfaceType() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".InterfaceType",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getInterfaceType()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkCardIndex() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".NetworkCardIndex",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkCardIndex()));
                            }

                            com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest> instanceNetworkInterfaceSpecificationIpv4PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getIpv4Prefixes();
                            if (!instanceNetworkInterfaceSpecificationIpv4PrefixesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationIpv4PrefixesList.isAutoConstruct()) {
                                int ipv4PrefixesListIndex = 1;

                                for (Ipv4PrefixSpecificationRequest instanceNetworkInterfaceSpecificationIpv4PrefixesListValue : instanceNetworkInterfaceSpecificationIpv4PrefixesList) {

                                    if (instanceNetworkInterfaceSpecificationIpv4PrefixesListValue.getIpv4Prefix() != null) {
                                        request.addParameter(
                                                "SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                                        + networkInterfacesListIndex + ".Ipv4Prefix." + ipv4PrefixesListIndex + ".Ipv4Prefix",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv4PrefixesListValue.getIpv4Prefix()));
                                    }
                                    ipv4PrefixesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv4PrefixCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Ipv4PrefixCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv4PrefixCount()));
                            }

                            com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest> instanceNetworkInterfaceSpecificationIpv6PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getIpv6Prefixes();
                            if (!instanceNetworkInterfaceSpecificationIpv6PrefixesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationIpv6PrefixesList.isAutoConstruct()) {
                                int ipv6PrefixesListIndex = 1;

                                for (Ipv6PrefixSpecificationRequest instanceNetworkInterfaceSpecificationIpv6PrefixesListValue : instanceNetworkInterfaceSpecificationIpv6PrefixesList) {

                                    if (instanceNetworkInterfaceSpecificationIpv6PrefixesListValue.getIpv6Prefix() != null) {
                                        request.addParameter(
                                                "SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                                        + networkInterfacesListIndex + ".Ipv6Prefix." + ipv6PrefixesListIndex + ".Ipv6Prefix",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv6PrefixesListValue.getIpv6Prefix()));
                                    }
                                    ipv6PrefixesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6PrefixCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Ipv6PrefixCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6PrefixCount()));
                            }
                            networkInterfacesListIndex++;
                        }
                    }

                    SpotPlacement placement = spotFleetRequestConfigDataLaunchSpecificationsListValue.getPlacement();
                    if (placement != null) {

                        if (placement.getAvailabilityZone() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.AvailabilityZone",
                                    StringUtils.fromString(placement.getAvailabilityZone()));
                        }

                        if (placement.getGroupName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.GroupName",
                                    StringUtils.fromString(placement.getGroupName()));
                        }

                        if (placement.getTenancy() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.Tenancy",
                                    StringUtils.fromString(placement.getTenancy()));
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getRamdiskId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".RamdiskId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getRamdiskId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getSpotPrice() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SpotPrice",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getSpotPrice()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getSubnetId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SubnetId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getSubnetId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getUserData() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".UserData",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getUserData()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getWeightedCapacity() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".WeightedCapacity",
                                StringUtils.fromDouble(spotFleetRequestConfigDataLaunchSpecificationsListValue.getWeightedCapacity()));
                    }

                    com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification> spotFleetLaunchSpecificationTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<SpotFleetTagSpecification>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getTagSpecifications();
                    if (!spotFleetLaunchSpecificationTagSpecificationsList.isEmpty() || !spotFleetLaunchSpecificationTagSpecificationsList.isAutoConstruct()) {
                        int tagSpecificationsListIndex = 1;

                        for (SpotFleetTagSpecification spotFleetLaunchSpecificationTagSpecificationsListValue : spotFleetLaunchSpecificationTagSpecificationsList) {

                            if (spotFleetLaunchSpecificationTagSpecificationsListValue.getResourceType() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".TagSpecificationSet."
                                        + tagSpecificationsListIndex + ".ResourceType",
                                        StringUtils.fromString(spotFleetLaunchSpecificationTagSpecificationsListValue.getResourceType()));
                            }

                            com.amazonaws.internal.SdkInternalList<Tag> spotFleetTagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) spotFleetLaunchSpecificationTagSpecificationsListValue
                                    .getTags();
                            if (!spotFleetTagSpecificationTagsList.isEmpty() || !spotFleetTagSpecificationTagsList.isAutoConstruct()) {
                                int tagsListIndex = 1;

                                for (Tag spotFleetTagSpecificationTagsListValue : spotFleetTagSpecificationTagsList) {

                                    if (spotFleetTagSpecificationTagsListValue.getKey() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".TagSpecificationSet." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                                StringUtils.fromString(spotFleetTagSpecificationTagsListValue.getKey()));
                                    }

                                    if (spotFleetTagSpecificationTagsListValue.getValue() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".TagSpecificationSet." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                                StringUtils.fromString(spotFleetTagSpecificationTagsListValue.getValue()));
                                    }
                                    tagsListIndex++;
                                }
                            }
                            tagSpecificationsListIndex++;
                        }
                    }

                    InstanceRequirements instanceRequirements = spotFleetRequestConfigDataLaunchSpecificationsListValue.getInstanceRequirements();
                    if (instanceRequirements != null) {

                        VCpuCountRange vCpuCount = instanceRequirements.getVCpuCount();
                        if (vCpuCount != null) {

                            if (vCpuCount.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                            }

                            if (vCpuCount.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                            }
                        }

                        MemoryMiB memoryMiB = instanceRequirements.getMemoryMiB();
                        if (memoryMiB != null) {

                            if (memoryMiB.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                            }

                            if (memoryMiB.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getCpuManufacturers();
                        if (!instanceRequirementsCpuManufacturersList.isEmpty() || !instanceRequirementsCpuManufacturersList.isAutoConstruct()) {
                            int cpuManufacturersListIndex = 1;

                            for (String instanceRequirementsCpuManufacturersListValue : instanceRequirementsCpuManufacturersList) {
                                if (instanceRequirementsCpuManufacturersListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.CpuManufacturerSet." + cpuManufacturersListIndex,
                                            StringUtils.fromString(instanceRequirementsCpuManufacturersListValue));
                                }
                                cpuManufacturersListIndex++;
                            }
                        }

                        MemoryGiBPerVCpu memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                        if (memoryGiBPerVCpu != null) {

                            if (memoryGiBPerVCpu.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.MemoryGiBPerVCpu.Min", StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                            }

                            if (memoryGiBPerVCpu.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.MemoryGiBPerVCpu.Max", StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getExcludedInstanceTypes();
                        if (!instanceRequirementsExcludedInstanceTypesList.isEmpty() || !instanceRequirementsExcludedInstanceTypesList.isAutoConstruct()) {
                            int excludedInstanceTypesListIndex = 1;

                            for (String instanceRequirementsExcludedInstanceTypesListValue : instanceRequirementsExcludedInstanceTypesList) {
                                if (instanceRequirementsExcludedInstanceTypesListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.ExcludedInstanceTypeSet." + excludedInstanceTypesListIndex,
                                            StringUtils.fromString(instanceRequirementsExcludedInstanceTypesListValue));
                                }
                                excludedInstanceTypesListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getInstanceGenerations();
                        if (!instanceRequirementsInstanceGenerationsList.isEmpty() || !instanceRequirementsInstanceGenerationsList.isAutoConstruct()) {
                            int instanceGenerationsListIndex = 1;

                            for (String instanceRequirementsInstanceGenerationsListValue : instanceRequirementsInstanceGenerationsList) {
                                if (instanceRequirementsInstanceGenerationsListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.InstanceGenerationSet." + instanceGenerationsListIndex,
                                            StringUtils.fromString(instanceRequirementsInstanceGenerationsListValue));
                                }
                                instanceGenerationsListIndex++;
                            }
                        }

                        if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                    StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                        }

                        if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                    StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                        }

                        if (instanceRequirements.getBareMetal() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
                        }

                        if (instanceRequirements.getBurstablePerformance() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.BurstablePerformance", StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                        }

                        if (instanceRequirements.getRequireHibernateSupport() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.RequireHibernateSupport",
                                    StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                        }

                        NetworkInterfaceCount networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                        if (networkInterfaceCount != null) {

                            if (networkInterfaceCount.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.NetworkInterfaceCount.Min", StringUtils.fromInteger(networkInterfaceCount.getMin()));
                            }

                            if (networkInterfaceCount.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.NetworkInterfaceCount.Max", StringUtils.fromInteger(networkInterfaceCount.getMax()));
                            }
                        }

                        if (instanceRequirements.getLocalStorage() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                    + ".InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getLocalStorageTypes();
                        if (!instanceRequirementsLocalStorageTypesList.isEmpty() || !instanceRequirementsLocalStorageTypesList.isAutoConstruct()) {
                            int localStorageTypesListIndex = 1;

                            for (String instanceRequirementsLocalStorageTypesListValue : instanceRequirementsLocalStorageTypesList) {
                                if (instanceRequirementsLocalStorageTypesListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.LocalStorageTypeSet." + localStorageTypesListIndex,
                                            StringUtils.fromString(instanceRequirementsLocalStorageTypesListValue));
                                }
                                localStorageTypesListIndex++;
                            }
                        }

                        TotalLocalStorageGB totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                        if (totalLocalStorageGB != null) {

                            if (totalLocalStorageGB.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.TotalLocalStorageGB.Min", StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                            }

                            if (totalLocalStorageGB.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.TotalLocalStorageGB.Max", StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                            }
                        }

                        BaselineEbsBandwidthMbps baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                        if (baselineEbsBandwidthMbps != null) {

                            if (baselineEbsBandwidthMbps.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                            }

                            if (baselineEbsBandwidthMbps.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max", StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getAcceleratorTypes();
                        if (!instanceRequirementsAcceleratorTypesList.isEmpty() || !instanceRequirementsAcceleratorTypesList.isAutoConstruct()) {
                            int acceleratorTypesListIndex = 1;

                            for (String instanceRequirementsAcceleratorTypesListValue : instanceRequirementsAcceleratorTypesList) {
                                if (instanceRequirementsAcceleratorTypesListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.AcceleratorTypeSet." + acceleratorTypesListIndex,
                                            StringUtils.fromString(instanceRequirementsAcceleratorTypesListValue));
                                }
                                acceleratorTypesListIndex++;
                            }
                        }

                        AcceleratorCount acceleratorCount = instanceRequirements.getAcceleratorCount();
                        if (acceleratorCount != null) {

                            if (acceleratorCount.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.AcceleratorCount.Min", StringUtils.fromInteger(acceleratorCount.getMin()));
                            }

                            if (acceleratorCount.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.AcceleratorCount.Max", StringUtils.fromInteger(acceleratorCount.getMax()));
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getAcceleratorManufacturers();
                        if (!instanceRequirementsAcceleratorManufacturersList.isEmpty() || !instanceRequirementsAcceleratorManufacturersList.isAutoConstruct()) {
                            int acceleratorManufacturersListIndex = 1;

                            for (String instanceRequirementsAcceleratorManufacturersListValue : instanceRequirementsAcceleratorManufacturersList) {
                                if (instanceRequirementsAcceleratorManufacturersListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.AcceleratorManufacturerSet." + acceleratorManufacturersListIndex,
                                            StringUtils.fromString(instanceRequirementsAcceleratorManufacturersListValue));
                                }
                                acceleratorManufacturersListIndex++;
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getAcceleratorNames();
                        if (!instanceRequirementsAcceleratorNamesList.isEmpty() || !instanceRequirementsAcceleratorNamesList.isAutoConstruct()) {
                            int acceleratorNamesListIndex = 1;

                            for (String instanceRequirementsAcceleratorNamesListValue : instanceRequirementsAcceleratorNamesList) {
                                if (instanceRequirementsAcceleratorNamesListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.AcceleratorNameSet." + acceleratorNamesListIndex,
                                            StringUtils.fromString(instanceRequirementsAcceleratorNamesListValue));
                                }
                                acceleratorNamesListIndex++;
                            }
                        }

                        AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
                        if (acceleratorTotalMemoryMiB != null) {

                            if (acceleratorTotalMemoryMiB.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min", StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                            }

                            if (acceleratorTotalMemoryMiB.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max", StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                            }
                        }

                        NetworkBandwidthGbps networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
                        if (networkBandwidthGbps != null) {

                            if (networkBandwidthGbps.getMin() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.NetworkBandwidthGbps.Min", StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                            }

                            if (networkBandwidthGbps.getMax() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                        + ".InstanceRequirements.NetworkBandwidthGbps.Max", StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                            }
                        }

                        com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAllowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                .getAllowedInstanceTypes();
                        if (!instanceRequirementsAllowedInstanceTypesList.isEmpty() || !instanceRequirementsAllowedInstanceTypesList.isAutoConstruct()) {
                            int allowedInstanceTypesListIndex = 1;

                            for (String instanceRequirementsAllowedInstanceTypesListValue : instanceRequirementsAllowedInstanceTypesList) {
                                if (instanceRequirementsAllowedInstanceTypesListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".InstanceRequirements.AllowedInstanceTypeSet." + allowedInstanceTypesListIndex,
                                            StringUtils.fromString(instanceRequirementsAllowedInstanceTypesListValue));
                                }
                                allowedInstanceTypesListIndex++;
                            }
                        }
                    }
                    launchSpecificationsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig> spotFleetRequestConfigDataLaunchTemplateConfigsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateConfig>) spotFleetRequestConfig
                    .getLaunchTemplateConfigs();
            if (!spotFleetRequestConfigDataLaunchTemplateConfigsList.isEmpty() || !spotFleetRequestConfigDataLaunchTemplateConfigsList.isAutoConstruct()) {
                int launchTemplateConfigsListIndex = 1;

                for (LaunchTemplateConfig spotFleetRequestConfigDataLaunchTemplateConfigsListValue : spotFleetRequestConfigDataLaunchTemplateConfigsList) {

                    FleetLaunchTemplateSpecification launchTemplateSpecification = spotFleetRequestConfigDataLaunchTemplateConfigsListValue
                            .getLaunchTemplateSpecification();
                    if (launchTemplateSpecification != null) {

                        if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                    + ".LaunchTemplateSpecification.LaunchTemplateId",
                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                        }

                        if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                    + ".LaunchTemplateSpecification.LaunchTemplateName",
                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                        }

                        if (launchTemplateSpecification.getVersion() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                    + ".LaunchTemplateSpecification.Version", StringUtils.fromString(launchTemplateSpecification.getVersion()));
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> launchTemplateConfigOverridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) spotFleetRequestConfigDataLaunchTemplateConfigsListValue
                            .getOverrides();
                    if (!launchTemplateConfigOverridesList.isEmpty() || !launchTemplateConfigOverridesList.isAutoConstruct()) {
                        int overridesListIndex = 1;

                        for (LaunchTemplateOverrides launchTemplateConfigOverridesListValue : launchTemplateConfigOverridesList) {

                            if (launchTemplateConfigOverridesListValue.getInstanceType() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".InstanceType",
                                        StringUtils.fromString(launchTemplateConfigOverridesListValue.getInstanceType()));
                            }

                            if (launchTemplateConfigOverridesListValue.getSpotPrice() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".SpotPrice", StringUtils.fromString(launchTemplateConfigOverridesListValue.getSpotPrice()));
                            }

                            if (launchTemplateConfigOverridesListValue.getSubnetId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".SubnetId", StringUtils.fromString(launchTemplateConfigOverridesListValue.getSubnetId()));
                            }

                            if (launchTemplateConfigOverridesListValue.getAvailabilityZone() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".AvailabilityZone",
                                        StringUtils.fromString(launchTemplateConfigOverridesListValue.getAvailabilityZone()));
                            }

                            if (launchTemplateConfigOverridesListValue.getWeightedCapacity() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".WeightedCapacity",
                                        StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getWeightedCapacity()));
                            }

                            if (launchTemplateConfigOverridesListValue.getPriority() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                        + overridesListIndex + ".Priority", StringUtils.fromDouble(launchTemplateConfigOverridesListValue.getPriority()));
                            }

                            InstanceRequirements instanceRequirements = launchTemplateConfigOverridesListValue.getInstanceRequirements();
                            if (instanceRequirements != null) {

                                VCpuCountRange vCpuCount = instanceRequirements.getVCpuCount();
                                if (vCpuCount != null) {

                                    if (vCpuCount.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                                    }

                                    if (vCpuCount.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                                    }
                                }

                                MemoryMiB memoryMiB = instanceRequirements.getMemoryMiB();
                                if (memoryMiB != null) {

                                    if (memoryMiB.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                                    }

                                    if (memoryMiB.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getCpuManufacturers();
                                if (!instanceRequirementsCpuManufacturersList.isEmpty() || !instanceRequirementsCpuManufacturersList.isAutoConstruct()) {
                                    int cpuManufacturersListIndex = 1;

                                    for (String instanceRequirementsCpuManufacturersListValue : instanceRequirementsCpuManufacturersList) {
                                        if (instanceRequirementsCpuManufacturersListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.CpuManufacturerSet."
                                                    + cpuManufacturersListIndex, StringUtils.fromString(instanceRequirementsCpuManufacturersListValue));
                                        }
                                        cpuManufacturersListIndex++;
                                    }
                                }

                                MemoryGiBPerVCpu memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                                if (memoryGiBPerVCpu != null) {

                                    if (memoryGiBPerVCpu.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.MemoryGiBPerVCpu.Min",
                                                StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                                    }

                                    if (memoryGiBPerVCpu.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.MemoryGiBPerVCpu.Max",
                                                StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getExcludedInstanceTypes();
                                if (!instanceRequirementsExcludedInstanceTypesList.isEmpty()
                                        || !instanceRequirementsExcludedInstanceTypesList.isAutoConstruct()) {
                                    int excludedInstanceTypesListIndex = 1;

                                    for (String instanceRequirementsExcludedInstanceTypesListValue : instanceRequirementsExcludedInstanceTypesList) {
                                        if (instanceRequirementsExcludedInstanceTypesListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.ExcludedInstanceTypeSet."
                                                    + excludedInstanceTypesListIndex,
                                                    StringUtils.fromString(instanceRequirementsExcludedInstanceTypesListValue));
                                        }
                                        excludedInstanceTypesListIndex++;
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getInstanceGenerations();
                                if (!instanceRequirementsInstanceGenerationsList.isEmpty() || !instanceRequirementsInstanceGenerationsList.isAutoConstruct()) {
                                    int instanceGenerationsListIndex = 1;

                                    for (String instanceRequirementsInstanceGenerationsListValue : instanceRequirementsInstanceGenerationsList) {
                                        if (instanceRequirementsInstanceGenerationsListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.InstanceGenerationSet."
                                                    + instanceGenerationsListIndex, StringUtils.fromString(instanceRequirementsInstanceGenerationsListValue));
                                        }
                                        instanceGenerationsListIndex++;
                                    }
                                }

                                if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                            StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                                }

                                if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                            StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                                }

                                if (instanceRequirements.getBareMetal() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.BareMetal",
                                            StringUtils.fromString(instanceRequirements.getBareMetal()));
                                }

                                if (instanceRequirements.getBurstablePerformance() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.BurstablePerformance",
                                            StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                                }

                                if (instanceRequirements.getRequireHibernateSupport() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.RequireHibernateSupport",
                                            StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                                }

                                NetworkInterfaceCount networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                                if (networkInterfaceCount != null) {

                                    if (networkInterfaceCount.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.NetworkInterfaceCount.Min",
                                                StringUtils.fromInteger(networkInterfaceCount.getMin()));
                                    }

                                    if (networkInterfaceCount.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.NetworkInterfaceCount.Max",
                                                StringUtils.fromInteger(networkInterfaceCount.getMax()));
                                    }
                                }

                                if (instanceRequirements.getLocalStorage() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                            + overridesListIndex + ".InstanceRequirements.LocalStorage",
                                            StringUtils.fromString(instanceRequirements.getLocalStorage()));
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getLocalStorageTypes();
                                if (!instanceRequirementsLocalStorageTypesList.isEmpty() || !instanceRequirementsLocalStorageTypesList.isAutoConstruct()) {
                                    int localStorageTypesListIndex = 1;

                                    for (String instanceRequirementsLocalStorageTypesListValue : instanceRequirementsLocalStorageTypesList) {
                                        if (instanceRequirementsLocalStorageTypesListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.LocalStorageTypeSet."
                                                    + localStorageTypesListIndex, StringUtils.fromString(instanceRequirementsLocalStorageTypesListValue));
                                        }
                                        localStorageTypesListIndex++;
                                    }
                                }

                                TotalLocalStorageGB totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                                if (totalLocalStorageGB != null) {

                                    if (totalLocalStorageGB.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.TotalLocalStorageGB.Min",
                                                StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                                    }

                                    if (totalLocalStorageGB.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.TotalLocalStorageGB.Max",
                                                StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                                    }
                                }

                                BaselineEbsBandwidthMbps baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                                if (baselineEbsBandwidthMbps != null) {

                                    if (baselineEbsBandwidthMbps.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min",
                                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                                    }

                                    if (baselineEbsBandwidthMbps.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max",
                                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getAcceleratorTypes();
                                if (!instanceRequirementsAcceleratorTypesList.isEmpty() || !instanceRequirementsAcceleratorTypesList.isAutoConstruct()) {
                                    int acceleratorTypesListIndex = 1;

                                    for (String instanceRequirementsAcceleratorTypesListValue : instanceRequirementsAcceleratorTypesList) {
                                        if (instanceRequirementsAcceleratorTypesListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.AcceleratorTypeSet."
                                                    + acceleratorTypesListIndex, StringUtils.fromString(instanceRequirementsAcceleratorTypesListValue));
                                        }
                                        acceleratorTypesListIndex++;
                                    }
                                }

                                AcceleratorCount acceleratorCount = instanceRequirements.getAcceleratorCount();
                                if (acceleratorCount != null) {

                                    if (acceleratorCount.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.AcceleratorCount.Min",
                                                StringUtils.fromInteger(acceleratorCount.getMin()));
                                    }

                                    if (acceleratorCount.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.AcceleratorCount.Max",
                                                StringUtils.fromInteger(acceleratorCount.getMax()));
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getAcceleratorManufacturers();
                                if (!instanceRequirementsAcceleratorManufacturersList.isEmpty()
                                        || !instanceRequirementsAcceleratorManufacturersList.isAutoConstruct()) {
                                    int acceleratorManufacturersListIndex = 1;

                                    for (String instanceRequirementsAcceleratorManufacturersListValue : instanceRequirementsAcceleratorManufacturersList) {
                                        if (instanceRequirementsAcceleratorManufacturersListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.AcceleratorManufacturerSet."
                                                    + acceleratorManufacturersListIndex,
                                                    StringUtils.fromString(instanceRequirementsAcceleratorManufacturersListValue));
                                        }
                                        acceleratorManufacturersListIndex++;
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getAcceleratorNames();
                                if (!instanceRequirementsAcceleratorNamesList.isEmpty() || !instanceRequirementsAcceleratorNamesList.isAutoConstruct()) {
                                    int acceleratorNamesListIndex = 1;

                                    for (String instanceRequirementsAcceleratorNamesListValue : instanceRequirementsAcceleratorNamesList) {
                                        if (instanceRequirementsAcceleratorNamesListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.AcceleratorNameSet."
                                                    + acceleratorNamesListIndex, StringUtils.fromString(instanceRequirementsAcceleratorNamesListValue));
                                        }
                                        acceleratorNamesListIndex++;
                                    }
                                }

                                AcceleratorTotalMemoryMiB acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
                                if (acceleratorTotalMemoryMiB != null) {

                                    if (acceleratorTotalMemoryMiB.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                                    }

                                    if (acceleratorTotalMemoryMiB.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                                    }
                                }

                                NetworkBandwidthGbps networkBandwidthGbps = instanceRequirements.getNetworkBandwidthGbps();
                                if (networkBandwidthGbps != null) {

                                    if (networkBandwidthGbps.getMin() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.NetworkBandwidthGbps.Min",
                                                StringUtils.fromDouble(networkBandwidthGbps.getMin()));
                                    }

                                    if (networkBandwidthGbps.getMax() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex + ".Overrides."
                                                + overridesListIndex + ".InstanceRequirements.NetworkBandwidthGbps.Max",
                                                StringUtils.fromDouble(networkBandwidthGbps.getMax()));
                                    }
                                }

                                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsAllowedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                        .getAllowedInstanceTypes();
                                if (!instanceRequirementsAllowedInstanceTypesList.isEmpty() || !instanceRequirementsAllowedInstanceTypesList.isAutoConstruct()) {
                                    int allowedInstanceTypesListIndex = 1;

                                    for (String instanceRequirementsAllowedInstanceTypesListValue : instanceRequirementsAllowedInstanceTypesList) {
                                        if (instanceRequirementsAllowedInstanceTypesListValue != null) {
                                            request.addParameter("SpotFleetRequestConfig.LaunchTemplateConfigs." + launchTemplateConfigsListIndex
                                                    + ".Overrides." + overridesListIndex + ".InstanceRequirements.AllowedInstanceTypeSet."
                                                    + allowedInstanceTypesListIndex, StringUtils.fromString(instanceRequirementsAllowedInstanceTypesListValue));
                                        }
                                        allowedInstanceTypesListIndex++;
                                    }
                                }
                            }
                            overridesListIndex++;
                        }
                    }
                    launchTemplateConfigsListIndex++;
                }
            }

            if (spotFleetRequestConfig.getSpotPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.SpotPrice", StringUtils.fromString(spotFleetRequestConfig.getSpotPrice()));
            }

            if (spotFleetRequestConfig.getTargetCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.TargetCapacity", StringUtils.fromInteger(spotFleetRequestConfig.getTargetCapacity()));
            }

            if (spotFleetRequestConfig.getOnDemandTargetCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.OnDemandTargetCapacity",
                        StringUtils.fromInteger(spotFleetRequestConfig.getOnDemandTargetCapacity()));
            }

            if (spotFleetRequestConfig.getOnDemandMaxTotalPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.OnDemandMaxTotalPrice", StringUtils.fromString(spotFleetRequestConfig.getOnDemandMaxTotalPrice()));
            }

            if (spotFleetRequestConfig.getSpotMaxTotalPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.SpotMaxTotalPrice", StringUtils.fromString(spotFleetRequestConfig.getSpotMaxTotalPrice()));
            }

            if (spotFleetRequestConfig.getTerminateInstancesWithExpiration() != null) {
                request.addParameter("SpotFleetRequestConfig.TerminateInstancesWithExpiration",
                        StringUtils.fromBoolean(spotFleetRequestConfig.getTerminateInstancesWithExpiration()));
            }

            if (spotFleetRequestConfig.getType() != null) {
                request.addParameter("SpotFleetRequestConfig.Type", StringUtils.fromString(spotFleetRequestConfig.getType()));
            }

            if (spotFleetRequestConfig.getValidFrom() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidFrom", StringUtils.fromDate(spotFleetRequestConfig.getValidFrom()));
            }

            if (spotFleetRequestConfig.getValidUntil() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidUntil", StringUtils.fromDate(spotFleetRequestConfig.getValidUntil()));
            }

            if (spotFleetRequestConfig.getReplaceUnhealthyInstances() != null) {
                request.addParameter("SpotFleetRequestConfig.ReplaceUnhealthyInstances",
                        StringUtils.fromBoolean(spotFleetRequestConfig.getReplaceUnhealthyInstances()));
            }

            if (spotFleetRequestConfig.getInstanceInterruptionBehavior() != null) {
                request.addParameter("SpotFleetRequestConfig.InstanceInterruptionBehavior",
                        StringUtils.fromString(spotFleetRequestConfig.getInstanceInterruptionBehavior()));
            }

            LoadBalancersConfig loadBalancersConfig = spotFleetRequestConfig.getLoadBalancersConfig();
            if (loadBalancersConfig != null) {

                ClassicLoadBalancersConfig classicLoadBalancersConfig = loadBalancersConfig.getClassicLoadBalancersConfig();
                if (classicLoadBalancersConfig != null) {

                    com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer> classicLoadBalancersConfigClassicLoadBalancersList = (com.amazonaws.internal.SdkInternalList<ClassicLoadBalancer>) classicLoadBalancersConfig
                            .getClassicLoadBalancers();
                    if (!classicLoadBalancersConfigClassicLoadBalancersList.isEmpty() || !classicLoadBalancersConfigClassicLoadBalancersList.isAutoConstruct()) {
                        int classicLoadBalancersListIndex = 1;

                        for (ClassicLoadBalancer classicLoadBalancersConfigClassicLoadBalancersListValue : classicLoadBalancersConfigClassicLoadBalancersList) {

                            if (classicLoadBalancersConfigClassicLoadBalancersListValue.getName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LoadBalancersConfig.ClassicLoadBalancersConfig.ClassicLoadBalancers."
                                        + classicLoadBalancersListIndex + ".Name",
                                        StringUtils.fromString(classicLoadBalancersConfigClassicLoadBalancersListValue.getName()));
                            }
                            classicLoadBalancersListIndex++;
                        }
                    }
                }

                TargetGroupsConfig targetGroupsConfig = loadBalancersConfig.getTargetGroupsConfig();
                if (targetGroupsConfig != null) {

                    com.amazonaws.internal.SdkInternalList<TargetGroup> targetGroupsConfigTargetGroupsList = (com.amazonaws.internal.SdkInternalList<TargetGroup>) targetGroupsConfig
                            .getTargetGroups();
                    if (!targetGroupsConfigTargetGroupsList.isEmpty() || !targetGroupsConfigTargetGroupsList.isAutoConstruct()) {
                        int targetGroupsListIndex = 1;

                        for (TargetGroup targetGroupsConfigTargetGroupsListValue : targetGroupsConfigTargetGroupsList) {

                            if (targetGroupsConfigTargetGroupsListValue.getArn() != null) {
                                request.addParameter("SpotFleetRequestConfig.LoadBalancersConfig.TargetGroupsConfig.TargetGroups." + targetGroupsListIndex
                                        + ".Arn", StringUtils.fromString(targetGroupsConfigTargetGroupsListValue.getArn()));
                            }
                            targetGroupsListIndex++;
                        }
                    }
                }
            }

            if (spotFleetRequestConfig.getInstancePoolsToUseCount() != null) {
                request.addParameter("SpotFleetRequestConfig.InstancePoolsToUseCount",
                        StringUtils.fromInteger(spotFleetRequestConfig.getInstancePoolsToUseCount()));
            }

            if (spotFleetRequestConfig.getContext() != null) {
                request.addParameter("SpotFleetRequestConfig.Context", StringUtils.fromString(spotFleetRequestConfig.getContext()));
            }

            if (spotFleetRequestConfig.getTargetCapacityUnitType() != null) {
                request.addParameter("SpotFleetRequestConfig.TargetCapacityUnitType",
                        StringUtils.fromString(spotFleetRequestConfig.getTargetCapacityUnitType()));
            }

            com.amazonaws.internal.SdkInternalList<TagSpecification> spotFleetRequestConfigDataTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) spotFleetRequestConfig
                    .getTagSpecifications();
            if (!spotFleetRequestConfigDataTagSpecificationsList.isEmpty() || !spotFleetRequestConfigDataTagSpecificationsList.isAutoConstruct()) {
                int tagSpecificationsListIndex = 1;

                for (TagSpecification spotFleetRequestConfigDataTagSpecificationsListValue : spotFleetRequestConfigDataTagSpecificationsList) {

                    if (spotFleetRequestConfigDataTagSpecificationsListValue.getResourceType() != null) {
                        request.addParameter("SpotFleetRequestConfig.TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                                StringUtils.fromString(spotFleetRequestConfigDataTagSpecificationsListValue.getResourceType()));
                    }

                    com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) spotFleetRequestConfigDataTagSpecificationsListValue
                            .getTags();
                    if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                        int tagsListIndex = 1;

                        for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                            if (tagSpecificationTagsListValue.getKey() != null) {
                                request.addParameter(
                                        "SpotFleetRequestConfig.TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                        StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                            }

                            if (tagSpecificationTagsListValue.getValue() != null) {
                                request.addParameter("SpotFleetRequestConfig.TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex
                                        + ".Value", StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                            }
                            tagsListIndex++;
                        }
                    }
                    tagSpecificationsListIndex++;
                }
            }
        }

        return request;
    }

}
