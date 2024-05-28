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
 * SessionKeyDerivationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionKeyDerivationMarshaller {

    private static final MarshallingInfo<StructuredPojo> AMEX_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Amex").build();
    private static final MarshallingInfo<StructuredPojo> EMV2000_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Emv2000").build();
    private static final MarshallingInfo<StructuredPojo> EMVCOMMON_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmvCommon").build();
    private static final MarshallingInfo<StructuredPojo> MASTERCARD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Mastercard").build();
    private static final MarshallingInfo<StructuredPojo> VISA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Visa").build();

    private static final SessionKeyDerivationMarshaller instance = new SessionKeyDerivationMarshaller();

    public static SessionKeyDerivationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionKeyDerivation sessionKeyDerivation, ProtocolMarshaller protocolMarshaller) {

        if (sessionKeyDerivation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionKeyDerivation.getAmex(), AMEX_BINDING);
            protocolMarshaller.marshall(sessionKeyDerivation.getEmv2000(), EMV2000_BINDING);
            protocolMarshaller.marshall(sessionKeyDerivation.getEmvCommon(), EMVCOMMON_BINDING);
            protocolMarshaller.marshall(sessionKeyDerivation.getMastercard(), MASTERCARD_BINDING);
            protocolMarshaller.marshall(sessionKeyDerivation.getVisa(), VISA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
