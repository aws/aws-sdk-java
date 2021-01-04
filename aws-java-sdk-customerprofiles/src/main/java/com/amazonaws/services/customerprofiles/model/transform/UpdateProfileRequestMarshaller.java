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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.customerprofiles.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateProfileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateProfileRequestMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> PROFILEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProfileId").build();
    private static final MarshallingInfo<String> ADDITIONALINFORMATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AdditionalInformation").build();
    private static final MarshallingInfo<String> ACCOUNTNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccountNumber").build();
    private static final MarshallingInfo<String> PARTYTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("PartyType").build();
    private static final MarshallingInfo<String> BUSINESSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BusinessName").build();
    private static final MarshallingInfo<String> FIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstName").build();
    private static final MarshallingInfo<String> MIDDLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MiddleName").build();
    private static final MarshallingInfo<String> LASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastName").build();
    private static final MarshallingInfo<String> BIRTHDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("BirthDate").build();
    private static final MarshallingInfo<String> GENDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Gender").build();
    private static final MarshallingInfo<String> PHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PhoneNumber").build();
    private static final MarshallingInfo<String> MOBILEPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MobilePhoneNumber").build();
    private static final MarshallingInfo<String> HOMEPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomePhoneNumber").build();
    private static final MarshallingInfo<String> BUSINESSPHONENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BusinessPhoneNumber").build();
    private static final MarshallingInfo<String> EMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmailAddress").build();
    private static final MarshallingInfo<String> PERSONALEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PersonalEmailAddress").build();
    private static final MarshallingInfo<String> BUSINESSEMAILADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BusinessEmailAddress").build();
    private static final MarshallingInfo<StructuredPojo> ADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Address").build();
    private static final MarshallingInfo<StructuredPojo> SHIPPINGADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShippingAddress").build();
    private static final MarshallingInfo<StructuredPojo> MAILINGADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MailingAddress").build();
    private static final MarshallingInfo<StructuredPojo> BILLINGADDRESS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BillingAddress").build();
    private static final MarshallingInfo<Map> ATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Attributes").build();

    private static final UpdateProfileRequestMarshaller instance = new UpdateProfileRequestMarshaller();

    public static UpdateProfileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateProfileRequest updateProfileRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateProfileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateProfileRequest.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getProfileId(), PROFILEID_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getAdditionalInformation(), ADDITIONALINFORMATION_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getAccountNumber(), ACCOUNTNUMBER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getPartyType(), PARTYTYPE_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getBusinessName(), BUSINESSNAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getFirstName(), FIRSTNAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getMiddleName(), MIDDLENAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getLastName(), LASTNAME_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getBirthDate(), BIRTHDATE_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getGender(), GENDER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getPhoneNumber(), PHONENUMBER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getMobilePhoneNumber(), MOBILEPHONENUMBER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getHomePhoneNumber(), HOMEPHONENUMBER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getBusinessPhoneNumber(), BUSINESSPHONENUMBER_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getEmailAddress(), EMAILADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getPersonalEmailAddress(), PERSONALEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getBusinessEmailAddress(), BUSINESSEMAILADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getAddress(), ADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getShippingAddress(), SHIPPINGADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getMailingAddress(), MAILINGADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getBillingAddress(), BILLINGADDRESS_BINDING);
            protocolMarshaller.marshall(updateProfileRequest.getAttributes(), ATTRIBUTES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
