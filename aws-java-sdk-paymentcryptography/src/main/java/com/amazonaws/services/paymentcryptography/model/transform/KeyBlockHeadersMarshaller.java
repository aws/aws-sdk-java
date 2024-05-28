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
package com.amazonaws.services.paymentcryptography.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.paymentcryptography.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KeyBlockHeadersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KeyBlockHeadersMarshaller {

    private static final MarshallingInfo<StructuredPojo> KEYMODESOFUSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyModesOfUse").build();
    private static final MarshallingInfo<String> KEYEXPORTABILITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyExportability").build();
    private static final MarshallingInfo<String> KEYVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyVersion").build();
    private static final MarshallingInfo<Map> OPTIONALBLOCKS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OptionalBlocks").build();

    private static final KeyBlockHeadersMarshaller instance = new KeyBlockHeadersMarshaller();

    public static KeyBlockHeadersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KeyBlockHeaders keyBlockHeaders, ProtocolMarshaller protocolMarshaller) {

        if (keyBlockHeaders == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(keyBlockHeaders.getKeyModesOfUse(), KEYMODESOFUSE_BINDING);
            protocolMarshaller.marshall(keyBlockHeaders.getKeyExportability(), KEYEXPORTABILITY_BINDING);
            protocolMarshaller.marshall(keyBlockHeaders.getKeyVersion(), KEYVERSION_BINDING);
            protocolMarshaller.marshall(keyBlockHeaders.getOptionalBlocks(), OPTIONALBLOCKS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
