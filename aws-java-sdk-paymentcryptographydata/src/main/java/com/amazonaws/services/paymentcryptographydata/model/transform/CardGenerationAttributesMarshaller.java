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
 * CardGenerationAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CardGenerationAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> AMEXCARDSECURITYCODEVERSION1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmexCardSecurityCodeVersion1").build();
    private static final MarshallingInfo<StructuredPojo> AMEXCARDSECURITYCODEVERSION2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AmexCardSecurityCodeVersion2").build();
    private static final MarshallingInfo<StructuredPojo> CARDHOLDERVERIFICATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CardHolderVerificationValue").build();
    private static final MarshallingInfo<StructuredPojo> CARDVERIFICATIONVALUE1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CardVerificationValue1").build();
    private static final MarshallingInfo<StructuredPojo> CARDVERIFICATIONVALUE2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CardVerificationValue2").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMICCARDVERIFICATIONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamicCardVerificationCode").build();
    private static final MarshallingInfo<StructuredPojo> DYNAMICCARDVERIFICATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DynamicCardVerificationValue").build();

    private static final CardGenerationAttributesMarshaller instance = new CardGenerationAttributesMarshaller();

    public static CardGenerationAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CardGenerationAttributes cardGenerationAttributes, ProtocolMarshaller protocolMarshaller) {

        if (cardGenerationAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(cardGenerationAttributes.getAmexCardSecurityCodeVersion1(), AMEXCARDSECURITYCODEVERSION1_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getAmexCardSecurityCodeVersion2(), AMEXCARDSECURITYCODEVERSION2_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getCardHolderVerificationValue(), CARDHOLDERVERIFICATIONVALUE_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getCardVerificationValue1(), CARDVERIFICATIONVALUE1_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getCardVerificationValue2(), CARDVERIFICATIONVALUE2_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getDynamicCardVerificationCode(), DYNAMICCARDVERIFICATIONCODE_BINDING);
            protocolMarshaller.marshall(cardGenerationAttributes.getDynamicCardVerificationValue(), DYNAMICCARDVERIFICATIONVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
