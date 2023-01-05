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
package com.amazonaws.services.chime.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.chime.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CandidateAddressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CandidateAddressMarshaller {

    private static final MarshallingInfo<String> STREETINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streetInfo").build();
    private static final MarshallingInfo<String> STREETNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("streetNumber").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("city").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postalCode").build();
    private static final MarshallingInfo<String> POSTALCODEPLUS4_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postalCodePlus4").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("country").build();

    private static final CandidateAddressMarshaller instance = new CandidateAddressMarshaller();

    public static CandidateAddressMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CandidateAddress candidateAddress, ProtocolMarshaller protocolMarshaller) {

        if (candidateAddress == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(candidateAddress.getStreetInfo(), STREETINFO_BINDING);
            protocolMarshaller.marshall(candidateAddress.getStreetNumber(), STREETNUMBER_BINDING);
            protocolMarshaller.marshall(candidateAddress.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(candidateAddress.getState(), STATE_BINDING);
            protocolMarshaller.marshall(candidateAddress.getPostalCode(), POSTALCODE_BINDING);
            protocolMarshaller.marshall(candidateAddress.getPostalCodePlus4(), POSTALCODEPLUS4_BINDING);
            protocolMarshaller.marshall(candidateAddress.getCountry(), COUNTRY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
