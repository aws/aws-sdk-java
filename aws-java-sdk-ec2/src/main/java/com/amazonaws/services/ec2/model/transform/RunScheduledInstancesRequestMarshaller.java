/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Run Scheduled Instances Request Marshaller
 */
public class RunScheduledInstancesRequestMarshaller implements Marshaller<Request<RunScheduledInstancesRequest>, RunScheduledInstancesRequest> {

    public Request<RunScheduledInstancesRequest> marshall(RunScheduledInstancesRequest runScheduledInstancesRequest) {

        if (runScheduledInstancesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunScheduledInstancesRequest> request = new DefaultRequest<RunScheduledInstancesRequest>(runScheduledInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunScheduledInstances");
        request.addParameter("Version", "2015-10-01");

        if (runScheduledInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(runScheduledInstancesRequest.getClientToken()));
        }
        if (runScheduledInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(runScheduledInstancesRequest.getInstanceCount()));
        }
        if (runScheduledInstancesRequest.getScheduledInstanceId() != null) {
            request.addParameter("ScheduledInstanceId", StringUtils.fromString(runScheduledInstancesRequest.getScheduledInstanceId()));
        }
        ScheduledInstancesLaunchSpecification scheduledInstancesLaunchSpecificationLaunchSpecification = runScheduledInstancesRequest.getLaunchSpecification();
        if (scheduledInstancesLaunchSpecificationLaunchSpecification != null) {
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getImageId() != null) {
                request.addParameter("LaunchSpecification.ImageId", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getImageId()));
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getKeyName() != null) {
                request.addParameter("LaunchSpecification.KeyName", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getKeyName()));
            }

            java.util.List<String> securityGroupIdsList = scheduledInstancesLaunchSpecificationLaunchSpecification.getSecurityGroupIds();
            int securityGroupIdsListIndex = 1;

            for (String securityGroupIdsListValue : securityGroupIdsList) {
                if (securityGroupIdsListValue != null) {
                    request.addParameter("LaunchSpecification.SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
                }

                securityGroupIdsListIndex++;
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getUserData()));
            }
            ScheduledInstancesPlacement scheduledInstancesPlacementPlacement = scheduledInstancesLaunchSpecificationLaunchSpecification.getPlacement();
            if (scheduledInstancesPlacementPlacement != null) {
                if (scheduledInstancesPlacementPlacement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(scheduledInstancesPlacementPlacement.getAvailabilityZone()));
                }
                if (scheduledInstancesPlacementPlacement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(scheduledInstancesPlacementPlacement.getGroupName()));
                }
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getKernelId() != null) {
                request.addParameter("LaunchSpecification.KernelId", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getKernelId()));
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getInstanceType()));
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getRamdiskId()));
            }

            java.util.List<ScheduledInstancesBlockDeviceMapping> blockDeviceMappingsList = scheduledInstancesLaunchSpecificationLaunchSpecification.getBlockDeviceMappings();
            int blockDeviceMappingsListIndex = 1;

            for (ScheduledInstancesBlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
                ScheduledInstancesBlockDeviceMapping scheduledInstancesBlockDeviceMappingMember = blockDeviceMappingsListValue;
                if (scheduledInstancesBlockDeviceMappingMember != null) {
                    if (scheduledInstancesBlockDeviceMappingMember.getDeviceName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(scheduledInstancesBlockDeviceMappingMember.getDeviceName()));
                    }
                    if (scheduledInstancesBlockDeviceMappingMember.getNoDevice() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(scheduledInstancesBlockDeviceMappingMember.getNoDevice()));
                    }
                    if (scheduledInstancesBlockDeviceMappingMember.getVirtualName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(scheduledInstancesBlockDeviceMappingMember.getVirtualName()));
                    }
                    ScheduledInstancesEbs scheduledInstancesEbsEbs = scheduledInstancesBlockDeviceMappingMember.getEbs();
                    if (scheduledInstancesEbsEbs != null) {
                        if (scheduledInstancesEbsEbs.getSnapshotId() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(scheduledInstancesEbsEbs.getSnapshotId()));
                        }
                        if (scheduledInstancesEbsEbs.getVolumeSize() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(scheduledInstancesEbsEbs.getVolumeSize()));
                        }
                        if (scheduledInstancesEbsEbs.isDeleteOnTermination() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(scheduledInstancesEbsEbs.isDeleteOnTermination()));
                        }
                        if (scheduledInstancesEbsEbs.getVolumeType() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType", StringUtils.fromString(scheduledInstancesEbsEbs.getVolumeType()));
                        }
                        if (scheduledInstancesEbsEbs.getIops() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(scheduledInstancesEbsEbs.getIops()));
                        }
                        if (scheduledInstancesEbsEbs.isEncrypted() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted", StringUtils.fromBoolean(scheduledInstancesEbsEbs.isEncrypted()));
                        }
                    }
                }

                blockDeviceMappingsListIndex++;
            }
            ScheduledInstancesMonitoring scheduledInstancesMonitoringMonitoring = scheduledInstancesLaunchSpecificationLaunchSpecification.getMonitoring();
            if (scheduledInstancesMonitoringMonitoring != null) {
                if (scheduledInstancesMonitoringMonitoring.isEnabled() != null) {
                    request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(scheduledInstancesMonitoringMonitoring.isEnabled()));
                }
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(scheduledInstancesLaunchSpecificationLaunchSpecification.getSubnetId()));
            }

            java.util.List<ScheduledInstancesNetworkInterface> networkInterfacesList = scheduledInstancesLaunchSpecificationLaunchSpecification.getNetworkInterfaces();
            int networkInterfacesListIndex = 1;

            for (ScheduledInstancesNetworkInterface networkInterfacesListValue : networkInterfacesList) {
                ScheduledInstancesNetworkInterface scheduledInstancesNetworkInterfaceMember = networkInterfacesListValue;
                if (scheduledInstancesNetworkInterfaceMember != null) {
                    if (scheduledInstancesNetworkInterfaceMember.getNetworkInterfaceId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId", StringUtils.fromString(scheduledInstancesNetworkInterfaceMember.getNetworkInterfaceId()));
                    }
                    if (scheduledInstancesNetworkInterfaceMember.getDeviceIndex() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex", StringUtils.fromInteger(scheduledInstancesNetworkInterfaceMember.getDeviceIndex()));
                    }
                    if (scheduledInstancesNetworkInterfaceMember.getSubnetId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SubnetId", StringUtils.fromString(scheduledInstancesNetworkInterfaceMember.getSubnetId()));
                    }
                    if (scheduledInstancesNetworkInterfaceMember.getDescription() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Description", StringUtils.fromString(scheduledInstancesNetworkInterfaceMember.getDescription()));
                    }
                    if (scheduledInstancesNetworkInterfaceMember.getPrivateIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress", StringUtils.fromString(scheduledInstancesNetworkInterfaceMember.getPrivateIpAddress()));
                    }

                    java.util.List<ScheduledInstancesPrivateIpAddressConfig> privateIpAddressConfigsList = scheduledInstancesNetworkInterfaceMember.getPrivateIpAddressConfigs();
                    int privateIpAddressConfigsListIndex = 1;

                    for (ScheduledInstancesPrivateIpAddressConfig privateIpAddressConfigsListValue : privateIpAddressConfigsList) {
                        ScheduledInstancesPrivateIpAddressConfig scheduledInstancesPrivateIpAddressConfigMember = privateIpAddressConfigsListValue;
                        if (scheduledInstancesPrivateIpAddressConfigMember != null) {
                            if (scheduledInstancesPrivateIpAddressConfigMember.getPrivateIpAddress() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddressConfig." + privateIpAddressConfigsListIndex + ".PrivateIpAddress", StringUtils.fromString(scheduledInstancesPrivateIpAddressConfigMember.getPrivateIpAddress()));
                            }
                            if (scheduledInstancesPrivateIpAddressConfigMember.isPrimary() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddressConfig." + privateIpAddressConfigsListIndex + ".Primary", StringUtils.fromBoolean(scheduledInstancesPrivateIpAddressConfigMember.isPrimary()));
                            }
                        }

                        privateIpAddressConfigsListIndex++;
                    }
                    if (scheduledInstancesNetworkInterfaceMember.getSecondaryPrivateIpAddressCount() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount", StringUtils.fromInteger(scheduledInstancesNetworkInterfaceMember.getSecondaryPrivateIpAddressCount()));
                    }
                    if (scheduledInstancesNetworkInterfaceMember.isAssociatePublicIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress", StringUtils.fromBoolean(scheduledInstancesNetworkInterfaceMember.isAssociatePublicIpAddress()));
                    }

                    java.util.List<String> groupsList = scheduledInstancesNetworkInterfaceMember.getGroups();
                    int groupsListIndex = 1;

                    for (String groupsListValue : groupsList) {
                        if (groupsListValue != null) {
                            request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Group." + groupsListIndex, StringUtils.fromString(groupsListValue));
                        }

                        groupsListIndex++;
                    }
                    if (scheduledInstancesNetworkInterfaceMember.isDeleteOnTermination() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination", StringUtils.fromBoolean(scheduledInstancesNetworkInterfaceMember.isDeleteOnTermination()));
                    }
                }

                networkInterfacesListIndex++;
            }
            ScheduledInstancesIamInstanceProfile scheduledInstancesIamInstanceProfileIamInstanceProfile = scheduledInstancesLaunchSpecificationLaunchSpecification.getIamInstanceProfile();
            if (scheduledInstancesIamInstanceProfileIamInstanceProfile != null) {
                if (scheduledInstancesIamInstanceProfileIamInstanceProfile.getArn() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Arn", StringUtils.fromString(scheduledInstancesIamInstanceProfileIamInstanceProfile.getArn()));
                }
                if (scheduledInstancesIamInstanceProfileIamInstanceProfile.getName() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Name", StringUtils.fromString(scheduledInstancesIamInstanceProfileIamInstanceProfile.getName()));
                }
            }
            if (scheduledInstancesLaunchSpecificationLaunchSpecification.isEbsOptimized() != null) {
                request.addParameter("LaunchSpecification.EbsOptimized", StringUtils.fromBoolean(scheduledInstancesLaunchSpecificationLaunchSpecification.isEbsOptimized()));
            }
        }

        return request;
    }
}
