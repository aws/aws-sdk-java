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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pcaconnectorad.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PrivateKeyAttributesV3Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PrivateKeyAttributesV3Marshaller {

    private static final MarshallingInfo<String> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Algorithm").build();
    private static final MarshallingInfo<List> CRYPTOPROVIDERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CryptoProviders").build();
    private static final MarshallingInfo<String> KEYSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KeySpec").build();
    private static final MarshallingInfo<StructuredPojo> KEYUSAGEPROPERTY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyUsageProperty").build();
    private static final MarshallingInfo<Integer> MINIMALKEYLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MinimalKeyLength").build();

    private static final PrivateKeyAttributesV3Marshaller instance = new PrivateKeyAttributesV3Marshaller();

    public static PrivateKeyAttributesV3Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PrivateKeyAttributesV3 privateKeyAttributesV3, ProtocolMarshaller protocolMarshaller) {

        if (privateKeyAttributesV3 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(privateKeyAttributesV3.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(privateKeyAttributesV3.getCryptoProviders(), CRYPTOPROVIDERS_BINDING);
            protocolMarshaller.marshall(privateKeyAttributesV3.getKeySpec(), KEYSPEC_BINDING);
            protocolMarshaller.marshall(privateKeyAttributesV3.getKeyUsageProperty(), KEYUSAGEPROPERTY_BINDING);
            protocolMarshaller.marshall(privateKeyAttributesV3.getMinimalKeyLength(), MINIMALKEYLENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
