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
 * ConversationLevelTestResultItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConversationLevelTestResultItemMarshaller {

    private static final MarshallingInfo<String> CONVERSATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationId").build();
    private static final MarshallingInfo<String> ENDTOENDRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endToEndResult").build();
    private static final MarshallingInfo<String> SPEECHTRANSCRIPTIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("speechTranscriptionResult").build();
    private static final MarshallingInfo<List> INTENTCLASSIFICATIONRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentClassificationResults").build();
    private static final MarshallingInfo<List> SLOTRESOLUTIONRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotResolutionResults").build();

    private static final ConversationLevelTestResultItemMarshaller instance = new ConversationLevelTestResultItemMarshaller();

    public static ConversationLevelTestResultItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConversationLevelTestResultItem conversationLevelTestResultItem, ProtocolMarshaller protocolMarshaller) {

        if (conversationLevelTestResultItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conversationLevelTestResultItem.getConversationId(), CONVERSATIONID_BINDING);
            protocolMarshaller.marshall(conversationLevelTestResultItem.getEndToEndResult(), ENDTOENDRESULT_BINDING);
            protocolMarshaller.marshall(conversationLevelTestResultItem.getSpeechTranscriptionResult(), SPEECHTRANSCRIPTIONRESULT_BINDING);
            protocolMarshaller.marshall(conversationLevelTestResultItem.getIntentClassificationResults(), INTENTCLASSIFICATIONRESULTS_BINDING);
            protocolMarshaller.marshall(conversationLevelTestResultItem.getSlotResolutionResults(), SLOTRESOLUTIONRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
