/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller {

    private static final MarshallingInfo<Boolean> AUTOPROVISION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Autoprovision").build();
    private static final MarshallingInfo<String> DRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Driver").build();
    private static final MarshallingInfo<Map> DRIVEROPTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DriverOpts").build();
    private static final MarshallingInfo<Map> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Labels").build();
    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Scope").build();

    private static final AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller instance = new AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller();

    public static AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.getAutoprovision(), AUTOPROVISION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.getDriver(), DRIVER_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.getDriverOpts(), DRIVEROPTS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.getLabels(), LABELS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDockerVolumeConfigurationDetails.getScope(), SCOPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
