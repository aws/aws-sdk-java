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
 * DiscoverDynamicCardVerificationCodeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DiscoverDynamicCardVerificationCodeMarshaller {

    private static final MarshallingInfo<String> APPLICATIONTRANSACTIONCOUNTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationTransactionCounter").build();
    private static final MarshallingInfo<String> CARDEXPIRYDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CardExpiryDate").build();
    private static final MarshallingInfo<String> UNPREDICTABLENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UnpredictableNumber").build();

    private static final DiscoverDynamicCardVerificationCodeMarshaller instance = new DiscoverDynamicCardVerificationCodeMarshaller();

    public static DiscoverDynamicCardVerificationCodeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DiscoverDynamicCardVerificationCode discoverDynamicCardVerificationCode, ProtocolMarshaller protocolMarshaller) {

        if (discoverDynamicCardVerificationCode == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(discoverDynamicCardVerificationCode.getApplicationTransactionCounter(), APPLICATIONTRANSACTIONCOUNTER_BINDING);
            protocolMarshaller.marshall(discoverDynamicCardVerificationCode.getCardExpiryDate(), CARDEXPIRYDATE_BINDING);
            protocolMarshaller.marshall(discoverDynamicCardVerificationCode.getUnpredictableNumber(), UNPREDICTABLENUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
