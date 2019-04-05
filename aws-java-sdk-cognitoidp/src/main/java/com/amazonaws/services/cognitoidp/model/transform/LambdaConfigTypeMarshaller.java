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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaConfigTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaConfigTypeMarshaller {

    private static final MarshallingInfo<String> PRESIGNUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PreSignUp").build();
    private static final MarshallingInfo<String> CUSTOMMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomMessage").build();
    private static final MarshallingInfo<String> POSTCONFIRMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostConfirmation").build();
    private static final MarshallingInfo<String> PREAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreAuthentication").build();
    private static final MarshallingInfo<String> POSTAUTHENTICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostAuthentication").build();
    private static final MarshallingInfo<String> DEFINEAUTHCHALLENGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefineAuthChallenge").build();
    private static final MarshallingInfo<String> CREATEAUTHCHALLENGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateAuthChallenge").build();
    private static final MarshallingInfo<String> VERIFYAUTHCHALLENGERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerifyAuthChallengeResponse").build();
    private static final MarshallingInfo<String> PRETOKENGENERATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PreTokenGeneration").build();
    private static final MarshallingInfo<String> USERMIGRATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserMigration").build();

    private static final LambdaConfigTypeMarshaller instance = new LambdaConfigTypeMarshaller();

    public static LambdaConfigTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaConfigType lambdaConfigType, ProtocolMarshaller protocolMarshaller) {

        if (lambdaConfigType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaConfigType.getPreSignUp(), PRESIGNUP_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getCustomMessage(), CUSTOMMESSAGE_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getPostConfirmation(), POSTCONFIRMATION_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getPreAuthentication(), PREAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getPostAuthentication(), POSTAUTHENTICATION_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getDefineAuthChallenge(), DEFINEAUTHCHALLENGE_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getCreateAuthChallenge(), CREATEAUTHCHALLENGE_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getVerifyAuthChallengeResponse(), VERIFYAUTHCHALLENGERESPONSE_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getPreTokenGeneration(), PRETOKENGENERATION_BINDING);
            protocolMarshaller.marshall(lambdaConfigType.getUserMigration(), USERMIGRATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
