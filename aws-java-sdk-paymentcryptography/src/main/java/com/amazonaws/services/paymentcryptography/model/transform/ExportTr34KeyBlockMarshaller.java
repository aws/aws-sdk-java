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
 * ExportTr34KeyBlockMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportTr34KeyBlockMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityPublicKeyIdentifier").build();
    private static final MarshallingInfo<String> WRAPPINGKEYCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingKeyCertificate").build();
    private static final MarshallingInfo<String> EXPORTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExportToken").build();
    private static final MarshallingInfo<String> KEYBLOCKFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyBlockFormat").build();
    private static final MarshallingInfo<String> RANDOMNONCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RandomNonce").build();
    private static final MarshallingInfo<StructuredPojo> KEYBLOCKHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyBlockHeaders").build();

    private static final ExportTr34KeyBlockMarshaller instance = new ExportTr34KeyBlockMarshaller();

    public static ExportTr34KeyBlockMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportTr34KeyBlock exportTr34KeyBlock, ProtocolMarshaller protocolMarshaller) {

        if (exportTr34KeyBlock == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportTr34KeyBlock.getCertificateAuthorityPublicKeyIdentifier(), CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(exportTr34KeyBlock.getWrappingKeyCertificate(), WRAPPINGKEYCERTIFICATE_BINDING);
            protocolMarshaller.marshall(exportTr34KeyBlock.getExportToken(), EXPORTTOKEN_BINDING);
            protocolMarshaller.marshall(exportTr34KeyBlock.getKeyBlockFormat(), KEYBLOCKFORMAT_BINDING);
            protocolMarshaller.marshall(exportTr34KeyBlock.getRandomNonce(), RANDOMNONCE_BINDING);
            protocolMarshaller.marshall(exportTr34KeyBlock.getKeyBlockHeaders(), KEYBLOCKHEADERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
