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
 * SlotCaptureSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SlotCaptureSettingMarshaller {

    private static final MarshallingInfo<StructuredPojo> CAPTURERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captureResponse").build();
    private static final MarshallingInfo<StructuredPojo> CAPTURENEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captureNextStep").build();
    private static final MarshallingInfo<StructuredPojo> CAPTURECONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("captureConditional").build();
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

    private static final SlotCaptureSettingMarshaller instance = new SlotCaptureSettingMarshaller();

    public static SlotCaptureSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SlotCaptureSetting slotCaptureSetting, ProtocolMarshaller protocolMarshaller) {

        if (slotCaptureSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(slotCaptureSetting.getCaptureResponse(), CAPTURERESPONSE_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getCaptureNextStep(), CAPTURENEXTSTEP_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getCaptureConditional(), CAPTURECONDITIONAL_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getFailureResponse(), FAILURERESPONSE_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getFailureNextStep(), FAILURENEXTSTEP_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getFailureConditional(), FAILURECONDITIONAL_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getCodeHook(), CODEHOOK_BINDING);
            protocolMarshaller.marshall(slotCaptureSetting.getElicitationCodeHook(), ELICITATIONCODEHOOK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
