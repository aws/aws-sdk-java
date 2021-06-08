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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListenerTimeoutMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListenerTimeoutMarshaller {

    private static final MarshallingInfo<StructuredPojo> GRPC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("grpc").build();
    private static final MarshallingInfo<StructuredPojo> HTTP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("http").build();
    private static final MarshallingInfo<StructuredPojo> HTTP2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("http2").build();
    private static final MarshallingInfo<StructuredPojo> TCP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tcp").build();

    private static final ListenerTimeoutMarshaller instance = new ListenerTimeoutMarshaller();

    public static ListenerTimeoutMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListenerTimeout listenerTimeout, ProtocolMarshaller protocolMarshaller) {

        if (listenerTimeout == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listenerTimeout.getGrpc(), GRPC_BINDING);
            protocolMarshaller.marshall(listenerTimeout.getHttp(), HTTP_BINDING);
            protocolMarshaller.marshall(listenerTimeout.getHttp2(), HTTP2_BINDING);
            protocolMarshaller.marshall(listenerTimeout.getTcp(), TCP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
