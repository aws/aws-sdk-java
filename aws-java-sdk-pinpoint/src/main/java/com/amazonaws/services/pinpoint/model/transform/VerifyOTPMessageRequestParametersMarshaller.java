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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VerifyOTPMessageRequestParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VerifyOTPMessageRequestParametersMarshaller {

    private static final MarshallingInfo<String> DESTINATIONIDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationIdentity").build();
    private static final MarshallingInfo<String> OTP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Otp").build();
    private static final MarshallingInfo<String> REFERENCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReferenceId").build();

    private static final VerifyOTPMessageRequestParametersMarshaller instance = new VerifyOTPMessageRequestParametersMarshaller();

    public static VerifyOTPMessageRequestParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(VerifyOTPMessageRequestParameters verifyOTPMessageRequestParameters, ProtocolMarshaller protocolMarshaller) {

        if (verifyOTPMessageRequestParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(verifyOTPMessageRequestParameters.getDestinationIdentity(), DESTINATIONIDENTITY_BINDING);
            protocolMarshaller.marshall(verifyOTPMessageRequestParameters.getOtp(), OTP_BINDING);
            protocolMarshaller.marshall(verifyOTPMessageRequestParameters.getReferenceId(), REFERENCEID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
