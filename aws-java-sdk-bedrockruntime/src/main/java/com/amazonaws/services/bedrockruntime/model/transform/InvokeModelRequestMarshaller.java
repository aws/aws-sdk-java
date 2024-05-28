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
package com.amazonaws.services.bedrockruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrockruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InvokeModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InvokeModelRequestMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> BODY_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("Content-Type").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("Accept").build();
    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<String> TRACE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("X-Amzn-Bedrock-Trace").build();
    private static final MarshallingInfo<String> GUARDRAILIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Bedrock-GuardrailIdentifier").build();
    private static final MarshallingInfo<String> GUARDRAILVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Bedrock-GuardrailVersion").build();

    private static final InvokeModelRequestMarshaller instance = new InvokeModelRequestMarshaller();

    public static InvokeModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InvokeModelRequest invokeModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (invokeModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(invokeModelRequest.getBody(), BODY_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getAccept(), ACCEPT_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getTrace(), TRACE_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getGuardrailIdentifier(), GUARDRAILIDENTIFIER_BINDING);
            protocolMarshaller.marshall(invokeModelRequest.getGuardrailVersion(), GUARDRAILVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
