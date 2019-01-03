/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InputDecryptionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InputDecryptionSettingsMarshaller {

    private static final MarshallingInfo<String> DECRYPTIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("decryptionMode").build();
    private static final MarshallingInfo<String> ENCRYPTEDDECRYPTIONKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptedDecryptionKey").build();
    private static final MarshallingInfo<String> INITIALIZATIONVECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationVector").build();
    private static final MarshallingInfo<String> KMSKEYREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("kmsKeyRegion").build();

    private static final InputDecryptionSettingsMarshaller instance = new InputDecryptionSettingsMarshaller();

    public static InputDecryptionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InputDecryptionSettings inputDecryptionSettings, ProtocolMarshaller protocolMarshaller) {

        if (inputDecryptionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inputDecryptionSettings.getDecryptionMode(), DECRYPTIONMODE_BINDING);
            protocolMarshaller.marshall(inputDecryptionSettings.getEncryptedDecryptionKey(), ENCRYPTEDDECRYPTIONKEY_BINDING);
            protocolMarshaller.marshall(inputDecryptionSettings.getInitializationVector(), INITIALIZATIONVECTOR_BINDING);
            protocolMarshaller.marshall(inputDecryptionSettings.getKmsKeyRegion(), KMSKEYREGION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
