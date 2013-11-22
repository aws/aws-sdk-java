/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Run Instances Request Marshaller
 */
public class RunInstancesRequestMarshaller implements Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(RunInstancesRequest runInstancesRequest) {

        if (runInstancesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(runInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunInstances");
        request.addParameter("Version", "2013-10-15");

        if (runInstancesRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(runInstancesRequest.getImageId()));
        }
        if (runInstancesRequest.getMinCount() != null) {
            request.addParameter("MinCount", StringUtils.fromInteger(runInstancesRequest.getMinCount()));
        }
        if (runInstancesRequest.getMaxCount() != null) {
            request.addParameter("MaxCount", StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
        }
        if (runInstancesRequest.getKeyName() != null) {
            request.addParameter("KeyName", StringUtils.fromString(runInstancesRequest.getKeyName()));
        }

        java.util.List<String> securityGroupsList = runInstancesRequest.getSecurityGroups();
        int securityGroupsListIndex = 1;

        for (String securityGroupsListValue : securityGroupsList) {
            if (securityGroupsListValue != null) {
                request.addParameter("SecurityGroup." + securityGroupsListIndex, StringUtils.fromString(securityGroupsListValue));
            }

            securityGroupsListIndex++;
        }

        java.util.List<String> securityGroupIdsList = runInstancesRequest.getSecurityGroupIds();
        int securityGroupIdsListIndex = 1;

        for (String securityGroupIdsListValue : securityGroupIdsList) {
            if (securityGroupIdsListValue != null) {
                request.addParameter("SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(securityGroupIdsListValue));
            }

            securityGroupIdsListIndex++;
        }
        if (runInstancesRequest.getUserData() != null) {
            request.addParameter("UserData", StringUtils.fromString(runInstancesRequest.getUserData()));
        }
        if (runInstancesRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(runInstancesRequest.getInstanceType()));
        }
        Placement placementPlacement = runInstancesRequest.getPlacement();
        if (placementPlacement != null) {
            if (placementPlacement.getAvailabilityZone() != null) {
                request.addParameter("Placement.AvailabilityZone", StringUtils.fromString(placementPlacement.getAvailabilityZone()));
            }
            if (placementPlacement.getGroupName() != null) {
                request.addParameter("Placement.GroupName", StringUtils.fromString(placementPlacement.getGroupName()));
            }
            if (placementPlacement.getTenancy() != null) {
                request.addParameter("Placement.Tenancy", StringUtils.fromString(placementPlacement.getTenancy()));
            }
        }
        if (runInstancesRequest.getKernelId() != null) {
            request.addParameter("KernelId", StringUtils.fromString(runInstancesRequest.getKernelId()));
        }
        if (runInstancesRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId", StringUtils.fromString(runInstancesRequest.getRamdiskId()));
        }

        java.util.List<BlockDeviceMapping> blockDeviceMappingsList = runInstancesRequest.getBlockDeviceMappings();
        int blockDeviceMappingsListIndex = 1;

        for (BlockDeviceMapping blockDeviceMappingsListValue : blockDeviceMappingsList) {
            BlockDeviceMapping blockDeviceMappingMember = blockDeviceMappingsListValue;
            if (blockDeviceMappingMember != null) {
                if (blockDeviceMappingMember.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName", StringUtils.fromString(blockDeviceMappingMember.getVirtualName()));
                }
                if (blockDeviceMappingMember.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName", StringUtils.fromString(blockDeviceMappingMember.getDeviceName()));
                }
                EbsBlockDevice ebsBlockDeviceEbs = blockDeviceMappingMember.getEbs();
                if (ebsBlockDeviceEbs != null) {
                    if (ebsBlockDeviceEbs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId", StringUtils.fromString(ebsBlockDeviceEbs.getSnapshotId()));
                    }
                    if (ebsBlockDeviceEbs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize", StringUtils.fromInteger(ebsBlockDeviceEbs.getVolumeSize()));
                    }
                    if (ebsBlockDeviceEbs.isDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination", StringUtils.fromBoolean(ebsBlockDeviceEbs.isDeleteOnTermination()));
                    }
                    if (ebsBlockDeviceEbs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType", StringUtils.fromString(ebsBlockDeviceEbs.getVolumeType()));
                    }
                    if (ebsBlockDeviceEbs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebsBlockDeviceEbs.getIops()));
                    }
                }
                if (blockDeviceMappingMember.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice", StringUtils.fromString(blockDeviceMappingMember.getNoDevice()));
                }
            }

            blockDeviceMappingsListIndex++;
        }
        if (runInstancesRequest.isMonitoring() != null) {
            request.addParameter("Monitoring.Enabled", StringUtils.fromBoolean(runInstancesRequest.isMonitoring()));
        }
        if (runInstancesRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }
        if (runInstancesRequest.isDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination", StringUtils.fromBoolean(runInstancesRequest.isDisableApiTermination()));
        }
        if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior", StringUtils.fromString(runInstancesRequest.getInstanceInitiatedShutdownBehavior()));
        }
        InstanceLicenseSpecification instanceLicenseSpecificationLicense = runInstancesRequest.getLicense();
        if (instanceLicenseSpecificationLicense != null) {
            if (instanceLicenseSpecificationLicense.getPool() != null) {
                request.addParameter("License.Pool", StringUtils.fromString(instanceLicenseSpecificationLicense.getPool()));
            }
        }
        if (runInstancesRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
        }
        if (runInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(runInstancesRequest.getClientToken()));
        }
        if (runInstancesRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(runInstancesRequest.getAdditionalInfo()));
        }

        java.util.List<InstanceNetworkInterfaceSpecification> networkInterfacesList = runInstancesRequest.getNetworkInterfaces();
        int networkInterfacesListIndex = 1;

        for (InstanceNetworkInterfaceSpecification networkInterfacesListValue : networkInterfacesList) {
            InstanceNetworkInterfaceSpecification instanceNetworkInterfaceSpecificationMember = networkInterfacesListValue;
            if (instanceNetworkInterfaceSpecificationMember != null) {
                if (instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getNetworkInterfaceId()));
                }
                if (instanceNetworkInterfaceSpecificationMember.getDeviceIndex() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex", StringUtils.fromInteger(instanceNetworkInterfaceSpecificationMember.getDeviceIndex()));
                }
                if (instanceNetworkInterfaceSpecificationMember.getSubnetId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SubnetId", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getSubnetId()));
                }
                if (instanceNetworkInterfaceSpecificationMember.getDescription() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".Description", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getDescription()));
                }
                if (instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress", StringUtils.fromString(instanceNetworkInterfaceSpecificationMember.getPrivateIpAddress()));
                }

                java.util.List<String> groupsList = instanceNetworkInterfaceSpecificationMember.getGroups();
                int groupsListIndex = 1;

                for (String groupsListValue : groupsList) {
                    if (groupsListValue != null) {
                        request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex, StringUtils.fromString(groupsListValue));
                    }

                    groupsListIndex++;
                }
                if (instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationMember.isDeleteOnTermination()));
                }

                java.util.List<PrivateIpAddressSpecification> privateIpAddressesList = instanceNetworkInterfaceSpecificationMember.getPrivateIpAddresses();
                int privateIpAddressesListIndex = 1;

                for (PrivateIpAddressSpecification privateIpAddressesListValue : privateIpAddressesList) {
                    PrivateIpAddressSpecification privateIpAddressSpecificationMember = privateIpAddressesListValue;
                    if (privateIpAddressSpecificationMember != null) {
                        if (privateIpAddressSpecificationMember.getPrivateIpAddress() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex + ".PrivateIpAddress", StringUtils.fromString(privateIpAddressSpecificationMember.getPrivateIpAddress()));
                        }
                        if (privateIpAddressSpecificationMember.isPrimary() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex + ".Primary", StringUtils.fromBoolean(privateIpAddressSpecificationMember.isPrimary()));
                        }
                    }

                    privateIpAddressesListIndex++;
                }
                if (instanceNetworkInterfaceSpecificationMember.getSecondaryPrivateIpAddressCount() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount", StringUtils.fromInteger(instanceNetworkInterfaceSpecificationMember.getSecondaryPrivateIpAddressCount()));
                }
                if (instanceNetworkInterfaceSpecificationMember.isAssociatePublicIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationMember.isAssociatePublicIpAddress()));
                }
            }

            networkInterfacesListIndex++;
        }
        IamInstanceProfileSpecification iamInstanceProfileSpecificationIamInstanceProfile = runInstancesRequest.getIamInstanceProfile();
        if (iamInstanceProfileSpecificationIamInstanceProfile != null) {
            if (iamInstanceProfileSpecificationIamInstanceProfile.getArn() != null) {
                request.addParameter("IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfileSpecificationIamInstanceProfile.getArn()));
            }
            if (iamInstanceProfileSpecificationIamInstanceProfile.getName() != null) {
                request.addParameter("IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfileSpecificationIamInstanceProfile.getName()));
            }
        }
        if (runInstancesRequest.isEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils.fromBoolean(runInstancesRequest.isEbsOptimized()));
        }


        return request;
    }
}
