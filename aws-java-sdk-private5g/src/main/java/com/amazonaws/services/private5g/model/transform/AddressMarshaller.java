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
package com.amazonaws.services.private5g.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.private5g.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddressMarshaller {

    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("city").build();
    private static final MarshallingInfo<String> COMPANY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("company").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("country").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("phoneNumber").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postalCode").build();
    private static final MarshallingInfo<String> STATEORPROVINCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateOrProvince").build();
    private static final MarshallingInfo<String> STREET1_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("street1").build();
    private static final MarshallingInfo<String> STREET2_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("street2").build();
    private static final MarshallingInfo<String> STREET3_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("street3").build();

    private static final AddressMarshaller instance = new AddressMarshaller();

    public static AddressMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Address address, ProtocolMarshaller protocolMarshaller) {

        if (address == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(address.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(address.getCompany(), COMPANY_BINDING);
            protocolMarshaller.marshall(address.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(address.getName(), NAME_BINDING);
            protocolMarshaller.marshall(address.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(address.getPostalCode(), POSTALCODE_BINDING);
            protocolMarshaller.marshall(address.getStateOrProvince(), STATEORPROVINCE_BINDING);
            protocolMarshaller.marshall(address.getStreet1(), STREET1_BINDING);
            protocolMarshaller.marshall(address.getStreet2(), STREET2_BINDING);
            protocolMarshaller.marshall(address.getStreet3(), STREET3_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
