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
 * VerifyMacRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerifyMacRequestMarshaller {

    private static final MarshallingInfo<String> KEYIDENTIFIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KeyIdentifier").build();
    private static final MarshallingInfo<String> MAC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Mac").build();
    private static final MarshallingInfo<Integer> MACLENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MacLength").build();
    private static final MarshallingInfo<String> MESSAGEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MessageData").build();
    private static final MarshallingInfo<StructuredPojo> VERIFICATIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VerificationAttributes").build();

    private static final VerifyMacRequestMarshaller instance = new VerifyMacRequestMarshaller();

    public static VerifyMacRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerifyMacRequest verifyMacRequest, ProtocolMarshaller protocolMarshaller) {

        if (verifyMacRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verifyMacRequest.getKeyIdentifier(), KEYIDENTIFIER_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getMac(), MAC_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getMacLength(), MACLENGTH_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getMessageData(), MESSAGEDATA_BINDING);
            protocolMarshaller.marshall(verifyMacRequest.getVerificationAttributes(), VERIFICATIONATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
