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
package com.amazonaws.services.pcaconnectorad.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PrivateKeyFlagsV2Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PrivateKeyFlagsV2Marshaller {

    private static final MarshallingInfo<String> CLIENTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientVersion").build();
    private static final MarshallingInfo<Boolean> EXPORTABLEKEY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportableKey").build();
    private static final MarshallingInfo<Boolean> STRONGKEYPROTECTIONREQUIRED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StrongKeyProtectionRequired").build();

    private static final PrivateKeyFlagsV2Marshaller instance = new PrivateKeyFlagsV2Marshaller();

    public static PrivateKeyFlagsV2Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PrivateKeyFlagsV2 privateKeyFlagsV2, ProtocolMarshaller protocolMarshaller) {

        if (privateKeyFlagsV2 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(privateKeyFlagsV2.getClientVersion(), CLIENTVERSION_BINDING);
            protocolMarshaller.marshall(privateKeyFlagsV2.getExportableKey(), EXPORTABLEKEY_BINDING);
            protocolMarshaller.marshall(privateKeyFlagsV2.getStrongKeyProtectionRequired(), STRONGKEYPROTECTIONREQUIRED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
