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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.paymentcryptography.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportKeyMaterialMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportKeyMaterialMarshaller {

    private static final MarshallingInfo<StructuredPojo> ROOTCERTIFICATEPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RootCertificatePublicKey").build();
    private static final MarshallingInfo<StructuredPojo> TRUSTEDCERTIFICATEPUBLICKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TrustedCertificatePublicKey").build();
    private static final MarshallingInfo<StructuredPojo> TR31KEYBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tr31KeyBlock").build();
    private static final MarshallingInfo<StructuredPojo> TR34KEYBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Tr34KeyBlock").build();
    private static final MarshallingInfo<StructuredPojo> KEYCRYPTOGRAM_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCryptogram").build();

    private static final ImportKeyMaterialMarshaller instance = new ImportKeyMaterialMarshaller();

    public static ImportKeyMaterialMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportKeyMaterial importKeyMaterial, ProtocolMarshaller protocolMarshaller) {

        if (importKeyMaterial == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importKeyMaterial.getRootCertificatePublicKey(), ROOTCERTIFICATEPUBLICKEY_BINDING);
            protocolMarshaller.marshall(importKeyMaterial.getTrustedCertificatePublicKey(), TRUSTEDCERTIFICATEPUBLICKEY_BINDING);
            protocolMarshaller.marshall(importKeyMaterial.getTr31KeyBlock(), TR31KEYBLOCK_BINDING);
            protocolMarshaller.marshall(importKeyMaterial.getTr34KeyBlock(), TR34KEYBLOCK_BINDING);
            protocolMarshaller.marshall(importKeyMaterial.getKeyCryptogram(), KEYCRYPTOGRAM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
