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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appflow.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SAPODataConnectorProfileCredentialsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SAPODataConnectorProfileCredentialsMarshaller {

    private static final MarshallingInfo<StructuredPojo> BASICAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("basicAuthCredentials").build();
    private static final MarshallingInfo<StructuredPojo> OAUTHCREDENTIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuthCredentials").build();

    private static final SAPODataConnectorProfileCredentialsMarshaller instance = new SAPODataConnectorProfileCredentialsMarshaller();

    public static SAPODataConnectorProfileCredentialsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SAPODataConnectorProfileCredentials sAPODataConnectorProfileCredentials, ProtocolMarshaller protocolMarshaller) {

        if (sAPODataConnectorProfileCredentials == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sAPODataConnectorProfileCredentials.getBasicAuthCredentials(), BASICAUTHCREDENTIALS_BINDING);
            protocolMarshaller.marshall(sAPODataConnectorProfileCredentials.getOAuthCredentials(), OAUTHCREDENTIALS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
