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
package com.amazonaws.services.appsync.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appsync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LambdaAuthorizerConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LambdaAuthorizerConfigMarshaller {

    private static final MarshallingInfo<Integer> AUTHORIZERRESULTTTLINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerResultTtlInSeconds").build();
    private static final MarshallingInfo<String> AUTHORIZERURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authorizerUri").build();
    private static final MarshallingInfo<String> IDENTITYVALIDATIONEXPRESSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identityValidationExpression").build();

    private static final LambdaAuthorizerConfigMarshaller instance = new LambdaAuthorizerConfigMarshaller();

    public static LambdaAuthorizerConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LambdaAuthorizerConfig lambdaAuthorizerConfig, ProtocolMarshaller protocolMarshaller) {

        if (lambdaAuthorizerConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lambdaAuthorizerConfig.getAuthorizerResultTtlInSeconds(), AUTHORIZERRESULTTTLINSECONDS_BINDING);
            protocolMarshaller.marshall(lambdaAuthorizerConfig.getAuthorizerUri(), AUTHORIZERURI_BINDING);
            protocolMarshaller.marshall(lambdaAuthorizerConfig.getIdentityValidationExpression(), IDENTITYVALIDATIONEXPRESSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
