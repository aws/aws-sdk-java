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
 * GeneratePinDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GeneratePinDataRequestMarshaller {

    private static final MarshallingInfo<String> ENCRYPTIONKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptionKeyIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> GENERATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationAttributes").build();
    private static final MarshallingInfo<String> GENERATIONKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationKeyIdentifier").build();
    private static final MarshallingInfo<String> PINBLOCKFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinBlockFormat").build();
    private static final MarshallingInfo<Integer> PINDATALENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinDataLength").build();
    private static final MarshallingInfo<String> PRIMARYACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryAccountNumber").build();

    private static final GeneratePinDataRequestMarshaller instance = new GeneratePinDataRequestMarshaller();

    public static GeneratePinDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GeneratePinDataRequest generatePinDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (generatePinDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generatePinDataRequest.getEncryptionKeyIdentifier(), ENCRYPTIONKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(generatePinDataRequest.getGenerationAttributes(), GENERATIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(generatePinDataRequest.getGenerationKeyIdentifier(), GENERATIONKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(generatePinDataRequest.getPinBlockFormat(), PINBLOCKFORMAT_BINDING);
            protocolMarshaller.marshall(generatePinDataRequest.getPinDataLength(), PINDATALENGTH_BINDING);
            protocolMarshaller.marshall(generatePinDataRequest.getPrimaryAccountNumber(), PRIMARYACCOUNTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
