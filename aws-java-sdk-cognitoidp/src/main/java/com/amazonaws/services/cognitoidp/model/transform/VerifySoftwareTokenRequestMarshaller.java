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
 * VerifySoftwareTokenRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerifySoftwareTokenRequestMarshaller {

    private static final MarshallingInfo<String> ACCESSTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessToken").build();
    private static final MarshallingInfo<String> SESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Session").build();
    private static final MarshallingInfo<String> USERCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserCode").build();
    private static final MarshallingInfo<String> FRIENDLYDEVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FriendlyDeviceName").build();

    private static final VerifySoftwareTokenRequestMarshaller instance = new VerifySoftwareTokenRequestMarshaller();

    public static VerifySoftwareTokenRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerifySoftwareTokenRequest verifySoftwareTokenRequest, ProtocolMarshaller protocolMarshaller) {

        if (verifySoftwareTokenRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verifySoftwareTokenRequest.getAccessToken(), ACCESSTOKEN_BINDING);
            protocolMarshaller.marshall(verifySoftwareTokenRequest.getSession(), SESSION_BINDING);
            protocolMarshaller.marshall(verifySoftwareTokenRequest.getUserCode(), USERCODE_BINDING);
            protocolMarshaller.marshall(verifySoftwareTokenRequest.getFriendlyDeviceName(), FRIENDLYDEVICENAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
