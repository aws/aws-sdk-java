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
 * UserPoolClientTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UserPoolClientTypeMarshaller {

    private static final MarshallingInfo<String> USERPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserPoolId").build();
    private static final MarshallingInfo<String> CLIENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientName").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientId").build();
    private static final MarshallingInfo<String> CLIENTSECRET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientSecret").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationDate").timestampFormat("unixTimestamp").build();
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

    private static final UserPoolClientTypeMarshaller instance = new UserPoolClientTypeMarshaller();

    public static UserPoolClientTypeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UserPoolClientType userPoolClientType, ProtocolMarshaller protocolMarshaller) {

        if (userPoolClientType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(userPoolClientType.getUserPoolId(), USERPOOLID_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getClientName(), CLIENTNAME_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getClientSecret(), CLIENTSECRET_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getLastModifiedDate(), LASTMODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getRefreshTokenValidity(), REFRESHTOKENVALIDITY_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getReadAttributes(), READATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getWriteAttributes(), WRITEATTRIBUTES_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getExplicitAuthFlows(), EXPLICITAUTHFLOWS_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getSupportedIdentityProviders(), SUPPORTEDIDENTITYPROVIDERS_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getCallbackURLs(), CALLBACKURLS_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getLogoutURLs(), LOGOUTURLS_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getDefaultRedirectURI(), DEFAULTREDIRECTURI_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getAllowedOAuthFlows(), ALLOWEDOAUTHFLOWS_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getAllowedOAuthScopes(), ALLOWEDOAUTHSCOPES_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getAllowedOAuthFlowsUserPoolClient(), ALLOWEDOAUTHFLOWSUSERPOOLCLIENT_BINDING);
            protocolMarshaller.marshall(userPoolClientType.getAnalyticsConfiguration(), ANALYTICSCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
