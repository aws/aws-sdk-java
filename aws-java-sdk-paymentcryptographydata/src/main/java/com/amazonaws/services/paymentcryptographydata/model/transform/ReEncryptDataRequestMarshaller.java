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
package com.amazonaws.services.paymentcryptographydata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.paymentcryptographydata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReEncryptDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReEncryptDataRequestMarshaller {

    private static final MarshallingInfo<String> CIPHERTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CipherText").build();
    private static final MarshallingInfo<StructuredPojo> INCOMINGENCRYPTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncomingEncryptionAttributes").build();
    private static final MarshallingInfo<String> INCOMINGKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("IncomingKeyIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> OUTGOINGENCRYPTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutgoingEncryptionAttributes").build();
    private static final MarshallingInfo<String> OUTGOINGKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutgoingKeyIdentifier").build();

    private static final ReEncryptDataRequestMarshaller instance = new ReEncryptDataRequestMarshaller();

    public static ReEncryptDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReEncryptDataRequest reEncryptDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (reEncryptDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reEncryptDataRequest.getCipherText(), CIPHERTEXT_BINDING);
            protocolMarshaller.marshall(reEncryptDataRequest.getIncomingEncryptionAttributes(), INCOMINGENCRYPTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(reEncryptDataRequest.getIncomingKeyIdentifier(), INCOMINGKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(reEncryptDataRequest.getOutgoingEncryptionAttributes(), OUTGOINGENCRYPTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(reEncryptDataRequest.getOutgoingKeyIdentifier(), OUTGOINGKEYIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
