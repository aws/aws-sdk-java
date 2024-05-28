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
 * MacAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class MacAttributesMarshaller {

    private static final MarshallingInfo<String> ALGORITHM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Algorithm").build();
    private static final MarshallingInfo<StructuredPojo> DUKPTCMAC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DukptCmac").build();
    private static final MarshallingInfo<StructuredPojo> DUKPTISO9797ALGORITHM1_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DukptIso9797Algorithm1").build();
    private static final MarshallingInfo<StructuredPojo> DUKPTISO9797ALGORITHM3_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DukptIso9797Algorithm3").build();
    private static final MarshallingInfo<StructuredPojo> EMVMAC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmvMac").build();

    private static final MacAttributesMarshaller instance = new MacAttributesMarshaller();

    public static MacAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(MacAttributes macAttributes, ProtocolMarshaller protocolMarshaller) {

        if (macAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(macAttributes.getAlgorithm(), ALGORITHM_BINDING);
            protocolMarshaller.marshall(macAttributes.getDukptCmac(), DUKPTCMAC_BINDING);
            protocolMarshaller.marshall(macAttributes.getDukptIso9797Algorithm1(), DUKPTISO9797ALGORITHM1_BINDING);
            protocolMarshaller.marshall(macAttributes.getDukptIso9797Algorithm3(), DUKPTISO9797ALGORITHM3_BINDING);
            protocolMarshaller.marshall(macAttributes.getEmvMac(), EMVMAC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
