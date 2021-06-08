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
package com.amazonaws.services.synthetics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.synthetics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CanaryRunConfigOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CanaryRunConfigOutputMarshaller {

    private static final MarshallingInfo<Integer> TIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeoutInSeconds").build();
    private static final MarshallingInfo<Integer> MEMORYINMB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MemoryInMB").build();
    private static final MarshallingInfo<Boolean> ACTIVETRACING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ActiveTracing").build();

    private static final CanaryRunConfigOutputMarshaller instance = new CanaryRunConfigOutputMarshaller();

    public static CanaryRunConfigOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CanaryRunConfigOutput canaryRunConfigOutput, ProtocolMarshaller protocolMarshaller) {

        if (canaryRunConfigOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(canaryRunConfigOutput.getTimeoutInSeconds(), TIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(canaryRunConfigOutput.getMemoryInMB(), MEMORYINMB_BINDING);
            protocolMarshaller.marshall(canaryRunConfigOutput.getActiveTracing(), ACTIVETRACING_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
