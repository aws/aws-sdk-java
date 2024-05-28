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
package com.amazonaws.services.mediapackagev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EncryptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EncryptionMarshaller {

    private static final MarshallingInfo<String> CONSTANTINITIALIZATIONVECTOR_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConstantInitializationVector").build();
    private static final MarshallingInfo<StructuredPojo> ENCRYPTIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionMethod").build();
    private static final MarshallingInfo<Integer> KEYROTATIONINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyRotationIntervalSeconds").build();
    private static final MarshallingInfo<StructuredPojo> SPEKEKEYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SpekeKeyProvider").build();

    private static final EncryptionMarshaller instance = new EncryptionMarshaller();

    public static EncryptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Encryption encryption, ProtocolMarshaller protocolMarshaller) {

        if (encryption == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(encryption.getConstantInitializationVector(), CONSTANTINITIALIZATIONVECTOR_BINDING);
            protocolMarshaller.marshall(encryption.getEncryptionMethod(), ENCRYPTIONMETHOD_BINDING);
            protocolMarshaller.marshall(encryption.getKeyRotationIntervalSeconds(), KEYROTATIONINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(encryption.getSpekeKeyProvider(), SPEKEKEYPROVIDER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
