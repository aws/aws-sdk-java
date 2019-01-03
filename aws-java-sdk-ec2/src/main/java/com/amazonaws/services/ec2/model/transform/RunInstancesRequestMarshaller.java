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

        com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> runInstancesRequestBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) runInstancesRequest
                .getBlockDeviceMappings();
        if (!runInstancesRequestBlockDeviceMappingsList.isEmpty() || !runInstancesRequestBlockDeviceMappingsList.isAutoConstruct()) {
            int blockDeviceMappingsListIndex = 1;

            for (BlockDeviceMapping runInstancesRequestBlockDeviceMappingsListValue : runInstancesRequestBlockDeviceMappingsList) {

                if (runInstancesRequestBlockDeviceMappingsListValue.getDeviceName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".DeviceName",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getDeviceName()));
                }

                if (runInstancesRequestBlockDeviceMappingsListValue.getVirtualName() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".VirtualName",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getVirtualName()));
                }

                EbsBlockDevice ebs = runInstancesRequestBlockDeviceMappingsListValue.getEbs();
                if (ebs != null) {

                    if (ebs.getDeleteOnTermination() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                    }

                    if (ebs.getIops() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                    }

                    if (ebs.getSnapshotId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                StringUtils.fromString(ebs.getSnapshotId()));
                    }

                    if (ebs.getVolumeSize() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                StringUtils.fromInteger(ebs.getVolumeSize()));
                    }

                    if (ebs.getVolumeType() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                StringUtils.fromString(ebs.getVolumeType()));
                    }

                    if (ebs.getEncrypted() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                StringUtils.fromBoolean(ebs.getEncrypted()));
                    }

                    if (ebs.getKmsKeyId() != null) {
                        request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.KmsKeyId", StringUtils.fromString(ebs.getKmsKeyId()));
                    }
                }

                if (runInstancesRequestBlockDeviceMappingsListValue.getNoDevice() != null) {
                    request.addParameter("BlockDeviceMapping." + blockDeviceMappingsListIndex + ".NoDevice",
                            StringUtils.fromString(runInstancesRequestBlockDeviceMappingsListValue.getNoDevice()));
                }
                blockDeviceMappingsListIndex++;
            }
        }

        if (runInstancesRequest.getImageId() != null) {
            request.addParameter("ImageId", StringUtils.fromString(runInstancesRequest.getImageId()));
        }

        if (runInstancesRequest.getInstanceType() != null) {
            request.addParameter("InstanceType", StringUtils.fromString(runInstancesRequest.getInstanceType()));
        }

        if (runInstancesRequest.getIpv6AddressCount() != null) {
            request.addParameter("Ipv6AddressCount", StringUtils.fromInteger(runInstancesRequest.getIpv6AddressCount()));
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

        if (runInstancesRequest.getKernelId() != null) {
            request.addParameter("KernelId", StringUtils.fromString(runInstancesRequest.getKernelId()));
        }

        if (runInstancesRequest.getKeyName() != null) {
            request.addParameter("KeyName", StringUtils.fromString(runInstancesRequest.getKeyName()));
        }

        if (runInstancesRequest.getMaxCount() != null) {
            request.addParameter("MaxCount", StringUtils.fromInteger(runInstancesRequest.getMaxCount()));
        }

        if (runInstancesRequest.getMinCount() != null) {
            request.addParameter("MinCount", StringUtils.fromInteger(runInstancesRequest.getMinCount()));
        }

        if (runInstancesRequest.getMonitoring() != null) {
            request.addParameter("Monitoring.Enabled", StringUtils.fromBoolean(runInstancesRequest.getMonitoring()));
        }

        Placement placement = runInstancesRequest.getPlacement();
        if (placement != null) {

            if (placement.getAvailabilityZone() != null) {
                request.addParameter("Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
            }

            if (placement.getAffinity() != null) {
                request.addParameter("Placement.Affinity", StringUtils.fromString(placement.getAffinity()));
            }

            if (placement.getGroupName() != null) {
                request.addParameter("Placement.GroupName", StringUtils.fromString(placement.getGroupName()));
            }

            if (placement.getPartitionNumber() != null) {
                request.addParameter("Placement.PartitionNumber", StringUtils.fromInteger(placement.getPartitionNumber()));
            }

            if (placement.getHostId() != null) {
                request.addParameter("Placement.HostId", StringUtils.fromString(placement.getHostId()));
            }

            if (placement.getTenancy() != null) {
                request.addParameter("Placement.Tenancy", StringUtils.fromString(placement.getTenancy()));
            }

            if (placement.getSpreadDomain() != null) {
                request.addParameter("Placement.SpreadDomain", StringUtils.fromString(placement.getSpreadDomain()));
            }
        }

        if (runInstancesRequest.getRamdiskId() != null) {
            request.addParameter("RamdiskId", StringUtils.fromString(runInstancesRequest.getRamdiskId()));
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

        if (runInstancesRequest.getSubnetId() != null) {
            request.addParameter("SubnetId", StringUtils.fromString(runInstancesRequest.getSubnetId()));
        }

        if (runInstancesRequest.getUserData() != null) {
            request.addParameter("UserData", StringUtils.fromString(runInstancesRequest.getUserData()));
        }

        if (runInstancesRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(runInstancesRequest.getAdditionalInfo()));
        }

        if (runInstancesRequest.getClientToken() != null) {
            request.addParameter("ClientToken", StringUtils.fromString(runInstancesRequest.getClientToken()));
        }

        if (runInstancesRequest.getDisableApiTermination() != null) {
            request.addParameter("DisableApiTermination", StringUtils.fromBoolean(runInstancesRequest.getDisableApiTermination()));
        }

        if (runInstancesRequest.getEbsOptimized() != null) {
            request.addParameter("EbsOptimized", StringUtils.fromBoolean(runInstancesRequest.getEbsOptimized()));
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

        if (runInstancesRequest.getInstanceInitiatedShutdownBehavior() != null) {
            request.addParameter("InstanceInitiatedShutdownBehavior", StringUtils.fromString(runInstancesRequest.getInstanceInitiatedShutdownBehavior()));
        }

        com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> runInstancesRequestNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) runInstancesRequest
                .getNetworkInterfaces();
        if (!runInstancesRequestNetworkInterfacesList.isEmpty() || !runInstancesRequestNetworkInterfacesList.isAutoConstruct()) {
            int networkInterfacesListIndex = 1;

            for (InstanceNetworkInterfaceSpecification runInstancesRequestNetworkInterfacesListValue : runInstancesRequestNetworkInterfacesList) {

                if (runInstancesRequestNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                            StringUtils.fromBoolean(runInstancesRequestNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeleteOnTermination",
                            StringUtils.fromBoolean(runInstancesRequestNetworkInterfacesListValue.getDeleteOnTermination()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDescription() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".Description",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getDescription()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getDeviceIndex() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".DeviceIndex",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getDeviceIndex()));
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

                if (runInstancesRequestNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".Ipv6AddressCount",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getIpv6AddressCount()));
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

                if (runInstancesRequestNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".NetworkInterfaceId",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getNetworkInterfaceId()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddress",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getPrivateIpAddress()));
                }

                com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> instanceNetworkInterfaceSpecificationPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) runInstancesRequestNetworkInterfacesListValue
                        .getPrivateIpAddresses();
                if (!instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isEmpty()
                        || !instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isAutoConstruct()) {
                    int privateIpAddressesListIndex = 1;

                    for (PrivateIpAddressSpecification instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue : instanceNetworkInterfaceSpecificationPrivateIpAddressesList) {

                        if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                    + ".Primary", StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary()));
                        }

                        if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                            request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                    + ".PrivateIpAddress",
                                    StringUtils.fromString(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress()));
                        }
                        privateIpAddressesListIndex++;
                    }
                }

                if (runInstancesRequestNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                            StringUtils.fromInteger(runInstancesRequestNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                }

                if (runInstancesRequestNetworkInterfacesListValue.getSubnetId() != null) {
                    request.addParameter("NetworkInterface." + networkInterfacesListIndex + ".SubnetId",
                            StringUtils.fromString(runInstancesRequestNetworkInterfacesListValue.getSubnetId()));
                }
                networkInterfacesListIndex++;
            }
        }

        if (runInstancesRequest.getPrivateIpAddress() != null) {
            request.addParameter("PrivateIpAddress", StringUtils.fromString(runInstancesRequest.getPrivateIpAddress()));
        }

        com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification> runInstancesRequestElasticGpuSpecificationList = (com.amazonaws.internal.SdkInternalList<ElasticGpuSpecification>) runInstancesRequest
                .getElasticGpuSpecification();
        if (!runInstancesRequestElasticGpuSpecificationList.isEmpty() || !runInstancesRequestElasticGpuSpecificationList.isAutoConstruct()) {
            int elasticGpuSpecificationListIndex = 1;

            for (ElasticGpuSpecification runInstancesRequestElasticGpuSpecificationListValue : runInstancesRequestElasticGpuSpecificationList) {

                if (runInstancesRequestElasticGpuSpecificationListValue.getType() != null) {
                    request.addParameter("ElasticGpuSpecification." + elasticGpuSpecificationListIndex + ".Type",
                            StringUtils.fromString(runInstancesRequestElasticGpuSpecificationListValue.getType()));
                }
                elasticGpuSpecificationListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator> runInstancesRequestElasticInferenceAcceleratorsList = (com.amazonaws.internal.SdkInternalList<ElasticInferenceAccelerator>) runInstancesRequest
                .getElasticInferenceAccelerators();
        if (!runInstancesRequestElasticInferenceAcceleratorsList.isEmpty() || !runInstancesRequestElasticInferenceAcceleratorsList.isAutoConstruct()) {
            int elasticInferenceAcceleratorsListIndex = 1;

            for (ElasticInferenceAccelerator runInstancesRequestElasticInferenceAcceleratorsListValue : runInstancesRequestElasticInferenceAcceleratorsList) {

                if (runInstancesRequestElasticInferenceAcceleratorsListValue.getType() != null) {
                    request.addParameter("ElasticInferenceAccelerator." + elasticInferenceAcceleratorsListIndex + ".Type",
                            StringUtils.fromString(runInstancesRequestElasticInferenceAcceleratorsListValue.getType()));
                }
                elasticInferenceAcceleratorsListIndex++;
            }
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

        LaunchTemplateSpecification launchTemplate = runInstancesRequest.getLaunchTemplate();
        if (launchTemplate != null) {

            if (launchTemplate.getLaunchTemplateId() != null) {
                request.addParameter("LaunchTemplate.LaunchTemplateId", StringUtils.fromString(launchTemplate.getLaunchTemplateId()));
            }

            if (launchTemplate.getLaunchTemplateName() != null) {
                request.addParameter("LaunchTemplate.LaunchTemplateName", StringUtils.fromString(launchTemplate.getLaunchTemplateName()));
            }

            if (launchTemplate.getVersion() != null) {
                request.addParameter("LaunchTemplate.Version", StringUtils.fromString(launchTemplate.getVersion()));
            }
        }

        InstanceMarketOptionsRequest instanceMarketOptions = runInstancesRequest.getInstanceMarketOptions();
        if (instanceMarketOptions != null) {

            if (instanceMarketOptions.getMarketType() != null) {
                request.addParameter("InstanceMarketOptions.MarketType", StringUtils.fromString(instanceMarketOptions.getMarketType()));
            }

            SpotMarketOptions spotOptions = instanceMarketOptions.getSpotOptions();
            if (spotOptions != null) {

                if (spotOptions.getMaxPrice() != null) {
                    request.addParameter("InstanceMarketOptions.SpotOptions.MaxPrice", StringUtils.fromString(spotOptions.getMaxPrice()));
                }

                if (spotOptions.getSpotInstanceType() != null) {
                    request.addParameter("InstanceMarketOptions.SpotOptions.SpotInstanceType", StringUtils.fromString(spotOptions.getSpotInstanceType()));
                }

                if (spotOptions.getBlockDurationMinutes() != null) {
                    request.addParameter("InstanceMarketOptions.SpotOptions.BlockDurationMinutes",
                            StringUtils.fromInteger(spotOptions.getBlockDurationMinutes()));
                }

                if (spotOptions.getValidUntil() != null) {
                    request.addParameter("InstanceMarketOptions.SpotOptions.ValidUntil", StringUtils.fromDate(spotOptions.getValidUntil()));
                }

                if (spotOptions.getInstanceInterruptionBehavior() != null) {
                    request.addParameter("InstanceMarketOptions.SpotOptions.InstanceInterruptionBehavior",
                            StringUtils.fromString(spotOptions.getInstanceInterruptionBehavior()));
                }
            }
        }

        CreditSpecificationRequest creditSpecification = runInstancesRequest.getCreditSpecification();
        if (creditSpecification != null) {

            if (creditSpecification.getCpuCredits() != null) {
                request.addParameter("CreditSpecification.CpuCredits", StringUtils.fromString(creditSpecification.getCpuCredits()));
            }
        }

        CpuOptionsRequest cpuOptions = runInstancesRequest.getCpuOptions();
        if (cpuOptions != null) {

            if (cpuOptions.getCoreCount() != null) {
                request.addParameter("CpuOptions.CoreCount", StringUtils.fromInteger(cpuOptions.getCoreCount()));
            }

            if (cpuOptions.getThreadsPerCore() != null) {
                request.addParameter("CpuOptions.ThreadsPerCore", StringUtils.fromInteger(cpuOptions.getThreadsPerCore()));
            }
        }

        CapacityReservationSpecification capacityReservationSpecification = runInstancesRequest.getCapacityReservationSpecification();
        if (capacityReservationSpecification != null) {

            if (capacityReservationSpecification.getCapacityReservationPreference() != null) {
                request.addParameter("CapacityReservationSpecification.CapacityReservationPreference",
                        StringUtils.fromString(capacityReservationSpecification.getCapacityReservationPreference()));
            }

            CapacityReservationTarget capacityReservationTarget = capacityReservationSpecification.getCapacityReservationTarget();
            if (capacityReservationTarget != null) {

                if (capacityReservationTarget.getCapacityReservationId() != null) {
                    request.addParameter("CapacityReservationSpecification.CapacityReservationTarget.CapacityReservationId",
                            StringUtils.fromString(capacityReservationTarget.getCapacityReservationId()));
                }
            }
        }

        HibernationOptionsRequest hibernationOptions = runInstancesRequest.getHibernationOptions();
        if (hibernationOptions != null) {

            if (hibernationOptions.getConfigured() != null) {
                request.addParameter("HibernationOptions.Configured", StringUtils.fromBoolean(hibernationOptions.getConfigured()));
            }
        }

        com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest> runInstancesRequestLicenseSpecificationsList = (com.amazonaws.internal.SdkInternalList<LicenseConfigurationRequest>) runInstancesRequest
                .getLicenseSpecifications();
        if (!runInstancesRequestLicenseSpecificationsList.isEmpty() || !runInstancesRequestLicenseSpecificationsList.isAutoConstruct()) {
            int licenseSpecificationsListIndex = 1;

            for (LicenseConfigurationRequest runInstancesRequestLicenseSpecificationsListValue : runInstancesRequestLicenseSpecificationsList) {

                if (runInstancesRequestLicenseSpecificationsListValue.getLicenseConfigurationArn() != null) {
                    request.addParameter("LicenseSpecification." + licenseSpecificationsListIndex + ".LicenseConfigurationArn",
                            StringUtils.fromString(runInstancesRequestLicenseSpecificationsListValue.getLicenseConfigurationArn()));
                }
                licenseSpecificationsListIndex++;
            }
        }

        return request;
    }

}
