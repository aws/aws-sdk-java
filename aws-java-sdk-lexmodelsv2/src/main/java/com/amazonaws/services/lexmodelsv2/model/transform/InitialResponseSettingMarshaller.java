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
 * InitialResponseSettingMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InitialResponseSettingMarshaller {

    private static final MarshallingInfo<StructuredPojo> INITIALRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initialResponse").build();
    private static final MarshallingInfo<StructuredPojo> NEXTSTEP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("nextStep").build();
    private static final MarshallingInfo<StructuredPojo> CONDITIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("conditional").build();
    private static final MarshallingInfo<StructuredPojo> CODEHOOK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("codeHook").build();

    private static final InitialResponseSettingMarshaller instance = new InitialResponseSettingMarshaller();

    public static InitialResponseSettingMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InitialResponseSetting initialResponseSetting, ProtocolMarshaller protocolMarshaller) {

        if (initialResponseSetting == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(initialResponseSetting.getInitialResponse(), INITIALRESPONSE_BINDING);
            protocolMarshaller.marshall(initialResponseSetting.getNextStep(), NEXTSTEP_BINDING);
            protocolMarshaller.marshall(initialResponseSetting.getConditional(), CONDITIONAL_BINDING);
            protocolMarshaller.marshall(initialResponseSetting.getCodeHook(), CODEHOOK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
