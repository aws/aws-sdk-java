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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateChannelMessageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateChannelMessageRequestMarshaller {

    private static final MarshallingInfo<String> CHANNELARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("channelArn").build();
    private static final MarshallingInfo<String> MESSAGEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("messageId").build();
    private static final MarshallingInfo<String> CONTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Content").build();
    private static final MarshallingInfo<String> METADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Metadata").build();
    private static final MarshallingInfo<String> CHIMEBEARER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("x-amz-chime-bearer").build();

    private static final UpdateChannelMessageRequestMarshaller instance = new UpdateChannelMessageRequestMarshaller();

    public static UpdateChannelMessageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateChannelMessageRequest updateChannelMessageRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateChannelMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateChannelMessageRequest.getChannelArn(), CHANNELARN_BINDING);
            protocolMarshaller.marshall(updateChannelMessageRequest.getMessageId(), MESSAGEID_BINDING);
            protocolMarshaller.marshall(updateChannelMessageRequest.getContent(), CONTENT_BINDING);
            protocolMarshaller.marshall(updateChannelMessageRequest.getMetadata(), METADATA_BINDING);
            protocolMarshaller.marshall(updateChannelMessageRequest.getChimeBearer(), CHIMEBEARER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
