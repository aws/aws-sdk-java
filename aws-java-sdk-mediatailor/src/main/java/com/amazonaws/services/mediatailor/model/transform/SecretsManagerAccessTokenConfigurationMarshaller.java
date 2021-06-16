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
package com.amazonaws.services.mediatailor.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediatailor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SecretsManagerAccessTokenConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SecretsManagerAccessTokenConfigurationMarshaller {

    private static final MarshallingInfo<String> HEADERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeaderName").build();
    private static final MarshallingInfo<String> SECRETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SecretArn").build();
    private static final MarshallingInfo<String> SECRETSTRINGKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecretStringKey").build();

    private static final SecretsManagerAccessTokenConfigurationMarshaller instance = new SecretsManagerAccessTokenConfigurationMarshaller();

    public static SecretsManagerAccessTokenConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SecretsManagerAccessTokenConfiguration secretsManagerAccessTokenConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (secretsManagerAccessTokenConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(secretsManagerAccessTokenConfiguration.getHeaderName(), HEADERNAME_BINDING);
            protocolMarshaller.marshall(secretsManagerAccessTokenConfiguration.getSecretArn(), SECRETARN_BINDING);
            protocolMarshaller.marshall(secretsManagerAccessTokenConfiguration.getSecretStringKey(), SECRETSTRINGKEY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
