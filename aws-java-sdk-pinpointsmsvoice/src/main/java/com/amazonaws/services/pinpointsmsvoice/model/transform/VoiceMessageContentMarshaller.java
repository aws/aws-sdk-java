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
package com.amazonaws.services.pinpointsmsvoice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VoiceMessageContentMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VoiceMessageContentMarshaller {

    private static final MarshallingInfo<StructuredPojo> CALLINSTRUCTIONSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CallInstructionsMessage").build();
    private static final MarshallingInfo<StructuredPojo> PLAINTEXTMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PlainTextMessage").build();
    private static final MarshallingInfo<StructuredPojo> SSMLMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SSMLMessage").build();

    private static final VoiceMessageContentMarshaller instance = new VoiceMessageContentMarshaller();

    public static VoiceMessageContentMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VoiceMessageContent voiceMessageContent, ProtocolMarshaller protocolMarshaller) {

        if (voiceMessageContent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(voiceMessageContent.getCallInstructionsMessage(), CALLINSTRUCTIONSMESSAGE_BINDING);
            protocolMarshaller.marshall(voiceMessageContent.getPlainTextMessage(), PLAINTEXTMESSAGE_BINDING);
            protocolMarshaller.marshall(voiceMessageContent.getSSMLMessage(), SSMLMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
