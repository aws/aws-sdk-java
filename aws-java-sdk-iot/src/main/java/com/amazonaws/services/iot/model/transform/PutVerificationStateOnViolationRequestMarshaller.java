/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PutVerificationStateOnViolationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PutVerificationStateOnViolationRequestMarshaller {

    private static final MarshallingInfo<String> VIOLATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("violationId").build();
    private static final MarshallingInfo<String> VERIFICATIONSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verificationState").build();
    private static final MarshallingInfo<String> VERIFICATIONSTATEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("verificationStateDescription").build();

    private static final PutVerificationStateOnViolationRequestMarshaller instance = new PutVerificationStateOnViolationRequestMarshaller();

    public static PutVerificationStateOnViolationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PutVerificationStateOnViolationRequest putVerificationStateOnViolationRequest, ProtocolMarshaller protocolMarshaller) {

        if (putVerificationStateOnViolationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(putVerificationStateOnViolationRequest.getViolationId(), VIOLATIONID_BINDING);
            protocolMarshaller.marshall(putVerificationStateOnViolationRequest.getVerificationState(), VERIFICATIONSTATE_BINDING);
            protocolMarshaller.marshall(putVerificationStateOnViolationRequest.getVerificationStateDescription(), VERIFICATIONSTATEDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
