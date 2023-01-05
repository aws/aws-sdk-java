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
package com.amazonaws.services.pipes.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pipes.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SelfManagedKafkaAccessConfigurationCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SelfManagedKafkaAccessConfigurationCredentialsMarshaller {

    private static final MarshallingInfo<String> BASICAUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BasicAuth").build();
    private static final MarshallingInfo<String> CLIENTCERTIFICATETLSAUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientCertificateTlsAuth").build();
    private static final MarshallingInfo<String> SASLSCRAM256AUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaslScram256Auth").build();
    private static final MarshallingInfo<String> SASLSCRAM512AUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SaslScram512Auth").build();

    private static final SelfManagedKafkaAccessConfigurationCredentialsMarshaller instance = new SelfManagedKafkaAccessConfigurationCredentialsMarshaller();

    public static SelfManagedKafkaAccessConfigurationCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SelfManagedKafkaAccessConfigurationCredentials selfManagedKafkaAccessConfigurationCredentials, ProtocolMarshaller protocolMarshaller) {

        if (selfManagedKafkaAccessConfigurationCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(selfManagedKafkaAccessConfigurationCredentials.getBasicAuth(), BASICAUTH_BINDING);
            protocolMarshaller.marshall(selfManagedKafkaAccessConfigurationCredentials.getClientCertificateTlsAuth(), CLIENTCERTIFICATETLSAUTH_BINDING);
            protocolMarshaller.marshall(selfManagedKafkaAccessConfigurationCredentials.getSaslScram256Auth(), SASLSCRAM256AUTH_BINDING);
            protocolMarshaller.marshall(selfManagedKafkaAccessConfigurationCredentials.getSaslScram512Auth(), SASLSCRAM512AUTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
