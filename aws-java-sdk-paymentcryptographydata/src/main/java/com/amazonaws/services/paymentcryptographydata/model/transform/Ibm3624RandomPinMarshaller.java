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
 * Ibm3624RandomPinMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class Ibm3624RandomPinMarshaller {

    private static final MarshallingInfo<String> DECIMALIZATIONTABLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DecimalizationTable").build();
    private static final MarshallingInfo<String> PINVALIDATIONDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinValidationData").build();
    private static final MarshallingInfo<String> PINVALIDATIONDATAPADCHARACTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PinValidationDataPadCharacter").build();

    private static final Ibm3624RandomPinMarshaller instance = new Ibm3624RandomPinMarshaller();

    public static Ibm3624RandomPinMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Ibm3624RandomPin ibm3624RandomPin, ProtocolMarshaller protocolMarshaller) {

        if (ibm3624RandomPin == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ibm3624RandomPin.getDecimalizationTable(), DECIMALIZATIONTABLE_BINDING);
            protocolMarshaller.marshall(ibm3624RandomPin.getPinValidationData(), PINVALIDATIONDATA_BINDING);
            protocolMarshaller.marshall(ibm3624RandomPin.getPinValidationDataPadCharacter(), PINVALIDATIONDATAPADCHARACTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
