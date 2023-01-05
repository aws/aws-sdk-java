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
package com.amazonaws.services.athena.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.athena.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EngineConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EngineConfigurationMarshaller {

    private static final MarshallingInfo<Integer> COORDINATORDPUSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CoordinatorDpuSize").build();
    private static final MarshallingInfo<Integer> MAXCONCURRENTDPUS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxConcurrentDpus").build();
    private static final MarshallingInfo<Integer> DEFAULTEXECUTORDPUSIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultExecutorDpuSize").build();
    private static final MarshallingInfo<Map> ADDITIONALCONFIGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalConfigs").build();

    private static final EngineConfigurationMarshaller instance = new EngineConfigurationMarshaller();

    public static EngineConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EngineConfiguration engineConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (engineConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(engineConfiguration.getCoordinatorDpuSize(), COORDINATORDPUSIZE_BINDING);
            protocolMarshaller.marshall(engineConfiguration.getMaxConcurrentDpus(), MAXCONCURRENTDPUS_BINDING);
            protocolMarshaller.marshall(engineConfiguration.getDefaultExecutorDpuSize(), DEFAULTEXECUTORDPUSIZE_BINDING);
            protocolMarshaller.marshall(engineConfiguration.getAdditionalConfigs(), ADDITIONALCONFIGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
