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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UtteranceSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UtteranceSpecificationMarshaller {

    private static final MarshallingInfo<String> BOTALIASID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botAliasId").build();
    private static final MarshallingInfo<String> BOTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botVersion").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("localeId").build();
    private static final MarshallingInfo<String> SESSIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("sessionId").build();
    private static final MarshallingInfo<String> CHANNEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("channel").build();
    private static final MarshallingInfo<String> MODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("mode").build();
    private static final MarshallingInfo<java.util.Date> CONVERSATIONSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CONVERSATIONENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> UTTERANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("utterance").build();
    private static final MarshallingInfo<java.util.Date> UTTERANCETIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> AUDIOVOICEDURATIONMILLIS_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("audioVoiceDurationMillis").build();
    private static final MarshallingInfo<Boolean> UTTERANCEUNDERSTOOD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceUnderstood").build();
    private static final MarshallingInfo<String> INPUTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("inputType").build();
    private static final MarshallingInfo<String> OUTPUTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputType").build();
    private static final MarshallingInfo<String> ASSOCIATEDINTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedIntentName").build();
    private static final MarshallingInfo<String> ASSOCIATEDSLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedSlotName").build();
    private static final MarshallingInfo<String> INTENTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentState").build();
    private static final MarshallingInfo<String> DIALOGACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogActionType").build();
    private static final MarshallingInfo<String> BOTRESPONSEAUDIOVOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("botResponseAudioVoiceId").build();
    private static final MarshallingInfo<String> SLOTSFILLEDINSESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotsFilledInSession").build();
    private static final MarshallingInfo<String> UTTERANCEREQUESTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("utteranceRequestId").build();
    private static final MarshallingInfo<List> BOTRESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("botResponses").build();

    private static final UtteranceSpecificationMarshaller instance = new UtteranceSpecificationMarshaller();

    public static UtteranceSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UtteranceSpecification utteranceSpecification, ProtocolMarshaller protocolMarshaller) {

        if (utteranceSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(utteranceSpecification.getBotAliasId(), BOTALIASID_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getBotVersion(), BOTVERSION_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getSessionId(), SESSIONID_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getChannel(), CHANNEL_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getMode(), MODE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getConversationStartTime(), CONVERSATIONSTARTTIME_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getConversationEndTime(), CONVERSATIONENDTIME_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getUtterance(), UTTERANCE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getUtteranceTimestamp(), UTTERANCETIMESTAMP_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getAudioVoiceDurationMillis(), AUDIOVOICEDURATIONMILLIS_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getUtteranceUnderstood(), UTTERANCEUNDERSTOOD_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getInputType(), INPUTTYPE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getOutputType(), OUTPUTTYPE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getAssociatedIntentName(), ASSOCIATEDINTENTNAME_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getAssociatedSlotName(), ASSOCIATEDSLOTNAME_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getIntentState(), INTENTSTATE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getDialogActionType(), DIALOGACTIONTYPE_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getBotResponseAudioVoiceId(), BOTRESPONSEAUDIOVOICEID_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getSlotsFilledInSession(), SLOTSFILLEDINSESSION_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getUtteranceRequestId(), UTTERANCEREQUESTID_BINDING);
            protocolMarshaller.marshall(utteranceSpecification.getBotResponses(), BOTRESPONSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
