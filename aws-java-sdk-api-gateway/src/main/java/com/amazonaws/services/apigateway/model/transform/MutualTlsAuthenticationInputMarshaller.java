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
package com.amazonaws.services.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * MutualTlsAuthenticationInputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MutualTlsAuthenticationInputMarshaller {

    private static final MarshallingInfo<String> TRUSTSTOREURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("truststoreUri").build();
    private static final MarshallingInfo<String> TRUSTSTOREVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("truststoreVersion").build();

    private static final MutualTlsAuthenticationInputMarshaller instance = new MutualTlsAuthenticationInputMarshaller();

    public static MutualTlsAuthenticationInputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MutualTlsAuthenticationInput mutualTlsAuthenticationInput, ProtocolMarshaller protocolMarshaller) {

        if (mutualTlsAuthenticationInput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(mutualTlsAuthenticationInput.getTruststoreUri(), TRUSTSTOREURI_BINDING);
            protocolMarshaller.marshall(mutualTlsAuthenticationInput.getTruststoreVersion(), TRUSTSTOREVERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
