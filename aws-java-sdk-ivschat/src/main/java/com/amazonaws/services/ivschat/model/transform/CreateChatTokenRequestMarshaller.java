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
package com.amazonaws.services.ivschat.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ivschat.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateChatTokenRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateChatTokenRequestMarshaller {

    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributes").build();
    private static final MarshallingInfo<List> CAPABILITIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("capabilities").build();
    private static final MarshallingInfo<String> ROOMIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("roomIdentifier").build();
    private static final MarshallingInfo<Integer> SESSIONDURATIONINMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sessionDurationInMinutes").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userId").build();

    private static final CreateChatTokenRequestMarshaller instance = new CreateChatTokenRequestMarshaller();

    public static CreateChatTokenRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateChatTokenRequest createChatTokenRequest, ProtocolMarshaller protocolMarshaller) {

        if (createChatTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createChatTokenRequest.getAttributes(), ATTRIBUTES_BINDING);
            protocolMarshaller.marshall(createChatTokenRequest.getCapabilities(), CAPABILITIES_BINDING);
            protocolMarshaller.marshall(createChatTokenRequest.getRoomIdentifier(), ROOMIDENTIFIER_BINDING);
            protocolMarshaller.marshall(createChatTokenRequest.getSessionDurationInMinutes(), SESSIONDURATIONINMINUTES_BINDING);
            protocolMarshaller.marshall(createChatTokenRequest.getUserId(), USERID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
