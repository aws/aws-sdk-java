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
 * WrappedKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class WrappedKeyMarshaller {

    private static final MarshallingInfo<String> WRAPPINGKEYARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappingKeyArn").build();
    private static final MarshallingInfo<String> WRAPPEDKEYMATERIALFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WrappedKeyMaterialFormat").build();
    private static final MarshallingInfo<String> KEYMATERIAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyMaterial").build();
    private static final MarshallingInfo<String> KEYCHECKVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCheckValue").build();
    private static final MarshallingInfo<String> KEYCHECKVALUEALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyCheckValueAlgorithm").build();

    private static final WrappedKeyMarshaller instance = new WrappedKeyMarshaller();

    public static WrappedKeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(WrappedKey wrappedKey, ProtocolMarshaller protocolMarshaller) {

        if (wrappedKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(wrappedKey.getWrappingKeyArn(), WRAPPINGKEYARN_BINDING);
            protocolMarshaller.marshall(wrappedKey.getWrappedKeyMaterialFormat(), WRAPPEDKEYMATERIALFORMAT_BINDING);
            protocolMarshaller.marshall(wrappedKey.getKeyMaterial(), KEYMATERIAL_BINDING);
            protocolMarshaller.marshall(wrappedKey.getKeyCheckValue(), KEYCHECKVALUE_BINDING);
            protocolMarshaller.marshall(wrappedKey.getKeyCheckValueAlgorithm(), KEYCHECKVALUEALGORITHM_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
