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
 * VerifyPinDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerifyPinDataRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> DUKPTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DukptAttributes").build();
    private static final MarshallingInfo<String> ENCRYPTEDPINBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptedPinBlock").build();
    private static final MarshallingInfo<String> ENCRYPTIONKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyIdentifier").build();
    private static final MarshallingInfo<String> PINBLOCKFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinBlockFormat").build();
    private static final MarshallingInfo<Integer> PINDATALENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinDataLength").build();
    private static final MarshallingInfo<String> PRIMARYACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryAccountNumber").build();
    private static final MarshallingInfo<StructuredPojo> VERIFICATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationAttributes").build();
    private static final MarshallingInfo<String> VERIFICATIONKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationKeyIdentifier").build();

    private static final VerifyPinDataRequestMarshaller instance = new VerifyPinDataRequestMarshaller();

    public static VerifyPinDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerifyPinDataRequest verifyPinDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (verifyPinDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verifyPinDataRequest.getDukptAttributes(), DUKPTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getEncryptedPinBlock(), ENCRYPTEDPINBLOCK_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getEncryptionKeyIdentifier(), ENCRYPTIONKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getPinBlockFormat(), PINBLOCKFORMAT_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getPinDataLength(), PINDATALENGTH_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getPrimaryAccountNumber(), PRIMARYACCOUNTNUMBER_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getVerificationAttributes(), VERIFICATIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(verifyPinDataRequest.getVerificationKeyIdentifier(), VERIFICATIONKEYIDENTIFIER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
