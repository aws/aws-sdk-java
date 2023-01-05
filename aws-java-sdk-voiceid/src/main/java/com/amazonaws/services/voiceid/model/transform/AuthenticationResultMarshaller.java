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
package com.amazonaws.services.voiceid.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.voiceid.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthenticationResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthenticationResultMarshaller {

    private static final MarshallingInfo<java.util.Date> AUDIOAGGREGATIONENDEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioAggregationEndedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> AUDIOAGGREGATIONSTARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AudioAggregationStartedAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> AUTHENTICATIONRESULTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuthenticationResultId").build();
    private static final MarshallingInfo<StructuredPojo> CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Configuration").build();
    private static final MarshallingInfo<String> CUSTOMERSPEAKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomerSpeakerId").build();
    private static final MarshallingInfo<String> DECISION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Decision").build();
    private static final MarshallingInfo<String> GENERATEDSPEAKERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeneratedSpeakerId").build();
    private static final MarshallingInfo<Integer> SCORE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Score").build();

    private static final AuthenticationResultMarshaller instance = new AuthenticationResultMarshaller();

    public static AuthenticationResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthenticationResult authenticationResult, ProtocolMarshaller protocolMarshaller) {

        if (authenticationResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authenticationResult.getAudioAggregationEndedAt(), AUDIOAGGREGATIONENDEDAT_BINDING);
            protocolMarshaller.marshall(authenticationResult.getAudioAggregationStartedAt(), AUDIOAGGREGATIONSTARTEDAT_BINDING);
            protocolMarshaller.marshall(authenticationResult.getAuthenticationResultId(), AUTHENTICATIONRESULTID_BINDING);
            protocolMarshaller.marshall(authenticationResult.getConfiguration(), CONFIGURATION_BINDING);
            protocolMarshaller.marshall(authenticationResult.getCustomerSpeakerId(), CUSTOMERSPEAKERID_BINDING);
            protocolMarshaller.marshall(authenticationResult.getDecision(), DECISION_BINDING);
            protocolMarshaller.marshall(authenticationResult.getGeneratedSpeakerId(), GENERATEDSPEAKERID_BINDING);
            protocolMarshaller.marshall(authenticationResult.getScore(), SCORE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
