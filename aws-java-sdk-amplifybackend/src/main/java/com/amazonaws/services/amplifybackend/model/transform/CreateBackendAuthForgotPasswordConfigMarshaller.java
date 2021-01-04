/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateBackendAuthForgotPasswordConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateBackendAuthForgotPasswordConfigMarshaller {

    private static final MarshallingInfo<String> DELIVERYMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deliveryMethod").build();
    private static final MarshallingInfo<StructuredPojo> EMAILSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("emailSettings").build();
    private static final MarshallingInfo<StructuredPojo> SMSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("smsSettings").build();

    private static final CreateBackendAuthForgotPasswordConfigMarshaller instance = new CreateBackendAuthForgotPasswordConfigMarshaller();

    public static CreateBackendAuthForgotPasswordConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateBackendAuthForgotPasswordConfig createBackendAuthForgotPasswordConfig, ProtocolMarshaller protocolMarshaller) {

        if (createBackendAuthForgotPasswordConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createBackendAuthForgotPasswordConfig.getDeliveryMethod(), DELIVERYMETHOD_BINDING);
            protocolMarshaller.marshall(createBackendAuthForgotPasswordConfig.getEmailSettings(), EMAILSETTINGS_BINDING);
            protocolMarshaller.marshall(createBackendAuthForgotPasswordConfig.getSmsSettings(), SMSSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
