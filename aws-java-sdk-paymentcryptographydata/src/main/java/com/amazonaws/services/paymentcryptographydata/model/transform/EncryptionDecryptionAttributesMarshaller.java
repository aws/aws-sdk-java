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
 * EncryptionDecryptionAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EncryptionDecryptionAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> ASYMMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Asymmetric").build();
    private static final MarshallingInfo<StructuredPojo> DUKPT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Dukpt").build();
    private static final MarshallingInfo<StructuredPojo> EMV_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Emv").build();
    private static final MarshallingInfo<StructuredPojo> SYMMETRIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Symmetric").build();

    private static final EncryptionDecryptionAttributesMarshaller instance = new EncryptionDecryptionAttributesMarshaller();

    public static EncryptionDecryptionAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EncryptionDecryptionAttributes encryptionDecryptionAttributes, ProtocolMarshaller protocolMarshaller) {

        if (encryptionDecryptionAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(encryptionDecryptionAttributes.getAsymmetric(), ASYMMETRIC_BINDING);
            protocolMarshaller.marshall(encryptionDecryptionAttributes.getDukpt(), DUKPT_BINDING);
            protocolMarshaller.marshall(encryptionDecryptionAttributes.getEmv(), EMV_BINDING);
            protocolMarshaller.marshall(encryptionDecryptionAttributes.getSymmetric(), SYMMETRIC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
