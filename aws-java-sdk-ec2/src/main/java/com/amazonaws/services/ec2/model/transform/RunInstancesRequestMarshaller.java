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

/**
 * RunInstancesRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunInstancesRequestMarshaller implements Marshaller<Request<RunInstancesRequest>, RunInstancesRequest> {

    public Request<RunInstancesRequest> marshall(RunInstancesRequest runInstancesRequest) {

        if (runInstancesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RunInstancesRequest> request = new DefaultRequest<RunInstancesRequest>(runInstancesRequest, "AmazonEC2");
        request.addParameter("Action", "RunInstances");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

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

        com.amazonaws.internal.SdkInternalList<String> runInstancesRequestSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) runInstancesRequest
                .getSecurityGroups();
        if (!runInstancesRequestSecurityGroupsList.isEmpty() || !runInstancesRequestSecurityGroupsList.isAutoConstruct()) {
            int securityGroupsListIndex = 1;

            for (String runInstancesRequestSecurityGroupsListValue : runInstancesRequestSecurityGroupsList) {
                if (runInstancesRequestSecurityGroupsListValue != null) {
                    request.addParameter("SecurityGroup." + securityGroupsListIndex, StringUtils.fromString(runInstancesRequestSecurityGroupsListValue));
                }
                securityGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> runInstancesRequestSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) runInstancesRequest
                .getSecurityGroupIds();
        if (!runInstancesRequestSecurityGroupIdsList.isEmpty() || !runInstancesRequestSecurityGroupIdsList.isAutoConstruct()) {
            int securityGroupIdsListIndex = 1;

            for (String runInstancesRequestSecurityGroupIdsListValue : runInstancesRequestSecurityGroupIdsList) {
                if (runInstancesRequestSecurityGroupIdsListValue != null) {
                    request.addParameter("SecurityGroupId." + securityGroupIdsListIndex, StringUtils.fromString(runInstancesRequestSecurityGroupIdsListValue));
                }
                securityGroupIdsListIndex++;
            }
        }

        if (runInstancesRequest.getUserData() != null) {
            request.addParameter("UserData", StringUtils.fromString(runInstancesRequest.getUserData()));
        }

        if (runInstancesRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(runInstancesRequest.getInstanceType()));
        }

        Placement placement = runInstancesRequest.getPlacement();
        if (placement != null) {

            if (placement.getAvailabilityZone() != null) {
                request.addParameter("Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
            }

            if (placement.getGroupName() != null) {
                request.addParameter("Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
            }

            if (placement.getTenancy() != null) {
                request.addParameter("Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
            }

            if (placement.getHostId() != null) {
                request.addParameter("Placement.HostId", StringUtils.fromString(placement.getHostId()));
            }

            if (placement.getAffinity() != null) {
                request.addParameter("Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
            }
        }

        if (runInstancesRequest.getKernelId() != null) {
            request.addParameter("KernelId", StringUtils.fromString(runInstancesRequest.getKernelId()));
        }

        if (runInstancesRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId", StringUtils.fromString(runInstancesRequest.getRamdiskId()));
        }

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> runInstancesRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) runInstancesRequest
                .getBlockDeviceMappings();
        if (!runInstancesRequestBlockDeviceMappingsList.isEmpty() || !runInstancesRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping runInstancesRequestBlockDeviceMappingsListValue : runInstancesRequestBlockDeviceMappingsList) {

                if (runInstancesRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getVirtualName()));
                }

                if (runInstancesRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                EbsBlockDevice ebs = runInstancesRequestBlockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                StringUtils.fromString(ebs.getSnapshotId()));
                    }

                    if (ebs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                StringUtils.fromInteger(ebs.getVolumeSize()));
                    }

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                StringUtils.fromString(ebs.getVolumeType()));
                    }

                    if (ebs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                    }

                    if (ebs.getEncrypted() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                StringUtils.fromBoolean(ebs.getEncrypted()));
                    }
                }

                if (runInstancesRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (runInstancesRequest.getMonitoring() != null) {
            request.addParameter("Monitoring.Enabled", StringUtils.fromBoolean(runInstancesRequest.getMonitoring()));
        }

        if (runInstancesRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }

        if (runInstancesRequest.getDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination", StringUtils.fromBoolean(runInstancesRequest.getDisableApiTermination()));
        }

        if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior", StringUtils.fromString(runInstancesRequest.getInstanceInitiatedShutdownBehavior()));
        }

        if (runInstancesRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> runInstancesRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) runInstancesRequest
                .getIpv6Addresses();
        if (!runInstancesRequestIpv6AddressesList.isEmpty() || !runInstancesRequestIpv6AddressesList.isAutoConstruct()) {
            int ipv6AddressesListIndex = 1;

            for (InstanceIpv6Address runInstancesRequestIpv6AddressesListValue : runInstancesRequestIpv6AddressesList) {

                if (runInstancesRequestIpv6AddressesListValue.getIpv6Address() != null) {
                    request.addParameter("Ipv6Address." + ipv6AddressesListIndex + ".Ipv6Address",
                            StringUtils.fromString(runInstancesRequestIpv6AddressesListValue.getIpv6Address()));
                }
                ipv6AddressesListIndex++;
            }
        }

        if (runInstancesRequest.getIpv6AddressCount() != null) {
            request.addParameter("Ipv6AddressCount", StringUtils.fromInteger(runInstancesRequest.getIpv6AddressCount()));
        }

        if (runInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(runInstancesRequest.getClientToken()));
        }

        if (runInstancesRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(runInstancesRequest.getAdditionalInfo()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> runInstancesRequestNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) runInstancesRequest
                .getNetworkInterfaces();
        if (!runInstancesRequestNetworkInterfacesList.isEmpty() || !runInstancesRequestNetworkInterfacesList.isAutoConstruct()) {
            int networkInterfacesListIndex = 1;

            for (InstanceNetworkInterfaceSpecification runInstancesRequestNetworkInterfacesListValue : runInstancesRequestNetworkInterfacesList) {

                if (runInstancesRequestNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getNetworkInterfaceId()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDeviceIndex() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getDeviceIndex()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getSubnetId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SubnetId",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getSubnetId()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDescription() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".Description",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getDescription()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getPrivateIpAddress()));
                }

                com.amazonaws.internal.SdkInternalList<String> instanceNetworkInterfaceSpecificationGroupsList = (com.amazonaws.internal.SdkInternalList<String>) runInstancesRequestNetworkInterfacesListValue
                        .getGroups();
                if (!instanceNetworkInterfaceSpecificationGroupsList.isEmpty() || !instanceNetworkInterfaceSpecificationGroupsList.isAutoConstruct()) {
                    int groupsListIndex = 1;

                    for (String instanceNetworkInterfaceSpecificationGroupsListValue : instanceNetworkInterfaceSpecificationGroupsList) {
                        if (instanceNetworkInterfaceSpecificationGroupsListValue != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex,
                                    StringUtils.fromString(instanceNetworkInterfaceSpecificationGroupsListValue));
                        }
                        groupsListIndex++;
                    }
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination",
                            StringUtils.fromBoolean(runInstancesRequestNetworkInterfacesListValue.getDeleteOnTermination()));
                }

                com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> instanceNetworkInterfaceSpecificationPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) runInstancesRequestNetworkInterfacesListValue
                        .getPrivateIpAddresses();
                if (!instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isEmpty()
                        || !instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isAutoConstruct()) {
                    int privateIpAddressesListIndex = 1;

                    for (PrivateIpAddressSpecification instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue : instanceNetworkInterfaceSpecificationPrivateIpAddressesList) {

                        if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                    + ".PrivateIpAddress",
                                    StringUtils.fromString(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress()));
                        }

                        if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                    + ".Primary", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary()));
                        }
                        privateIpAddressesListIndex++;
                    }
                }

                if (runInstancesRequestNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                            StringUtils.fromBoolean(runInstancesRequestNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                }

                com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> instanceNetworkInterfaceSpecificationIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) runInstancesRequestNetworkInterfacesListValue
                        .getIpv6Addresses();
                if (!instanceNetworkInterfaceSpecificationIpv6AddressesList.isEmpty()
                        || !instanceNetworkInterfaceSpecificationIpv6AddressesList.isAutoConstruct()) {
                    int ipv6AddressesListIndex = 1;

                    for (InstanceIpv6Address instanceNetworkInterfaceSpecificationIpv6AddressesListValue : instanceNetworkInterfaceSpecificationIpv6AddressesList) {

                        if (instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address() != null) {
                            request.addParameter(
                                    "NetworkInterface." + networkInterfacesListIndex + ".Ipv6Addresses." + ipv6AddressesListIndex + ".Ipv6Address",
                                    StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address()));
                        }
                        ipv6AddressesListIndex++;
                    }
                }

                if (runInstancesRequestNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".Ipv6AddressCount",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getIpv6AddressCount()));
                }
                networkInterfacesListIndex++;
            }
        }

        IamInstanceProfileSpecification iamInstanceProfile = runInstancesRequest.getIamInstanceProfile();
        if (iamInstanceProfile != null) {

            if (iamInstanceProfile.getArn() != null) {
                request.addParameter("IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfile.getArn()));
            }

            if (iamInstanceProfile.getName() != null) {
                request.addParameter("IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfile.getName()));
            }
        }

        if (runInstancesRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils.fromBoolean(runInstancesRequest.getEbsOptimized()));
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> runInstancesRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) runInstancesRequest
                .getTagSpecifications();
        if (!runInstancesRequestTagSpecificationsList.isEmpty() || !runInstancesRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification runInstancesRequestTagSpecificationsListValue : runInstancesRequestTagSpecificationsList) {

                if (runInstancesRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(runInstancesRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) runInstancesRequestTagSpecificationsListValue
                        .getTags();
                if (!tagSpecificationTagsList.isEmpty() || !tagSpecificationTagsList.isAutoConstruct()) {
                    int tagsListIndex = 1;

                    for (Tag tagSpecificationTagsListValue : tagSpecificationTagsList) {

                        if (tagSpecificationTagsListValue.getKey() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getKey()));
                        }

                        if (tagSpecificationTagsListValue.getValue() != null) {
                            request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                    StringUtils.fromString(tagSpecificationTagsListValue.getValue()));
                        }
                        tagsListIndex++;
                    }
                }
                tagSpecificationsListIndex++;
            }
        }

        return request;
    }

}
