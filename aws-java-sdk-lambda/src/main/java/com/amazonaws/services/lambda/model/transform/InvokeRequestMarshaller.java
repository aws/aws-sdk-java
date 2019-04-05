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
package com.amazonaws.services.lambda.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lambda.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InvokeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InvokeRequestMarshaller {

    private static final MarshallingInfo<String> FUNCTIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("FunctionName").build();
    private static final MarshallingInfo<String> INVOCATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Invocation-Type").build();
    private static final MarshallingInfo<String> LOGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("X-Amz-Log-Type").build();
    private static final MarshallingInfo<String> CLIENTCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amz-Client-Context").build();
    private static final MarshallingInfo<java.nio.ByteBuffer> PAYLOAD_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).isExplicitPayloadMember(true).isBinary(true).build();
    private static final MarshallingInfo<String> QUALIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("Qualifier").build();

    private static final InvokeRequestMarshaller instance = new InvokeRequestMarshaller();

    public static InvokeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InvokeRequest invokeRequest, ProtocolMarshaller protocolMarshaller) {

        if (invokeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(invokeRequest.getFunctionName(), FUNCTIONNAME_BINDING);
            protocolMarshaller.marshall(invokeRequest.getInvocationType(), INVOCATIONTYPE_BINDING);
            protocolMarshaller.marshall(invokeRequest.getLogType(), LOGTYPE_BINDING);
            protocolMarshaller.marshall(invokeRequest.getClientContext(), CLIENTCONTEXT_BINDING);
            protocolMarshaller.marshall(invokeRequest.getPayload(), PAYLOAD_BINDING);
            protocolMarshaller.marshall(invokeRequest.getQualifier(), QUALIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
