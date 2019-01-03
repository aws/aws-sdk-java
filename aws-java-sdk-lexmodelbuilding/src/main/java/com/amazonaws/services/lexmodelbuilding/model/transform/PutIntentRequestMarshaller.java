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
 * PutIntentRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutIntentRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> SLOTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("slots").build();
    private static final MarshallingInfo<List> SAMPLEUTTERANCES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sampleUtterances").build();
    private static final MarshallingInfo<StructuredPojo> CONFIRMATIONPROMPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationPrompt").build();
    private static final MarshallingInfo<StructuredPojo> REJECTIONSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rejectionStatement").build();
    private static final MarshallingInfo<StructuredPojo> FOLLOWUPPROMPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("followUpPrompt").build();
    private static final MarshallingInfo<StructuredPojo> CONCLUSIONSTATEMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conclusionStatement").build();
    private static final MarshallingInfo<StructuredPojo> DIALOGCODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dialogCodeHook").build();
    private static final MarshallingInfo<StructuredPojo> FULFILLMENTACTIVITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fulfillmentActivity").build();
    private static final MarshallingInfo<String> PARENTINTENTSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentIntentSignature").build();
    private static final MarshallingInfo<String> CHECKSUM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("checksum").build();
    private static final MarshallingInfo<Boolean> CREATEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createVersion").build();

    private static final PutIntentRequestMarshaller instance = new PutIntentRequestMarshaller();

    public static PutIntentRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutIntentRequest putIntentRequest, ProtocolMarshaller protocolMarshaller) {

        if (putIntentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putIntentRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getSlots(), SLOTS_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getSampleUtterances(), SAMPLEUTTERANCES_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getConfirmationPrompt(), CONFIRMATIONPROMPT_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getRejectionStatement(), REJECTIONSTATEMENT_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getFollowUpPrompt(), FOLLOWUPPROMPT_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getConclusionStatement(), CONCLUSIONSTATEMENT_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getDialogCodeHook(), DIALOGCODEHOOK_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getFulfillmentActivity(), FULFILLMENTACTIVITY_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getParentIntentSignature(), PARENTINTENTSIGNATURE_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getChecksum(), CHECKSUM_BINDING);
            protocolMarshaller.marshall(putIntentRequest.getCreateVersion(), CREATEVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
