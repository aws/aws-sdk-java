/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Request Spot Instances Request Marshaller
 */
public class RequestSpotInstancesRequestMarshaller implements Marshaller<Request<RequestSpotInstancesRequest>, RequestSpotInstancesRequest> {

    public Request<RequestSpotInstancesRequest> marshall(RequestSpotInstancesRequest requestSpotInstancesRequest) {

        if (requestSpotInstancesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RequestSpotInstancesRequest> request = new DefaultRequest<RequestSpotInstancesRequest>(requestSpotInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotInstances");
        request.addParameter("Version", "2011-12-15");

        if (requestSpotInstancesRequest.getSpotPrice() != null) {
            request.addParameter("SpotPrice", StringUtils.fromString(requestSpotInstancesRequest.getSpotPrice()));
        }
        if (requestSpotInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(requestSpotInstancesRequest.getInstanceCount()));
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
        if (requestSpotInstancesRequest.getLaunchGroup() != null) {
            request.addParameter("LaunchGroup", StringUtils.fromString(requestSpotInstancesRequest.getLaunchGroup()));
        }
        if (requestSpotInstancesRequest.getAvailabilityZoneGroup() != null) {
            request.addParameter("AvailabilityZoneGroup", StringUtils.fromString(requestSpotInstancesRequest.getAvailabilityZoneGroup()));
        }
        LaunchSpecification launchSpecificationLaunchSpecification = requestSpotInstancesRequest.getLaunchSpecification();
        if (launchSpecificationLaunchSpecification != null) {
            if (launchSpecificationLaunchSpecification.getImageId() != null) {
                request.addParameter("LaunchSpecification.ImageId", StringUtils.fromString(launchSpecificationLaunchSpecification.getImageId()));
            }
            if (launchSpecificationLaunchSpecification.getKeyName() != null) {
                request.addParameter("LaunchSpecification.KeyName", StringUtils.fromString(launchSpecificationLaunchSpecification.getKeyName()));
            }

            java.util.List<GroupIdentifier> allSecurityGroupsList = launchSpecificationLaunchSpecification.getAllSecurityGroups();
            int allSecurityGroupsListIndex = 1;

            for (GroupIdentifier allSecurityGroupsListValue : allSecurityGroupsList) {
                GroupIdentifier groupIdentifierMember = allSecurityGroupsListValue;
                if (groupIdentifierMember != null) {
                    if (groupIdentifierMember.getGroupName() != null) {
                        request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupName", StringUtils.fromString(groupIdentifierMember.getGroupName()));
                    }
                    if (groupIdentifierMember.getGroupId() != null) {
                        request.addParameter("LaunchSpecification.GroupSet." + allSecurityGroupsListIndex + ".GroupId", StringUtils.fromString(groupIdentifierMember.getGroupId()));
                    }
                }

                allSecurityGroupsListIndex++;
            }

            java.util.List<String> securityGroupsList = launchSpecificationLaunchSpecification.getSecurityGroups();
            int securityGroupsListIndex = 1;

            for (String securityGroupsListValue : securityGroupsList) {
                if (securityGroupsListValue != null) {
                    request.addParameter("LaunchSpecification.SecurityGroup." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
                }

                securityGroupsListIndex++;
            }
            if (launchSpecificationLaunchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(launchSpecificationLaunchSpecification.getUserData()));
            }
            if (launchSpecificationLaunchSpecification.getAddressingType() != null) {
                request.addParameter("LaunchSpecification.AddressingType", StringUtils.fromString(launchSpecificationLaunchSpecification.getAddressingType()));
            }
            if (launchSpecificationLaunchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecificationLaunchSpecification.getInstanceType()));
            }
            SpotPlacement spotPlacementPlacement = launchSpecificationLaunchSpecification.getPlacement();
            if (spotPlacementPlacement != null) {
                if (spotPlacementPlacement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(spotPlacementPlacement.getAvailabilityZone()));
                }
                if (spotPlacementPlacement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(spotPlacementPlacement.getGroupName()));
                }
            }
            if (launchSpecificationLaunchSpecification.getKernelId() != null) {
                request.addParameter("LaunchSpecification.KernelId", StringUtils.fromString(launchSpecificationLaunchSpecification.getKernelId()));
            }
            if (launchSpecificationLaunchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId", StringUtils.fromString(launchSpecificationLaunchSpecification.getRamdiskId()));
            }

            java.util.List<BlockDeviceMapping> blockDeviceMappingsList = launchSpecificationLaunchSpecification.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                BlockDeviceMapping blockDeviceMappingMember = blockDeviceMappingsListValue;
                if (blockDeviceMappingMember != null) {
                    if (blockDeviceMappingMember.getVirtualName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingMember.getVirtualName()));
                    }
                    if (blockDeviceMappingMember.getDeviceName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingMember.getDeviceName()));
                    }
                    EbsBlockDevice ebsBlockDeviceEbs = blockDeviceMappingMember.getEbs();
                    if (ebsBlockDeviceEbs != null) {
                        if (ebsBlockDeviceEbs.getSnapshotId() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebsBlockDeviceEbs.getSnapshotId()));
                        }
                        if (ebsBlockDeviceEbs.getVolumeSize() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebsBlockDeviceEbs.getVolumeSize()));
                        }
                        if (ebsBlockDeviceEbs.isDeleteOnTermination() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebsBlockDeviceEbs.isDeleteOnTermination()));
                        }
                    }
                    if (blockDeviceMappingMember.getNoDevice() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingMember.getNoDevice()));
                    }
                }

                blockDeviceMappingsListIndex++;
            }
            if (launchSpecificationLaunchSpecification.isMonitoringEnabled() != null) {
                request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(launchSpecificationLaunchSpecification.isMonitoringEnabled()));
            }
            if (launchSpecificationLaunchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecificationLaunchSpecification.getSubnetId()));
            }

            java.util.List<InstanceNetworkInterfaceSpecification> networkInterfacesList = launchSpecificationLaunchSpecification.getNetworkInterfaces();
            int networkInterfacesListIndex = 1;

            for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {
                InstanceNetworkInterfaceSpecification instanceNetworkInterfaceSpecificationMember = networkInterfacesListValue;
                if (instanceNetworkInterfaceSpecificationMember != null) {
                    if (instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".NetworkInterfaceId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId()));
                    }
                    if (instanceNetworkInterfaceSpecificationMember.getDeviceIndex() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".DeviceIndex", StringUtils.fromInteger(instanceNetworkInterfaceSpecificationMember.getDeviceIndex()));
                    }
                    if (instanceNetworkInterfaceSpecificationMember.getSubnetId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".SubnetId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getSubnetId()));
                    }
                    if (instanceNetworkInterfaceSpecificationMember.getDescription() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".Description", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getDescription()));
                    }
                    if (instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddress", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress()));
                    }

                    java.util.List<String> groupsList = instanceNetworkInterfaceSpecificationMember.getGroups();
                    int groupsListIndex = 1;

                    for (String groupsListValue : groupsList) {
                        if (groupsListValue != null) {
                            request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
                        }

                        groupsListIndex++;
                    }
                    if (instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterfaceSet." + networkInterfacesListIndex + ".DeleteOnTermination", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination()));
                    }
                }

                networkInterfacesListIndex++;
            }
        }


        return request;
    }
}
