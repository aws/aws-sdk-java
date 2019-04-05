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
package com.amazonaws.services.greengrass.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FunctionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FunctionConfigurationMarshaller {

    private static final MarshallingInfo<String> ENCODINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncodingType").build();
    private static final MarshallingInfo<StructuredPojo> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Environment").build();
    private static final MarshallingInfo<String> EXECARGS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExecArgs").build();
    private static final MarshallingInfo<String> EXECUTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Executable").build();
    private static final MarshallingInfo<Integer> MEMORYSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemorySize").build();
    private static final MarshallingInfo<Boolean> PINNED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pinned").build();
    private static final MarshallingInfo<Integer> TIMEOUT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timeout").build();

    private static final FunctionConfigurationMarshaller instance = new FunctionConfigurationMarshaller();

    public static FunctionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FunctionConfiguration functionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (functionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(functionConfiguration.getEncodingType(), ENCODINGTYPE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getExecArgs(), EXECARGS_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getExecutable(), EXECUTABLE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getMemorySize(), MEMORYSIZE_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getPinned(), PINNED_BINDING);
            protocolMarshaller.marshall(functionConfiguration.getTimeout(), TIMEOUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
