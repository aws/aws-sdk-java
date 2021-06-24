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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller {

    private static final MarshallingInfo<String> CONTAINERPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerPath").build();
    private static final MarshallingInfo<List> MOUNTOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MountOptions").build();
    private static final MarshallingInfo<Integer> SIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Size").build();

    private static final AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller instance = new AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller();

    public static AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(
            AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails awsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails.getContainerPath(), CONTAINERPATH_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails.getMountOptions(), MOUNTOPTIONS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails.getSize(), SIZE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
