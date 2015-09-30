/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Request Spot Fleet Request Marshaller
 */
public class RequestSpotFleetRequestMarshaller implements Marshaller<Request<RequestSpotFleetRequest>, RequestSpotFleetRequest> {

    public Request<RequestSpotFleetRequest> marshall(RequestSpotFleetRequest requestSpotFleetRequest) {

        if (requestSpotFleetRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotFleetRequest> request = new DefaultRequest<RequestSpotFleetRequest>(requestSpotFleetRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotFleet");
        request.addParameter("Version", "2015-10-01");

        SpotFleetRequestConfigData spotFleetRequestConfigDataSpotFleetRequestConfig = requestSpotFleetRequest.getSpotFleetRequestConfig();
        if (spotFleetRequestConfigDataSpotFleetRequestConfig != null) {
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getClientToken() != null) {
                request.addParameter("SpotFleetRequestConfig.ClientToken", StringUtils.fromString(spotFleetRequestConfigDataSpotFleetRequestConfig.getClientToken()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getSpotPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.SpotPrice", StringUtils.fromString(spotFleetRequestConfigDataSpotFleetRequestConfig.getSpotPrice()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getTargetCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.TargetCapacity", StringUtils.fromInteger(spotFleetRequestConfigDataSpotFleetRequestConfig.getTargetCapacity()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getValidFrom() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidFrom", StringUtils.fromDate(spotFleetRequestConfigDataSpotFleetRequestConfig.getValidFrom()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getValidUntil() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidUntil", StringUtils.fromDate(spotFleetRequestConfigDataSpotFleetRequestConfig.getValidUntil()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.isTerminateInstancesWithExpiration() != null) {
                request.addParameter("SpotFleetRequestConfig.TerminateInstancesWithExpiration", StringUtils.fromBoolean(spotFleetRequestConfigDataSpotFleetRequestConfig.isTerminateInstancesWithExpiration()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getIamFleetRole() != null) {
                request.addParameter("SpotFleetRequestConfig.IamFleetRole", StringUtils.fromString(spotFleetRequestConfigDataSpotFleetRequestConfig.getIamFleetRole()));
            }

            java.util.List<SpotFleetLaunchSpecification> launchSpecificationsList = spotFleetRequestConfigDataSpotFleetRequestConfig.getLaunchSpecifications();
            int launchSpecificationsListIndex = 1;

            for (SpotFleetLaunchSpecification launchSpecificationsListValue : launchSpecificationsList) {
                SpotFleetLaunchSpecification spotFleetLaunchSpecificationMember = launchSpecificationsListValue;
                if (spotFleetLaunchSpecificationMember != null) {
                    if (spotFleetLaunchSpecificationMember.getImageId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".ImageId", StringUtils.fromString(spotFleetLaunchSpecificationMember.getImageId()));
                    }
                    if (spotFleetLaunchSpecificationMember.getKeyName() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KeyName", StringUtils.fromString(spotFleetLaunchSpecificationMember.getKeyName()));
                    }

                    java.util.List<GroupIdentifier> securityGroupsList = spotFleetLaunchSpecificationMember.getSecurityGroups();
                    int securityGroupsListIndex = 1;

                    for (GroupIdentifier securityGroupsListValue : securityGroupsList) {
                        GroupIdentifier groupIdentifierMember = securityGroupsListValue;
                        if (groupIdentifierMember != null) {
                            if (groupIdentifierMember.getGroupName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet." + securityGroupsListIndex + ".GroupName", StringUtils.fromString(groupIdentifierMember.getGroupName()));
                            }
                            if (groupIdentifierMember.getGroupId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet." + securityGroupsListIndex + ".GroupId", StringUtils.fromString(groupIdentifierMember.getGroupId()));
                            }
                        }

                        securityGroupsListIndex++;
                    }
                    if (spotFleetLaunchSpecificationMember.getUserData() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".UserData", StringUtils.fromString(spotFleetLaunchSpecificationMember.getUserData()));
                    }
                    if (spotFleetLaunchSpecificationMember.getAddressingType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".AddressingType", StringUtils.fromString(spotFleetLaunchSpecificationMember.getAddressingType()));
                    }
                    if (spotFleetLaunchSpecificationMember.getInstanceType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".InstanceType", StringUtils.fromString(spotFleetLaunchSpecificationMember.getInstanceType()));
                    }
                    SpotPlacement spotPlacementPlacement = spotFleetLaunchSpecificationMember.getPlacement();
                    if (spotPlacementPlacement != null) {
                        if (spotPlacementPlacement.getAvailabilityZone() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.AvailabilityZone", StringUtils.fromString(spotPlacementPlacement.getAvailabilityZone()));
                        }
                        if (spotPlacementPlacement.getGroupName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.GroupName", StringUtils.fromString(spotPlacementPlacement.getGroupName()));
                        }
                    }
                    if (spotFleetLaunchSpecificationMember.getKernelId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KernelId", StringUtils.fromString(spotFleetLaunchSpecificationMember.getKernelId()));
                    }
                    if (spotFleetLaunchSpecificationMember.getRamdiskId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".RamdiskId", StringUtils.fromString(spotFleetLaunchSpecificationMember.getRamdiskId()));
                    }

                    java.util.List<BlockDeviceMapping> blockDeviceMappingsList = spotFleetLaunchSpecificationMember.getBlockDeviceMappings();
                    int blockDeviceMappingsListIndex = 1;

                    for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                        BlockDeviceMapping blockDeviceMappingMember = blockDeviceMappingsListValue;
                        if (blockDeviceMappingMember != null) {
                            if (blockDeviceMappingMember.getVirtualName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingMember.getVirtualName()));
                            }
                            if (blockDeviceMappingMember.getDeviceName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingMember.getDeviceName()));
                            }
                            EbsBlockDevice ebsBlockDeviceEbs = blockDeviceMappingMember.getEbs();
                            if (ebsBlockDeviceEbs != null) {
                                if (ebsBlockDeviceEbs.getSnapshotId() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebsBlockDeviceEbs.getSnapshotId()));
                                }
                                if (ebsBlockDeviceEbs.getVolumeSize() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebsBlockDeviceEbs.getVolumeSize()));
                                }
                                if (ebsBlockDeviceEbs.isDeleteOnTermination() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebsBlockDeviceEbs.isDeleteOnTermination()));
                                }
                                if (ebsBlockDeviceEbs.getVolumeType() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType", StringUtils.fromString(ebsBlockDeviceEbs.getVolumeType()));
                                }
                                if (ebsBlockDeviceEbs.getIops() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebsBlockDeviceEbs.getIops()));
                                }
                                if (ebsBlockDeviceEbs.isEncrypted() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted", StringUtils.fromBoolean(ebsBlockDeviceEbs.isEncrypted()));
                                }
                            }
                            if (blockDeviceMappingMember.getNoDevice() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingMember.getNoDevice()));
                            }
                        }

                        blockDeviceMappingsListIndex++;
                    }
                    SpotFleetMonitoring spotFleetMonitoringMonitoring = spotFleetLaunchSpecificationMember.getMonitoring();
                    if (spotFleetMonitoringMonitoring != null) {
                        if (spotFleetMonitoringMonitoring.isEnabled() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Monitoring.Enabled", StringUtils.fromBoolean(spotFleetMonitoringMonitoring.isEnabled()));
                        }
                    }
                    if (spotFleetLaunchSpecificationMember.getSubnetId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SubnetId", StringUtils.fromString(spotFleetLaunchSpecificationMember.getSubnetId()));
                    }

                    java.util.List<InstanceNetworkInterfaceSpecification> networkInterfacesList = spotFleetLaunchSpecificationMember.getNetworkInterfaces();
                    int networkInterfacesListIndex = 1;

                    for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {
                        InstanceNetworkInterfaceSpecification instanceNetworkInterfaceSpecificationMember = networkInterfacesListValue;
                        if (instanceNetworkInterfaceSpecificationMember != null) {
                            if (instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".NetworkInterfaceId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId()));
                            }
                            if (instanceNetworkInterfaceSpecificationMember.getDeviceIndex() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".DeviceIndex", StringUtils.fromInteger(instanceNetworkInterfaceSpecificationMember.getDeviceIndex()));
                            }
                            if (instanceNetworkInterfaceSpecificationMember.getSubnetId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".SubnetId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getSubnetId()));
                            }
                            if (instanceNetworkInterfaceSpecificationMember.getDescription() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".Description", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getDescription()));
                            }
                            if (instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddress", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress()));
                            }

                            java.util.List<String> groupsList = instanceNetworkInterfaceSpecificationMember.getGroups();
                            int groupsListIndex = 1;

                            for (String groupsListValue : groupsList) {
                                if (groupsListValue != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
                                }

                                groupsListIndex++;
                            }
                            if (instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".DeleteOnTermination", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination()));
                            }

                            java.util.List<PrivateIpAddressSpecification> privateIpAddressesList = instanceNetworkInterfaceSpecificationMember.getPrivateIpAddresses();
                            int privateIpAddressesListIndex = 1;

                            for (PrivateIpAddressSpecification privateIpAddressesListValue : privateIpAddressesList) {
                                PrivateIpAddressSpecification privateIpAddressSpecificationMember = privateIpAddressesListValue;
                                if (privateIpAddressSpecificationMember != null) {
                                    if (privateIpAddressSpecificationMember.getPrivateIpAddress() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex + ".PrivateIpAddress", StringUtils.fromString(privateIpAddressSpecificationMember.getPrivateIpAddress()));
                                    }
                                    if (privateIpAddressSpecificationMember.isPrimary() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex + ".Primary", StringUtils.fromBoolean(privateIpAddressSpecificationMember.isPrimary()));
                                    }
                                }

                                privateIpAddressesListIndex++;
                            }
                            if (instanceNetworkInterfaceSpecificationMember.getSecondaryPrivateIpAddressCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount", StringUtils.fromInteger(instanceNetworkInterfaceSpecificationMember.getSecondaryPrivateIpAddressCount()));
                            }
                            if (instanceNetworkInterfaceSpecificationMember.isAssociatePublicIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".AssociatePublicIpAddress", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationMember.isAssociatePublicIpAddress()));
                            }
                        }

                        networkInterfacesListIndex++;
                    }
                    IamInstanceProfileSpecification iamInstanceProfileSpecificationIamInstanceProfile = spotFleetLaunchSpecificationMember.getIamInstanceProfile();
                    if (iamInstanceProfileSpecificationIamInstanceProfile != null) {
                        if (iamInstanceProfileSpecificationIamInstanceProfile.getArn() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfileSpecificationIamInstanceProfile.getArn()));
                        }
                        if (iamInstanceProfileSpecificationIamInstanceProfile.getName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfileSpecificationIamInstanceProfile.getName()));
                        }
                    }
                    if (spotFleetLaunchSpecificationMember.isEbsOptimized() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".EbsOptimized", StringUtils.fromBoolean(spotFleetLaunchSpecificationMember.isEbsOptimized()));
                    }
                    if (spotFleetLaunchSpecificationMember.getWeightedCapacity() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".WeightedCapacity", StringUtils.fromDouble(spotFleetLaunchSpecificationMember.getWeightedCapacity()));
                    }
                    if (spotFleetLaunchSpecificationMember.getSpotPrice() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SpotPrice", StringUtils.fromString(spotFleetLaunchSpecificationMember.getSpotPrice()));
                    }
                }

                launchSpecificationsListIndex++;
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getExcessCapacityTerminationPolicy() != null) {
                request.addParameter("SpotFleetRequestConfig.ExcessCapacityTerminationPolicy", StringUtils.fromString(spotFleetRequestConfigDataSpotFleetRequestConfig.getExcessCapacityTerminationPolicy()));
            }
            if (spotFleetRequestConfigDataSpotFleetRequestConfig.getAllocationStrategy() != null) {
                request.addParameter("SpotFleetRequestConfig.AllocationStrategy", StringUtils.fromString(spotFleetRequestConfigDataSpotFleetRequestConfig.getAllocationStrategy()));
            }
        }

        return request;
    }
}
