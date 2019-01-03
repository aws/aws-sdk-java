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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelbuilding.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutBotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutBotRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> INTENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("intents").build();
    private static final MarshallingInfo<StructuredPojo> CLARIFICATIONPROMPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clarificationPrompt").build();
    private static final MarshallingInfo<StructuredPojo> ABORTSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("abortStatement").build();
    private static final MarshallingInfo<Integer> IDLESESSIONTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idleSessionTTLInSeconds").build();
    private static final MarshallingInfo<String> VOICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("voiceId").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checksum").build();
    private static final MarshallingInfo<String> PROCESSBEHAVIOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("processBehavior").build();
    private static final MarshallingInfo<String> LOCALE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("locale").build();
    private static final MarshallingInfo<Boolean> CHILDDIRECTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("childDirected").build();
    private static final MarshallingInfo<Boolean> CREATEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createVersion").build();

    private static final PutBotRequestMarshaller instance = new PutBotRequestMarshaller();

    public static PutBotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutBotRequest putBotRequest, ProtocolMarshaller protocolMarshaller) {

        if (putBotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putBotRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(putBotRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(putBotRequest.getIntents(), INTENTS_BINDING);
            protocolMarshaller.marshall(putBotRequest.getClarificationPrompt(), CLARIFICATIONPROMPT_BINDING);
            protocolMarshaller.marshall(putBotRequest.getAbortStatement(), ABORTSTATEMENT_BINDING);
            protocolMarshaller.marshall(putBotRequest.getIdleSessionTTLInSeconds(), IDLESESSIONTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(putBotRequest.getVoiceId(), VOICEID_BINDING);
            protocolMarshaller.marshall(putBotRequest.getChecksum(), CHECKSUM_BINDING);
            protocolMarshaller.marshall(putBotRequest.getProcessBehavior(), PROCESSBEHAVIOR_BINDING);
            protocolMarshaller.marshall(putBotRequest.getLocale(), LOCALE_BINDING);
            protocolMarshaller.marshall(putBotRequest.getChildDirected(), CHILDDIRECTED_BINDING);
            protocolMarshaller.marshall(putBotRequest.getCreateVersion(), CREATEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
