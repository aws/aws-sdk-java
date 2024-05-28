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
 * PinGenerationAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PinGenerationAttributesMarshaller {

    private static final MarshallingInfo<StructuredPojo> IBM3624NATURALPIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ibm3624NaturalPin").build();
    private static final MarshallingInfo<StructuredPojo> IBM3624PINFROMOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ibm3624PinFromOffset").build();
    private static final MarshallingInfo<StructuredPojo> IBM3624PINOFFSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ibm3624PinOffset").build();
    private static final MarshallingInfo<StructuredPojo> IBM3624RANDOMPIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Ibm3624RandomPin").build();
    private static final MarshallingInfo<StructuredPojo> VISAPIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisaPin").build();
    private static final MarshallingInfo<StructuredPojo> VISAPINVERIFICATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VisaPinVerificationValue").build();

    private static final PinGenerationAttributesMarshaller instance = new PinGenerationAttributesMarshaller();

    public static PinGenerationAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PinGenerationAttributes pinGenerationAttributes, ProtocolMarshaller protocolMarshaller) {

        if (pinGenerationAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(pinGenerationAttributes.getIbm3624NaturalPin(), IBM3624NATURALPIN_BINDING);
            protocolMarshaller.marshall(pinGenerationAttributes.getIbm3624PinFromOffset(), IBM3624PINFROMOFFSET_BINDING);
            protocolMarshaller.marshall(pinGenerationAttributes.getIbm3624PinOffset(), IBM3624PINOFFSET_BINDING);
            protocolMarshaller.marshall(pinGenerationAttributes.getIbm3624RandomPin(), IBM3624RANDOMPIN_BINDING);
            protocolMarshaller.marshall(pinGenerationAttributes.getVisaPin(), VISAPIN_BINDING);
            protocolMarshaller.marshall(pinGenerationAttributes.getVisaPinVerificationValue(), VISAPINVERIFICATIONVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
