/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.qbusiness.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PluginAuthConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PluginAuthConfigurationMarshaller {

    private static final MarshallingInfo<StructuredPojo> BASICAUTHCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> OAUTH2CLIENTCREDENTIALCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuth2ClientCredentialConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NOAUTHCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noAuthConfiguration").build();

    private static final PluginAuthConfigurationMarshaller instance = new PluginAuthConfigurationMarshaller();

    public static PluginAuthConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PluginAuthConfiguration pluginAuthConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (pluginAuthConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pluginAuthConfiguration.getBasicAuthConfiguration(), BASICAUTHCONFIGURATION_BINDING);
            protocolMarshaller.marshall(pluginAuthConfiguration.getOAuth2ClientCredentialConfiguration(), OAUTH2CLIENTCREDENTIALCONFIGURATION_BINDING);
            protocolMarshaller.marshall(pluginAuthConfiguration.getNoAuthConfiguration(), NOAUTHCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
