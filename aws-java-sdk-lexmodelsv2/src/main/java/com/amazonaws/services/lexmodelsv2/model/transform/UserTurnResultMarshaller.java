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
 * UserTurnResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserTurnResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> INPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("input").build();
    private static final MarshallingInfo<StructuredPojo> EXPECTEDOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expectedOutput").build();
    private static final MarshallingInfo<StructuredPojo> ACTUALOUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("actualOutput").build();
    private static final MarshallingInfo<StructuredPojo> ERRORDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorDetails").build();
    private static final MarshallingInfo<String> ENDTOENDRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("endToEndResult").build();
    private static final MarshallingInfo<String> INTENTMATCHRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentMatchResult").build();
    private static final MarshallingInfo<String> SLOTMATCHRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotMatchResult").build();
    private static final MarshallingInfo<String> SPEECHTRANSCRIPTIONRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("speechTranscriptionResult").build();
    private static final MarshallingInfo<StructuredPojo> CONVERSATIONLEVELRESULT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conversationLevelResult").build();

    private static final UserTurnResultMarshaller instance = new UserTurnResultMarshaller();

    public static UserTurnResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserTurnResult userTurnResult, ProtocolMarshaller protocolMarshaller) {

        if (userTurnResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userTurnResult.getInput(), INPUT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getExpectedOutput(), EXPECTEDOUTPUT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getActualOutput(), ACTUALOUTPUT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getErrorDetails(), ERRORDETAILS_BINDING);
            protocolMarshaller.marshall(userTurnResult.getEndToEndResult(), ENDTOENDRESULT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getIntentMatchResult(), INTENTMATCHRESULT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getSlotMatchResult(), SLOTMATCHRESULT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getSpeechTranscriptionResult(), SPEECHTRANSCRIPTIONRESULT_BINDING);
            protocolMarshaller.marshall(userTurnResult.getConversationLevelResult(), CONVERSATIONLEVELRESULT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
