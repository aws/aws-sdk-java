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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BackendAPIAppSyncAuthSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BackendAPIAppSyncAuthSettingsMarshaller {

    private static final MarshallingInfo<String> COGNITOUSERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cognitoUserPoolId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Double> EXPIRATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("expirationTime").build();
    private static final MarshallingInfo<String> OPENIDAUTHTTL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDAuthTTL").build();
    private static final MarshallingInfo<String> OPENIDCLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDClientId").build();
    private static final MarshallingInfo<String> OPENIDIATTTL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDIatTTL").build();
    private static final MarshallingInfo<String> OPENIDISSUEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDIssueURL").build();
    private static final MarshallingInfo<String> OPENIDPROVIDERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("openIDProviderName").build();

    private static final BackendAPIAppSyncAuthSettingsMarshaller instance = new BackendAPIAppSyncAuthSettingsMarshaller();

    public static BackendAPIAppSyncAuthSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BackendAPIAppSyncAuthSettings backendAPIAppSyncAuthSettings, ProtocolMarshaller protocolMarshaller) {

        if (backendAPIAppSyncAuthSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getCognitoUserPoolId(), COGNITOUSERPOOLID_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getExpirationTime(), EXPIRATIONTIME_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getOpenIDAuthTTL(), OPENIDAUTHTTL_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getOpenIDClientId(), OPENIDCLIENTID_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getOpenIDIatTTL(), OPENIDIATTTL_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getOpenIDIssueURL(), OPENIDISSUEURL_BINDING);
            protocolMarshaller.marshall(backendAPIAppSyncAuthSettings.getOpenIDProviderName(), OPENIDPROVIDERNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
