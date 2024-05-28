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
 * KeyUsageFlagsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KeyUsageFlagsMarshaller {

    private static final MarshallingInfo<Boolean> DATAENCIPHERMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataEncipherment").build();
    private static final MarshallingInfo<Boolean> DIGITALSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DigitalSignature").build();
    private static final MarshallingInfo<Boolean> KEYAGREEMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAgreement").build();
    private static final MarshallingInfo<Boolean> KEYENCIPHERMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyEncipherment").build();
    private static final MarshallingInfo<Boolean> NONREPUDIATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonRepudiation").build();

    private static final KeyUsageFlagsMarshaller instance = new KeyUsageFlagsMarshaller();

    public static KeyUsageFlagsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KeyUsageFlags keyUsageFlags, ProtocolMarshaller protocolMarshaller) {

        if (keyUsageFlags == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(keyUsageFlags.getDataEncipherment(), DATAENCIPHERMENT_BINDING);
            protocolMarshaller.marshall(keyUsageFlags.getDigitalSignature(), DIGITALSIGNATURE_BINDING);
            protocolMarshaller.marshall(keyUsageFlags.getKeyAgreement(), KEYAGREEMENT_BINDING);
            protocolMarshaller.marshall(keyUsageFlags.getKeyEncipherment(), KEYENCIPHERMENT_BINDING);
            protocolMarshaller.marshall(keyUsageFlags.getNonRepudiation(), NONREPUDIATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
