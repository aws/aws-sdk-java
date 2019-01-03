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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceIdentifierMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceIdentifierMarshaller {

    private static final MarshallingInfo<String> DEVICECERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deviceCertificateId").build();
    private static final MarshallingInfo<String> CACERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("caCertificateId").build();
    private static final MarshallingInfo<String> COGNITOIDENTITYPOOLID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cognitoIdentityPoolId").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("clientId").build();
    private static final MarshallingInfo<StructuredPojo> POLICYVERSIONIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("policyVersionIdentifier").build();
    private static final MarshallingInfo<String> ACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("account").build();

    private static final ResourceIdentifierMarshaller instance = new ResourceIdentifierMarshaller();

    public static ResourceIdentifierMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceIdentifier resourceIdentifier, ProtocolMarshaller protocolMarshaller) {

        if (resourceIdentifier == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceIdentifier.getDeviceCertificateId(), DEVICECERTIFICATEID_BINDING);
            protocolMarshaller.marshall(resourceIdentifier.getCaCertificateId(), CACERTIFICATEID_BINDING);
            protocolMarshaller.marshall(resourceIdentifier.getCognitoIdentityPoolId(), COGNITOIDENTITYPOOLID_BINDING);
            protocolMarshaller.marshall(resourceIdentifier.getClientId(), CLIENTID_BINDING);
            protocolMarshaller.marshall(resourceIdentifier.getPolicyVersionIdentifier(), POLICYVERSIONIDENTIFIER_BINDING);
            protocolMarshaller.marshall(resourceIdentifier.getAccount(), ACCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
