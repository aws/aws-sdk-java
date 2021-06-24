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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionVolumesDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionVolumesDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> DOCKERVOLUMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DockerVolumeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> EFSVOLUMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EfsVolumeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> HOST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Host").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();

    private static final AwsEcsTaskDefinitionVolumesDetailsMarshaller instance = new AwsEcsTaskDefinitionVolumesDetailsMarshaller();

    public static AwsEcsTaskDefinitionVolumesDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionVolumesDetails awsEcsTaskDefinitionVolumesDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionVolumesDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDetails.getDockerVolumeConfiguration(), DOCKERVOLUMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDetails.getEfsVolumeConfiguration(), EFSVOLUMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDetails.getHost(), HOST_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionVolumesDetails.getName(), NAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
