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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateUserRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateUserRequestMarshaller {

    private static final MarshallingInfo<String> ORGANIZATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationId").build();
    private static final MarshallingInfo<String> USERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserId").build();
    private static final MarshallingInfo<String> ROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Role").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<String> FIRSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FirstName").build();
    private static final MarshallingInfo<String> LASTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LastName").build();
    private static final MarshallingInfo<Boolean> HIDDENFROMGLOBALADDRESSLIST_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HiddenFromGlobalAddressList").build();
    private static final MarshallingInfo<String> INITIALS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Initials").build();
    private static final MarshallingInfo<String> TELEPHONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Telephone").build();
    private static final MarshallingInfo<String> STREET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Street").build();
    private static final MarshallingInfo<String> JOBTITLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobTitle").build();
    private static final MarshallingInfo<String> CITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("City").build();
    private static final MarshallingInfo<String> COMPANY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Company").build();
    private static final MarshallingInfo<String> ZIPCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ZipCode").build();
    private static final MarshallingInfo<String> DEPARTMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Department").build();
    private static final MarshallingInfo<String> COUNTRY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Country").build();
    private static final MarshallingInfo<String> OFFICE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Office").build();

    private static final UpdateUserRequestMarshaller instance = new UpdateUserRequestMarshaller();

    public static UpdateUserRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateUserRequest updateUserRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateUserRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateUserRequest.getOrganizationId(), ORGANIZATIONID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getUserId(), USERID_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getRole(), ROLE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getFirstName(), FIRSTNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getLastName(), LASTNAME_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getHiddenFromGlobalAddressList(), HIDDENFROMGLOBALADDRESSLIST_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getInitials(), INITIALS_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getTelephone(), TELEPHONE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getStreet(), STREET_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getJobTitle(), JOBTITLE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getCity(), CITY_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getCompany(), COMPANY_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getZipCode(), ZIPCODE_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getDepartment(), DEPARTMENT_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getCountry(), COUNTRY_BINDING);
            protocolMarshaller.marshall(updateUserRequest.getOffice(), OFFICE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
