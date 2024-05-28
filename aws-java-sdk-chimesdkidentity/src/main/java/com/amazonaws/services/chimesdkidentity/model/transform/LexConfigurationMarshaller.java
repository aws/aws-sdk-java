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
package com.amazonaws.services.chimesdkidentity.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chimesdkidentity.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LexConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LexConfigurationMarshaller {

    private static final MarshallingInfo<String> RESPONDSTO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RespondsTo").build();
    private static final MarshallingInfo<StructuredPojo> INVOKEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InvokedBy").build();
    private static final MarshallingInfo<String> LEXBOTALIASARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LexBotAliasArn").build();
    private static final MarshallingInfo<String> LOCALEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LocaleId").build();
    private static final MarshallingInfo<String> WELCOMEINTENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WelcomeIntent").build();

    private static final LexConfigurationMarshaller instance = new LexConfigurationMarshaller();

    public static LexConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LexConfiguration lexConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (lexConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lexConfiguration.getRespondsTo(), RESPONDSTO_BINDING);
            protocolMarshaller.marshall(lexConfiguration.getInvokedBy(), INVOKEDBY_BINDING);
            protocolMarshaller.marshall(lexConfiguration.getLexBotAliasArn(), LEXBOTALIASARN_BINDING);
            protocolMarshaller.marshall(lexConfiguration.getLocaleId(), LOCALEID_BINDING);
            protocolMarshaller.marshall(lexConfiguration.getWelcomeIntent(), WELCOMEINTENT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
