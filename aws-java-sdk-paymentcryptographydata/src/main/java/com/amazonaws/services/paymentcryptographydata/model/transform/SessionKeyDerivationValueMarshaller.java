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
 * SessionKeyDerivationValueMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionKeyDerivationValueMarshaller {

    private static final MarshallingInfo<String> APPLICATIONCRYPTOGRAM_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationCryptogram").build();
    private static final MarshallingInfo<String> APPLICATIONTRANSACTIONCOUNTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationTransactionCounter").build();

    private static final SessionKeyDerivationValueMarshaller instance = new SessionKeyDerivationValueMarshaller();

    public static SessionKeyDerivationValueMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionKeyDerivationValue sessionKeyDerivationValue, ProtocolMarshaller protocolMarshaller) {

        if (sessionKeyDerivationValue == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionKeyDerivationValue.getApplicationCryptogram(), APPLICATIONCRYPTOGRAM_BINDING);
            protocolMarshaller.marshall(sessionKeyDerivationValue.getApplicationTransactionCounter(), APPLICATIONTRANSACTIONCOUNTER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
