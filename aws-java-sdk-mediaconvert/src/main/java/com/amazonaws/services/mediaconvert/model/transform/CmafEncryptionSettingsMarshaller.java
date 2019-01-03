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
 * CmafEncryptionSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CmafEncryptionSettingsMarshaller {

    private static final MarshallingInfo<String> CONSTANTINITIALIZATIONVECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("constantInitializationVector").build();
    private static final MarshallingInfo<String> ENCRYPTIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryptionMethod").build();
    private static final MarshallingInfo<String> INITIALIZATIONVECTORINMANIFEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationVectorInManifest").build();
    private static final MarshallingInfo<StructuredPojo> STATICKEYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("staticKeyProvider").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();

    private static final CmafEncryptionSettingsMarshaller instance = new CmafEncryptionSettingsMarshaller();

    public static CmafEncryptionSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CmafEncryptionSettings cmafEncryptionSettings, ProtocolMarshaller protocolMarshaller) {

        if (cmafEncryptionSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cmafEncryptionSettings.getConstantInitializationVector(), CONSTANTINITIALIZATIONVECTOR_BINDING);
            protocolMarshaller.marshall(cmafEncryptionSettings.getEncryptionMethod(), ENCRYPTIONMETHOD_BINDING);
            protocolMarshaller.marshall(cmafEncryptionSettings.getInitializationVectorInManifest(), INITIALIZATIONVECTORINMANIFEST_BINDING);
            protocolMarshaller.marshall(cmafEncryptionSettings.getStaticKeyProvider(), STATICKEYPROVIDER_BINDING);
            protocolMarshaller.marshall(cmafEncryptionSettings.getType(), TYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
