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
package com.amazonaws.services.cloudtrail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudtrail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PublicKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PublicKeyMarshaller {

    private static final MarshallingInfo<java.nio.ByteBuffer> VALUE_BINDING = MarshallingInfo.builder(MarshallingType.BYTE_BUFFER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Value").build();
    private static final MarshallingInfo<java.util.Date> VALIDITYSTARTTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidityStartTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> VALIDITYENDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidityEndTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FINGERPRINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Fingerprint").build();

    private static final PublicKeyMarshaller instance = new PublicKeyMarshaller();

    public static PublicKeyMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PublicKey publicKey, ProtocolMarshaller protocolMarshaller) {

        if (publicKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(publicKey.getValue(), VALUE_BINDING);
            protocolMarshaller.marshall(publicKey.getValidityStartTime(), VALIDITYSTARTTIME_BINDING);
            protocolMarshaller.marshall(publicKey.getValidityEndTime(), VALIDITYENDTIME_BINDING);
            protocolMarshaller.marshall(publicKey.getFingerprint(), FINGERPRINT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
