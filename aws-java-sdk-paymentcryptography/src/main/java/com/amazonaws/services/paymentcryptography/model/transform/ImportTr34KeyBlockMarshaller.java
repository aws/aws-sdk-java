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
 * ImportTr34KeyBlockMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportTr34KeyBlockMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityPublicKeyIdentifier").build();
    private static final MarshallingInfo<String> SIGNINGKEYCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SigningKeyCertificate").build();
    private static final MarshallingInfo<String> IMPORTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportToken").build();
    private static final MarshallingInfo<String> WRAPPEDKEYBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappedKeyBlock").build();
    private static final MarshallingInfo<String> KEYBLOCKFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyBlockFormat").build();
    private static final MarshallingInfo<String> RANDOMNONCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RandomNonce").build();

    private static final ImportTr34KeyBlockMarshaller instance = new ImportTr34KeyBlockMarshaller();

    public static ImportTr34KeyBlockMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportTr34KeyBlock importTr34KeyBlock, ProtocolMarshaller protocolMarshaller) {

        if (importTr34KeyBlock == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importTr34KeyBlock.getCertificateAuthorityPublicKeyIdentifier(), CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(importTr34KeyBlock.getSigningKeyCertificate(), SIGNINGKEYCERTIFICATE_BINDING);
            protocolMarshaller.marshall(importTr34KeyBlock.getImportToken(), IMPORTTOKEN_BINDING);
            protocolMarshaller.marshall(importTr34KeyBlock.getWrappedKeyBlock(), WRAPPEDKEYBLOCK_BINDING);
            protocolMarshaller.marshall(importTr34KeyBlock.getKeyBlockFormat(), KEYBLOCKFORMAT_BINDING);
            protocolMarshaller.marshall(importTr34KeyBlock.getRandomNonce(), RANDOMNONCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
