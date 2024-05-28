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
 * MacAlgorithmEmvMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MacAlgorithmEmvMarshaller {

    private static final MarshallingInfo<String> MAJORKEYDERIVATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MajorKeyDerivationMode").build();
    private static final MarshallingInfo<String> PANSEQUENCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PanSequenceNumber").build();
    private static final MarshallingInfo<String> PRIMARYACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryAccountNumber").build();
    private static final MarshallingInfo<String> SESSIONKEYDERIVATIONMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionKeyDerivationMode").build();
    private static final MarshallingInfo<StructuredPojo> SESSIONKEYDERIVATIONVALUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SessionKeyDerivationValue").build();

    private static final MacAlgorithmEmvMarshaller instance = new MacAlgorithmEmvMarshaller();

    public static MacAlgorithmEmvMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MacAlgorithmEmv macAlgorithmEmv, ProtocolMarshaller protocolMarshaller) {

        if (macAlgorithmEmv == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(macAlgorithmEmv.getMajorKeyDerivationMode(), MAJORKEYDERIVATIONMODE_BINDING);
            protocolMarshaller.marshall(macAlgorithmEmv.getPanSequenceNumber(), PANSEQUENCENUMBER_BINDING);
            protocolMarshaller.marshall(macAlgorithmEmv.getPrimaryAccountNumber(), PRIMARYACCOUNTNUMBER_BINDING);
            protocolMarshaller.marshall(macAlgorithmEmv.getSessionKeyDerivationMode(), SESSIONKEYDERIVATIONMODE_BINDING);
            protocolMarshaller.marshall(macAlgorithmEmv.getSessionKeyDerivationValue(), SESSIONKEYDERIVATIONVALUE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
