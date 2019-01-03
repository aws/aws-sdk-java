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
package com.amazonaws.services.iot.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateAuthorizerRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateAuthorizerRequestMarshaller {

    private static final MarshallingInfo<String> AUTHORIZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("authorizerName").build();
    private static final MarshallingInfo<String> AUTHORIZERFUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerFunctionArn").build();
    private static final MarshallingInfo<String> TOKENKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenKeyName").build();
    private static final MarshallingInfo<Map> TOKENSIGNINGPUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenSigningPublicKeys").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();

    private static final CreateAuthorizerRequestMarshaller instance = new CreateAuthorizerRequestMarshaller();

    public static CreateAuthorizerRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateAuthorizerRequest createAuthorizerRequest, ProtocolMarshaller protocolMarshaller) {

        if (createAuthorizerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerName(), AUTHORIZERNAME_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getAuthorizerFunctionArn(), AUTHORIZERFUNCTIONARN_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getTokenKeyName(), TOKENKEYNAME_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getTokenSigningPublicKeys(), TOKENSIGNINGPUBLICKEYS_BINDING);
            protocolMarshaller.marshall(createAuthorizerRequest.getStatus(), STATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
