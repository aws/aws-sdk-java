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
 * GenerateCardValidationDataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GenerateCardValidationDataRequestMarshaller {

    private static final MarshallingInfo<StructuredPojo> GENERATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GenerationAttributes").build();
    private static final MarshallingInfo<String> KEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyIdentifier").build();
    private static final MarshallingInfo<String> PRIMARYACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryAccountNumber").build();
    private static final MarshallingInfo<Integer> VALIDATIONDATALENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationDataLength").build();

    private static final GenerateCardValidationDataRequestMarshaller instance = new GenerateCardValidationDataRequestMarshaller();

    public static GenerateCardValidationDataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GenerateCardValidationDataRequest generateCardValidationDataRequest, ProtocolMarshaller protocolMarshaller) {

        if (generateCardValidationDataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(generateCardValidationDataRequest.getGenerationAttributes(), GENERATIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(generateCardValidationDataRequest.getKeyIdentifier(), KEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(generateCardValidationDataRequest.getPrimaryAccountNumber(), PRIMARYACCOUNTNUMBER_BINDING);
            protocolMarshaller.marshall(generateCardValidationDataRequest.getValidationDataLength(), VALIDATIONDATALENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
