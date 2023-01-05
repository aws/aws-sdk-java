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
 * AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller {

    private static final MarshallingInfo<String> DEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeviceName").build();
    private static final MarshallingInfo<StructuredPojo> EBS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ebs").build();
    private static final MarshallingInfo<String> NODEVICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NoDevice").build();
    private static final MarshallingInfo<String> VIRTUALNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VirtualName").build();

    private static final AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller instance = new AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller();

    public static AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEc2LaunchTemplateDataBlockDeviceMappingSetDetails awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.getDeviceName(), DEVICENAME_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.getEbs(), EBS_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.getNoDevice(), NODEVICE_BINDING);
            protocolMarshaller.marshall(awsEc2LaunchTemplateDataBlockDeviceMappingSetDetails.getVirtualName(), VIRTUALNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
