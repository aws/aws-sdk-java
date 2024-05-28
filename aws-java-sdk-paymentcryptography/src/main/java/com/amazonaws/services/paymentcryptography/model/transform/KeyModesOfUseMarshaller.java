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
 * KeyModesOfUseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class KeyModesOfUseMarshaller {

    private static final MarshallingInfo<Boolean> ENCRYPT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Encrypt").build();
    private static final MarshallingInfo<Boolean> DECRYPT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Decrypt").build();
    private static final MarshallingInfo<Boolean> WRAP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Wrap").build();
    private static final MarshallingInfo<Boolean> UNWRAP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Unwrap").build();
    private static final MarshallingInfo<Boolean> GENERATE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Generate").build();
    private static final MarshallingInfo<Boolean> SIGN_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Sign").build();
    private static final MarshallingInfo<Boolean> VERIFY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Verify").build();
    private static final MarshallingInfo<Boolean> DERIVEKEY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeriveKey").build();
    private static final MarshallingInfo<Boolean> NORESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NoRestrictions").build();

    private static final KeyModesOfUseMarshaller instance = new KeyModesOfUseMarshaller();

    public static KeyModesOfUseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(KeyModesOfUse keyModesOfUse, ProtocolMarshaller protocolMarshaller) {

        if (keyModesOfUse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(keyModesOfUse.getEncrypt(), ENCRYPT_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getDecrypt(), DECRYPT_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getWrap(), WRAP_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getUnwrap(), UNWRAP_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getGenerate(), GENERATE_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getSign(), SIGN_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getVerify(), VERIFY_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getDeriveKey(), DERIVEKEY_BINDING);
            protocolMarshaller.marshall(keyModesOfUse.getNoRestrictions(), NORESTRICTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
