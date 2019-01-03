/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * NumberValidateResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NumberValidateResponseMarshaller {

    private static final MarshallingInfo<String> CARRIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Carrier").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> CLEANSEDPHONENUMBERE164_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CleansedPhoneNumberE164").build();
    private static final MarshallingInfo<String> CLEANSEDPHONENUMBERNATIONAL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CleansedPhoneNumberNational").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<String> COUNTRYCODEISO2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCodeIso2").build();
    private static final MarshallingInfo<String> COUNTRYCODENUMERIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCodeNumeric").build();
    private static final MarshallingInfo<String> COUNTY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("County").build();
    private static final MarshallingInfo<String> ORIGINALCOUNTRYCODEISO2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginalCountryCodeIso2").build();
    private static final MarshallingInfo<String> ORIGINALPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginalPhoneNumber").build();
    private static final MarshallingInfo<String> PHONETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PhoneType").build();
    private static final MarshallingInfo<Integer> PHONETYPECODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneTypeCode").build();
    private static final MarshallingInfo<String> TIMEZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Timezone").build();
    private static final MarshallingInfo<String> ZIPCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ZipCode").build();

    private static final NumberValidateResponseMarshaller instance = new NumberValidateResponseMarshaller();

    public static NumberValidateResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NumberValidateResponse numberValidateResponse, ProtocolMarshaller protocolMarshaller) {

        if (numberValidateResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(numberValidateResponse.getCarrier(), CARRIER_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCleansedPhoneNumberE164(), CLEANSEDPHONENUMBERE164_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCleansedPhoneNumberNational(), CLEANSEDPHONENUMBERNATIONAL_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCountryCodeIso2(), COUNTRYCODEISO2_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCountryCodeNumeric(), COUNTRYCODENUMERIC_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getCounty(), COUNTY_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getOriginalCountryCodeIso2(), ORIGINALCOUNTRYCODEISO2_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getOriginalPhoneNumber(), ORIGINALPHONENUMBER_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getPhoneType(), PHONETYPE_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getPhoneTypeCode(), PHONETYPECODE_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getTimezone(), TIMEZONE_BINDING);
            protocolMarshaller.marshall(numberValidateResponse.getZipCode(), ZIPCODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
