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
 * HlsEncryptionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsEncryptionSettingsMarshaller {

    private static final MarshallingInfo<String> CONSTANTINITIALIZATIONVECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("constantInitializationVector").build();
    private static final MarshallingInfo<String> ENCRYPTIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionMethod").build();
    private static final MarshallingInfo<String> INITIALIZATIONVECTORINMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationVectorInManifest").build();
    private static final MarshallingInfo<String> OFFLINEENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("offlineEncrypted").build();
    private static final MarshallingInfo<StructuredPojo> SPEKEKEYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("spekeKeyProvider").build();
    private static final MarshallingInfo<StructuredPojo> STATICKEYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("staticKeyProvider").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final HlsEncryptionSettingsMarshaller instance = new HlsEncryptionSettingsMarshaller();

    public static HlsEncryptionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsEncryptionSettings hlsEncryptionSettings, ProtocolMarshaller protocolMarshaller) {

        if (hlsEncryptionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsEncryptionSettings.getConstantInitializationVector(), CONSTANTINITIALIZATIONVECTOR_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getEncryptionMethod(), ENCRYPTIONMETHOD_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getInitializationVectorInManifest(), INITIALIZATIONVECTORINMANIFEST_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getOfflineEncrypted(), OFFLINEENCRYPTED_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getSpekeKeyProvider(), SPEKEKEYPROVIDER_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getStaticKeyProvider(), STATICKEYPROVIDER_BINDING);
            protocolMarshaller.marshall(hlsEncryptionSettings.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
