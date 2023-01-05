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
package com.amazonaws.services.sagemakerruntime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakerruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InvokeEndpointAsyncRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InvokeEndpointAsyncRequestMarshaller {

    private static final MarshallingInfo<String> ENDPOINTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("EndpointName").build();
    private static final MarshallingInfo<String> CONTENTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Content-Type").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("X-Amzn-SageMaker-Accept").build();
    private static final MarshallingInfo<String> CUSTOMATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Custom-Attributes").build();
    private static final MarshallingInfo<String> INFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-Inference-Id").build();
    private static final MarshallingInfo<String> INPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-InputLocation").build();
    private static final MarshallingInfo<Integer> REQUESTTTLSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-SageMaker-RequestTTLSeconds").build();

    private static final InvokeEndpointAsyncRequestMarshaller instance = new InvokeEndpointAsyncRequestMarshaller();

    public static InvokeEndpointAsyncRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InvokeEndpointAsyncRequest invokeEndpointAsyncRequest, ProtocolMarshaller protocolMarshaller) {

        if (invokeEndpointAsyncRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getEndpointName(), ENDPOINTNAME_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getContentType(), CONTENTTYPE_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getAccept(), ACCEPT_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getCustomAttributes(), CUSTOMATTRIBUTES_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getInferenceId(), INFERENCEID_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getInputLocation(), INPUTLOCATION_BINDING);
            protocolMarshaller.marshall(invokeEndpointAsyncRequest.getRequestTTLSeconds(), REQUESTTTLSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
