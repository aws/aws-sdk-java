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
package com.amazonaws.services.ssoadmin.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ssoadmin.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationProviderMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationProviderMarshaller {

    private static final MarshallingInfo<String> APPLICATIONPROVIDERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationProviderArn").build();
    private static final MarshallingInfo<StructuredPojo> DISPLAYDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayData").build();
    private static final MarshallingInfo<String> FEDERATIONPROTOCOL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FederationProtocol").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCESERVERCONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceServerConfig").build();

    private static final ApplicationProviderMarshaller instance = new ApplicationProviderMarshaller();

    public static ApplicationProviderMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationProvider applicationProvider, ProtocolMarshaller protocolMarshaller) {

        if (applicationProvider == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationProvider.getApplicationProviderArn(), APPLICATIONPROVIDERARN_BINDING);
            protocolMarshaller.marshall(applicationProvider.getDisplayData(), DISPLAYDATA_BINDING);
            protocolMarshaller.marshall(applicationProvider.getFederationProtocol(), FEDERATIONPROTOCOL_BINDING);
            protocolMarshaller.marshall(applicationProvider.getResourceServerConfig(), RESOURCESERVERCONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
