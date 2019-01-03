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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RespondToAuthChallengeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RespondToAuthChallengeRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> CHALLENGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChallengeName").build();
    private static final MarshallingInfo<String> SESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Session").build();
    private static final MarshallingInfo<Map> CHALLENGERESPONSES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChallengeResponses").build();
    private static final MarshallingInfo<StructuredPojo> ANALYTICSMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyticsMetadata").build();
    private static final MarshallingInfo<StructuredPojo> USERCONTEXTDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserContextData").build();

    private static final RespondToAuthChallengeRequestMarshaller instance = new RespondToAuthChallengeRequestMarshaller();

    public static RespondToAuthChallengeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RespondToAuthChallengeRequest respondToAuthChallengeRequest, ProtocolMarshaller protocolMarshaller) {

        if (respondToAuthChallengeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getChallengeName(), CHALLENGENAME_BINDING);
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getSession(), SESSION_BINDING);
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getChallengeResponses(), CHALLENGERESPONSES_BINDING);
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getAnalyticsMetadata(), ANALYTICSMETADATA_BINDING);
            protocolMarshaller.marshall(respondToAuthChallengeRequest.getUserContextData(), USERCONTEXTDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
