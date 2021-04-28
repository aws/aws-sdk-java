/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EulaAcceptanceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EulaAcceptanceMarshaller {

    private static final MarshallingInfo<java.util.Date> ACCEPTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> ACCEPTEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptedBy").build();
    private static final MarshallingInfo<String> ACCEPTEEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accepteeId").build();
    private static final MarshallingInfo<String> EULAACCEPTANCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("eulaAcceptanceId").build();
    private static final MarshallingInfo<String> EULAID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eulaId").build();

    private static final EulaAcceptanceMarshaller instance = new EulaAcceptanceMarshaller();

    public static EulaAcceptanceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EulaAcceptance eulaAcceptance, ProtocolMarshaller protocolMarshaller) {

        if (eulaAcceptance == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(eulaAcceptance.getAcceptedAt(), ACCEPTEDAT_BINDING);
            protocolMarshaller.marshall(eulaAcceptance.getAcceptedBy(), ACCEPTEDBY_BINDING);
            protocolMarshaller.marshall(eulaAcceptance.getAccepteeId(), ACCEPTEEID_BINDING);
            protocolMarshaller.marshall(eulaAcceptance.getEulaAcceptanceId(), EULAACCEPTANCEID_BINDING);
            protocolMarshaller.marshall(eulaAcceptance.getEulaId(), EULAID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
