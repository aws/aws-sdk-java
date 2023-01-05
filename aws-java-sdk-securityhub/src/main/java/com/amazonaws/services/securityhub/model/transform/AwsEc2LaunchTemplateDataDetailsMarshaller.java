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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2LaunchTemplateDataDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataDetailsMarshaller {

    private static final MarshallingInfo<List> BLOCKDEVICEMAPPINGSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDeviceMappingSet").build();
    private static final MarshallingInfo<StructuredPojo> CAPACITYRESERVATIONSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityReservationSpecification").build();
    private static final MarshallingInfo<StructuredPojo> CPUOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CpuOptions").build();
    private static final MarshallingInfo<StructuredPojo> CREDITSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreditSpecification").build();
    private static final MarshallingInfo<Boolean> DISABLEAPISTOP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableApiStop").build();
    private static final MarshallingInfo<Boolean> DISABLEAPITERMINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisableApiTermination").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();
    private static final MarshallingInfo<List> ELASTICGPUSPECIFICATIONSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticGpuSpecificationSet").build();
    private static final MarshallingInfo<List> ELASTICINFERENCEACCELERATORSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ElasticInferenceAcceleratorSet").build();
    private static final MarshallingInfo<StructuredPojo> ENCLAVEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnclaveOptions").build();
    private static final MarshallingInfo<StructuredPojo> HIBERNATIONOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HibernationOptions").build();
    private static final MarshallingInfo<StructuredPojo> IAMINSTANCEPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamInstanceProfile").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<String> INSTANCEINITIATEDSHUTDOWNBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceInitiatedShutdownBehavior").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEMARKETOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMarketOptions").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEREQUIREMENTS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceRequirements").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> KERNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KernelId").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyName").build();
    private static final MarshallingInfo<List> LICENSESET_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LicenseSet").build();
    private static final MarshallingInfo<StructuredPojo> MAINTENANCEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaintenanceOptions").build();
    private static final MarshallingInfo<StructuredPojo> METADATAOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataOptions").build();
    private static final MarshallingInfo<StructuredPojo> MONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Monitoring").build();
    private static final MarshallingInfo<List> NETWORKINTERFACESET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceSet").build();
    private static final MarshallingInfo<StructuredPojo> PLACEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Placement").build();
    private static final MarshallingInfo<StructuredPojo> PRIVATEDNSNAMEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrivateDnsNameOptions").build();
    private static final MarshallingInfo<String> RAMDISKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RamDiskId").build();
    private static final MarshallingInfo<List> SECURITYGROUPIDSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupIdSet").build();
    private static final MarshallingInfo<List> SECURITYGROUPSET_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroupSet").build();
    private static final MarshallingInfo<String> USERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserData").build();

    private static final AwsEc2LaunchTemplateDataDetailsMarshaller instance = new AwsEc2LaunchTemplateDataDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataDetails awsEc2LaunchTemplateDataDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getBlockDeviceMappingSet(), BLOCKDEVICEMAPPINGSET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getCapacityReservationSpecification(), CAPACITYRESERVATIONSPECIFICATION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getCpuOptions(), CPUOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getCreditSpecification(), CREDITSPECIFICATION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getDisableApiStop(), DISABLEAPISTOP_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getDisableApiTermination(), DISABLEAPITERMINATION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getEbsOptimized(), EBSOPTIMIZED_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getElasticGpuSpecificationSet(), ELASTICGPUSPECIFICATIONSET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getElasticInferenceAcceleratorSet(), ELASTICINFERENCEACCELERATORSET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getEnclaveOptions(), ENCLAVEOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getHibernationOptions(), HIBERNATIONOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getIamInstanceProfile(), IAMINSTANCEPROFILE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getInstanceInitiatedShutdownBehavior(), INSTANCEINITIATEDSHUTDOWNBEHAVIOR_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getInstanceMarketOptions(), INSTANCEMARKETOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getInstanceRequirements(), INSTANCEREQUIREMENTS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getKernelId(), KERNELID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getLicenseSet(), LICENSESET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getMaintenanceOptions(), MAINTENANCEOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getMetadataOptions(), METADATAOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getMonitoring(), MONITORING_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getNetworkInterfaceSet(), NETWORKINTERFACESET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getPlacement(), PLACEMENT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getPrivateDnsNameOptions(), PRIVATEDNSNAMEOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getRamDiskId(), RAMDISKID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getSecurityGroupIdSet(), SECURITYGROUPIDSET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getSecurityGroupSet(), SECURITYGROUPSET_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataDetails.getUserData(), USERDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
