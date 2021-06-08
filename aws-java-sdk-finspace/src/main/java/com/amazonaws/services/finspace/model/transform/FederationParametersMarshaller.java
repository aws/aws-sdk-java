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
package com.amazonaws.services.finspace.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * FederationParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FederationParametersMarshaller {

    private static final MarshallingInfo<String> SAMLMETADATADOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("samlMetadataDocument").build();
    private static final MarshallingInfo<String> SAMLMETADATAURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("samlMetadataURL").build();
    private static final MarshallingInfo<String> APPLICATIONCALLBACKURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationCallBackURL").build();
    private static final MarshallingInfo<String> FEDERATIONURN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("federationURN").build();
    private static final MarshallingInfo<String> FEDERATIONPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("federationProviderName").build();
    private static final MarshallingInfo<Map> ATTRIBUTEMAP_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("attributeMap").build();

    private static final FederationParametersMarshaller instance = new FederationParametersMarshaller();

    public static FederationParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FederationParameters federationParameters, ProtocolMarshaller protocolMarshaller) {

        if (federationParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(federationParameters.getSamlMetadataDocument(), SAMLMETADATADOCUMENT_BINDING);
            protocolMarshaller.marshall(federationParameters.getSamlMetadataURL(), SAMLMETADATAURL_BINDING);
            protocolMarshaller.marshall(federationParameters.getApplicationCallBackURL(), APPLICATIONCALLBACKURL_BINDING);
            protocolMarshaller.marshall(federationParameters.getFederationURN(), FEDERATIONURN_BINDING);
            protocolMarshaller.marshall(federationParameters.getFederationProviderName(), FEDERATIONPROVIDERNAME_BINDING);
            protocolMarshaller.marshall(federationParameters.getAttributeMap(), ATTRIBUTEMAP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
