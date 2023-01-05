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
package com.amazonaws.services.outposts.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.outposts.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddressMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddressMarshaller {

    private static final MarshallingInfo<String> CONTACTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactName").build();
    private static final MarshallingInfo<String> CONTACTPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactPhoneNumber").build();
    private static final MarshallingInfo<String> ADDRESSLINE1_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine1").build();
    private static final MarshallingInfo<String> ADDRESSLINE2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine2").build();
    private static final MarshallingInfo<String> ADDRESSLINE3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine3").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> STATEORREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateOrRegion").build();
    private static final MarshallingInfo<String> DISTRICTORCOUNTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistrictOrCounty").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostalCode").build();
    private static final MarshallingInfo<String> COUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCode").build();
    private static final MarshallingInfo<String> MUNICIPALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Municipality").build();

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
            protocolMarshaller.marshall(address.getContactName(), CONTACTNAME_BINDING);
            protocolMarshaller.marshall(address.getContactPhoneNumber(), CONTACTPHONENUMBER_BINDING);
            protocolMarshaller.marshall(address.getAddressLine1(), ADDRESSLINE1_BINDING);
            protocolMarshaller.marshall(address.getAddressLine2(), ADDRESSLINE2_BINDING);
            protocolMarshaller.marshall(address.getAddressLine3(), ADDRESSLINE3_BINDING);
            protocolMarshaller.marshall(address.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(address.getStateOrRegion(), STATEORREGION_BINDING);
            protocolMarshaller.marshall(address.getDistrictOrCounty(), DISTRICTORCOUNTY_BINDING);
            protocolMarshaller.marshall(address.getPostalCode(), POSTALCODE_BINDING);
            protocolMarshaller.marshall(address.getCountryCode(), COUNTRYCODE_BINDING);
            protocolMarshaller.marshall(address.getMunicipality(), MUNICIPALITY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
