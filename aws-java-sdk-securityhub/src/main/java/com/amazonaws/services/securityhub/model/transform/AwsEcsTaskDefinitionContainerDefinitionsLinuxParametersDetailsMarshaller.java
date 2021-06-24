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
 * AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Capabilities").build();
    private static final MarshallingInfo<List> DEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Devices").build();
    private static final MarshallingInfo<Boolean> INITPROCESSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InitProcessEnabled").build();
    private static final MarshallingInfo<Integer> MAXSWAP_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MaxSwap").build();
    private static final MarshallingInfo<Integer> SHAREDMEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SharedMemorySize").build();
    private static final MarshallingInfo<Integer> SWAPPINESS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Swappiness").build();
    private static final MarshallingInfo<List> TMPFS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tmpfs").build();

    private static final AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller instance = new AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller();

    public static AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails,
            ProtocolMarshaller protocolMarshaller) {

        if (awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getDevices(), DEVICES_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getInitProcessEnabled(), INITPROCESSENABLED_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getMaxSwap(), MAXSWAP_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getSharedMemorySize(), SHAREDMEMORYSIZE_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getSwappiness(), SWAPPINESS_BINDING);
            protocolMarshaller.marshall(awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.getTmpfs(), TMPFS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
