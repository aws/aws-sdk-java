/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * CreateLaunchTemplateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchTemplateRequestMarshaller implements Marshaller<Request<CreateLaunchTemplateRequest>, CreateLaunchTemplateRequest> {

    public Request<CreateLaunchTemplateRequest> marshall(CreateLaunchTemplateRequest createLaunchTemplateRequest) {

        if (createLaunchTemplateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLaunchTemplateRequest> request = new DefaultRequest<CreateLaunchTemplateRequest>(createLaunchTemplateRequest, "AmazonEC2");
        request.addParameter("Action", "CreateLaunchTemplate");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createLaunchTemplateRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(createLaunchTemplateRequest.getClientToken()));
        }

        if (createLaunchTemplateRequest.getLaunchTemplateName() != null) {
            request.addParameter("LaunchTemplateName", StringUtils.fromString(createLaunchTemplateRequest.getLaunchTemplateName()));
        }

        if (createLaunchTemplateRequest.getVersionDescription() != null) {
            request.addParameter("VersionDescription", StringUtils.fromString(createLaunchTemplateRequest.getVersionDescription()));
        }

        RequestLaunchTemplateData launchTemplateData = createLaunchTemplateRequest.getLaunchTemplateData();
        if (launchTemplateData != null) {

            if (launchTemplateData.getKernelId() != null) {
                request.addParameter("LaunchTemplateData.KernelId", StringUtils.fromString(launchTemplateData.getKernelId()));
            }

            if (launchTemplateData.getEbsOptimized() != null) {
                request.addParameter("LaunchTemplateData.EbsOptimized", StringUtils.fromBoolean(launchTemplateData.getEbsOptimized()));
            }

            LaunchTemplateIamInstanceProfileSpecificationRequest iamInstanceProfile = launchTemplateData.getIamInstanceProfile();
            if (iamInstanceProfile != null) {

                if (iamInstanceProfile.getArn() != null) {
                    request.addParameter("LaunchTemplateData.IamInstanceProfile.Arn", StringUtils.fromString(iamInstanceProfile.getArn()));
                }

                if (iamInstanceProfile.getName() != null) {
                    request.addParameter("LaunchTemplateData.IamInstanceProfile.Name", StringUtils.fromString(iamInstanceProfile.getName()));
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest> requestLaunchTemplateDataBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateBlockDeviceMappingRequest>) launchTemplateData
                    .getBlockDeviceMappings();
            if (!requestLaunchTemplateDataBlockDeviceMappingsList.isEmpty() || !requestLaunchTemplateDataBlockDeviceMappingsList.isAutoConstruct()) {
                int blockDeviceMappingsListIndex = 1;

                for (LaunchTemplateBlockDeviceMappingRequest requestLaunchTemplateDataBlockDeviceMappingsListValue : requestLaunchTemplateDataBlockDeviceMappingsList) {

                    if (requestLaunchTemplateDataBlockDeviceMappingsListValue.getDeviceName() != null) {
                        request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                                StringUtils.fromString(requestLaunchTemplateDataBlockDeviceMappingsListValue.getDeviceName()));
                    }

                    if (requestLaunchTemplateDataBlockDeviceMappingsListValue.getVirtualName() != null) {
                        request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                                StringUtils.fromString(requestLaunchTemplateDataBlockDeviceMappingsListValue.getVirtualName()));
                    }

                    LaunchTemplateEbsBlockDeviceRequest ebs = requestLaunchTemplateDataBlockDeviceMappingsListValue.getEbs();
                    if (ebs != null) {

                        if (ebs.getEncrypted() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                    StringUtils.fromBoolean(ebs.getEncrypted()));
                        }

                        if (ebs.getDeleteOnTermination() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                    StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                        }

                        if (ebs.getIops() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops",
                                    StringUtils.fromInteger(ebs.getIops()));
                        }

                        if (ebs.getKmsKeyId() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.KmsKeyId",
                                    StringUtils.fromString(ebs.getKmsKeyId()));
                        }

                        if (ebs.getSnapshotId() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                    StringUtils.fromString(ebs.getSnapshotId()));
                        }

                        if (ebs.getVolumeSize() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                    StringUtils.fromInteger(ebs.getVolumeSize()));
                        }

                        if (ebs.getVolumeType() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                    StringUtils.fromString(ebs.getVolumeType()));
                        }

                        if (ebs.getThroughput() != null) {
                            request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Throughput",
                                    StringUtils.fromInteger(ebs.getThroughput()));
                        }
                    }

                    if (requestLaunchTemplateDataBlockDeviceMappingsListValue.getNoDevice() != null) {
                        request.addParameter("LaunchTemplateData.BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                                StringUtils.fromString(requestLaunchTemplateDataBlockDeviceMappingsListValue.getNoDevice()));
                    }
                    blockDeviceMappingsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest> requestLaunchTemplateDataNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateInstanceNetworkInterfaceSpecificationRequest>) launchTemplateData
                    .getNetworkInterfaces();
            if (!requestLaunchTemplateDataNetworkInterfacesList.isEmpty() || !requestLaunchTemplateDataNetworkInterfacesList.isAutoConstruct()) {
                int networkInterfacesListIndex = 1;

                for (LaunchTemplateInstanceNetworkInterfaceSpecificationRequest requestLaunchTemplateDataNetworkInterfacesListValue : requestLaunchTemplateDataNetworkInterfacesList) {

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getAssociateCarrierIpAddress() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".AssociateCarrierIpAddress",
                                StringUtils.fromBoolean(requestLaunchTemplateDataNetworkInterfacesListValue.getAssociateCarrierIpAddress()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                                StringUtils.fromBoolean(requestLaunchTemplateDataNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination",
                                StringUtils.fromBoolean(requestLaunchTemplateDataNetworkInterfacesListValue.getDeleteOnTermination()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getDescription() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Description",
                                StringUtils.fromString(requestLaunchTemplateDataNetworkInterfacesListValue.getDescription()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getDeviceIndex() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getDeviceIndex()));
                    }

                    com.amazonaws.internal.SdkInternalList<String> launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsList = (com.amazonaws.internal.SdkInternalList<String>) requestLaunchTemplateDataNetworkInterfacesListValue
                            .getGroups();
                    if (!launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsList.isEmpty()
                            || !launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsList.isAutoConstruct()) {
                        int groupsListIndex = 1;

                        for (String launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsListValue : launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsList) {
                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsListValue != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".SecurityGroupId."
                                        + groupsListIndex, StringUtils.fromString(launchTemplateInstanceNetworkInterfaceSpecificationRequestGroupsListValue));
                            }
                            groupsListIndex++;
                        }
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getInterfaceType() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".InterfaceType",
                                StringUtils.fromString(requestLaunchTemplateDataNetworkInterfacesListValue.getInterfaceType()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv6AddressCount",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getIpv6AddressCount()));
                    }

                    com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest> launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6AddressRequest>) requestLaunchTemplateDataNetworkInterfacesListValue
                            .getIpv6Addresses();
                    if (!launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesList.isEmpty()
                            || !launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesList.isAutoConstruct()) {
                        int ipv6AddressesListIndex = 1;

                        for (InstanceIpv6AddressRequest launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesListValue : launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesList) {

                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesListValue.getIpv6Address() != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv6Addresses."
                                        + ipv6AddressesListIndex + ".Ipv6Address", StringUtils
                                        .fromString(launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6AddressesListValue.getIpv6Address()));
                            }
                            ipv6AddressesListIndex++;
                        }
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId",
                                StringUtils.fromString(requestLaunchTemplateDataNetworkInterfacesListValue.getNetworkInterfaceId()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress",
                                StringUtils.fromString(requestLaunchTemplateDataNetworkInterfacesListValue.getPrivateIpAddress()));
                    }

                    com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) requestLaunchTemplateDataNetworkInterfacesListValue
                            .getPrivateIpAddresses();
                    if (!launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesList.isEmpty()
                            || !launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesList.isAutoConstruct()) {
                        int privateIpAddressesListIndex = 1;

                        for (PrivateIpAddressSpecification launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesListValue : launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesList) {

                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesListValue.getPrimary() != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses."
                                        + privateIpAddressesListIndex + ".Primary", StringUtils
                                        .fromBoolean(launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesListValue.getPrimary()));
                            }

                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses."
                                        + privateIpAddressesListIndex + ".PrivateIpAddress",
                                        StringUtils.fromString(launchTemplateInstanceNetworkInterfaceSpecificationRequestPrivateIpAddressesListValue
                                                .getPrivateIpAddress()));
                            }
                            privateIpAddressesListIndex++;
                        }
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getSubnetId() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".SubnetId",
                                StringUtils.fromString(requestLaunchTemplateDataNetworkInterfacesListValue.getSubnetId()));
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getNetworkCardIndex() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".NetworkCardIndex",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getNetworkCardIndex()));
                    }

                    com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest> launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv4PrefixSpecificationRequest>) requestLaunchTemplateDataNetworkInterfacesListValue
                            .getIpv4Prefixes();
                    if (!launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesList.isEmpty()
                            || !launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesList.isAutoConstruct()) {
                        int ipv4PrefixesListIndex = 1;

                        for (Ipv4PrefixSpecificationRequest launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesListValue : launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesList) {

                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesListValue.getIpv4Prefix() != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv4Prefix."
                                        + ipv4PrefixesListIndex + ".Ipv4Prefix",
                                        StringUtils.fromString(launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv4PrefixesListValue.getIpv4Prefix()));
                            }
                            ipv4PrefixesListIndex++;
                        }
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getIpv4PrefixCount() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv4PrefixCount",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getIpv4PrefixCount()));
                    }

                    com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest> launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesList = (com.amazonaws.internal.SdkInternalList<Ipv6PrefixSpecificationRequest>) requestLaunchTemplateDataNetworkInterfacesListValue
                            .getIpv6Prefixes();
                    if (!launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesList.isEmpty()
                            || !launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesList.isAutoConstruct()) {
                        int ipv6PrefixesListIndex = 1;

                        for (Ipv6PrefixSpecificationRequest launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesListValue : launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesList) {

                            if (launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesListValue.getIpv6Prefix() != null) {
                                request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv6Prefix."
                                        + ipv6PrefixesListIndex + ".Ipv6Prefix",
                                        StringUtils.fromString(launchTemplateInstanceNetworkInterfaceSpecificationRequestIpv6PrefixesListValue.getIpv6Prefix()));
                            }
                            ipv6PrefixesListIndex++;
                        }
                    }

                    if (requestLaunchTemplateDataNetworkInterfacesListValue.getIpv6PrefixCount() != null) {
                        request.addParameter("LaunchTemplateData.NetworkInterface." + networkInterfacesListIndex + ".Ipv6PrefixCount",
                                StringUtils.fromInteger(requestLaunchTemplateDataNetworkInterfacesListValue.getIpv6PrefixCount()));
                    }
                    networkInterfacesListIndex++;
                }
            }

            if (launchTemplateData.getImageId() != null) {
                request.addParameter("LaunchTemplateData.ImageId", StringUtils.fromString(launchTemplateData.getImageId()));
            }

            if (launchTemplateData.getInstanceType() != null) {
                request.addParameter("LaunchTemplateData.InstanceType", StringUtils.fromString(launchTemplateData.getInstanceType()));
            }

            if (launchTemplateData.getKeyName() != null) {
                request.addParameter("LaunchTemplateData.KeyName", StringUtils.fromString(launchTemplateData.getKeyName()));
            }

            LaunchTemplatesMonitoringRequest monitoring = launchTemplateData.getMonitoring();
            if (monitoring != null) {

                if (monitoring.getEnabled() != null) {
                    request.addParameter("LaunchTemplateData.Monitoring.Enabled", StringUtils.fromBoolean(monitoring.getEnabled()));
                }
            }

            LaunchTemplatePlacementRequest placement = launchTemplateData.getPlacement();
            if (placement != null) {

                if (placement.getAvailabilityZone() != null) {
                    request.addParameter("LaunchTemplateData.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                }

                if (placement.getAffinity() != null) {
                    request.addParameter("LaunchTemplateData.Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
                }

                if (placement.getGroupName() != null) {
                    request.addParameter("LaunchTemplateData.Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
                }

                if (placement.getHostId() != null) {
                    request.addParameter("LaunchTemplateData.Placement.HostId", StringUtils.fromString(placement.getHostId()));
                }

                if (placement.getTenancy() != null) {
                    request.addParameter("LaunchTemplateData.Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
                }

                if (placement.getSpreadDomain() != null) {
                    request.addParameter("LaunchTemplateData.Placement.SpreadDomain", StringUtils.fromString(placement.getSpreadDomain()));
                }

                if (placement.getHostResourceGroupArn() != null) {
                    request.addParameter("LaunchTemplateData.Placement.HostResourceGroupArn", StringUtils.fromString(placement.getHostResourceGroupArn()));
                }

                if (placement.getPartitionNumber() != null) {
                    request.addParameter("LaunchTemplateData.Placement.PartitionNumber", StringUtils.fromInteger(placement.getPartitionNumber()));
                }
            }

            if (launchTemplateData.getRamDiskId() != null) {
                request.addParameter("LaunchTemplateData.RamDiskId", StringUtils.fromString(launchTemplateData.getRamDiskId()));
            }

            if (launchTemplateData.getDisableApiTermination() != null) {
                request.addParameter("LaunchTemplateData.DisableApiTermination", StringUtils.fromBoolean(launchTemplateData.getDisableApiTermination()));
            }

            if (launchTemplateData.getInstanceInitiatedShutdownBehavior() != null) {
                request.addParameter("LaunchTemplateData.InstanceInitiatedShutdownBehavior",
                        StringUtils.fromString(launchTemplateData.getInstanceInitiatedShutdownBehavior()));
            }

            if (launchTemplateData.getUserData() != null) {
                request.addParameter("LaunchTemplateData.UserData", StringUtils.fromString(launchTemplateData.getUserData()));
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest> requestLaunchTemplateDataTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateTagSpecificationRequest>) launchTemplateData
                    .getTagSpecifications();
            if (!requestLaunchTemplateDataTagSpecificationsList.isEmpty() || !requestLaunchTemplateDataTagSpecificationsList.isAutoConstruct()) {
                int tagSpecificationsListIndex = 1;

                for (LaunchTemplateTagSpecificationRequest requestLaunchTemplateDataTagSpecificationsListValue : requestLaunchTemplateDataTagSpecificationsList) {

                    if (requestLaunchTemplateDataTagSpecificationsListValue.getResourceType() != null) {
                        request.addParameter("LaunchTemplateData.TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                                StringUtils.fromString(requestLaunchTemplateDataTagSpecificationsListValue.getResourceType()));
                    }

                    com.amazonaws.internal.SdkInternalList<Tag> launchTemplateTagSpecificationRequestTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) requestLaunchTemplateDataTagSpecificationsListValue
                            .getTags();
                    if (!launchTemplateTagSpecificationRequestTagsList.isEmpty() || !launchTemplateTagSpecificationRequestTagsList.isAutoConstruct()) {
                        int tagsListIndex = 1;

                        for (Tag launchTemplateTagSpecificationRequestTagsListValue : launchTemplateTagSpecificationRequestTagsList) {

                            if (launchTemplateTagSpecificationRequestTagsListValue.getKey() != null) {
                                request.addParameter("LaunchTemplateData.TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Key",
                                        StringUtils.fromString(launchTemplateTagSpecificationRequestTagsListValue.getKey()));
                            }

                            if (launchTemplateTagSpecificationRequestTagsListValue.getValue() != null) {
                                request.addParameter("LaunchTemplateData.TagSpecification." + tagSpecificationsListIndex + ".Tag." + tagsListIndex + ".Value",
                                        StringUtils.fromString(launchTemplateTagSpecificationRequestTagsListValue.getValue()));
                            }
                            tagsListIndex++;
                        }
                    }
                    tagSpecificationsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification> requestLaunchTemplateDataElasticGpuSpecificationsList = (com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>) launchTemplateData
                    .getElasticGpuSpecifications();
            if (!requestLaunchTemplateDataElasticGpuSpecificationsList.isEmpty() || !requestLaunchTemplateDataElasticGpuSpecificationsList.isAutoConstruct()) {
                int elasticGpuSpecificationsListIndex = 1;

                for (ElasticGpuSpecification requestLaunchTemplateDataElasticGpuSpecificationsListValue : requestLaunchTemplateDataElasticGpuSpecificationsList) {

                    if (requestLaunchTemplateDataElasticGpuSpecificationsListValue.getType() != null) {
                        request.addParameter("LaunchTemplateData.ElasticGpuSpecification." + elasticGpuSpecificationsListIndex + ".Type",
                                StringUtils.fromString(requestLaunchTemplateDataElasticGpuSpecificationsListValue.getType()));
                    }
                    elasticGpuSpecificationsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator> requestLaunchTemplateDataElasticInferenceAcceleratorsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateElasticInferenceAccelerator>) launchTemplateData
                    .getElasticInferenceAccelerators();
            if (!requestLaunchTemplateDataElasticInferenceAcceleratorsList.isEmpty()
                    || !requestLaunchTemplateDataElasticInferenceAcceleratorsList.isAutoConstruct()) {
                int elasticInferenceAcceleratorsListIndex = 1;

                for (LaunchTemplateElasticInferenceAccelerator requestLaunchTemplateDataElasticInferenceAcceleratorsListValue : requestLaunchTemplateDataElasticInferenceAcceleratorsList) {

                    if (requestLaunchTemplateDataElasticInferenceAcceleratorsListValue.getType() != null) {
                        request.addParameter("LaunchTemplateData.ElasticInferenceAccelerator." + elasticInferenceAcceleratorsListIndex + ".Type",
                                StringUtils.fromString(requestLaunchTemplateDataElasticInferenceAcceleratorsListValue.getType()));
                    }

                    if (requestLaunchTemplateDataElasticInferenceAcceleratorsListValue.getCount() != null) {
                        request.addParameter("LaunchTemplateData.ElasticInferenceAccelerator." + elasticInferenceAcceleratorsListIndex + ".Count",
                                StringUtils.fromInteger(requestLaunchTemplateDataElasticInferenceAcceleratorsListValue.getCount()));
                    }
                    elasticInferenceAcceleratorsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> requestLaunchTemplateDataSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) launchTemplateData
                    .getSecurityGroupIds();
            if (!requestLaunchTemplateDataSecurityGroupIdsList.isEmpty() || !requestLaunchTemplateDataSecurityGroupIdsList.isAutoConstruct()) {
                int securityGroupIdsListIndex = 1;

                for (String requestLaunchTemplateDataSecurityGroupIdsListValue : requestLaunchTemplateDataSecurityGroupIdsList) {
                    if (requestLaunchTemplateDataSecurityGroupIdsListValue != null) {
                        request.addParameter("LaunchTemplateData.SecurityGroupId." + securityGroupIdsListIndex,
                                StringUtils.fromString(requestLaunchTemplateDataSecurityGroupIdsListValue));
                    }
                    securityGroupIdsListIndex++;
                }
            }

            com.amazonaws.internal.SdkInternalList<String> requestLaunchTemplateDataSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) launchTemplateData
                    .getSecurityGroups();
            if (!requestLaunchTemplateDataSecurityGroupsList.isEmpty() || !requestLaunchTemplateDataSecurityGroupsList.isAutoConstruct()) {
                int securityGroupsListIndex = 1;

                for (String requestLaunchTemplateDataSecurityGroupsListValue : requestLaunchTemplateDataSecurityGroupsList) {
                    if (requestLaunchTemplateDataSecurityGroupsListValue != null) {
                        request.addParameter("LaunchTemplateData.SecurityGroup." + securityGroupsListIndex,
                                StringUtils.fromString(requestLaunchTemplateDataSecurityGroupsListValue));
                    }
                    securityGroupsListIndex++;
                }
            }

            LaunchTemplateInstanceMarketOptionsRequest instanceMarketOptions = launchTemplateData.getInstanceMarketOptions();
            if (instanceMarketOptions != null) {

                if (instanceMarketOptions.getMarketType() != null) {
                    request.addParameter("LaunchTemplateData.InstanceMarketOptions.MarketType", StringUtils.fromString(instanceMarketOptions.getMarketType()));
                }

                LaunchTemplateSpotMarketOptionsRequest spotOptions = instanceMarketOptions.getSpotOptions();
                if (spotOptions != null) {

                    if (spotOptions.getMaxPrice() != null) {
                        request.addParameter("LaunchTemplateData.InstanceMarketOptions.SpotOptions.MaxPrice", StringUtils.fromString(spotOptions.getMaxPrice()));
                    }

                    if (spotOptions.getSpotInstanceType() != null) {
                        request.addParameter("LaunchTemplateData.InstanceMarketOptions.SpotOptions.SpotInstanceType",
                                StringUtils.fromString(spotOptions.getSpotInstanceType()));
                    }

                    if (spotOptions.getBlockDurationMinutes() != null) {
                        request.addParameter("LaunchTemplateData.InstanceMarketOptions.SpotOptions.BlockDurationMinutes",
                                StringUtils.fromInteger(spotOptions.getBlockDurationMinutes()));
                    }

                    if (spotOptions.getValidUntil() != null) {
                        request.addParameter("LaunchTemplateData.InstanceMarketOptions.SpotOptions.ValidUntil",
                                StringUtils.fromDate(spotOptions.getValidUntil()));
                    }

                    if (spotOptions.getInstanceInterruptionBehavior() != null) {
                        request.addParameter("LaunchTemplateData.InstanceMarketOptions.SpotOptions.InstanceInterruptionBehavior",
                                StringUtils.fromString(spotOptions.getInstanceInterruptionBehavior()));
                    }
                }
            }

            CreditSpecificationRequest creditSpecification = launchTemplateData.getCreditSpecification();
            if (creditSpecification != null) {

                if (creditSpecification.getCpuCredits() != null) {
                    request.addParameter("LaunchTemplateData.CreditSpecification.CpuCredits", StringUtils.fromString(creditSpecification.getCpuCredits()));
                }
            }

            LaunchTemplateCpuOptionsRequest cpuOptions = launchTemplateData.getCpuOptions();
            if (cpuOptions != null) {

                if (cpuOptions.getCoreCount() != null) {
                    request.addParameter("LaunchTemplateData.CpuOptions.CoreCount", StringUtils.fromInteger(cpuOptions.getCoreCount()));
                }

                if (cpuOptions.getThreadsPerCore() != null) {
                    request.addParameter("LaunchTemplateData.CpuOptions.ThreadsPerCore", StringUtils.fromInteger(cpuOptions.getThreadsPerCore()));
                }
            }

            LaunchTemplateCapacityReservationSpecificationRequest capacityReservationSpecification = launchTemplateData.getCapacityReservationSpecification();
            if (capacityReservationSpecification != null) {

                if (capacityReservationSpecification.getCapacityReservationPreference() != null) {
                    request.addParameter("LaunchTemplateData.CapacityReservationSpecification.CapacityReservationPreference",
                            StringUtils.fromString(capacityReservationSpecification.getCapacityReservationPreference()));
                }

                CapacityReservationTarget capacityReservationTarget = capacityReservationSpecification.getCapacityReservationTarget();
                if (capacityReservationTarget != null) {

                    if (capacityReservationTarget.getCapacityReservationId() != null) {
                        request.addParameter("LaunchTemplateData.CapacityReservationSpecification.CapacityReservationTarget.CapacityReservationId",
                                StringUtils.fromString(capacityReservationTarget.getCapacityReservationId()));
                    }

                    if (capacityReservationTarget.getCapacityReservationResourceGroupArn() != null) {
                        request.addParameter(
                                "LaunchTemplateData.CapacityReservationSpecification.CapacityReservationTarget.CapacityReservationResourceGroupArn",
                                StringUtils.fromString(capacityReservationTarget.getCapacityReservationResourceGroupArn()));
                    }
                }
            }

            com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest> requestLaunchTemplateDataLicenseSpecificationsList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateLicenseConfigurationRequest>) launchTemplateData
                    .getLicenseSpecifications();
            if (!requestLaunchTemplateDataLicenseSpecificationsList.isEmpty() || !requestLaunchTemplateDataLicenseSpecificationsList.isAutoConstruct()) {
                int licenseSpecificationsListIndex = 1;

                for (LaunchTemplateLicenseConfigurationRequest requestLaunchTemplateDataLicenseSpecificationsListValue : requestLaunchTemplateDataLicenseSpecificationsList) {

                    if (requestLaunchTemplateDataLicenseSpecificationsListValue.getLicenseConfigurationArn() != null) {
                        request.addParameter("LaunchTemplateData.LicenseSpecification." + licenseSpecificationsListIndex + ".LicenseConfigurationArn",
                                StringUtils.fromString(requestLaunchTemplateDataLicenseSpecificationsListValue.getLicenseConfigurationArn()));
                    }
                    licenseSpecificationsListIndex++;
                }
            }

            LaunchTemplateHibernationOptionsRequest hibernationOptions = launchTemplateData.getHibernationOptions();
            if (hibernationOptions != null) {

                if (hibernationOptions.getConfigured() != null) {
                    request.addParameter("LaunchTemplateData.HibernationOptions.Configured", StringUtils.fromBoolean(hibernationOptions.getConfigured()));
                }
            }

            LaunchTemplateInstanceMetadataOptionsRequest metadataOptions = launchTemplateData.getMetadataOptions();
            if (metadataOptions != null) {

                if (metadataOptions.getHttpTokens() != null) {
                    request.addParameter("LaunchTemplateData.MetadataOptions.HttpTokens", StringUtils.fromString(metadataOptions.getHttpTokens()));
                }

                if (metadataOptions.getHttpPutResponseHopLimit() != null) {
                    request.addParameter("LaunchTemplateData.MetadataOptions.HttpPutResponseHopLimit",
                            StringUtils.fromInteger(metadataOptions.getHttpPutResponseHopLimit()));
                }

                if (metadataOptions.getHttpEndpoint() != null) {
                    request.addParameter("LaunchTemplateData.MetadataOptions.HttpEndpoint", StringUtils.fromString(metadataOptions.getHttpEndpoint()));
                }

                if (metadataOptions.getHttpProtocolIpv6() != null) {
                    request.addParameter("LaunchTemplateData.MetadataOptions.HttpProtocolIpv6", StringUtils.fromString(metadataOptions.getHttpProtocolIpv6()));
                }

                if (metadataOptions.getInstanceMetadataTags() != null) {
                    request.addParameter("LaunchTemplateData.MetadataOptions.InstanceMetadataTags",
                            StringUtils.fromString(metadataOptions.getInstanceMetadataTags()));
                }
            }

            LaunchTemplateEnclaveOptionsRequest enclaveOptions = launchTemplateData.getEnclaveOptions();
            if (enclaveOptions != null) {

                if (enclaveOptions.getEnabled() != null) {
                    request.addParameter("LaunchTemplateData.EnclaveOptions.Enabled", StringUtils.fromBoolean(enclaveOptions.getEnabled()));
                }
            }

            InstanceRequirementsRequest instanceRequirements = launchTemplateData.getInstanceRequirements();
            if (instanceRequirements != null) {

                VCpuCountRangeRequest vCpuCount = instanceRequirements.getVCpuCount();
                if (vCpuCount != null) {

                    if (vCpuCount.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.VCpuCount.Min", StringUtils.fromInteger(vCpuCount.getMin()));
                    }

                    if (vCpuCount.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.VCpuCount.Max", StringUtils.fromInteger(vCpuCount.getMax()));
                    }
                }

                MemoryMiBRequest memoryMiB = instanceRequirements.getMemoryMiB();
                if (memoryMiB != null) {

                    if (memoryMiB.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.MemoryMiB.Min", StringUtils.fromInteger(memoryMiB.getMin()));
                    }

                    if (memoryMiB.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.MemoryMiB.Max", StringUtils.fromInteger(memoryMiB.getMax()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestCpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getCpuManufacturers();
                if (!instanceRequirementsRequestCpuManufacturersList.isEmpty() || !instanceRequirementsRequestCpuManufacturersList.isAutoConstruct()) {
                    int cpuManufacturersListIndex = 1;

                    for (String instanceRequirementsRequestCpuManufacturersListValue : instanceRequirementsRequestCpuManufacturersList) {
                        if (instanceRequirementsRequestCpuManufacturersListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.CpuManufacturer." + cpuManufacturersListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestCpuManufacturersListValue));
                        }
                        cpuManufacturersListIndex++;
                    }
                }

                MemoryGiBPerVCpuRequest memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                if (memoryGiBPerVCpu != null) {

                    if (memoryGiBPerVCpu.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.MemoryGiBPerVCpu.Min", StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                    }

                    if (memoryGiBPerVCpu.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.MemoryGiBPerVCpu.Max", StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestExcludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getExcludedInstanceTypes();
                if (!instanceRequirementsRequestExcludedInstanceTypesList.isEmpty() || !instanceRequirementsRequestExcludedInstanceTypesList.isAutoConstruct()) {
                    int excludedInstanceTypesListIndex = 1;

                    for (String instanceRequirementsRequestExcludedInstanceTypesListValue : instanceRequirementsRequestExcludedInstanceTypesList) {
                        if (instanceRequirementsRequestExcludedInstanceTypesListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.ExcludedInstanceType." + excludedInstanceTypesListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestExcludedInstanceTypesListValue));
                        }
                        excludedInstanceTypesListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestInstanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getInstanceGenerations();
                if (!instanceRequirementsRequestInstanceGenerationsList.isEmpty() || !instanceRequirementsRequestInstanceGenerationsList.isAutoConstruct()) {
                    int instanceGenerationsListIndex = 1;

                    for (String instanceRequirementsRequestInstanceGenerationsListValue : instanceRequirementsRequestInstanceGenerationsList) {
                        if (instanceRequirementsRequestInstanceGenerationsListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.InstanceGeneration." + instanceGenerationsListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestInstanceGenerationsListValue));
                        }
                        instanceGenerationsListIndex++;
                    }
                }

                if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                            StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                }

                if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                            StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                }

                if (instanceRequirements.getBareMetal() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.BareMetal", StringUtils.fromString(instanceRequirements.getBareMetal()));
                }

                if (instanceRequirements.getBurstablePerformance() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.BurstablePerformance",
                            StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                }

                if (instanceRequirements.getRequireHibernateSupport() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.RequireHibernateSupport",
                            StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                }

                NetworkInterfaceCountRequest networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                if (networkInterfaceCount != null) {

                    if (networkInterfaceCount.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.NetworkInterfaceCount.Min",
                                StringUtils.fromInteger(networkInterfaceCount.getMin()));
                    }

                    if (networkInterfaceCount.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.NetworkInterfaceCount.Max",
                                StringUtils.fromInteger(networkInterfaceCount.getMax()));
                    }
                }

                if (instanceRequirements.getLocalStorage() != null) {
                    request.addParameter("LaunchTemplateData.InstanceRequirements.LocalStorage", StringUtils.fromString(instanceRequirements.getLocalStorage()));
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestLocalStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getLocalStorageTypes();
                if (!instanceRequirementsRequestLocalStorageTypesList.isEmpty() || !instanceRequirementsRequestLocalStorageTypesList.isAutoConstruct()) {
                    int localStorageTypesListIndex = 1;

                    for (String instanceRequirementsRequestLocalStorageTypesListValue : instanceRequirementsRequestLocalStorageTypesList) {
                        if (instanceRequirementsRequestLocalStorageTypesListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.LocalStorageType." + localStorageTypesListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestLocalStorageTypesListValue));
                        }
                        localStorageTypesListIndex++;
                    }
                }

                TotalLocalStorageGBRequest totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                if (totalLocalStorageGB != null) {

                    if (totalLocalStorageGB.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.TotalLocalStorageGB.Min",
                                StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                    }

                    if (totalLocalStorageGB.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.TotalLocalStorageGB.Max",
                                StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                    }
                }

                BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps = instanceRequirements.getBaselineEbsBandwidthMbps();
                if (baselineEbsBandwidthMbps != null) {

                    if (baselineEbsBandwidthMbps.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.BaselineEbsBandwidthMbps.Min",
                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                    }

                    if (baselineEbsBandwidthMbps.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.BaselineEbsBandwidthMbps.Max",
                                StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getAcceleratorTypes();
                if (!instanceRequirementsRequestAcceleratorTypesList.isEmpty() || !instanceRequirementsRequestAcceleratorTypesList.isAutoConstruct()) {
                    int acceleratorTypesListIndex = 1;

                    for (String instanceRequirementsRequestAcceleratorTypesListValue : instanceRequirementsRequestAcceleratorTypesList) {
                        if (instanceRequirementsRequestAcceleratorTypesListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorType." + acceleratorTypesListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestAcceleratorTypesListValue));
                        }
                        acceleratorTypesListIndex++;
                    }
                }

                AcceleratorCountRequest acceleratorCount = instanceRequirements.getAcceleratorCount();
                if (acceleratorCount != null) {

                    if (acceleratorCount.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorCount.Min", StringUtils.fromInteger(acceleratorCount.getMin()));
                    }

                    if (acceleratorCount.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorCount.Max", StringUtils.fromInteger(acceleratorCount.getMax()));
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getAcceleratorManufacturers();
                if (!instanceRequirementsRequestAcceleratorManufacturersList.isEmpty()
                        || !instanceRequirementsRequestAcceleratorManufacturersList.isAutoConstruct()) {
                    int acceleratorManufacturersListIndex = 1;

                    for (String instanceRequirementsRequestAcceleratorManufacturersListValue : instanceRequirementsRequestAcceleratorManufacturersList) {
                        if (instanceRequirementsRequestAcceleratorManufacturersListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorManufacturer." + acceleratorManufacturersListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestAcceleratorManufacturersListValue));
                        }
                        acceleratorManufacturersListIndex++;
                    }
                }

                com.amazonaws.internal.SdkInternalList<String> instanceRequirementsRequestAcceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                        .getAcceleratorNames();
                if (!instanceRequirementsRequestAcceleratorNamesList.isEmpty() || !instanceRequirementsRequestAcceleratorNamesList.isAutoConstruct()) {
                    int acceleratorNamesListIndex = 1;

                    for (String instanceRequirementsRequestAcceleratorNamesListValue : instanceRequirementsRequestAcceleratorNamesList) {
                        if (instanceRequirementsRequestAcceleratorNamesListValue != null) {
                            request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorName." + acceleratorNamesListIndex,
                                    StringUtils.fromString(instanceRequirementsRequestAcceleratorNamesListValue));
                        }
                        acceleratorNamesListIndex++;
                    }
                }

                AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB = instanceRequirements.getAcceleratorTotalMemoryMiB();
                if (acceleratorTotalMemoryMiB != null) {

                    if (acceleratorTotalMemoryMiB.getMin() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                    }

                    if (acceleratorTotalMemoryMiB.getMax() != null) {
                        request.addParameter("LaunchTemplateData.InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                    }
                }
            }

            LaunchTemplatePrivateDnsNameOptionsRequest privateDnsNameOptions = launchTemplateData.getPrivateDnsNameOptions();
            if (privateDnsNameOptions != null) {

                if (privateDnsNameOptions.getHostnameType() != null) {
                    request.addParameter("LaunchTemplateData.PrivateDnsNameOptions.HostnameType",
                            StringUtils.fromString(privateDnsNameOptions.getHostnameType()));
                }

                if (privateDnsNameOptions.getEnableResourceNameDnsARecord() != null) {
                    request.addParameter("LaunchTemplateData.PrivateDnsNameOptions.EnableResourceNameDnsARecord",
                            StringUtils.fromBoolean(privateDnsNameOptions.getEnableResourceNameDnsARecord()));
                }

                if (privateDnsNameOptions.getEnableResourceNameDnsAAAARecord() != null) {
                    request.addParameter("LaunchTemplateData.PrivateDnsNameOptions.EnableResourceNameDnsAAAARecord",
                            StringUtils.fromBoolean(privateDnsNameOptions.getEnableResourceNameDnsAAAARecord()));
                }
            }

            LaunchTemplateInstanceMaintenanceOptionsRequest maintenanceOptions = launchTemplateData.getMaintenanceOptions();
            if (maintenanceOptions != null) {

                if (maintenanceOptions.getAutoRecovery() != null) {
                    request.addParameter("LaunchTemplateData.MaintenanceOptions.AutoRecovery", StringUtils.fromString(maintenanceOptions.getAutoRecovery()));
                }
            }

            if (launchTemplateData.getDisableApiStop() != null) {
                request.addParameter("LaunchTemplateData.DisableApiStop", StringUtils.fromBoolean(launchTemplateData.getDisableApiStop()));
            }
        }

        com.amazonaws.internal.SdkInternalList<TagSpecification> createLaunchTemplateRequestTagSpecificationsList = (com.amazonaws.internal.SdkInternalList<TagSpecification>) createLaunchTemplateRequest
                .getTagSpecifications();
        if (!createLaunchTemplateRequestTagSpecificationsList.isEmpty() || !createLaunchTemplateRequestTagSpecificationsList.isAutoConstruct()) {
            int tagSpecificationsListIndex = 1;

            for (TagSpecification createLaunchTemplateRequestTagSpecificationsListValue : createLaunchTemplateRequestTagSpecificationsList) {

                if (createLaunchTemplateRequestTagSpecificationsListValue.getResourceType() != null) {
                    request.addParameter("TagSpecification." + tagSpecificationsListIndex + ".ResourceType",
                            StringUtils.fromString(createLaunchTemplateRequestTagSpecificationsListValue.getResourceType()));
                }

                com.amazonaws.internal.SdkInternalList<Tag> tagSpecificationTagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createLaunchTemplateRequestTagSpecificationsListValue
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
