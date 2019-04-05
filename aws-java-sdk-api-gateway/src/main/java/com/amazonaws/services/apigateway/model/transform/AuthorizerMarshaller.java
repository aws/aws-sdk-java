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
package com.amazonaws.services.apigateway.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AuthorizerMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AuthorizerMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<List> PROVIDERARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("providerARNs").build();
    private static final MarshallingInfo<String> AUTHTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("authType").build();
    private static final MarshallingInfo<String> AUTHORIZERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerUri").build();
    private static final MarshallingInfo<String> AUTHORIZERCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerCredentials").build();
    private static final MarshallingInfo<String> IDENTITYSOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identitySource").build();
    private static final MarshallingInfo<String> IDENTITYVALIDATIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityValidationExpression").build();
    private static final MarshallingInfo<Integer> AUTHORIZERRESULTTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerResultTtlInSeconds").build();

    private static final AuthorizerMarshaller instance = new AuthorizerMarshaller();

    public static AuthorizerMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Authorizer authorizer, ProtocolMarshaller protocolMarshaller) {

        if (authorizer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(authorizer.getId(), ID_BINDING);
            protocolMarshaller.marshall(authorizer.getName(), NAME_BINDING);
            protocolMarshaller.marshall(authorizer.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(authorizer.getProviderARNs(), PROVIDERARNS_BINDING);
            protocolMarshaller.marshall(authorizer.getAuthType(), AUTHTYPE_BINDING);
            protocolMarshaller.marshall(authorizer.getAuthorizerUri(), AUTHORIZERURI_BINDING);
            protocolMarshaller.marshall(authorizer.getAuthorizerCredentials(), AUTHORIZERCREDENTIALS_BINDING);
            protocolMarshaller.marshall(authorizer.getIdentitySource(), IDENTITYSOURCE_BINDING);
            protocolMarshaller.marshall(authorizer.getIdentityValidationExpression(), IDENTITYVALIDATIONEXPRESSION_BINDING);
            protocolMarshaller.marshall(authorizer.getAuthorizerResultTtlInSeconds(), AUTHORIZERRESULTTTLINSECONDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
