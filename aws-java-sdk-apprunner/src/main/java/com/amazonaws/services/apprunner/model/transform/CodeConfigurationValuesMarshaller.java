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
package com.amazonaws.services.apprunner.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apprunner.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeConfigurationValuesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeConfigurationValuesMarshaller {

    private static final MarshallingInfo<String> RUNTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Runtime").build();
    private static final MarshallingInfo<String> BUILDCOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BuildCommand").build();
    private static final MarshallingInfo<String> STARTCOMMAND_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StartCommand").build();
    private static final MarshallingInfo<String> PORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Port").build();
    private static final MarshallingInfo<Map> RUNTIMEENVIRONMENTVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RuntimeEnvironmentVariables").build();

    private static final CodeConfigurationValuesMarshaller instance = new CodeConfigurationValuesMarshaller();

    public static CodeConfigurationValuesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeConfigurationValues codeConfigurationValues, ProtocolMarshaller protocolMarshaller) {

        if (codeConfigurationValues == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeConfigurationValues.getRuntime(), RUNTIME_BINDING);
            protocolMarshaller.marshall(codeConfigurationValues.getBuildCommand(), BUILDCOMMAND_BINDING);
            protocolMarshaller.marshall(codeConfigurationValues.getStartCommand(), STARTCOMMAND_BINDING);
            protocolMarshaller.marshall(codeConfigurationValues.getPort(), PORT_BINDING);
            protocolMarshaller.marshall(codeConfigurationValues.getRuntimeEnvironmentVariables(), RUNTIMEENVIRONMENTVARIABLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
