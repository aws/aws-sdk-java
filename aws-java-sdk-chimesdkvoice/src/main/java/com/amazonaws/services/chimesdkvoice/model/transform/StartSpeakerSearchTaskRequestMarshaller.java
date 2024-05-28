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
package com.amazonaws.services.chimesdkvoice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkvoice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartSpeakerSearchTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartSpeakerSearchTaskRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("VoiceConnectorId").build();
    private static final MarshallingInfo<String> TRANSACTIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TransactionId").build();
    private static final MarshallingInfo<String> VOICEPROFILEDOMAINID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VoiceProfileDomainId").build();
    private static final MarshallingInfo<String> CLIENTREQUESTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientRequestToken").build();
    private static final MarshallingInfo<String> CALLLEG_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CallLeg").build();

    private static final StartSpeakerSearchTaskRequestMarshaller instance = new StartSpeakerSearchTaskRequestMarshaller();

    public static StartSpeakerSearchTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartSpeakerSearchTaskRequest startSpeakerSearchTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startSpeakerSearchTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startSpeakerSearchTaskRequest.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
            protocolMarshaller.marshall(startSpeakerSearchTaskRequest.getTransactionId(), TRANSACTIONID_BINDING);
            protocolMarshaller.marshall(startSpeakerSearchTaskRequest.getVoiceProfileDomainId(), VOICEPROFILEDOMAINID_BINDING);
            protocolMarshaller.marshall(startSpeakerSearchTaskRequest.getClientRequestToken(), CLIENTREQUESTTOKEN_BINDING);
            protocolMarshaller.marshall(startSpeakerSearchTaskRequest.getCallLeg(), CALLLEG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
