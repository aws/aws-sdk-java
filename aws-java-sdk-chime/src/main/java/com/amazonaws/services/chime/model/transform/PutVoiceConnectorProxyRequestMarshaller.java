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
package com.amazonaws.services.chime.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutVoiceConnectorProxyRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutVoiceConnectorProxyRequestMarshaller {

    private static final MarshallingInfo<String> VOICECONNECTORID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("voiceConnectorId").build();
    private static final MarshallingInfo<Integer> DEFAULTSESSIONEXPIRYMINUTES_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultSessionExpiryMinutes").build();
    private static final MarshallingInfo<List> PHONENUMBERPOOLCOUNTRIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumberPoolCountries").build();
    private static final MarshallingInfo<String> FALLBACKPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FallBackPhoneNumber").build();
    private static final MarshallingInfo<Boolean> DISABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Disabled").build();

    private static final PutVoiceConnectorProxyRequestMarshaller instance = new PutVoiceConnectorProxyRequestMarshaller();

    public static PutVoiceConnectorProxyRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutVoiceConnectorProxyRequest putVoiceConnectorProxyRequest, ProtocolMarshaller protocolMarshaller) {

        if (putVoiceConnectorProxyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putVoiceConnectorProxyRequest.getVoiceConnectorId(), VOICECONNECTORID_BINDING);
            protocolMarshaller.marshall(putVoiceConnectorProxyRequest.getDefaultSessionExpiryMinutes(), DEFAULTSESSIONEXPIRYMINUTES_BINDING);
            protocolMarshaller.marshall(putVoiceConnectorProxyRequest.getPhoneNumberPoolCountries(), PHONENUMBERPOOLCOUNTRIES_BINDING);
            protocolMarshaller.marshall(putVoiceConnectorProxyRequest.getFallBackPhoneNumber(), FALLBACKPHONENUMBER_BINDING);
            protocolMarshaller.marshall(putVoiceConnectorProxyRequest.getDisabled(), DISABLED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
