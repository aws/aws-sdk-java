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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller {

    private static final MarshallingInfo<Boolean> DELETEONTERMINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteOnTermination").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Encrypted").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Iops").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotId").build();
    private static final MarshallingInfo<Integer> THROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Throughput").build();
    private static final MarshallingInfo<Integer> VOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeSize").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeType").build();

    private static final AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller instance = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getDeleteOnTermination(), DELETEONTERMINATION_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getThroughput(), THROUGHPUT_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getVolumeSize(), VOLUMESIZE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetEbsDetails.getVolumeType(), VOLUMETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
