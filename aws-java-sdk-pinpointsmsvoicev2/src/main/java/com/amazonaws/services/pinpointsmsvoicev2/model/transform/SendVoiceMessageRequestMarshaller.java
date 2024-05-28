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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpointsmsvoicev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SendVoiceMessageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SendVoiceMessageRequestMarshaller {

    private static final MarshallingInfo<String> DESTINATIONPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationPhoneNumber").build();
    private static final MarshallingInfo<String> ORIGINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginationIdentity").build();
    private static final MarshallingInfo<String> MESSAGEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageBody").build();
    private static final MarshallingInfo<String> MESSAGEBODYTEXTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageBodyTextType").build();
    private static final MarshallingInfo<String> VOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VoiceId").build();
    private static final MarshallingInfo<String> CONFIGURATIONSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConfigurationSetName").build();
    private static final MarshallingInfo<String> MAXPRICEPERMINUTE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxPricePerMinute").build();
    private static final MarshallingInfo<Integer> TIMETOLIVE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeToLive").build();
    private static final MarshallingInfo<Map> CONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Context").build();
    private static final MarshallingInfo<Boolean> DRYRUN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DryRun").build();
    private static final MarshallingInfo<String> PROTECTCONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProtectConfigurationId").build();

    private static final SendVoiceMessageRequestMarshaller instance = new SendVoiceMessageRequestMarshaller();

    public static SendVoiceMessageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SendVoiceMessageRequest sendVoiceMessageRequest, ProtocolMarshaller protocolMarshaller) {

        if (sendVoiceMessageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sendVoiceMessageRequest.getDestinationPhoneNumber(), DESTINATIONPHONENUMBER_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getOriginationIdentity(), ORIGINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getMessageBody(), MESSAGEBODY_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getMessageBodyTextType(), MESSAGEBODYTEXTTYPE_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getVoiceId(), VOICEID_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getConfigurationSetName(), CONFIGURATIONSETNAME_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getMaxPricePerMinute(), MAXPRICEPERMINUTE_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getTimeToLive(), TIMETOLIVE_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getContext(), CONTEXT_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getDryRun(), DRYRUN_BINDING);
            protocolMarshaller.marshall(sendVoiceMessageRequest.getProtectConfigurationId(), PROTECTCONFIGURATIONID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
