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
 * ExportKeyCryptogramMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportKeyCryptogramMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertificateAuthorityPublicKeyIdentifier").build();
    private static final MarshallingInfo<String> WRAPPINGKEYCERTIFICATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingKeyCertificate").build();
    private static final MarshallingInfo<String> WRAPPINGSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingSpec").build();

    private static final ExportKeyCryptogramMarshaller instance = new ExportKeyCryptogramMarshaller();

    public static ExportKeyCryptogramMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportKeyCryptogram exportKeyCryptogram, ProtocolMarshaller protocolMarshaller) {

        if (exportKeyCryptogram == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportKeyCryptogram.getCertificateAuthorityPublicKeyIdentifier(), CERTIFICATEAUTHORITYPUBLICKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(exportKeyCryptogram.getWrappingKeyCertificate(), WRAPPINGKEYCERTIFICATE_BINDING);
            protocolMarshaller.marshall(exportKeyCryptogram.getWrappingSpec(), WRAPPINGSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
