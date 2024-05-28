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
 * UpdateAppAuthorizationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAppAuthorizationRequestMarshaller {

    private static final MarshallingInfo<String> APPBUNDLEIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appBundleIdentifier").build();
    private static final MarshallingInfo<String> APPAUTHORIZATIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("appAuthorizationIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> CREDENTIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("credential").build();
    private static final MarshallingInfo<StructuredPojo> TENANT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tenant").build();

    private static final UpdateAppAuthorizationRequestMarshaller instance = new UpdateAppAuthorizationRequestMarshaller();

    public static UpdateAppAuthorizationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAppAuthorizationRequest updateAppAuthorizationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAppAuthorizationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAppAuthorizationRequest.getAppBundleIdentifier(), APPBUNDLEIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateAppAuthorizationRequest.getAppAuthorizationIdentifier(), APPAUTHORIZATIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(updateAppAuthorizationRequest.getCredential(), CREDENTIAL_BINDING);
            protocolMarshaller.marshall(updateAppAuthorizationRequest.getTenant(), TENANT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
