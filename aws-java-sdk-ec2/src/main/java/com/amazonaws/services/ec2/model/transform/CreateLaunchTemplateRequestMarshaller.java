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
                }
            }

            LaunchTemplateHibernationOptionsRequest hibernationOptions = launchTemplateData.getHibernationOptions();
            if (hibernationOptions != null) {

                if (hibernationOptions.getConfigured() != null) {
                    request.addParameter("LaunchTemplateData.HibernationOptions.Configured", StringUtils.fromBoolean(hibernationOptions.getConfigured()));
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
        }

        return request;
    }

}
