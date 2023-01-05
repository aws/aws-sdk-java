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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OAuth2CustomParameterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OAuth2CustomParameterMarshaller {

    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<Boolean> ISREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isRequired").build();
    private static final MarshallingInfo<String> LABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("label").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> ISSENSITIVEFIELD_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("isSensitiveField").build();
    private static final MarshallingInfo<List> CONNECTORSUPPLIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("connectorSuppliedValues").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final OAuth2CustomParameterMarshaller instance = new OAuth2CustomParameterMarshaller();

    public static OAuth2CustomParameterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OAuth2CustomParameter oAuth2CustomParameter, ProtocolMarshaller protocolMarshaller) {

        if (oAuth2CustomParameter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(oAuth2CustomParameter.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getIsRequired(), ISREQUIRED_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getLabel(), LABEL_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getIsSensitiveField(), ISSENSITIVEFIELD_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getConnectorSuppliedValues(), CONNECTORSUPPLIEDVALUES_BINDING);
            protocolMarshaller.marshall(oAuth2CustomParameter.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
