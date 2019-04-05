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
package com.amazonaws.services.route53domains.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.route53domains.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContactDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContactDetailMarshaller {

    private static final MarshallingInfo<String> FIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstName").build();
    private static final MarshallingInfo<String> LASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastName").build();
    private static final MarshallingInfo<String> CONTACTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContactType").build();
    private static final MarshallingInfo<String> ORGANIZATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationName").build();
    private static final MarshallingInfo<String> ADDRESSLINE1_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine1").build();
    private static final MarshallingInfo<String> ADDRESSLINE2_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddressLine2").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("State").build();
    private static final MarshallingInfo<String> COUNTRYCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CountryCode").build();
    private static final MarshallingInfo<String> ZIPCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ZipCode").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<String> EMAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Email").build();
    private static final MarshallingInfo<String> FAX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Fax").build();
    private static final MarshallingInfo<List> EXTRAPARAMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ExtraParams").build();

    private static final ContactDetailMarshaller instance = new ContactDetailMarshaller();

    public static ContactDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContactDetail contactDetail, ProtocolMarshaller protocolMarshaller) {

        if (contactDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(contactDetail.getFirstName(), FIRSTNAME_BINDING);
            protocolMarshaller.marshall(contactDetail.getLastName(), LASTNAME_BINDING);
            protocolMarshaller.marshall(contactDetail.getContactType(), CONTACTTYPE_BINDING);
            protocolMarshaller.marshall(contactDetail.getOrganizationName(), ORGANIZATIONNAME_BINDING);
            protocolMarshaller.marshall(contactDetail.getAddressLine1(), ADDRESSLINE1_BINDING);
            protocolMarshaller.marshall(contactDetail.getAddressLine2(), ADDRESSLINE2_BINDING);
            protocolMarshaller.marshall(contactDetail.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(contactDetail.getState(), STATE_BINDING);
            protocolMarshaller.marshall(contactDetail.getCountryCode(), COUNTRYCODE_BINDING);
            protocolMarshaller.marshall(contactDetail.getZipCode(), ZIPCODE_BINDING);
            protocolMarshaller.marshall(contactDetail.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(contactDetail.getEmail(), EMAIL_BINDING);
            protocolMarshaller.marshall(contactDetail.getFax(), FAX_BINDING);
            protocolMarshaller.marshall(contactDetail.getExtraParams(), EXTRAPARAMS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
