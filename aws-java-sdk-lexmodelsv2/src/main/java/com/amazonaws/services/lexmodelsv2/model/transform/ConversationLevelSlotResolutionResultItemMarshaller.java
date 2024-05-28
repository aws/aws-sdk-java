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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConversationLevelSlotResolutionResultItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConversationLevelSlotResolutionResultItemMarshaller {

    private static final MarshallingInfo<String> INTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentName").build();
    private static final MarshallingInfo<String> SLOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slotName").build();
    private static final MarshallingInfo<String> MATCHRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("matchResult").build();

    private static final ConversationLevelSlotResolutionResultItemMarshaller instance = new ConversationLevelSlotResolutionResultItemMarshaller();

    public static ConversationLevelSlotResolutionResultItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConversationLevelSlotResolutionResultItem conversationLevelSlotResolutionResultItem, ProtocolMarshaller protocolMarshaller) {

        if (conversationLevelSlotResolutionResultItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(conversationLevelSlotResolutionResultItem.getIntentName(), INTENTNAME_BINDING);
            protocolMarshaller.marshall(conversationLevelSlotResolutionResultItem.getSlotName(), SLOTNAME_BINDING);
            protocolMarshaller.marshall(conversationLevelSlotResolutionResultItem.getMatchResult(), MATCHRESULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
