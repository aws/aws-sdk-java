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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendChannelMessageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendChannelMessageRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("channelArn").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> PERSISTENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Persistence").build();
    private static final MarshallingInfo<String> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metadata").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> CHIMEBEARER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-chime-bearer").build();

    private static final SendChannelMessageRequestMarshaller instance = new SendChannelMessageRequestMarshaller();

    public static SendChannelMessageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendChannelMessageRequest sendChannelMessageRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendChannelMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendChannelMessageRequest.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getPersistence(), PERSISTENCE_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(sendChannelMessageRequest.getChimeBearer(), CHIMEBEARER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
