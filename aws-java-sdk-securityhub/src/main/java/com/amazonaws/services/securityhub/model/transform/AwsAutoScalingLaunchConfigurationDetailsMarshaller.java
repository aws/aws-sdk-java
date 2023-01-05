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
 * AwsAutoScalingLaunchConfigurationDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAutoScalingLaunchConfigurationDetailsMarshaller {

    private static final MarshallingInfo<Boolean> ASSOCIATEPUBLICIPADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociatePublicIpAddress").build();
    private static final MarshallingInfo<List> BLOCKDEVICEMAPPINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BlockDeviceMappings").build();
    private static final MarshallingInfo<String> CLASSICLINKVPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClassicLinkVpcId").build();
    private static final MarshallingInfo<List> CLASSICLINKVPCSECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClassicLinkVpcSecurityGroups").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTime").build();
    private static final MarshallingInfo<Boolean> EBSOPTIMIZED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EbsOptimized").build();
    private static final MarshallingInfo<String> IAMINSTANCEPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IamInstanceProfile").build();
    private static final MarshallingInfo<String> IMAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ImageId").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCEMONITORING_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceMonitoring").build();
    private static final MarshallingInfo<String> INSTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InstanceType").build();
    private static final MarshallingInfo<String> KERNELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KernelId").build();
    private static final MarshallingInfo<String> KEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeyName").build();
    private static final MarshallingInfo<String> LAUNCHCONFIGURATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchConfigurationName").build();
    private static final MarshallingInfo<String> PLACEMENTTENANCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlacementTenancy").build();
    private static final MarshallingInfo<String> RAMDISKID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RamdiskId").build();
    private static final MarshallingInfo<List> SECURITYGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityGroups").build();
    private static final MarshallingInfo<String> SPOTPRICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SpotPrice").build();
    private static final MarshallingInfo<String> USERDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserData").build();
    private static final MarshallingInfo<StructuredPojo> METADATAOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataOptions").build();

    private static final AwsAutoScalingLaunchConfigurationDetailsMarshaller instance = new AwsAutoScalingLaunchConfigurationDetailsMarshaller();

    public static AwsAutoScalingLaunchConfigurationDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfigurationDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAutoScalingLaunchConfigurationDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getAssociatePublicIpAddress(), ASSOCIATEPUBLICIPADDRESS_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getBlockDeviceMappings(), BLOCKDEVICEMAPPINGS_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getClassicLinkVpcId(), CLASSICLINKVPCID_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getClassicLinkVpcSecurityGroups(), CLASSICLINKVPCSECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getCreatedTime(), CREATEDTIME_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getEbsOptimized(), EBSOPTIMIZED_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getIamInstanceProfile(), IAMINSTANCEPROFILE_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getImageId(), IMAGEID_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getInstanceMonitoring(), INSTANCEMONITORING_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getInstanceType(), INSTANCETYPE_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getKernelId(), KERNELID_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getKeyName(), KEYNAME_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getLaunchConfigurationName(), LAUNCHCONFIGURATIONNAME_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getPlacementTenancy(), PLACEMENTTENANCY_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getRamdiskId(), RAMDISKID_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getSecurityGroups(), SECURITYGROUPS_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getSpotPrice(), SPOTPRICE_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getUserData(), USERDATA_BINDING);
            protocolMarshaller.marshall(awsAutoScalingLaunchConfigurationDetails.getMetadataOptions(), METADATAOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
