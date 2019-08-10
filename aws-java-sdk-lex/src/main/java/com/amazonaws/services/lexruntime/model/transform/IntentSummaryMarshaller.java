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
package com.amazonaws.services.lexruntime.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexruntime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IntentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IntentSummaryMarshaller {

    private static final MarshallingInfo<String> INTENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intentName").build();
    private static final MarshallingInfo<Map> SLOTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slots").build();
    private static final MarshallingInfo<String> CONFIRMATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationStatus").build();
    private static final MarshallingInfo<String> DIALOGACTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogActionType").build();
    private static final MarshallingInfo<String> FULFILLMENTSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fulfillmentState").build();
    private static final MarshallingInfo<String> SLOTTOELICIT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("slotToElicit").build();

    private static final IntentSummaryMarshaller instance = new IntentSummaryMarshaller();

    public static IntentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IntentSummary intentSummary, ProtocolMarshaller protocolMarshaller) {

        if (intentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(intentSummary.getIntentName(), INTENTNAME_BINDING);
            protocolMarshaller.marshall(intentSummary.getSlots(), SLOTS_BINDING);
            protocolMarshaller.marshall(intentSummary.getConfirmationStatus(), CONFIRMATIONSTATUS_BINDING);
            protocolMarshaller.marshall(intentSummary.getDialogActionType(), DIALOGACTIONTYPE_BINDING);
            protocolMarshaller.marshall(intentSummary.getFulfillmentState(), FULFILLMENTSTATE_BINDING);
            protocolMarshaller.marshall(intentSummary.getSlotToElicit(), SLOTTOELICIT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
