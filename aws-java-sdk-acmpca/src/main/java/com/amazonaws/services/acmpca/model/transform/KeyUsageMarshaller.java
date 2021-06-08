/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.acmpca.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.acmpca.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * KeyUsageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KeyUsageMarshaller {

    private static final MarshallingInfo<Boolean> DIGITALSIGNATURE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DigitalSignature").build();
    private static final MarshallingInfo<Boolean> NONREPUDIATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NonRepudiation").build();
    private static final MarshallingInfo<Boolean> KEYENCIPHERMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyEncipherment").build();
    private static final MarshallingInfo<Boolean> DATAENCIPHERMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataEncipherment").build();
    private static final MarshallingInfo<Boolean> KEYAGREEMENT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAgreement").build();
    private static final MarshallingInfo<Boolean> KEYCERTSIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCertSign").build();
    private static final MarshallingInfo<Boolean> CRLSIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CRLSign").build();
    private static final MarshallingInfo<Boolean> ENCIPHERONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncipherOnly").build();
    private static final MarshallingInfo<Boolean> DECIPHERONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecipherOnly").build();

    private static final KeyUsageMarshaller instance = new KeyUsageMarshaller();

    public static KeyUsageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KeyUsage keyUsage, ProtocolMarshaller protocolMarshaller) {

        if (keyUsage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(keyUsage.getDigitalSignature(), DIGITALSIGNATURE_BINDING);
            protocolMarshaller.marshall(keyUsage.getNonRepudiation(), NONREPUDIATION_BINDING);
            protocolMarshaller.marshall(keyUsage.getKeyEncipherment(), KEYENCIPHERMENT_BINDING);
            protocolMarshaller.marshall(keyUsage.getDataEncipherment(), DATAENCIPHERMENT_BINDING);
            protocolMarshaller.marshall(keyUsage.getKeyAgreement(), KEYAGREEMENT_BINDING);
            protocolMarshaller.marshall(keyUsage.getKeyCertSign(), KEYCERTSIGN_BINDING);
            protocolMarshaller.marshall(keyUsage.getCRLSign(), CRLSIGN_BINDING);
            protocolMarshaller.marshall(keyUsage.getEncipherOnly(), ENCIPHERONLY_BINDING);
            protocolMarshaller.marshall(keyUsage.getDecipherOnly(), DECIPHERONLY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
