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
package com.amazonaws.services.customerprofiles.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddressMarshaller {

    private static final MarshallingInfo<String> ADDRESS1_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address1").build();
    private static final MarshallingInfo<String> ADDRESS2_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address2").build();
    private static final MarshallingInfo<String> ADDRESS3_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address3").build();
    private static final MarshallingInfo<String> ADDRESS4_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Address4").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> COUNTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("County").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> PROVINCE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Province").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostalCode").build();

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
            protocolMarshaller.marshall(address.getAddress1(), ADDRESS1_BINDING);
            protocolMarshaller.marshall(address.getAddress2(), ADDRESS2_BINDING);
            protocolMarshaller.marshall(address.getAddress3(), ADDRESS3_BINDING);
            protocolMarshaller.marshall(address.getAddress4(), ADDRESS4_BINDING);
            protocolMarshaller.marshall(address.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(address.getCounty(), COUNTY_BINDING);
            protocolMarshaller.marshall(address.getState(), STATE_BINDING);
            protocolMarshaller.marshall(address.getProvince(), PROVINCE_BINDING);
            protocolMarshaller.marshall(address.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(address.getPostalCode(), POSTALCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
