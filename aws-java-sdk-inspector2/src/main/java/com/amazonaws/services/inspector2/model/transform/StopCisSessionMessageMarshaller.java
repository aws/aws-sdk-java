/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StopCisSessionMessageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StopCisSessionMessageMarshaller {

    private static final MarshallingInfo<String> BENCHMARKPROFILE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("benchmarkProfile").build();
    private static final MarshallingInfo<String> BENCHMARKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("benchmarkVersion").build();
    private static final MarshallingInfo<StructuredPojo> COMPUTEPLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computePlatform").build();
    private static final MarshallingInfo<StructuredPojo> PROGRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("progress").build();
    private static final MarshallingInfo<String> REASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("reason").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final StopCisSessionMessageMarshaller instance = new StopCisSessionMessageMarshaller();

    public static StopCisSessionMessageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StopCisSessionMessage stopCisSessionMessage, ProtocolMarshaller protocolMarshaller) {

        if (stopCisSessionMessage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stopCisSessionMessage.getBenchmarkProfile(), BENCHMARKPROFILE_BINDING);
            protocolMarshaller.marshall(stopCisSessionMessage.getBenchmarkVersion(), BENCHMARKVERSION_BINDING);
            protocolMarshaller.marshall(stopCisSessionMessage.getComputePlatform(), COMPUTEPLATFORM_BINDING);
            protocolMarshaller.marshall(stopCisSessionMessage.getProgress(), PROGRESS_BINDING);
            protocolMarshaller.marshall(stopCisSessionMessage.getReason(), REASON_BINDING);
            protocolMarshaller.marshall(stopCisSessionMessage.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
