/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.IdempotentUtils;

/**
 * RunScheduledInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunScheduledInstancesRequestMarshaller implements Marshaller<Request<RunScheduledInstancesRequest>, RunScheduledInstancesRequest> {

    public Request<RunScheduledInstancesRequest> marshall(RunScheduledInstancesRequest runScheduledInstancesRequest) {

        if (runScheduledInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunScheduledInstancesRequest> request = new DefaultRequest<RunScheduledInstancesRequest>(runScheduledInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunScheduledInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        request.addParameter("ClientToken", IdempotentUtils.resolveString(runScheduledInstancesRequest.getClientToken()));

        if (runScheduledInstancesRequest.getInstanceCount() != null) {
            request.addParameter("InstanceCount", StringUtils.fromInteger(runScheduledInstancesRequest.getInstanceCount()));
        }

        if (runScheduledInstancesRequest.getScheduledInstanceId() != null) {
            request.addParameter("ScheduledInstanceId", StringUtils.fromString(runScheduledInstancesRequest.getScheduledInstanceId()));
        }

        ScheduledInstancesLaunchSpecification launchSpecification = runScheduledInstancesRequest.getLaunchSpecification();
        if (launchSpecification != null) {

            if (launchSpecification.getImageId() != null) {
                request.addParameter("LaunchSpecification.ImageId", StringUtils.fromString(launchSpecification.getImageId()));
            }

            if (launchSpecification.getKeyName() != null) {
                request.addParameter("LaunchSpecification.KeyName", StringUtils.fromString(launchSpecification.getKeyName()));
            }

            com.amazonaws.internal.SdkInternalList<String> scheduledInstancesLaunchSpecificationSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) launchSpecification
                    .getSecurityGroupIds();
            if (!scheduledInstancesLaunchSpecificationSecurityGroupIdsList.isEmpty()
                    || !scheduledInstancesLaunchSpecificationSecurityGroupIdsList.isAutoConstruct()) {
                int securityGroupIdsListIndex = 1;

                for (String scheduledInstancesLaunchSpecificationSecurityGroupIdsListValue : scheduledInstancesLaunchSpecificationSecurityGroupIdsList) {
                    if (scheduledInstancesLaunchSpecificationSecurityGroupIdsListValue != null) {
                        request.addParameter("LaunchSpecification.SecurityGroupId." + securityGroupIdsListIndex,
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationSecurityGroupIdsListValue));
                    }
                    securityGroupIdsListIndex++;
                }
            }

            if (launchSpecification.getUserData() != null) {
                request.addParameter("LaunchSpecification.UserData", StringUtils.fromString(launchSpecification.getUserData()));
            }

            ScheduledInstancesPlacement placement = launchSpecification.getPlacement();
            if (placement != null) {

                if (placement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchSpecification.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                }

                if (placement.getGroupName() != null) {
                    request.addParameter("LaunchSpecification.Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                }
            }

            if (launchSpecification.getKernelId() != null) {
                request.addParameter("LaunchSpecification.KernelId", StringUtils.fromString(launchSpecification.getKernelId()));
            }

            if (launchSpecification.getInstanceType() != null) {
                request.addParameter("LaunchSpecification.InstanceType", StringUtils.fromString(launchSpecification.getInstanceType()));
            }

            if (launchSpecification.getRamdiskId() != null) {
                request.addParameter("LaunchSpecification.RamdiskId", StringUtils.fromString(launchSpecification.getRamdiskId()));
            }

            com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping> scheduledInstancesLaunchSpecificationBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesBlockDeviceMapping>) launchSpecification
                    .getBlockDeviceMappings();
            if (!scheduledInstancesLaunchSpecificationBlockDeviceMappingsList.isEmpty()
                    || !scheduledInstancesLaunchSpecificationBlockDeviceMappingsList.isAutoConstruct()) {
                int blockDeviceMappingsListIndex = 1;

                for (ScheduledInstancesBlockDeviceMapping scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue : scheduledInstancesLaunchSpecificationBlockDeviceMappingsList) {

                    if (scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName()));
                    }

                    if (scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice()));
                    }

                    if (scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName()));
                    }

                    ScheduledInstancesEbs ebs = scheduledInstancesLaunchSpecificationBlockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {

                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                    StringUtils.fromString(ebs.getSnapshotId()));
                        }

                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                    StringUtils.fromInteger(ebs.getVolumeSize()));
                        }

                        if (ebs.getDeleteOnTermination() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                    StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                        }

                        if (ebs.getVolumeType() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                    StringUtils.fromString(ebs.getVolumeType()));
                        }

                        if (ebs.getIops() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops",
                                    StringUtils.fromInteger(ebs.getIops()));
                        }

                        if (ebs.getEncrypted() != null) {
                            request.addParameter("LaunchSpecification.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                    StringUtils.fromBoolean(ebs.getEncrypted()));
                        }
                    }
                    blockDeviceMappingsListIndex++;
                }
            }

            ScheduledInstancesMonitoring monitoring = launchSpecification.getMonitoring();
            if (monitoring != null) {

                if (monitoring.getEnabled() != null) {
                    request.addParameter("LaunchSpecification.Monitoring.Enabled", StringUtils.fromBoolean(monitoring.getEnabled()));
                }
            }

            if (launchSpecification.getSubnetId() != null) {
                request.addParameter("LaunchSpecification.SubnetId", StringUtils.fromString(launchSpecification.getSubnetId()));
            }

            com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface> scheduledInstancesLaunchSpecificationNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesNetworkInterface>) launchSpecification
                    .getNetworkInterfaces();
            if (!scheduledInstancesLaunchSpecificationNetworkInterfacesList.isEmpty()
                    || !scheduledInstancesLaunchSpecificationNetworkInterfacesList.isAutoConstruct()) {
                int networkInterfacesListIndex = 1;

                for (ScheduledInstancesNetworkInterface scheduledInstancesLaunchSpecificationNetworkInterfacesListValue : scheduledInstancesLaunchSpecificationNetworkInterfacesList) {

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId()));
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex",
                                StringUtils.fromInteger(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex()));
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getSubnetId() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SubnetId",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getSubnetId()));
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDescription() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Description",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDescription()));
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress",
                                StringUtils.fromString(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress()));
                    }

                    com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig> scheduledInstancesNetworkInterfacePrivateIpAddressConfigsList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesPrivateIpAddressConfig>) scheduledInstancesLaunchSpecificationNetworkInterfacesListValue
                            .getPrivateIpAddressConfigs();
                    if (!scheduledInstancesNetworkInterfacePrivateIpAddressConfigsList.isEmpty()
                            || !scheduledInstancesNetworkInterfacePrivateIpAddressConfigsList.isAutoConstruct()) {
                        int privateIpAddressConfigsListIndex = 1;

                        for (ScheduledInstancesPrivateIpAddressConfig scheduledInstancesNetworkInterfacePrivateIpAddressConfigsListValue : scheduledInstancesNetworkInterfacePrivateIpAddressConfigsList) {

                            if (scheduledInstancesNetworkInterfacePrivateIpAddressConfigsListValue.getPrivateIpAddress() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddressConfig."
                                        + privateIpAddressConfigsListIndex + ".PrivateIpAddress",
                                        StringUtils.fromString(scheduledInstancesNetworkInterfacePrivateIpAddressConfigsListValue.getPrivateIpAddress()));
                            }

                            if (scheduledInstancesNetworkInterfacePrivateIpAddressConfigsListValue.getPrimary() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddressConfig."
                                        + privateIpAddressConfigsListIndex + ".Primary",
                                        StringUtils.fromBoolean(scheduledInstancesNetworkInterfacePrivateIpAddressConfigsListValue.getPrimary()));
                            }
                            privateIpAddressConfigsListIndex++;
                        }
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                                StringUtils.fromInteger(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                                StringUtils.fromBoolean(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                    }

                    com.amazonaws.internal.SdkInternalList<String> scheduledInstancesNetworkInterfaceGroupsList = (com.amazonaws.internal.SdkInternalList<String>) scheduledInstancesLaunchSpecificationNetworkInterfacesListValue
                            .getGroups();
                    if (!scheduledInstancesNetworkInterfaceGroupsList.isEmpty() || !scheduledInstancesNetworkInterfaceGroupsList.isAutoConstruct()) {
                        int groupsListIndex = 1;

                        for (String scheduledInstancesNetworkInterfaceGroupsListValue : scheduledInstancesNetworkInterfaceGroupsList) {
                            if (scheduledInstancesNetworkInterfaceGroupsListValue != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Group." + groupsListIndex,
                                        StringUtils.fromString(scheduledInstancesNetworkInterfaceGroupsListValue));
                            }
                            groupsListIndex++;
                        }
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination",
                                StringUtils.fromBoolean(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination()));
                    }

                    com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address> scheduledInstancesNetworkInterfaceIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<ScheduledInstancesIpv6Address>) scheduledInstancesLaunchSpecificationNetworkInterfacesListValue
                            .getIpv6Addresses();
                    if (!scheduledInstancesNetworkInterfaceIpv6AddressesList.isEmpty()
                            || !scheduledInstancesNetworkInterfaceIpv6AddressesList.isAutoConstruct()) {
                        int ipv6AddressesListIndex = 1;

                        for (ScheduledInstancesIpv6Address scheduledInstancesNetworkInterfaceIpv6AddressesListValue : scheduledInstancesNetworkInterfaceIpv6AddressesList) {

                            if (scheduledInstancesNetworkInterfaceIpv6AddressesListValue.getIpv6Address() != null) {
                                request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Ipv6Address."
                                        + ipv6AddressesListIndex + ".Ipv6Address",
                                        StringUtils.fromString(scheduledInstancesNetworkInterfaceIpv6AddressesListValue.getIpv6Address()));
                            }
                            ipv6AddressesListIndex++;
                        }
                    }

                    if (scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                        request.addParameter("LaunchSpecification.NetworkInterface." + networkInterfacesListIndex + ".Ipv6AddressCount",
                                StringUtils.fromInteger(scheduledInstancesLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount()));
                    }
                    networkInterfacesListIndex++;
                }
            }

            ScheduledInstancesIamInstanceProfile iamInstanceProfile = launchSpecification.getIamInstanceProfile();
            if (iamInstanceProfile != null) {

                if (iamInstanceProfile.getArn() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfile.getArn()));
                }

                if (iamInstanceProfile.getName() != null) {
                    request.addParameter("LaunchSpecification.IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfile.getName()));
                }
            }

            if (launchSpecification.getEbsOptimized() != null) {
                request.addParameter("LaunchSpecification.EbsOptimized", StringUtils.fromBoolean(launchSpecification.getEbsOptimized()));
            }
        }

        return request;
    }

}
