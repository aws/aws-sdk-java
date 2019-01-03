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
 * AuthorizerDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthorizerDescriptionMarshaller {

    private static final MarshallingInfo<String> AUTHORIZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerName").build();
    private static final MarshallingInfo<String> AUTHORIZERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerArn").build();
    private static final MarshallingInfo<String> AUTHORIZERFUNCTIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerFunctionArn").build();
    private static final MarshallingInfo<String> TOKENKEYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenKeyName").build();
    private static final MarshallingInfo<Map> TOKENSIGNINGPUBLICKEYS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenSigningPublicKeys").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedDate").timestampFormat("unixTimestamp").build();

    private static final AuthorizerDescriptionMarshaller instance = new AuthorizerDescriptionMarshaller();

    public static AuthorizerDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AuthorizerDescription authorizerDescription, ProtocolMarshaller protocolMarshaller) {

        if (authorizerDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authorizerDescription.getAuthorizerName(), AUTHORIZERNAME_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getAuthorizerArn(), AUTHORIZERARN_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getAuthorizerFunctionArn(), AUTHORIZERFUNCTIONARN_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getTokenKeyName(), TOKENKEYNAME_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getTokenSigningPublicKeys(), TOKENSIGNINGPUBLICKEYS_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(authorizerDescription.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
