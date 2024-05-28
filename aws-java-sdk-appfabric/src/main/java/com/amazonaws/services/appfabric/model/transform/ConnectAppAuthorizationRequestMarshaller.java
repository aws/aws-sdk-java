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
package com.amazonaws.services.appfabric.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appfabric.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConnectAppAuthorizationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConnectAppAuthorizationRequestMarshaller {

    private static final MarshallingInfo<String> APPBUNDLEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appBundleIdentifier").build();
    private static final MarshallingInfo<String> APPAUTHORIZATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appAuthorizationIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> AUTHREQUEST_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("authRequest").build();

    private static final ConnectAppAuthorizationRequestMarshaller instance = new ConnectAppAuthorizationRequestMarshaller();

    public static ConnectAppAuthorizationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConnectAppAuthorizationRequest connectAppAuthorizationRequest, ProtocolMarshaller protocolMarshaller) {

        if (connectAppAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(connectAppAuthorizationRequest.getAppBundleIdentifier(), APPBUNDLEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(connectAppAuthorizationRequest.getAppAuthorizationIdentifier(), APPAUTHORIZATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(connectAppAuthorizationRequest.getAuthRequest(), AUTHREQUEST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
