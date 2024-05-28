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
 * SessionKeyEmv2000Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SessionKeyEmv2000Marshaller {

    private static final MarshallingInfo<String> APPLICATIONTRANSACTIONCOUNTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationTransactionCounter").build();
    private static final MarshallingInfo<String> PANSEQUENCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PanSequenceNumber").build();
    private static final MarshallingInfo<String> PRIMARYACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PrimaryAccountNumber").build();

    private static final SessionKeyEmv2000Marshaller instance = new SessionKeyEmv2000Marshaller();

    public static SessionKeyEmv2000Marshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SessionKeyEmv2000 sessionKeyEmv2000, ProtocolMarshaller protocolMarshaller) {

        if (sessionKeyEmv2000 == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(sessionKeyEmv2000.getApplicationTransactionCounter(), APPLICATIONTRANSACTIONCOUNTER_BINDING);
            protocolMarshaller.marshall(sessionKeyEmv2000.getPanSequenceNumber(), PANSEQUENCENUMBER_BINDING);
            protocolMarshaller.marshall(sessionKeyEmv2000.getPrimaryAccountNumber(), PRIMARYACCOUNTNUMBER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
