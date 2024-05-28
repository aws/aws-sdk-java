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
 * ExportTr31KeyBlockMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExportTr31KeyBlockMarshaller {

    private static final MarshallingInfo<String> WRAPPINGKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingKeyIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> KEYBLOCKHEADERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyBlockHeaders").build();

    private static final ExportTr31KeyBlockMarshaller instance = new ExportTr31KeyBlockMarshaller();

    public static ExportTr31KeyBlockMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExportTr31KeyBlock exportTr31KeyBlock, ProtocolMarshaller protocolMarshaller) {

        if (exportTr31KeyBlock == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(exportTr31KeyBlock.getWrappingKeyIdentifier(), WRAPPINGKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(exportTr31KeyBlock.getKeyBlockHeaders(), KEYBLOCKHEADERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
