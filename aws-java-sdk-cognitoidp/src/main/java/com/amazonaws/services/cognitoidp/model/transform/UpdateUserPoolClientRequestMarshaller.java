/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserPoolClientRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserPoolClientRequestMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> CLIENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientName").build();
    private static final MarshallingInfo<Integer> REFRESHTOKENVALIDITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RefreshTokenValidity").build();
    private static final MarshallingInfo<List> READATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadAttributes").build();
    private static final MarshallingInfo<List> WRITEATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WriteAttributes").build();
    private static final MarshallingInfo<List> EXPLICITAUTHFLOWS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExplicitAuthFlows").build();
    private static final MarshallingInfo<List> SUPPORTEDIDENTITYPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedIdentityProviders").build();
    private static final MarshallingInfo<List> CALLBACKURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CallbackURLs").build();
    private static final MarshallingInfo<List> LOGOUTURLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LogoutURLs").build();
    private static final MarshallingInfo<String> DEFAULTREDIRECTURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRedirectURI").build();
    private static final MarshallingInfo<List> ALLOWEDOAUTHFLOWS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedOAuthFlows").build();
    private static final MarshallingInfo<List> ALLOWEDOAUTHSCOPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedOAuthScopes").build();
    private static final MarshallingInfo<Boolean> ALLOWEDOAUTHFLOWSUSERPOOLCLIENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllowedOAuthFlowsUserPoolClient").build();
    private static final MarshallingInfo<StructuredPojo> ANALYTICSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AnalyticsConfiguration").build();

    private static final UpdateUserPoolClientRequestMarshaller instance = new UpdateUserPoolClientRequestMarshaller();

    public static UpdateUserPoolClientRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserPoolClientRequest updateUserPoolClientRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserPoolClientRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserPoolClientRequest.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getClientName(), CLIENTNAME_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getRefreshTokenValidity(), REFRESHTOKENVALIDITY_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getReadAttributes(), READATTRIBUTES_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getWriteAttributes(), WRITEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getExplicitAuthFlows(), EXPLICITAUTHFLOWS_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getSupportedIdentityProviders(), SUPPORTEDIDENTITYPROVIDERS_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getCallbackURLs(), CALLBACKURLS_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getLogoutURLs(), LOGOUTURLS_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getDefaultRedirectURI(), DEFAULTREDIRECTURI_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getAllowedOAuthFlows(), ALLOWEDOAUTHFLOWS_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getAllowedOAuthScopes(), ALLOWEDOAUTHSCOPES_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getAllowedOAuthFlowsUserPoolClient(), ALLOWEDOAUTHFLOWSUSERPOOLCLIENT_BINDING);
            protocolMarshaller.marshall(updateUserPoolClientRequest.getAnalyticsConfiguration(), ANALYTICSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
