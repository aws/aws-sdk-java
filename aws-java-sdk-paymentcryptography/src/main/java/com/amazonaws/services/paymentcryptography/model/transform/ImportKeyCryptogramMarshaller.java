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
 * ImportKeyCryptogramMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportKeyCryptogramMarshaller {

    private static final MarshallingInfo<StructuredPojo> KEYATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyAttributes").build();
    private static final MarshallingInfo<Boolean> EXPORTABLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Exportable").build();
    private static final MarshallingInfo<String> WRAPPEDKEYCRYPTOGRAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappedKeyCryptogram").build();
    private static final MarshallingInfo<String> IMPORTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportToken").build();
    private static final MarshallingInfo<String> WRAPPINGSPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingSpec").build();

    private static final ImportKeyCryptogramMarshaller instance = new ImportKeyCryptogramMarshaller();

    public static ImportKeyCryptogramMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportKeyCryptogram importKeyCryptogram, ProtocolMarshaller protocolMarshaller) {

        if (importKeyCryptogram == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importKeyCryptogram.getKeyAttributes(), KEYATTRIBUTES_BINDING);
            protocolMarshaller.marshall(importKeyCryptogram.getExportable(), EXPORTABLE_BINDING);
            protocolMarshaller.marshall(importKeyCryptogram.getWrappedKeyCryptogram(), WRAPPEDKEYCRYPTOGRAM_BINDING);
            protocolMarshaller.marshall(importKeyCryptogram.getImportToken(), IMPORTTOKEN_BINDING);
            protocolMarshaller.marshall(importKeyCryptogram.getWrappingSpec(), WRAPPINGSPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
