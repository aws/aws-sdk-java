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
 * TranslatePinDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class TranslatePinDataRequestMarshaller {

    private static final MarshallingInfo<String> ENCRYPTEDPINBLOCK_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EncryptedPinBlock").build();
    private static final MarshallingInfo<StructuredPojo> INCOMINGDUKPTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncomingDukptAttributes").build();
    private static final MarshallingInfo<String> INCOMINGKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncomingKeyIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> INCOMINGTRANSLATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IncomingTranslationAttributes").build();
    private static final MarshallingInfo<StructuredPojo> OUTGOINGDUKPTATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutgoingDukptAttributes").build();
    private static final MarshallingInfo<String> OUTGOINGKEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutgoingKeyIdentifier").build();
    private static final MarshallingInfo<StructuredPojo> OUTGOINGTRANSLATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutgoingTranslationAttributes").build();

    private static final TranslatePinDataRequestMarshaller instance = new TranslatePinDataRequestMarshaller();

    public static TranslatePinDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(TranslatePinDataRequest translatePinDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (translatePinDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(translatePinDataRequest.getEncryptedPinBlock(), ENCRYPTEDPINBLOCK_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getIncomingDukptAttributes(), INCOMINGDUKPTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getIncomingKeyIdentifier(), INCOMINGKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getIncomingTranslationAttributes(), INCOMINGTRANSLATIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getOutgoingDukptAttributes(), OUTGOINGDUKPTATTRIBUTES_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getOutgoingKeyIdentifier(), OUTGOINGKEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(translatePinDataRequest.getOutgoingTranslationAttributes(), OUTGOINGTRANSLATIONATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
