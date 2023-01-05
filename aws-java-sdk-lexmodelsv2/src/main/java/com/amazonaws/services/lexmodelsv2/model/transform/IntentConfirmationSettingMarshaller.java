/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * IntentConfirmationSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IntentConfirmationSettingMarshaller {

    private static final MarshallingInfo<StructuredPojo> PROMPTSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("promptSpecification").build();
    private static final MarshallingInfo<StructuredPojo> DECLINATIONRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("declinationResponse").build();
    private static final MarshallingInfo<Boolean> ACTIVE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("active").build();
    private static final MarshallingInfo<StructuredPojo> CONFIRMATIONRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationResponse").build();
    private static final MarshallingInfo<StructuredPojo> CONFIRMATIONNEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationNextStep").build();
    private static final MarshallingInfo<StructuredPojo> CONFIRMATIONCONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("confirmationConditional").build();
    private static final MarshallingInfo<StructuredPojo> DECLINATIONNEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("declinationNextStep").build();
    private static final MarshallingInfo<StructuredPojo> DECLINATIONCONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("declinationConditional").build();
    private static final MarshallingInfo<StructuredPojo> FAILURERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureResponse").build();
    private static final MarshallingInfo<StructuredPojo> FAILURENEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureNextStep").build();
    private static final MarshallingInfo<StructuredPojo> FAILURECONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureConditional").build();
    private static final MarshallingInfo<StructuredPojo> CODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codeHook").build();
    private static final MarshallingInfo<StructuredPojo> ELICITATIONCODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("elicitationCodeHook").build();

    private static final IntentConfirmationSettingMarshaller instance = new IntentConfirmationSettingMarshaller();

    public static IntentConfirmationSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IntentConfirmationSetting intentConfirmationSetting, ProtocolMarshaller protocolMarshaller) {

        if (intentConfirmationSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(intentConfirmationSetting.getPromptSpecification(), PROMPTSPECIFICATION_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getDeclinationResponse(), DECLINATIONRESPONSE_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getActive(), ACTIVE_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getConfirmationResponse(), CONFIRMATIONRESPONSE_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getConfirmationNextStep(), CONFIRMATIONNEXTSTEP_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getConfirmationConditional(), CONFIRMATIONCONDITIONAL_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getDeclinationNextStep(), DECLINATIONNEXTSTEP_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getDeclinationConditional(), DECLINATIONCONDITIONAL_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getFailureResponse(), FAILURERESPONSE_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getFailureNextStep(), FAILURENEXTSTEP_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getFailureConditional(), FAILURECONDITIONAL_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getCodeHook(), CODEHOOK_BINDING);
            protocolMarshaller.marshall(intentConfirmationSetting.getElicitationCodeHook(), ELICITATIONCODEHOOK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
