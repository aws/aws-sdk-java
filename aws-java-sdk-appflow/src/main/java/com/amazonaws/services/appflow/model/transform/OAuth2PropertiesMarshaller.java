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
package com.amazonaws.services.appflow.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OAuth2PropertiesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OAuth2PropertiesMarshaller {

    private static final MarshallingInfo<String> TOKENURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tokenUrl").build();
    private static final MarshallingInfo<String> OAUTH2GRANTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuth2GrantType").build();
    private static final MarshallingInfo<Map> TOKENURLCUSTOMPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tokenUrlCustomProperties").build();

    private static final OAuth2PropertiesMarshaller instance = new OAuth2PropertiesMarshaller();

    public static OAuth2PropertiesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OAuth2Properties oAuth2Properties, ProtocolMarshaller protocolMarshaller) {

        if (oAuth2Properties == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oAuth2Properties.getTokenUrl(), TOKENURL_BINDING);
            protocolMarshaller.marshall(oAuth2Properties.getOAuth2GrantType(), OAUTH2GRANTTYPE_BINDING);
            protocolMarshaller.marshall(oAuth2Properties.getTokenUrlCustomProperties(), TOKENURLCUSTOMPROPERTIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
