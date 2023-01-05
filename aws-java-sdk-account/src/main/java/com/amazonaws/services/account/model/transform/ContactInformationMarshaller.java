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
package com.amazonaws.services.account.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.account.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactInformationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactInformationMarshaller {

    private static final MarshallingInfo<String> ADDRESSLINE1_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine1").build();
    private static final MarshallingInfo<String> ADDRESSLINE2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine2").build();
    private static final MarshallingInfo<String> ADDRESSLINE3_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine3").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> COMPANYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CompanyName").build();
    private static final MarshallingInfo<String> COUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCode").build();
    private static final MarshallingInfo<String> DISTRICTORCOUNTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DistrictOrCounty").build();
    private static final MarshallingInfo<String> FULLNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FullName").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<String> POSTALCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PostalCode").build();
    private static final MarshallingInfo<String> STATEORREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StateOrRegion").build();
    private static final MarshallingInfo<String> WEBSITEURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WebsiteUrl").build();

    private static final ContactInformationMarshaller instance = new ContactInformationMarshaller();

    public static ContactInformationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContactInformation contactInformation, ProtocolMarshaller protocolMarshaller) {

        if (contactInformation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contactInformation.getAddressLine1(), ADDRESSLINE1_BINDING);
            protocolMarshaller.marshall(contactInformation.getAddressLine2(), ADDRESSLINE2_BINDING);
            protocolMarshaller.marshall(contactInformation.getAddressLine3(), ADDRESSLINE3_BINDING);
            protocolMarshaller.marshall(contactInformation.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(contactInformation.getCompanyName(), COMPANYNAME_BINDING);
            protocolMarshaller.marshall(contactInformation.getCountryCode(), COUNTRYCODE_BINDING);
            protocolMarshaller.marshall(contactInformation.getDistrictOrCounty(), DISTRICTORCOUNTY_BINDING);
            protocolMarshaller.marshall(contactInformation.getFullName(), FULLNAME_BINDING);
            protocolMarshaller.marshall(contactInformation.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(contactInformation.getPostalCode(), POSTALCODE_BINDING);
            protocolMarshaller.marshall(contactInformation.getStateOrRegion(), STATEORREGION_BINDING);
            protocolMarshaller.marshall(contactInformation.getWebsiteUrl(), WEBSITEURL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
